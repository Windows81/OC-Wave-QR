package com.google.firebase.perf;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.logging.AndroidLogger;

public final class FirebasePerformanceInitializer implements AppStateMonitor.AppColdStartCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLogger f30896a = AndroidLogger.e();

    public void a() {
        try {
            FirebasePerformance.c();
        } catch (IllegalStateException e2) {
            f30896a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e2);
        }
    }
}
