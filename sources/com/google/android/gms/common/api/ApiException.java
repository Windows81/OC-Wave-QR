package com.google.android.gms.common.api;

public class ApiException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final Status f24415z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.S()
            java.lang.String r1 = r4.X()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.X()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.f24415z = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status a() {
        return this.f24415z;
    }

    public int b() {
        return this.f24415z.S();
    }
}
