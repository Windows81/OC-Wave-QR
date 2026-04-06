package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class zzd implements zzq {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f27201a;

    /* renamed from: b  reason: collision with root package name */
    public final Continuation f27202b;

    /* renamed from: c  reason: collision with root package name */
    public final zzw f27203c;

    public zzd(Executor executor, Continuation continuation, zzw zzw) {
        this.f27201a = executor;
        this.f27202b = continuation;
        this.f27203c = zzw;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public final void d(Task task) {
        this.f27201a.execute(new zzc(this, task));
    }
}
