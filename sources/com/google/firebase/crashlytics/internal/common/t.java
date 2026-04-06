package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Executor f30109A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f30110B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Callable f30111z;

    public /* synthetic */ t(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        this.f30111z = callable;
        this.f30109A = executor;
        this.f30110B = taskCompletionSource;
    }

    public final void run() {
        Utils.k(this.f30111z, this.f30109A, this.f30110B);
    }
}
