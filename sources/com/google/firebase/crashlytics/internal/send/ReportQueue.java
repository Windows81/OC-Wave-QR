package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class ReportQueue {

    /* renamed from: a  reason: collision with root package name */
    public final double f30629a;

    /* renamed from: b  reason: collision with root package name */
    public final double f30630b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30631c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30632d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30633e;

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue f30634f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f30635g;

    /* renamed from: h  reason: collision with root package name */
    public final Transport f30636h;

    /* renamed from: i  reason: collision with root package name */
    public final OnDemandCounter f30637i;

    /* renamed from: j  reason: collision with root package name */
    public int f30638j;

    /* renamed from: k  reason: collision with root package name */
    public long f30639k;

    public final class ReportRunnable implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final TaskCompletionSource f30640A;

        /* renamed from: z  reason: collision with root package name */
        public final CrashlyticsReportWithSessionId f30642z;

        public void run() {
            ReportQueue.this.p(this.f30642z, this.f30640A);
            ReportQueue.this.f30637i.c();
            double e2 = ReportQueue.this.g();
            Logger f2 = Logger.f();
            f2.b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e2 / 1000.0d)}) + " s for report: " + this.f30642z.d());
            ReportQueue.q(e2);
        }

        public ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.f30642z = crashlyticsReportWithSessionId;
            this.f30640A = taskCompletionSource;
        }
    }

    public ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.f30658f, settings.f30659g, ((long) settings.f30660h) * 1000, transport, onDemandCounter);
    }

    public static void q(double d2) {
        try {
            Thread.sleep((long) d2);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.f30629a) * Math.pow(this.f30630b, (double) h()));
    }

    public final int h() {
        if (this.f30639k == 0) {
            this.f30639k = o();
        }
        int o2 = (int) ((o() - this.f30639k) / this.f30631c);
        int min = l() ? Math.min(100, this.f30638j + o2) : Math.max(0, this.f30638j - o2);
        if (this.f30638j != min) {
            this.f30638j = min;
            this.f30639k = o();
        }
        return min;
    }

    public TaskCompletionSource i(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z2) {
        synchronized (this.f30634f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (z2) {
                    this.f30637i.b();
                    if (k()) {
                        Logger f2 = Logger.f();
                        f2.b("Enqueueing report: " + crashlyticsReportWithSessionId.d());
                        Logger f3 = Logger.f();
                        f3.b("Queue size: " + this.f30634f.size());
                        this.f30635g.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                        Logger f4 = Logger.f();
                        f4.b("Closing task for report: " + crashlyticsReportWithSessionId.d());
                        taskCompletionSource.e(crashlyticsReportWithSessionId);
                        return taskCompletionSource;
                    }
                    h();
                    Logger f5 = Logger.f();
                    f5.b("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.d());
                    this.f30637i.a();
                    taskCompletionSource.e(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                p(crashlyticsReportWithSessionId, taskCompletionSource);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new c(this, countDownLatch)).start();
        Utils.g(countDownLatch, 2, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f30634f.size() < this.f30633e;
    }

    public final boolean l() {
        return this.f30634f.size() == this.f30633e;
    }

    public final /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            ForcedSender.a(this.f30636h, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public final /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.d(exc);
            return;
        }
        if (z2) {
            j();
        }
        taskCompletionSource.e(crashlyticsReportWithSessionId);
    }

    public final long o() {
        return System.currentTimeMillis();
    }

    public final void p(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
        Logger f2 = Logger.f();
        f2.b("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.d());
        this.f30636h.b(Event.g(crashlyticsReportWithSessionId.b()), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.f30632d < 2000, crashlyticsReportWithSessionId));
    }

    public ReportQueue(double d2, double d3, long j2, Transport transport, OnDemandCounter onDemandCounter) {
        this.f30629a = d2;
        this.f30630b = d3;
        this.f30631c = j2;
        this.f30636h = transport;
        this.f30637i = onDemandCounter;
        this.f30632d = SystemClock.elapsedRealtime();
        int i2 = (int) d2;
        this.f30633e = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f30634f = arrayBlockingQueue;
        this.f30635g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f30638j = 0;
        this.f30639k = 0;
    }
}
