package com.google.android.gms.tasks;

public class TaskCompletionSource<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final zzw f27183a = new zzw();

    public Task a() {
        return this.f27183a;
    }

    public void b(Exception exc) {
        this.f27183a.q(exc);
    }

    public void c(Object obj) {
        this.f27183a.r(obj);
    }

    public boolean d(Exception exc) {
        return this.f27183a.t(exc);
    }

    public boolean e(Object obj) {
        return this.f27183a.u(obj);
    }
}
