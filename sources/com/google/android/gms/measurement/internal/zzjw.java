package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class zzjw implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzjk f26658z;

    public zzjw(zzjk zzjk) {
        this.f26658z = zzjk;
    }

    public final void execute(Runnable runnable) {
        this.f26658z.f().D(runnable);
    }
}
