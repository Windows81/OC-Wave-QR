package com.hansecom.abt.api;

import com.hansecom.mapi.models.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata
public final class HttpMultipleChoiceException extends ApiException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpMultipleChoiceException(ErrorResponse errorResponse, HttpException httpException) {
        super(errorResponse, httpException);
        Intrinsics.i(httpException, "httpException");
    }
}
