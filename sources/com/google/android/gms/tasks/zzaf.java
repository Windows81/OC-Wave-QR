package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

final class zzaf<T> implements zzae<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27190a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f27191b;

    /* renamed from: c  reason: collision with root package name */
    public final zzw f27192c;

    /* renamed from: d  reason: collision with root package name */
    public int f27193d;

    /* renamed from: e  reason: collision with root package name */
    public int f27194e;

    /* renamed from: f  reason: collision with root package name */
    public int f27195f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f27196g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27197h;

    public zzaf(int i2, zzw zzw) {
        this.f27191b = i2;
        this.f27192c = zzw;
    }

    private final void c() {
        if (this.f27193d + this.f27194e + this.f27195f != this.f27191b) {
            return;
        }
        if (this.f27196g != null) {
            zzw zzw = this.f27192c;
            int i2 = this.f27194e;
            int i3 = this.f27191b;
            zzw.q(new ExecutionException(i2 + " out of " + i3 + " underlying tasks failed", this.f27196g));
        } else if (this.f27197h) {
            this.f27192c.s();
        } else {
            this.f27192c.r((Object) null);
        }
    }

    public final void a(Object obj) {
        synchronized (this.f27190a) {
            this.f27193d++;
            c();
        }
    }

    public final void b() {
        synchronized (this.f27190a) {
            this.f27195f++;
            this.f27197h = true;
            c();
        }
    }

    public final void e(Exception exc) {
        synchronized (this.f27190a) {
            this.f27194e++;
            this.f27196g = exc;
            c();
        }
    }
}
