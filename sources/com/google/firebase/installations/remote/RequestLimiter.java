package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

class RequestLimiter {

    /* renamed from: d  reason: collision with root package name */
    public static final long f30865d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f30866e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final Utils f30867a = Utils.c();

    /* renamed from: b  reason: collision with root package name */
    public long f30868b;

    /* renamed from: c  reason: collision with root package name */
    public int f30869c;

    public static boolean c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    public static boolean d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    public final synchronized long a(int i2) {
        if (!c(i2)) {
            return f30865d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f30869c) + ((double) this.f30867a.e()), (double) f30866e);
    }

    public synchronized boolean b() {
        return this.f30869c == 0 || this.f30867a.a() > this.f30868b;
    }

    public final synchronized void e() {
        this.f30869c = 0;
    }

    public synchronized void f(int i2) {
        if (d(i2)) {
            e();
            return;
        }
        this.f30869c++;
        this.f30868b = this.f30867a.a() + a(i2);
    }
}
