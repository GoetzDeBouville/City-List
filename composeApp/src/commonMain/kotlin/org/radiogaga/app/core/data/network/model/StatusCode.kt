package org.radiogaga.app.core.data.network.model

import org.radiogaga.app.core.domain.model.ErrorType
import kotlin.jvm.JvmInline

@JvmInline
value class StatusCode(val code: Int)

fun StatusCode.mapToErrorType(): ErrorType {
    return when (code) {
        NO_CONNECTION_CODE -> ErrorType.NO_CONNECTION
        in 400..499 -> ErrorType.BAD_REQUEST
        in 500..599 -> ErrorType.SERVER_ERROR
        else -> ErrorType.UNKNOWN_ERROR
    }
}

private const val NO_CONNECTION_CODE = -1