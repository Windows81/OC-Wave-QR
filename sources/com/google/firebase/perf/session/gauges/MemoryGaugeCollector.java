package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MemoryGaugeCollector {

    /* renamed from: f  reason: collision with root package name */
    public static final AndroidLogger f31050f = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f31051a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f31052b;

    /* renamed from: c  reason: collision with root package name */
    public final Runtime f31053c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f31054d;

    /* renamed from: e  reason: collision with root package name */
    public long f31055e;

    public MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static boolean e(long j2) {
        return j2 <= 0;
    }

    public void c(Timer timer) {
        h(timer);
    }

    public final int d() {
        return Utils.c(StorageUnit.BYTES.f(this.f31053c.totalMemory() - this.f31053c.freeMemory()));
    }

    public final /* synthetic */ void f(Timer timer) {
        AndroidMemoryReading l2 = l(timer);
        if (l2 != null) {
            this.f31052b.add(l2);
        }
    }

    public final /* synthetic */ void g(Timer timer) {
        AndroidMemoryReading l2 = l(timer);
        if (l2 != null) {
            this.f31052b.add(l2);
        }
    }

    public final synchronized void h(Timer timer) {
        try {
            this.f31051a.schedule(new i(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            AndroidLogger androidLogger = f31050f;
            androidLogger.j("Unable to collect Memory Metric: " + e2.getMessage());
        }
    }

    public final synchronized void i(long j2, Timer timer) {
        this.f31055e = j2;
        try {
            this.f31054d = this.f31051a.scheduleAtFixedRate(new h(this, timer), 0, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            AndroidLogger androidLogger = f31050f;
            androidLogger.j("Unable to start collecting Memory Metrics: " + e2.getMessage());
        }
    }

    public void j(long j2, Timer timer) {
        if (!e(j2)) {
            if (this.f31054d == null) {
                i(j2, timer);
            } else if (this.f31055e != j2) {
                k();
                i(j2, timer);
            }
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f31054d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f31054d = null;
            this.f31055e = -1;
        }
    }

    public final AndroidMemoryReading l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (AndroidMemoryReading) AndroidMemoryReading.h0().O(timer.b()).P(d()).d();
    }

    public MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f31054d = null;
        this.f31055e = -1;
        this.f31051a = scheduledExecutorService;
        this.f31052b = new ConcurrentLinkedQueue();
        this.f31053c = runtime;
    }
}
