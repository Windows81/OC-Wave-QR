package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzmq implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzmm f26831z;

    public zzmq(zzmm zzmm) {
        this.f26831z = zzmm;
    }

    public final void run() {
        zzlp.M(this.f26831z.f26823c, new ComponentName(this.f26831z.f26823c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
