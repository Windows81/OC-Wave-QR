package com.google.firebase.perf.logging;

import java.util.Locale;

public class AndroidLogger {

    /* renamed from: c  reason: collision with root package name */
    public static volatile AndroidLogger f30972c;

    /* renamed from: a  reason: collision with root package name */
    public final LogWrapper f30973a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30974b;

    public AndroidLogger(LogWrapper logWrapper) {
        this.f30974b = false;
        this.f30973a = logWrapper == null ? LogWrapper.c() : logWrapper;
    }

    public static AndroidLogger e() {
        if (f30972c == null) {
            synchronized (AndroidLogger.class) {
                try {
                    if (f30972c == null) {
                        f30972c = new AndroidLogger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30972c;
    }

    public void a(String str) {
        if (this.f30974b) {
            this.f30973a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f30974b) {
            this.f30973a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f30974b) {
            this.f30973a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f30974b) {
            this.f30973a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f30974b) {
            this.f30973a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f30974b) {
            this.f30973a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f30974b;
    }

    public void i(boolean z2) {
        this.f30974b = z2;
    }

    public void j(String str) {
        if (this.f30974b) {
            this.f30973a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f30974b) {
            this.f30973a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public AndroidLogger() {
        this((LogWrapper) null);
    }
}
