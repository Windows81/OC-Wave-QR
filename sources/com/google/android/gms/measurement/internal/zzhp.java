package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class zzhp extends zzix {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f26465l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public zzht f26466c;

    /* renamed from: d  reason: collision with root package name */
    public zzht f26467d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f26468e = new PriorityBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue f26469f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26470g = new zzhr(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26471h = new zzhr(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f26472i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f26473j = new Semaphore(2);

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f26474k;

    public zzhp(zzhw zzhw) {
        super(zzhw);
    }

    public final Future B(Callable callable) {
        p();
        Preconditions.m(callable);
        zzhu zzhu = new zzhu(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f26466c) {
            zzhu.run();
        } else {
            y(zzhu);
        }
        return zzhu;
    }

    public final void D(Runnable runnable) {
        p();
        Preconditions.m(runnable);
        y(new zzhu(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        p();
        Preconditions.m(runnable);
        y(new zzhu(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return Thread.currentThread() == this.f26466c;
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final void k() {
        if (Thread.currentThread() != this.f26467d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final void n() {
        if (Thread.currentThread() != this.f26466c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean t() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = m().L();
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = m().L();
        r3.a("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzhp r0 = r1.f()     // Catch:{ all -> 0x002c }
            r0.D(r6)     // Catch:{ all -> 0x002c }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.zzgi r3 = r1.m()
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.a(r4)
        L_0x002b:
            return r2
        L_0x002c:
            r3 = move-exception
            goto L_0x004a
        L_0x002e:
            com.google.android.gms.measurement.internal.zzgi r3 = r1.m()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.L()     // Catch:{ all -> 0x002c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x002c }
            r4.append(r5)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x002c }
            r3.a(r4)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            r2 = 0
            return r2
        L_0x004a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhp.v(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final Future w(Callable callable) {
        p();
        Preconditions.m(callable);
        zzhu zzhu = new zzhu(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f26466c) {
            if (!this.f26468e.isEmpty()) {
                m().L().a("Callable skipped the worker queue.");
            }
            zzhu.run();
        } else {
            y(zzhu);
        }
        return zzhu;
    }

    public final void y(zzhu zzhu) {
        synchronized (this.f26472i) {
            try {
                this.f26468e.add(zzhu);
                zzht zzht = this.f26466c;
                if (zzht == null) {
                    zzht zzht2 = new zzht(this, "Measurement Worker", this.f26468e);
                    this.f26466c = zzht2;
                    zzht2.setUncaughtExceptionHandler(this.f26470g);
                    this.f26466c.start();
                } else {
                    zzht.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        p();
        Preconditions.m(runnable);
        zzhu zzhu = new zzhu(this, runnable, false, "Task exception on network thread");
        synchronized (this.f26472i) {
            try {
                this.f26469f.add(zzhu);
                zzht zzht = this.f26467d;
                if (zzht == null) {
                    zzht zzht2 = new zzht(this, "Measurement Network", this.f26469f);
                    this.f26467d = zzht2;
                    zzht2.setUncaughtExceptionHandler(this.f26471h);
                    this.f26467d.start();
                } else {
                    zzht.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
