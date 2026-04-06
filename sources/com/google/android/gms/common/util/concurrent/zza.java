package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class zza implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f25143z;

    public zza(Runnable runnable, int i2) {
        this.f25143z = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f25143z.run();
    }
}
