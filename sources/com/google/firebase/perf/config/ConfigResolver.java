package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

public class ConfigResolver {

    /* renamed from: d  reason: collision with root package name */
    public static final AndroidLogger f30918d = AndroidLogger.e();

    /* renamed from: e  reason: collision with root package name */
    public static volatile ConfigResolver f30919e;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteConfigManager f30920a;

    /* renamed from: b  reason: collision with root package name */
    public ImmutableBundle f30921b;

    /* renamed from: c  reason: collision with root package name */
    public DeviceCacheManager f30922c;

    public ConfigResolver(RemoteConfigManager remoteConfigManager, ImmutableBundle immutableBundle, DeviceCacheManager deviceCacheManager) {
        this.f30920a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f30921b = immutableBundle == null ? new ImmutableBundle() : immutableBundle;
        this.f30922c = deviceCacheManager == null ? DeviceCacheManager.e() : deviceCacheManager;
    }

    public static synchronized ConfigResolver g() {
        ConfigResolver configResolver;
        synchronized (ConfigResolver.class) {
            try {
                if (f30919e == null) {
                    f30919e = new ConfigResolver((RemoteConfigManager) null, (ImmutableBundle) null, (DeviceCacheManager) null);
                }
                configResolver = f30919e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return configResolver;
    }

    public long A() {
        ConfigurationConstants.SessionsMaxDurationMinutes e2 = ConfigurationConstants.SessionsMaxDurationMinutes.e();
        Optional p2 = p(e2);
        if (p2.d() && M(((Long) p2.c()).longValue())) {
            return ((Long) p2.c()).longValue();
        }
        Optional w2 = w(e2);
        if (!w2.d() || !M(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !M(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public long B() {
        ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs e2 = ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs.e();
        Optional p2 = p(e2);
        if (p2.d() && J(((Long) p2.c()).longValue())) {
            return ((Long) p2.c()).longValue();
        }
        Optional w2 = w(e2);
        if (!w2.d() || !J(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !J(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public long C() {
        ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs f2 = ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs.f();
        Optional p2 = p(f2);
        if (p2.d() && J(((Long) p2.c()).longValue())) {
            return ((Long) p2.c()).longValue();
        }
        Optional w2 = w(f2);
        if (!w2.d() || !J(((Long) w2.c()).longValue())) {
            Optional d2 = d(f2);
            return (!d2.d() || !J(((Long) d2.c()).longValue())) ? this.f30920a.isLastFetchFailed() ? f2.e().longValue() : f2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(f2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public double D() {
        ConfigurationConstants.SessionsSamplingRate f2 = ConfigurationConstants.SessionsSamplingRate.f();
        Optional o2 = o(f2);
        if (o2.d()) {
            double doubleValue = ((Double) o2.c()).doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        Optional v2 = v(f2);
        if (!v2.d() || !L(((Double) v2.c()).doubleValue())) {
            Optional c2 = c(f2);
            return (!c2.d() || !L(((Double) c2.c()).doubleValue())) ? this.f30920a.isLastFetchFailed() ? f2.e().doubleValue() : f2.d().doubleValue() : ((Double) c2.c()).doubleValue();
        }
        this.f30922c.j(f2.a(), ((Double) v2.c()).doubleValue());
        return ((Double) v2.c()).doubleValue();
    }

    public long E() {
        ConfigurationConstants.TraceEventCountBackground e2 = ConfigurationConstants.TraceEventCountBackground.e();
        Optional w2 = w(e2);
        if (!w2.d() || !H(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !H(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public long F() {
        ConfigurationConstants.TraceEventCountForeground e2 = ConfigurationConstants.TraceEventCountForeground.e();
        Optional w2 = w(e2);
        if (!w2.d() || !H(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !H(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public double G() {
        ConfigurationConstants.TraceSamplingRate f2 = ConfigurationConstants.TraceSamplingRate.f();
        Optional v2 = v(f2);
        if (!v2.d() || !L(((Double) v2.c()).doubleValue())) {
            Optional c2 = c(f2);
            return (!c2.d() || !L(((Double) c2.c()).doubleValue())) ? this.f30920a.isLastFetchFailed() ? f2.e().doubleValue() : f2.d().doubleValue() : ((Double) c2.c()).doubleValue();
        }
        this.f30922c.j(f2.a(), ((Double) v2.c()).doubleValue());
        return ((Double) v2.c()).doubleValue();
    }

    public final boolean H(long j2) {
        return j2 >= 0;
    }

    public final boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(BuildConfig.f30891b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(long j2) {
        return j2 >= 0;
    }

    public boolean K() {
        Boolean j2 = j();
        return (j2 == null || j2.booleanValue()) && m();
    }

    public final boolean L(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final boolean M(long j2) {
        return j2 > 0;
    }

    public final boolean N(long j2) {
        return j2 > 0;
    }

    public void O(Context context) {
        f30918d.i(Utils.b(context));
        this.f30922c.i(context);
    }

    public void P(ImmutableBundle immutableBundle) {
        this.f30921b = immutableBundle;
    }

    public String a() {
        String f2;
        ConfigurationConstants.LogSourceName e2 = ConfigurationConstants.LogSourceName.e();
        if (BuildConfig.f30890a.booleanValue()) {
            return e2.d();
        }
        String c2 = e2.c();
        long j2 = -1;
        if (c2 != null) {
            j2 = ((Long) this.f30920a.getRemoteConfigValueOrDefault(c2, -1L)).longValue();
        }
        String a2 = e2.a();
        if (!ConfigurationConstants.LogSourceName.g(j2) || (f2 = ConfigurationConstants.LogSourceName.f(j2)) == null) {
            Optional e3 = e(e2);
            return e3.d() ? (String) e3.c() : e2.d();
        }
        this.f30922c.l(a2, f2);
        return f2;
    }

    public final Optional b(ConfigurationFlag configurationFlag) {
        return this.f30922c.b(configurationFlag.a());
    }

    public final Optional c(ConfigurationFlag configurationFlag) {
        return this.f30922c.c(configurationFlag.a());
    }

    public final Optional d(ConfigurationFlag configurationFlag) {
        return this.f30922c.f(configurationFlag.a());
    }

    public final Optional e(ConfigurationFlag configurationFlag) {
        return this.f30922c.g(configurationFlag.a());
    }

    public double f() {
        ConfigurationConstants.FragmentSamplingRate e2 = ConfigurationConstants.FragmentSamplingRate.e();
        Optional o2 = o(e2);
        if (o2.d()) {
            double doubleValue = ((Double) o2.c()).doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        Optional v2 = v(e2);
        if (!v2.d() || !L(((Double) v2.c()).doubleValue())) {
            Optional c2 = c(e2);
            return (!c2.d() || !L(((Double) c2.c()).doubleValue())) ? e2.d().doubleValue() : ((Double) c2.c()).doubleValue();
        }
        this.f30922c.j(e2.a(), ((Double) v2.c()).doubleValue());
        return ((Double) v2.c()).doubleValue();
    }

    public boolean h() {
        ConfigurationConstants.ExperimentTTID e2 = ConfigurationConstants.ExperimentTTID.e();
        Optional n2 = n(e2);
        if (n2.d()) {
            return ((Boolean) n2.c()).booleanValue();
        }
        Optional u2 = u(e2);
        if (u2.d()) {
            this.f30922c.m(e2.a(), ((Boolean) u2.c()).booleanValue());
            return ((Boolean) u2.c()).booleanValue();
        }
        Optional b2 = b(e2);
        return b2.d() ? ((Boolean) b2.c()).booleanValue() : e2.d().booleanValue();
    }

    public Boolean i() {
        ConfigurationConstants.CollectionDeactivated e2 = ConfigurationConstants.CollectionDeactivated.e();
        Optional n2 = n(e2);
        return n2.d() ? (Boolean) n2.c() : e2.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        ConfigurationConstants.CollectionEnabled d2 = ConfigurationConstants.CollectionEnabled.d();
        Optional b2 = b(d2);
        if (b2.d()) {
            return (Boolean) b2.c();
        }
        Optional n2 = n(d2);
        if (n2.d()) {
            return (Boolean) n2.c();
        }
        return null;
    }

    public final boolean k() {
        ConfigurationConstants.SdkEnabled e2 = ConfigurationConstants.SdkEnabled.e();
        Optional u2 = u(e2);
        if (!u2.d()) {
            Optional b2 = b(e2);
            return b2.d() ? ((Boolean) b2.c()).booleanValue() : e2.d().booleanValue();
        } else if (this.f30920a.isLastFetchFailed()) {
            return false;
        } else {
            this.f30922c.m(e2.a(), ((Boolean) u2.c()).booleanValue());
            return ((Boolean) u2.c()).booleanValue();
        }
    }

    public final boolean l() {
        ConfigurationConstants.SdkDisabledVersions e2 = ConfigurationConstants.SdkDisabledVersions.e();
        Optional x2 = x(e2);
        if (x2.d()) {
            this.f30922c.l(e2.a(), (String) x2.c());
            return I((String) x2.c());
        }
        Optional e3 = e(e2);
        return e3.d() ? I((String) e3.c()) : I(e2.d());
    }

    public boolean m() {
        return k() && !l();
    }

    public final Optional n(ConfigurationFlag configurationFlag) {
        return this.f30921b.b(configurationFlag.b());
    }

    public final Optional o(ConfigurationFlag configurationFlag) {
        return this.f30921b.c(configurationFlag.b());
    }

    public final Optional p(ConfigurationFlag configurationFlag) {
        return this.f30921b.e(configurationFlag.b());
    }

    public long q() {
        ConfigurationConstants.NetworkEventCountBackground e2 = ConfigurationConstants.NetworkEventCountBackground.e();
        Optional w2 = w(e2);
        if (!w2.d() || !H(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !H(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public long r() {
        ConfigurationConstants.NetworkEventCountForeground e2 = ConfigurationConstants.NetworkEventCountForeground.e();
        Optional w2 = w(e2);
        if (!w2.d() || !H(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !H(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public double s() {
        ConfigurationConstants.NetworkRequestSamplingRate f2 = ConfigurationConstants.NetworkRequestSamplingRate.f();
        Optional v2 = v(f2);
        if (!v2.d() || !L(((Double) v2.c()).doubleValue())) {
            Optional c2 = c(f2);
            return (!c2.d() || !L(((Double) c2.c()).doubleValue())) ? this.f30920a.isLastFetchFailed() ? f2.e().doubleValue() : f2.d().doubleValue() : ((Double) c2.c()).doubleValue();
        }
        this.f30922c.j(f2.a(), ((Double) v2.c()).doubleValue());
        return ((Double) v2.c()).doubleValue();
    }

    public long t() {
        ConfigurationConstants.RateLimitSec e2 = ConfigurationConstants.RateLimitSec.e();
        Optional w2 = w(e2);
        if (!w2.d() || !N(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !N(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public final Optional u(ConfigurationFlag configurationFlag) {
        return this.f30920a.getBoolean(configurationFlag.c());
    }

    public final Optional v(ConfigurationFlag configurationFlag) {
        return this.f30920a.getDouble(configurationFlag.c());
    }

    public final Optional w(ConfigurationFlag configurationFlag) {
        return this.f30920a.getLong(configurationFlag.c());
    }

    public final Optional x(ConfigurationFlag configurationFlag) {
        return this.f30920a.getString(configurationFlag.c());
    }

    public long y() {
        ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs e2 = ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs.e();
        Optional p2 = p(e2);
        if (p2.d() && J(((Long) p2.c()).longValue())) {
            return ((Long) p2.c()).longValue();
        }
        Optional w2 = w(e2);
        if (!w2.d() || !J(((Long) w2.c()).longValue())) {
            Optional d2 = d(e2);
            return (!d2.d() || !J(((Long) d2.c()).longValue())) ? e2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(e2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }

    public long z() {
        ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs f2 = ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs.f();
        Optional p2 = p(f2);
        if (p2.d() && J(((Long) p2.c()).longValue())) {
            return ((Long) p2.c()).longValue();
        }
        Optional w2 = w(f2);
        if (!w2.d() || !J(((Long) w2.c()).longValue())) {
            Optional d2 = d(f2);
            return (!d2.d() || !J(((Long) d2.c()).longValue())) ? this.f30920a.isLastFetchFailed() ? f2.e().longValue() : f2.d().longValue() : ((Long) d2.c()).longValue();
        }
        this.f30922c.k(f2.a(), ((Long) w2.c()).longValue());
        return ((Long) w2.c()).longValue();
    }
}
