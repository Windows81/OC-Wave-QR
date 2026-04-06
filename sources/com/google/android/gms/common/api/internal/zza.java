package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zza implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f24768A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzb f24769B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f24770z;

    public zza(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.f24769B = zzb;
        this.f24770z = lifecycleCallback;
        this.f24768A = str;
    }

    public final void run() {
        Bundle bundle;
        zzb zzb = this.f24769B;
        if (zzb.f24771A > 0) {
            LifecycleCallback lifecycleCallback = this.f24770z;
            if (zzb.f24772B != null) {
                bundle = zzb.f24772B.getBundle(this.f24768A);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f24769B.f24771A >= 2) {
            this.f24770z.j();
        }
        if (this.f24769B.f24771A >= 3) {
            this.f24770z.h();
        }
        if (this.f24769B.f24771A >= 4) {
            this.f24770z.k();
        }
        if (this.f24769B.f24771A >= 5) {
            this.f24770z.g();
        }
    }
}
