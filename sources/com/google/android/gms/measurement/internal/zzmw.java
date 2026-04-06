package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final /* synthetic */ class zzmw implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ int f26846A;

    /* renamed from: B  reason: collision with root package name */
    public /* synthetic */ zzgi f26847B;
    public /* synthetic */ Intent C;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzmu f26848z;

    public /* synthetic */ zzmw(zzmu zzmu, int i2, zzgi zzgi, Intent intent) {
        this.f26848z = zzmu;
        this.f26846A = i2;
        this.f26847B = zzgi;
        this.C = intent;
    }

    public final void run() {
        this.f26848z.d(this.f26846A, this.f26847B, this.C);
    }
}
