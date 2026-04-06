package com.hansecom.abt.api;

import com.hansecom.mapi.models.ErrorResponse;
import com.hansecom.mapi.models.ValidationError;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import retrofit2.HttpException;

@Metadata
public final class ApiExceptionFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final ApiExceptionFactory f33083a = new ApiExceptionFactory();

    public final ApiException a(ErrorResponse errorResponse, HttpException httpException) {
        Intrinsics.i(httpException, "httpException");
        if (httpException.a() == 300) {
            return new HttpMultipleChoiceException(errorResponse, httpException);
        }
        List f2 = errorResponse != null ? errorResponse.f() : null;
        Collection collection = f2;
        if (collection == null || collection.isEmpty()) {
            return new ApiException(errorResponse, httpException);
        }
        Iterable iterable = f2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(CollectionsKt.x(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((ValidationError) next).b(), next);
        }
        return new ApiValidationException(errorResponse, httpException, linkedHashMap);
    }
}
