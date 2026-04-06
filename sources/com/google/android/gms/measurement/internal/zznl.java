package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zznl {

    /* renamed from: a  reason: collision with root package name */
    public final Clock f26883a;

    /* renamed from: b  reason: collision with root package name */
    public long f26884b;

    public zznl(Clock clock) {
        Preconditions.m(clock);
        this.f26883a = clock;
    }

    public final void a() {
        this.f26884b = 0;
    }

    public final boolean b(long j2) {
        return this.f26884b == 0 || this.f26883a.c() - this.f26884b >= 3600000;
    }

    public final void c() {
        this.f26884b = this.f26883a.c();
    }
}
