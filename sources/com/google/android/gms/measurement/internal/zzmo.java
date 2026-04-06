package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzmo implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzmm f26827A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentName f26828z;

    public zzmo(zzmm zzmm, ComponentName componentName) {
        this.f26828z = componentName;
        this.f26827A = zzmm;
    }

    public final void run() {
        zzlp.M(this.f26827A.f26823c, this.f26828z);
    }
}
