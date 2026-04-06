package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class zzz implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Callable f27249A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzw f27250z;

    public zzz(zzw zzw, Callable callable) {
        this.f27250z = zzw;
        this.f27249A = callable;
    }

    public final void run() {
        try {
            this.f27250z.r(this.f27249A.call());
        } catch (Exception e2) {
            this.f27250z.q(e2);
        } catch (Throwable th) {
            this.f27250z.q(new RuntimeException(th));
        }
    }
}
