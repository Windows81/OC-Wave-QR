package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdh;

abstract class zzax {

    /* renamed from: d  reason: collision with root package name */
    public static volatile Handler f26215d;

    /* renamed from: a  reason: collision with root package name */
    public final zzja f26216a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f26217b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f26218c;

    public zzax(zzja zzja) {
        Preconditions.m(zzja);
        this.f26216a = zzja;
        this.f26217b = new zzaw(this, zzja);
    }

    public final void a() {
        this.f26218c = 0;
        f().removeCallbacks(this.f26217b);
    }

    public final void b(long j2) {
        a();
        if (j2 >= 0) {
            this.f26218c = this.f26216a.b().a();
            if (!f().postDelayed(this.f26217b, j2)) {
                this.f26216a.m().G().b("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f26218c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (f26215d != null) {
            return f26215d;
        }
        synchronized (zzax.class) {
            try {
                if (f26215d == null) {
                    f26215d = new zzdh(this.f26216a.a().getMainLooper());
                }
                handler = f26215d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
