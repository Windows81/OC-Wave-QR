package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import java.util.concurrent.Executor;

public class HandlerExecutor implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final Handler f25137z;

    public final void execute(Runnable runnable) {
        this.f25137z.post(runnable);
    }
}
