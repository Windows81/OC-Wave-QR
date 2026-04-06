package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27230a;

    /* renamed from: b  reason: collision with root package name */
    public final SuccessContinuation f27231b;

    /* renamed from: c  reason: collision with root package name */
    public final zzw f27232c;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzw) {
        this.f27230a = executor;
        this.f27231b = successContinuation;
        this.f27232c = zzw;
    }

    public final void a(Object obj) {
        this.f27232c.r(obj);
    }

    public final void b() {
        this.f27232c.s();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void d(Task task) {
        this.f27230a.execute(new zzo(this, task));
    }

    public final void e(Exception exc) {
        this.f27232c.q(exc);
    }
}
