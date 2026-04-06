package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzo implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f27228A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Task f27229z;

    public zzo(zzp zzp, Task task) {
        this.f27228A = zzp;
        this.f27229z = task;
    }

    public final void run() {
        try {
            Task a2 = this.f27228A.f27231b.a(this.f27229z.k());
            if (a2 == null) {
                this.f27228A.e(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzp = this.f27228A;
            Executor executor = TaskExecutors.f27185b;
            a2.f(executor, zzp);
            a2.e(executor, this.f27228A);
            a2.a(executor, this.f27228A);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f27228A.e((Exception) e2.getCause());
            } else {
                this.f27228A.e(e2);
            }
        } catch (CancellationException unused) {
            this.f27228A.b();
        } catch (Exception e3) {
            this.f27228A.e(e3);
        }
    }
}
