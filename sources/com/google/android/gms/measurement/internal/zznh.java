package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zznh {

    /* renamed from: a  reason: collision with root package name */
    public long f26873a;

    /* renamed from: b  reason: collision with root package name */
    public long f26874b;

    /* renamed from: c  reason: collision with root package name */
    public final zzax f26875c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zznb f26876d;

    public zznh(zznb zznb) {
        this.f26876d = zznb;
        this.f26875c = new zzng(this, zznb.f26587a);
        long c2 = zznb.b().c();
        this.f26873a = c2;
        this.f26874b = c2;
    }

    public static /* synthetic */ void c(zznh zznh) {
        zznh.f26876d.n();
        zznh.d(false, false, zznh.f26876d.b().c());
        zznh.f26876d.o().v(zznh.f26876d.b().c());
    }

    public final long a(long j2) {
        long j3 = j2 - this.f26874b;
        this.f26874b = j2;
        return j3;
    }

    public final void b() {
        this.f26875c.a();
        if (this.f26876d.d().t(zzbj.g1)) {
            this.f26873a = this.f26876d.b().c();
        } else {
            this.f26873a = 0;
        }
        this.f26874b = this.f26873a;
    }

    public final boolean d(boolean z2, boolean z3, long j2) {
        this.f26876d.n();
        this.f26876d.v();
        if (this.f26876d.f26587a.p()) {
            this.f26876d.i().f26371r.b(this.f26876d.b().a());
        }
        long j3 = j2 - this.f26873a;
        if (z2 || j3 >= 1000) {
            if (!z3) {
                j3 = a(j2);
            }
            this.f26876d.m().K().b("Recording user engagement, ms", Long.valueOf(j3));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j3);
            zzop.X(this.f26876d.s().C(!this.f26876d.d().Z()), bundle, true);
            if (!z3) {
                this.f26876d.r().b1("auto", "_e", bundle);
            }
            this.f26873a = j2;
            this.f26875c.a();
            this.f26875c.b(((Long) zzbj.d0.a((Object) null)).longValue());
            return true;
        }
        this.f26876d.m().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
        return false;
    }

    public final void e(long j2) {
        this.f26875c.a();
    }

    public final void f(long j2) {
        this.f26876d.n();
        this.f26875c.a();
        this.f26873a = j2;
        this.f26874b = j2;
    }
}
