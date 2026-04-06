package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzkk implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26686A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bundle f26687z;

    public zzkk(zzjk zzjk, Bundle bundle) {
        this.f26687z = bundle;
        this.f26686A = zzjk;
    }

    public final void run() {
        zzjk.W(this.f26686A, this.f26687z);
    }
}
