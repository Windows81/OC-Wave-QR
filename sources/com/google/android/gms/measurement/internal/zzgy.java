package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgy {

    /* renamed from: a  reason: collision with root package name */
    public final String f26391a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26392b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26393c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26394d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzgu f26395e;

    public final Pair a() {
        long j2;
        this.f26395e.n();
        this.f26395e.n();
        long c2 = c();
        if (c2 == 0) {
            d();
            j2 = 0;
        } else {
            j2 = Math.abs(c2 - this.f26395e.b().a());
        }
        long j3 = this.f26394d;
        if (j2 < j3) {
            return null;
        }
        if (j2 > (j3 << 1)) {
            d();
            return null;
        }
        String string = this.f26395e.J().getString(this.f26393c, (String) null);
        long j4 = this.f26395e.J().getLong(this.f26392b, 0);
        d();
        return (string == null || j4 <= 0) ? zzgu.f26354B : new Pair(string, Long.valueOf(j4));
    }

    public final void b(String str, long j2) {
        this.f26395e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.f26395e.J().getLong(this.f26392b, 0);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.f26395e.J().edit();
            edit.putString(this.f26393c, str);
            edit.putLong(this.f26392b, 1);
            edit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z2 = (this.f26395e.j().W0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor edit2 = this.f26395e.J().edit();
        if (z2) {
            edit2.putString(this.f26393c, str);
        }
        edit2.putLong(this.f26392b, j4);
        edit2.apply();
    }

    public final long c() {
        return this.f26395e.J().getLong(this.f26391a, 0);
    }

    public final void d() {
        this.f26395e.n();
        long a2 = this.f26395e.b().a();
        SharedPreferences.Editor edit = this.f26395e.J().edit();
        edit.remove(this.f26392b);
        edit.remove(this.f26393c);
        edit.putLong(this.f26391a, a2);
        edit.apply();
    }

    public zzgy(zzgu zzgu, String str, long j2) {
        this.f26395e = zzgu;
        Preconditions.g(str);
        Preconditions.a(j2 > 0);
        this.f26391a = str + ":start";
        this.f26392b = str + ":count";
        this.f26393c = str + ":value";
        this.f26394d = j2;
    }
}
