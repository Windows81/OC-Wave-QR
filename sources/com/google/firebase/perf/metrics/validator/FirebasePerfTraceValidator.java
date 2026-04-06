package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;

final class FirebasePerfTraceValidator extends PerfMetricValidator {

    /* renamed from: b  reason: collision with root package name */
    public static final AndroidLogger f31006b = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final TraceMetric f31007a;

    public FirebasePerfTraceValidator(TraceMetric traceMetric) {
        this.f31007a = traceMetric;
    }

    public boolean c() {
        if (!o(this.f31007a, 0)) {
            AndroidLogger androidLogger = f31006b;
            androidLogger.j("Invalid Trace:" + this.f31007a.C0());
            return false;
        } else if (!j(this.f31007a) || h(this.f31007a)) {
            return true;
        } else {
            AndroidLogger androidLogger2 = f31006b;
            androidLogger2.j("Invalid Counters for Trace:" + this.f31007a.C0());
            return false;
        }
    }

    public final boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                PerfMetricValidator.d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e2) {
                f31006b.j(e2.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean h(TraceMetric traceMetric) {
        return i(traceMetric, 0);
    }

    public final boolean i(TraceMetric traceMetric, int i2) {
        if (traceMetric == null) {
            return false;
        }
        if (i2 > 1) {
            f31006b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : traceMetric.w0().entrySet()) {
            if (!l((String) entry.getKey())) {
                AndroidLogger androidLogger = f31006b;
                androidLogger.j("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            } else if (!m((Long) entry.getValue())) {
                AndroidLogger androidLogger2 = f31006b;
                androidLogger2.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (TraceMetric i3 : traceMetric.E0()) {
            if (!i(i3, i2 + 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(TraceMetric traceMetric) {
        if (traceMetric.v0() > 0) {
            return true;
        }
        for (TraceMetric v0 : traceMetric.E0()) {
            if (v0.v0() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(TraceMetric traceMetric) {
        return traceMetric.C0().startsWith("_st_");
    }

    public final boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f31006b.j("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            f31006b.j("counterId exceeded max length 100");
            return false;
        }
    }

    public final boolean m(Long l2) {
        return l2 != null;
    }

    public final boolean n(TraceMetric traceMetric) {
        Long l2 = (Long) traceMetric.w0().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        return l2 != null && l2.compareTo(0L) > 0;
    }

    public final boolean o(TraceMetric traceMetric, int i2) {
        if (traceMetric == null) {
            f31006b.j("TraceMetric is null");
            return false;
        } else if (i2 > 1) {
            f31006b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(traceMetric.C0())) {
            AndroidLogger androidLogger = f31006b;
            androidLogger.j("invalid TraceId:" + traceMetric.C0());
            return false;
        } else if (!p(traceMetric)) {
            AndroidLogger androidLogger2 = f31006b;
            androidLogger2.j("invalid TraceDuration:" + traceMetric.z0());
            return false;
        } else if (!traceMetric.F0()) {
            f31006b.j("clientStartTimeUs is null.");
            return false;
        } else if (!k(traceMetric) || n(traceMetric)) {
            for (TraceMetric o2 : traceMetric.E0()) {
                if (!o(o2, i2 + 1)) {
                    return false;
                }
            }
            return g(traceMetric.x0());
        } else {
            AndroidLogger androidLogger3 = f31006b;
            androidLogger3.j("non-positive totalFrames in screen trace " + traceMetric.C0());
            return false;
        }
    }

    public final boolean p(TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.z0() > 0;
    }

    public final boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }
}
