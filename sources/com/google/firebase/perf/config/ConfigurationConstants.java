package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ConfigurationConstants {

    public static final class CollectionDeactivated extends ConfigurationFlag<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static CollectionDeactivated f30923a;

        public static synchronized CollectionDeactivated e() {
            CollectionDeactivated collectionDeactivated;
            synchronized (CollectionDeactivated.class) {
                try {
                    if (f30923a == null) {
                        f30923a = new CollectionDeactivated();
                    }
                    collectionDeactivated = f30923a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return collectionDeactivated;
        }

        public String b() {
            return "firebase_performance_collection_deactivated";
        }

        public Boolean d() {
            return Boolean.FALSE;
        }
    }

    public static final class CollectionEnabled extends ConfigurationFlag<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static CollectionEnabled f30924a;

        public static synchronized CollectionEnabled d() {
            CollectionEnabled collectionEnabled;
            synchronized (CollectionEnabled.class) {
                try {
                    if (f30924a == null) {
                        f30924a = new CollectionEnabled();
                    }
                    collectionEnabled = f30924a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return collectionEnabled;
        }

        public String a() {
            return "isEnabled";
        }

        public String b() {
            return "firebase_performance_collection_enabled";
        }
    }

    public static final class ExperimentTTID extends ConfigurationFlag<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ExperimentTTID f30925a;

        public static synchronized ExperimentTTID e() {
            ExperimentTTID experimentTTID;
            synchronized (ExperimentTTID.class) {
                try {
                    if (f30925a == null) {
                        f30925a = new ExperimentTTID();
                    }
                    experimentTTID = f30925a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return experimentTTID;
        }

        public String a() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        public String b() {
            return "experiment_app_start_ttid";
        }

        public String c() {
            return "fpr_experiment_app_start_ttid";
        }

        public Boolean d() {
            return Boolean.FALSE;
        }
    }

    public static final class FragmentSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a  reason: collision with root package name */
        public static FragmentSamplingRate f30926a;

        public static synchronized FragmentSamplingRate e() {
            FragmentSamplingRate fragmentSamplingRate;
            synchronized (FragmentSamplingRate.class) {
                try {
                    if (f30926a == null) {
                        f30926a = new FragmentSamplingRate();
                    }
                    fragmentSamplingRate = f30926a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return fragmentSamplingRate;
        }

        public String a() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        public String b() {
            return "fragment_sampling_percentage";
        }

        public String c() {
            return "fpr_vc_fragment_sampling_rate";
        }

        public Double d() {
            return Double.valueOf(0.0d);
        }
    }

    public static final class LogSourceName extends ConfigurationFlag<String> {

        /* renamed from: a  reason: collision with root package name */
        public static LogSourceName f30927a;

        /* renamed from: b  reason: collision with root package name */
        public static final Map f30928b = Collections.unmodifiableMap(new HashMap<Long, String>() {
            {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        });

        public static synchronized LogSourceName e() {
            LogSourceName logSourceName;
            synchronized (LogSourceName.class) {
                try {
                    if (f30927a == null) {
                        f30927a = new LogSourceName();
                    }
                    logSourceName = f30927a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return logSourceName;
        }

        public static String f(long j2) {
            return (String) f30928b.get(Long.valueOf(j2));
        }

        public static boolean g(long j2) {
            return f30928b.containsKey(Long.valueOf(j2));
        }

        public String a() {
            return "com.google.firebase.perf.LogSourceName";
        }

        public String c() {
            return "fpr_log_source";
        }

        public String d() {
            return BuildConfig.f30892c;
        }
    }

    public static final class NetworkEventCountBackground extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static NetworkEventCountBackground f30929a;

        public static synchronized NetworkEventCountBackground e() {
            NetworkEventCountBackground networkEventCountBackground;
            synchronized (NetworkEventCountBackground.class) {
                try {
                    if (f30929a == null) {
                        f30929a = new NetworkEventCountBackground();
                    }
                    networkEventCountBackground = f30929a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return networkEventCountBackground;
        }

        public String a() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        public String c() {
            return "fpr_rl_network_event_count_bg";
        }

        public Long d() {
            return 70L;
        }
    }

    public static final class NetworkEventCountForeground extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static NetworkEventCountForeground f30930a;

        public static synchronized NetworkEventCountForeground e() {
            NetworkEventCountForeground networkEventCountForeground;
            synchronized (NetworkEventCountForeground.class) {
                try {
                    if (f30930a == null) {
                        f30930a = new NetworkEventCountForeground();
                    }
                    networkEventCountForeground = f30930a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return networkEventCountForeground;
        }

        public String a() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        public String c() {
            return "fpr_rl_network_event_count_fg";
        }

        public Long d() {
            return 700L;
        }
    }

    public static final class NetworkRequestSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a  reason: collision with root package name */
        public static NetworkRequestSamplingRate f30931a;

        public static synchronized NetworkRequestSamplingRate f() {
            NetworkRequestSamplingRate networkRequestSamplingRate;
            synchronized (NetworkRequestSamplingRate.class) {
                try {
                    if (f30931a == null) {
                        f30931a = new NetworkRequestSamplingRate();
                    }
                    networkRequestSamplingRate = f30931a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return networkRequestSamplingRate;
        }

        public String a() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        public String c() {
            return "fpr_vc_network_request_sampling_rate";
        }

        public Double d() {
            return Double.valueOf(1.0d);
        }

        public Double e() {
            return Double.valueOf(d().doubleValue() / 1000.0d);
        }
    }

    public static final class RateLimitSec extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static RateLimitSec f30932a;

        public static synchronized RateLimitSec e() {
            RateLimitSec rateLimitSec;
            synchronized (RateLimitSec.class) {
                try {
                    if (f30932a == null) {
                        f30932a = new RateLimitSec();
                    }
                    rateLimitSec = f30932a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return rateLimitSec;
        }

        public String a() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        public String c() {
            return "fpr_rl_time_limit_sec";
        }

        public Long d() {
            return 600L;
        }
    }

    public static final class SdkDisabledVersions extends ConfigurationFlag<String> {

        /* renamed from: a  reason: collision with root package name */
        public static SdkDisabledVersions f30933a;

        public static synchronized SdkDisabledVersions e() {
            SdkDisabledVersions sdkDisabledVersions;
            synchronized (SdkDisabledVersions.class) {
                try {
                    if (f30933a == null) {
                        f30933a = new SdkDisabledVersions();
                    }
                    sdkDisabledVersions = f30933a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sdkDisabledVersions;
        }

        public String a() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        public String c() {
            return "fpr_disabled_android_versions";
        }

        public String d() {
            return "";
        }
    }

    public static final class SdkEnabled extends ConfigurationFlag<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static SdkEnabled f30934a;

        public static synchronized SdkEnabled e() {
            SdkEnabled sdkEnabled;
            synchronized (SdkEnabled.class) {
                try {
                    if (f30934a == null) {
                        f30934a = new SdkEnabled();
                    }
                    sdkEnabled = f30934a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sdkEnabled;
        }

        public String a() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        public String c() {
            return "fpr_enabled";
        }

        public Boolean d() {
            return Boolean.TRUE;
        }
    }

    public static final class SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsCpuCaptureFrequencyBackgroundMs f30935a;

        public static synchronized SessionsCpuCaptureFrequencyBackgroundMs e() {
            SessionsCpuCaptureFrequencyBackgroundMs sessionsCpuCaptureFrequencyBackgroundMs;
            synchronized (SessionsCpuCaptureFrequencyBackgroundMs.class) {
                try {
                    if (f30935a == null) {
                        f30935a = new SessionsCpuCaptureFrequencyBackgroundMs();
                    }
                    sessionsCpuCaptureFrequencyBackgroundMs = f30935a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsCpuCaptureFrequencyBackgroundMs;
        }

        public String a() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        public String b() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        public String c() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        public Long d() {
            return 0L;
        }
    }

    public static final class SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsCpuCaptureFrequencyForegroundMs f30936a;

        public static synchronized SessionsCpuCaptureFrequencyForegroundMs f() {
            SessionsCpuCaptureFrequencyForegroundMs sessionsCpuCaptureFrequencyForegroundMs;
            synchronized (SessionsCpuCaptureFrequencyForegroundMs.class) {
                try {
                    if (f30936a == null) {
                        f30936a = new SessionsCpuCaptureFrequencyForegroundMs();
                    }
                    sessionsCpuCaptureFrequencyForegroundMs = f30936a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsCpuCaptureFrequencyForegroundMs;
        }

        public String a() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        public String b() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        public String c() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        public Long d() {
            return 100L;
        }

        public Long e() {
            return Long.valueOf(d().longValue() * 3);
        }
    }

    public static final class SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsMaxDurationMinutes f30937a;

        public static synchronized SessionsMaxDurationMinutes e() {
            SessionsMaxDurationMinutes sessionsMaxDurationMinutes;
            synchronized (SessionsMaxDurationMinutes.class) {
                try {
                    if (f30937a == null) {
                        f30937a = new SessionsMaxDurationMinutes();
                    }
                    sessionsMaxDurationMinutes = f30937a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsMaxDurationMinutes;
        }

        public String a() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        public String b() {
            return "sessions_max_length_minutes";
        }

        public String c() {
            return "fpr_session_max_duration_min";
        }

        public Long d() {
            return 240L;
        }
    }

    public static final class SessionsMemoryCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsMemoryCaptureFrequencyBackgroundMs f30938a;

        public static synchronized SessionsMemoryCaptureFrequencyBackgroundMs e() {
            SessionsMemoryCaptureFrequencyBackgroundMs sessionsMemoryCaptureFrequencyBackgroundMs;
            synchronized (SessionsMemoryCaptureFrequencyBackgroundMs.class) {
                try {
                    if (f30938a == null) {
                        f30938a = new SessionsMemoryCaptureFrequencyBackgroundMs();
                    }
                    sessionsMemoryCaptureFrequencyBackgroundMs = f30938a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsMemoryCaptureFrequencyBackgroundMs;
        }

        public String a() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        public String b() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        public String c() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        public Long d() {
            return 0L;
        }
    }

    public static final class SessionsMemoryCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsMemoryCaptureFrequencyForegroundMs f30939a;

        public static synchronized SessionsMemoryCaptureFrequencyForegroundMs f() {
            SessionsMemoryCaptureFrequencyForegroundMs sessionsMemoryCaptureFrequencyForegroundMs;
            synchronized (SessionsMemoryCaptureFrequencyForegroundMs.class) {
                try {
                    if (f30939a == null) {
                        f30939a = new SessionsMemoryCaptureFrequencyForegroundMs();
                    }
                    sessionsMemoryCaptureFrequencyForegroundMs = f30939a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsMemoryCaptureFrequencyForegroundMs;
        }

        public String a() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        public String b() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        public String c() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        public Long d() {
            return 100L;
        }

        public Long e() {
            return Long.valueOf(d().longValue() * 3);
        }
    }

    public static final class SessionsSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a  reason: collision with root package name */
        public static SessionsSamplingRate f30940a;

        public static synchronized SessionsSamplingRate f() {
            SessionsSamplingRate sessionsSamplingRate;
            synchronized (SessionsSamplingRate.class) {
                try {
                    if (f30940a == null) {
                        f30940a = new SessionsSamplingRate();
                    }
                    sessionsSamplingRate = f30940a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return sessionsSamplingRate;
        }

        public String a() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        public String b() {
            return "sessions_sampling_percentage";
        }

        public String c() {
            return "fpr_vc_session_sampling_rate";
        }

        public Double d() {
            return Double.valueOf(0.01d);
        }

        public Double e() {
            return Double.valueOf(d().doubleValue() / 1000.0d);
        }
    }

    public static final class TraceEventCountBackground extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static TraceEventCountBackground f30941a;

        public static synchronized TraceEventCountBackground e() {
            TraceEventCountBackground traceEventCountBackground;
            synchronized (TraceEventCountBackground.class) {
                try {
                    if (f30941a == null) {
                        f30941a = new TraceEventCountBackground();
                    }
                    traceEventCountBackground = f30941a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return traceEventCountBackground;
        }

        public String a() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        public String c() {
            return "fpr_rl_trace_event_count_bg";
        }

        public Long d() {
            return 30L;
        }
    }

    public static final class TraceEventCountForeground extends ConfigurationFlag<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static TraceEventCountForeground f30942a;

        public static synchronized TraceEventCountForeground e() {
            TraceEventCountForeground traceEventCountForeground;
            synchronized (TraceEventCountForeground.class) {
                try {
                    if (f30942a == null) {
                        f30942a = new TraceEventCountForeground();
                    }
                    traceEventCountForeground = f30942a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return traceEventCountForeground;
        }

        public String a() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        public String c() {
            return "fpr_rl_trace_event_count_fg";
        }

        public Long d() {
            return 300L;
        }
    }

    public static final class TraceSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a  reason: collision with root package name */
        public static TraceSamplingRate f30943a;

        public static synchronized TraceSamplingRate f() {
            TraceSamplingRate traceSamplingRate;
            synchronized (TraceSamplingRate.class) {
                try {
                    if (f30943a == null) {
                        f30943a = new TraceSamplingRate();
                    }
                    traceSamplingRate = f30943a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return traceSamplingRate;
        }

        public String a() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        public String c() {
            return "fpr_vc_trace_sampling_rate";
        }

        public Double d() {
            return Double.valueOf(1.0d);
        }

        public Double e() {
            return Double.valueOf(d().doubleValue() / 1000.0d);
        }
    }
}
