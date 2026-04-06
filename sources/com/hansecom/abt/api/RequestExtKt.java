package com.hansecom.abt.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Request;

@Metadata
public final class RequestExtKt {
    public static final String a(Request request) {
        Intrinsics.i(request, "<this>");
        return request.d("Authorization");
    }

    public static final String b(Request request) {
        Intrinsics.i(request, "<this>");
        String a2 = a(request);
        if (a2 != null) {
            return StringsKt.D0(a2, "Bearer ");
        }
        return null;
    }

    public static final Request c(Request request, String str) {
        Intrinsics.i(request, "<this>");
        Intrinsics.i(str, "token");
        Request.Builder i2 = request.i();
        return i2.d("Authorization", "Bearer " + str).b();
    }
}
