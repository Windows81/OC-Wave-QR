package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzn implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final TaskCompletionSource f27432z;

    public zzn() {
        this.f27432z = null;
    }

    public abstract void a();

    public final TaskCompletionSource b() {
        return this.f27432z;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f27432z;
        if (taskCompletionSource != null) {
            taskCompletionSource.d(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            c(e2);
        }
    }

    public zzn(TaskCompletionSource taskCompletionSource) {
        this.f27432z = taskCompletionSource;
    }
}
