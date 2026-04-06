package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f29916c = new Logger("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    public final String f29917a;

    /* renamed from: b  reason: collision with root package name */
    public int f29918b = 4;

    public Logger(String str) {
        this.f29917a = str;
    }

    public static Logger f() {
        return f29916c;
    }

    public final boolean a(int i2) {
        return this.f29918b <= i2 || Log.isLoggable(this.f29917a, i2);
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f29917a, str, th);
        }
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f29917a, str, th);
        }
    }

    public void g(String str) {
        h(str, (Throwable) null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f29917a, str, th);
        }
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f29917a, str, th);
        }
    }

    public void k(String str) {
        l(str, (Throwable) null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f29917a, str, th);
        }
    }
}
