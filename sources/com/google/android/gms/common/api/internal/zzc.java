package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzc implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f24774A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzd f24775B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f24776z;

    public zzc(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.f24775B = zzd;
        this.f24776z = lifecycleCallback;
        this.f24774A = str;
    }

    public final void run() {
        Bundle bundle;
        zzd zzd = this.f24775B;
        if (zzd.C0 > 0) {
            LifecycleCallback lifecycleCallback = this.f24776z;
            if (zzd.D0 != null) {
                bundle = zzd.D0.getBundle(this.f24774A);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f24775B.C0 >= 2) {
            this.f24776z.j();
        }
        if (this.f24775B.C0 >= 3) {
            this.f24776z.h();
        }
        if (this.f24775B.C0 >= 4) {
            this.f24776z.k();
        }
        if (this.f24775B.C0 >= 5) {
            this.f24776z.g();
        }
    }
}
