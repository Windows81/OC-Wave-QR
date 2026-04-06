package com.google.android.gms.measurement.internal;

import java.util.Objects;

public final /* synthetic */ class zzt implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzhw f26981z;

    public /* synthetic */ zzt(zzhw zzhw) {
        this.f26981z = zzhw;
    }

    public final void run() {
        zzhw zzhw = this.f26981z;
        if (!zzhw.L().X0()) {
            zzhw.m().L().a("registerTrigger called but app not eligible");
            return;
        }
        zzjk H = zzhw.H();
        Objects.requireNonNull(H);
        new Thread(new zzq(H)).start();
    }
}
