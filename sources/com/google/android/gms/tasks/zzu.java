package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

final class zzu implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final Handler f27237z = new zza(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f27237z.post(runnable);
    }
}
