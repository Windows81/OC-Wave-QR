package com.hansecom.abt.api;

import com.hansecom.mapi.models.ErrorResponse;
import kotlin.Metadata;
import retrofit2.HttpException;

@Metadata
public class ApiException extends Exception {

    /* renamed from: A  reason: collision with root package name */
    public final HttpException f33081A;

    /* renamed from: z  reason: collision with root package name */
    public final ErrorResponse f33082z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(com.hansecom.mapi.models.ErrorResponse r2, retrofit2.HttpException r3) {
        /*
            r1 = this;
            java.lang.String r0 = "httpException"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            if (r2 == 0) goto L_0x000d
            java.lang.String r0 = r2.e()
            if (r0 != 0) goto L_0x0015
        L_0x000d:
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "Unknown error"
        L_0x0015:
            r1.<init>(r0)
            r1.f33082z = r2
            r1.f33081A = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.api.ApiException.<init>(com.hansecom.mapi.models.ErrorResponse, retrofit2.HttpException):void");
    }

    public final ErrorResponse a() {
        return this.f33082z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.hansecom.abt.util.resourcesResolvers.StringValue b() {
        /*
            r4 = this;
            com.hansecom.mapi.models.ErrorResponse r0 = r4.f33082z
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.c()
            if (r0 == 0) goto L_0x0022
            com.hansecom.abt.util.resourcesResolvers.StringValue$Key r1 = new com.hansecom.abt.util.resourcesResolvers.StringValue$Key
            int r2 = com.hansecom.abt.R.string.N3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.hansecom.mapi.models.ErrorResponse r3 = r4.f33082z
            java.util.List r3 = r3.d()
            if (r3 != 0) goto L_0x001e
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        L_0x001e:
            r1.<init>(r0, r2, r3)
            goto L_0x0038
        L_0x0022:
            com.hansecom.mapi.models.ErrorResponse r0 = r4.f33082z
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.e()
            if (r0 == 0) goto L_0x0031
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.util.resourcesResolvers.StringValueKt.d(r0)
            goto L_0x0038
        L_0x0031:
            com.hansecom.abt.util.resourcesResolvers.StringValue$ResourceId r1 = new com.hansecom.abt.util.resourcesResolvers.StringValue$ResourceId
            int r0 = com.hansecom.abt.R.string.N3
            r1.<init>(r0)
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.api.ApiException.b():com.hansecom.abt.util.resourcesResolvers.StringValue");
    }

    public final int c() {
        return this.f33081A.a();
    }
}
