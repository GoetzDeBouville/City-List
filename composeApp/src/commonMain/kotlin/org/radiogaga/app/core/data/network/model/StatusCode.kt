package org.radiogaga.app.core.data.network.model

import org.radiogaga.app.core.domain.model.ErrorType
import kotlin.jvm.JvmInline

@JvmInline
value class StatusCode(val code: Int)

fun StatusCode.mapToErrorType(): ErrorType {
    return when (code) {
        NO_CONNECTION_CODE -> ErrorType.NO_CONNECTION
        BAD_REQUEST_CODE -> ErrorType.BAD_REQUEST
        SERVER_ERROR_CODE -> ErrorType.SERVER_ERROR
        else -> ErrorType.UNKNOWN_ERROR
    }
}

private const val NO_CONNECTION_CODE = -1
private const val BAD_REQUEST_CODE = 400
private const val SERVER_ERROR_CODE = 500