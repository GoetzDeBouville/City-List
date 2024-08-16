package org.radiogaga.app.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import org.radiogaga.app.core.domain.model.ErrorType
import org.radiogaga.app.core.domain.model.Result
import org.radiogaga.app.core.ui.ErrorScreenState

abstract class BaseViewModel : ViewModel() {

    protected inline fun <reified D> runSafelyUseCase(
        useCaseFlow: Flow<Result<D, ErrorType>>,
        noinline onFailure: ((ErrorType) -> Unit)? = null,
        crossinline onSuccess: (D) -> Unit,
    ) {
        viewModelScope.launch(Dispatchers.IO) {
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
                println("$TAG error -> $error")
                error.printStackTrace()
                onFailure?.invoke(ErrorType.UNKNOWN_ERROR)
            }
        }
    }

    protected fun mapErrorToUiState(errorType: ErrorType): ErrorScreenState {
        return when (errorType) {
            ErrorType.NO_CONNECTION -> ErrorScreenState.NO_INTERNET
            ErrorType.NOTHING_FOUND -> ErrorScreenState.NOTHING_FOUND
            else -> ErrorScreenState.SERVER_ERROR
        }
    }

    companion object {
        val TAG = BaseViewModel::class.simpleName
    }
}