package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

final class RateLimiter {

    /* renamed from: a  reason: collision with root package name */
    public final ConfigResolver f31076a;

    /* renamed from: b  reason: collision with root package name */
    public final double f31077b;

    /* renamed from: c  reason: collision with root package name */
    public final double f31078c;

    /* renamed from: d  reason: collision with root package name */
    public RateLimiterImpl f31079d;

    /* renamed from: e  reason: collision with root package name */
    public RateLimiterImpl f31080e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f31081f;

    public static class RateLimiterImpl {

        /* renamed from: k  reason: collision with root package name */
        public static final AndroidLogger f31082k = AndroidLogger.e();

        /* renamed from: l  reason: collision with root package name */
        public static final long f31083l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        public final Clock f31084a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f31085b;

        /* renamed from: c  reason: collision with root package name */
        public Timer f31086c;

        /* renamed from: d  reason: collision with root package name */
        public Rate f31087d;

        /* renamed from: e  reason: collision with root package name */
        public long f31088e;

        /* renamed from: f  reason: collision with root package name */
        public double f31089f;

        /* renamed from: g  reason: collision with root package name */
        public Rate f31090g;

        /* renamed from: h  reason: collision with root package name */
        public Rate f31091h;

        /* renamed from: i  reason: collision with root package name */
        public long f31092i;

        /* renamed from: j  reason: collision with root package name */
        public long f31093j;

        public RateLimiterImpl(Rate rate, long j2, Clock clock, ConfigResolver configResolver, String str, boolean z2) {
            this.f31084a = clock;
            this.f31088e = j2;
            this.f31087d = rate;
            this.f31089f = (double) j2;
            this.f31086c = clock.a();
            g(configResolver, str, z2);
            this.f31085b = z2;
        }

        public static long c(ConfigResolver configResolver, String str) {
            return str == "Trace" ? configResolver.E() : configResolver.q();
        }

        public static long d(ConfigResolver configResolver, String str) {
            return str == "Trace" ? configResolver.t() : configResolver.t();
        }

        public static long e(ConfigResolver configResolver, String str) {
            return str == "Trace" ? configResolver.F() : configResolver.r();
        }

        public static long f(ConfigResolver configResolver, String str) {
            return str == "Trace" ? configResolver.t() : configResolver.t();
        }

        public synchronized void a(boolean z2) {
            Rate rate;
            if (z2) {
                try {
                    rate = this.f31090g;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            } else {
                rate = this.f31091h;
            }
            this.f31087d = rate;
            this.f31088e = z2 ? this.f31092i : this.f31093j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean b(com.google.firebase.perf.v1.PerfMetric r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                com.google.firebase.perf.util.Clock r5 = r4.f31084a     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.Timer r5 = r5.a()     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.Timer r0 = r4.f31086c     // Catch:{ all -> 0x002e }
                long r0 = r0.d(r5)     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                com.google.firebase.perf.util.Rate r2 = r4.f31087d     // Catch:{ all -> 0x002e }
                double r2 = r2.a()     // Catch:{ all -> 0x002e }
                double r0 = r0 * r2
                long r2 = f31083l     // Catch:{ all -> 0x002e }
                double r2 = (double) r2     // Catch:{ all -> 0x002e }
                double r0 = r0 / r2
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0030
                double r2 = r4.f31089f     // Catch:{ all -> 0x002e }
                double r2 = r2 + r0
                long r0 = r4.f31088e     // Catch:{ all -> 0x002e }
                double r0 = (double) r0     // Catch:{ all -> 0x002e }
                double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x002e }
                r4.f31089f = r0     // Catch:{ all -> 0x002e }
                r4.f31086c = r5     // Catch:{ all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r5 = move-exception
                goto L_0x004c
            L_0x0030:
                double r0 = r4.f31089f     // Catch:{ all -> 0x002e }
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L_0x003e
                double r0 = r0 - r2
                r4.f31089f = r0     // Catch:{ all -> 0x002e }
                monitor-exit(r4)
                r5 = 1
                return r5
            L_0x003e:
                boolean r5 = r4.f31085b     // Catch:{ all -> 0x002e }
                if (r5 == 0) goto L_0x0049
                com.google.firebase.perf.logging.AndroidLogger r5 = f31082k     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "Exceeded log rate limit, dropping the log."
                r5.j(r0)     // Catch:{ all -> 0x002e }
            L_0x0049:
                monitor-exit(r4)
                r5 = 0
                return r5
            L_0x004c:
                monitor-exit(r4)     // Catch:{ all -> 0x002e }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.RateLimiter.RateLimiterImpl.b(com.google.firebase.perf.v1.PerfMetric):boolean");
        }

        public final void g(ConfigResolver configResolver, String str, boolean z2) {
            String str2 = str;
            long f2 = f(configResolver, str);
            long e2 = e(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(e2, f2, timeUnit);
            this.f31090g = rate;
            this.f31092i = e2;
            if (z2) {
                f31082k.b("Foreground %s logging rate:%f, burst capacity:%d", str2, rate, Long.valueOf(e2));
            }
            long d2 = d(configResolver, str);
            long c2 = c(configResolver, str);
            Rate rate2 = new Rate(c2, d2, timeUnit);
            this.f31091h = rate2;
            this.f31093j = c2;
            if (z2) {
                f31082k.b("Background %s logging rate:%f, capacity:%d", str2, rate2, Long.valueOf(c2));
            }
        }
    }

    public RateLimiter(Context context, Rate rate, long j2) {
        this(rate, j2, new Clock(), b(), b(), ConfigResolver.g());
        this.f31081f = Utils.b(context);
    }

    public static double b() {
        return new Random().nextDouble();
    }

    public void a(boolean z2) {
        this.f31079d.a(z2);
        this.f31080e.a(z2);
    }

    public final boolean c(List list) {
        return list.size() > 0 && ((PerfSession) list.get(0)).k0() > 0 && ((PerfSession) list.get(0)).j0(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    public final boolean d() {
        return this.f31078c < this.f31076a.f();
    }

    public final boolean e() {
        return this.f31077b < this.f31076a.s();
    }

    public final boolean f() {
        return this.f31077b < this.f31076a.G();
    }

    public boolean g(PerfMetric perfMetric) {
        if (!j(perfMetric)) {
            return false;
        }
        if (perfMetric.o()) {
            return !this.f31080e.b(perfMetric);
        }
        if (perfMetric.l()) {
            return !this.f31079d.b(perfMetric);
        }
        return true;
    }

    public boolean h(PerfMetric perfMetric) {
        if (perfMetric.l() && !f() && !c(perfMetric.n().D0())) {
            return false;
        }
        if (!i(perfMetric) || d() || c(perfMetric.n().D0())) {
            return !perfMetric.o() || e() || c(perfMetric.p().z0());
        }
        return false;
    }

    public boolean i(PerfMetric perfMetric) {
        return perfMetric.l() && perfMetric.n().C0().startsWith("_st_") && perfMetric.n().s0("Hosting_activity");
    }

    public boolean j(PerfMetric perfMetric) {
        return (!perfMetric.l() || ((!perfMetric.n().C0().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) && !perfMetric.n().C0().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.n().v0() <= 0)) && !perfMetric.j();
    }

    public RateLimiter(Rate rate, long j2, Clock clock, double d2, double d3, ConfigResolver configResolver) {
        double d4 = d2;
        double d5 = d3;
        this.f31079d = null;
        this.f31080e = null;
        boolean z2 = false;
        this.f31081f = false;
        Utils.a(0.0d <= d4 && d4 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d5 && d5 < 1.0d) {
            z2 = true;
        }
        Utils.a(z2, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f31077b = d4;
        this.f31078c = d5;
        this.f31076a = configResolver;
        Rate rate2 = rate;
        long j3 = j2;
        Clock clock2 = clock;
        ConfigResolver configResolver2 = configResolver;
        this.f31079d = new RateLimiterImpl(rate2, j3, clock2, configResolver2, "Trace", this.f31081f);
        this.f31080e = new RateLimiterImpl(rate2, j3, clock2, configResolver2, "Network", this.f31081f);
    }
}
