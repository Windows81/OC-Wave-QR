package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CpuGaugeCollector {

    /* renamed from: g  reason: collision with root package name */
    public static final AndroidLogger f31036g = AndroidLogger.e();

    /* renamed from: h  reason: collision with root package name */
    public static final long f31037h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue f31038a = new ConcurrentLinkedQueue();

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f31039b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c  reason: collision with root package name */
    public final String f31040c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31041d;

    /* renamed from: e  reason: collision with root package name */
    public ScheduledFuture f31042e = null;

    /* renamed from: f  reason: collision with root package name */
    public long f31043f = -1;

    public CpuGaugeCollector() {
        int myPid = Process.myPid();
        this.f31040c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f31041d = e();
    }

    public static boolean f(long j2) {
        return j2 <= 0;
    }

    public void c(Timer timer) {
        i(timer);
    }

    public final long d(long j2) {
        return Math.round((((double) j2) / ((double) this.f31041d)) * ((double) f31037h));
    }

    public final long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public final /* synthetic */ void g(Timer timer) {
        CpuMetricReading m2 = m(timer);
        if (m2 != null) {
            this.f31038a.add(m2);
        }
    }

    public final /* synthetic */ void h(Timer timer) {
        CpuMetricReading m2 = m(timer);
        if (m2 != null) {
            this.f31038a.add(m2);
        }
    }

    public final synchronized void i(Timer timer) {
        try {
            this.f31039b.schedule(new b(this, timer), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            AndroidLogger androidLogger = f31036g;
            androidLogger.j("Unable to collect Cpu Metric: " + e2.getMessage());
        }
    }

    public final synchronized void j(long j2, Timer timer) {
        this.f31043f = j2;
        try {
            this.f31042e = this.f31039b.scheduleAtFixedRate(new a(this, timer), 0, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            AndroidLogger androidLogger = f31036g;
            androidLogger.j("Unable to start collecting Cpu Metrics: " + e2.getMessage());
        }
    }

    public void k(long j2, Timer timer) {
        long j3 = this.f31041d;
        if (j3 != -1 && j3 != 0 && !f(j2)) {
            if (this.f31042e == null) {
                j(j2, timer);
            } else if (this.f31043f != j2) {
                l();
                j(j2, timer);
            }
        }
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.f31042e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f31042e = null;
            this.f31043f = -1;
        }
    }

    public final CpuMetricReading m(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f31040c));
            long b2 = timer.b();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            CpuMetricReading cpuMetricReading = (CpuMetricReading) CpuMetricReading.i0().O(b2).P(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).R(d(parseLong + parseLong2)).d();
            bufferedReader.close();
            return cpuMetricReading;
        } catch (IOException e2) {
            AndroidLogger androidLogger = f31036g;
            androidLogger.j("Unable to read 'proc/[pid]/stat' file: " + e2.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e3) {
            AndroidLogger androidLogger2 = f31036g;
            androidLogger2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
