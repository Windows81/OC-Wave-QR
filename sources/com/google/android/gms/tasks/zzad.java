package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzad<T> implements zzae<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f27189a = new CountDownLatch(1);

    public /* synthetic */ zzad(zzac zzac) {
    }

    public final void a(Object obj) {
        this.f27189a.countDown();
    }

    public final void b() {
        this.f27189a.countDown();
    }

    public final void c() {
        this.f27189a.await();
    }

    public final boolean d(long j2, TimeUnit timeUnit) {
        return this.f27189a.await(j2, timeUnit);
    }

    public final void e(Exception exc) {
        this.f27189a.countDown();
    }
}
