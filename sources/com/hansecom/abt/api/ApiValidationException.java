package com.hansecom.abt.api;

import com.hansecom.mapi.models.ErrorResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

@Metadata
public final class ApiValidationException extends ApiException {

    /* renamed from: B  reason: collision with root package name */
    public final Map f33108B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiValidationException(ErrorResponse errorResponse, HttpException httpException, Map map) {
        super(errorResponse, httpException);
        Intrinsics.i(httpException, "httpException");
        Intrinsics.i(map, "validationErrors");
        this.f33108B = map;
    }

    public final Map d() {
        return this.f33108B;
    }
}
