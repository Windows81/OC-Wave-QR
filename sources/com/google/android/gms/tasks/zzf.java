package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27206a;

    /* renamed from: b  reason: collision with root package name */
    public final Continuation f27207b;

    /* renamed from: c  reason: collision with root package name */
    public final zzw f27208c;

    public zzf(Executor executor, Continuation continuation, zzw zzw) {
        this.f27206a = executor;
        this.f27207b = continuation;
        this.f27208c = zzw;
    }

    public final void a(Object obj) {
        this.f27208c.r(obj);
    }

    public final void b() {
        this.f27208c.s();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void d(Task task) {
        this.f27206a.execute(new zze(this, task));
    }

    public final void e(Exception exc) {
        this.f27208c.q(exc);
    }
}
