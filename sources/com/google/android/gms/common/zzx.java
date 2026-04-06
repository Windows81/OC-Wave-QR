package com.google.android.gms.common;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
class zzx {

    /* renamed from: e  reason: collision with root package name */
    public static final zzx f25185e = new zzx(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25186a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25187b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f25188c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25189d;

    public zzx(boolean z2, int i2, int i3, String str, Throwable th) {
        this.f25186a = z2;
        this.f25189d = i2;
        this.f25187b = str;
        this.f25188c = th;
    }

    public static zzx b() {
        return f25185e;
    }

    public static zzx c(String str) {
        return new zzx(false, 1, 5, str, (Throwable) null);
    }

    public static zzx d(String str, Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx f(int i2) {
        return new zzx(true, i2, 1, (String) null, (Throwable) null);
    }

    public static zzx g(int i2, int i3, String str, Throwable th) {
        return new zzx(false, i2, i3, str, th);
    }

    public String a() {
        return this.f25187b;
    }

    public final void e() {
        if (!this.f25186a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f25188c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f25188c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }

    public /* synthetic */ zzx(boolean z2, int i2, int i3, String str, Throwable th, zzw zzw) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }
}
