package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zze implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzf f27204A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27205z;

    public zze(zzf zzf, Task task) {
        this.f27204A = zzf;
        this.f27205z = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f27204A.f27207b.a(this.f27205z);
            if (task == null) {
                this.f27204A.e(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzf = this.f27204A;
            Executor executor = TaskExecutors.f27185b;
            task.f(executor, zzf);
            task.e(executor, this.f27204A);
            task.a(executor, this.f27204A);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f27204A.f27208c.q((Exception) e2.getCause());
            } else {
                this.f27204A.f27208c.q(e2);
            }
        } catch (Exception e3) {
            this.f27204A.f27208c.q(e3);
        }
    }
}
