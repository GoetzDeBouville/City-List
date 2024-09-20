package org.radiogaga.app.util

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result


fun <T> debounceFun(
    delayMillis: Long,
    coroutineScope: CoroutineScope,
    useLastParam: Boolean,
    action: (T) -> Unit
): (T) -> Unit {
    var debounceJob: Job? = null
    return { param: T ->
        if (useLastParam) {
            debounceJob?.cancel()
        }
        if (debounceJob?.isCompleted == true || useLastParam) {
            debounceJob = coroutineScope.launch {
                if (useLastParam) {
                    delay(delayMillis)
                }
                action(param)
                if (!useLastParam) {
                    delay(delayMillis)
                }
            }
        }
    }
}

inline fun <reified D> runSafelyUseCase(
    useCaseFlow: Flow<Result<D, ErrorType>>,
    scope: CoroutineScope,
    noinline onFailure: ((ErrorType) -> Unit)? = null,
    crossinline onSuccess: (D) -> Unit,
) {
    scope.launch(Dispatchers.IO) {
        runCatching {
            useCaseFlow.collect { result ->
                when (result) {
                    is Result.Success -> onSuccess(result.data)
                    is Result.Error -> {
                        onFailure?.invoke(result.error)
                    }
                }
            }
        }.onFailure { error ->
            error.printStackTrace()
            scope.launch(Dispatchers.Main) {
                onFailure?.invoke(ErrorType.UNKNOWN_ERROR)
            }
        }
    }
}