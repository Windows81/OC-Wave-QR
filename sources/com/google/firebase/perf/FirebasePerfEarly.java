package com.google.firebase.perf;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

public class FirebasePerfEarly {
    public FirebasePerfEarly(FirebaseApp firebaseApp, StartupTime startupTime, Executor executor) {
        Context k2 = firebaseApp.k();
        ConfigResolver.g().O(k2);
        AppStateMonitor b2 = AppStateMonitor.b();
        b2.i(k2);
        b2.j(new FirebasePerformanceInitializer());
        if (startupTime != null) {
            AppStartTrace p2 = AppStartTrace.p();
            p2.z(k2);
            executor.execute(new AppStartTrace.StartFromBackgroundRunnable(p2));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
