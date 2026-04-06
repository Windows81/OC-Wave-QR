package com.google.android.gms.measurement.internal;

import java.util.Map;

public final /* synthetic */ class zzlc implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ int f26722A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ Exception f26723B;
    public /* synthetic */ byte[] C;
    public /* synthetic */ Map D;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzld f26724z;

    public /* synthetic */ zzlc(zzld zzld, int i2, Exception exc, byte[] bArr, Map map) {
        this.f26724z = zzld;
        this.f26722A = i2;
        this.f26723B = exc;
        this.C = bArr;
        this.D = map;
    }

    public final void run() {
        this.f26724z.a(this.f26722A, this.f26723B, this.C, this.D);
    }
}
