package com.hansecom.mapi.infrastructure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ApiClient$Companion$defaultBasePath$2 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public static final ApiClient$Companion$defaultBasePath$2 f39130z = new ApiClient$Companion$defaultBasePath$2();

    public ApiClient$Companion$defaultBasePath$2() {
        super(0);
    }

    public final String invoke() {
        return System.getProperties().getProperty(ApiClient.i(), "https://mapi.ci.mvticketing.com");
    }
}
