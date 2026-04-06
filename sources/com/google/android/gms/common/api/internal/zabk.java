package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class zabk implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Handler f24651z;

    public /* synthetic */ zabk(Handler handler) {
        this.f24651z = handler;
    }

    public final void execute(Runnable runnable) {
        this.f24651z.post(runnable);
    }
}
