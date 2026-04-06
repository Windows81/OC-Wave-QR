package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

final class zzgr implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final int f26345A;

    /* renamed from: B  reason: collision with root package name */
    public final Throwable f26346B;
    public final byte[] C;
    public final String D;
    public final Map E;

    /* renamed from: z  reason: collision with root package name */
    public final zzgo f26347z;

    public final void run() {
        this.f26347z.a(this.D, this.f26345A, this.f26346B, this.C, this.E);
    }

    public zzgr(String str, zzgo zzgo, int i2, Throwable th, byte[] bArr, Map map) {
        Preconditions.m(zzgo);
        this.f26347z = zzgo;
        this.f26345A = i2;
        this.f26346B = th;
        this.C = bArr;
        this.D = str;
        this.E = map;
    }
}
