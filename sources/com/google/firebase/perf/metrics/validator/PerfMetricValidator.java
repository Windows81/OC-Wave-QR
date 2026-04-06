package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class PerfMetricValidator {
    public static List a(PerfMetric perfMetric, Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.l()) {
            arrayList.add(new FirebasePerfTraceValidator(perfMetric.n()));
        }
        if (perfMetric.o()) {
            arrayList.add(new FirebasePerfNetworkValidator(perfMetric.p(), context));
        }
        if (perfMetric.k0()) {
            arrayList.add(new FirebasePerfApplicationInfoValidator(perfMetric.j0()));
        }
        if (perfMetric.j()) {
            arrayList.add(new FirebasePerfGaugeMetricValidator(perfMetric.q()));
        }
        return arrayList;
    }

    public static boolean b(PerfMetric perfMetric, Context context) {
        List<PerfMetricValidator> a2 = a(perfMetric, context);
        if (a2.isEmpty()) {
            AndroidLogger.e().a("No validators found for PerfMetric.");
            return false;
        }
        for (PerfMetricValidator c2 : a2) {
            if (!c2.c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants.CounterNames counterNames : Constants.CounterNames.values()) {
            if (counterNames.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (Constants.TraceNames traceNames : Constants.TraceNames.values()) {
            if (traceNames.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
