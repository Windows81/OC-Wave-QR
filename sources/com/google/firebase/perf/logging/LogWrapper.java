package com.google.firebase.perf.logging;

import android.util.Log;

class LogWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static LogWrapper f30975a;

    public static synchronized LogWrapper c() {
        LogWrapper logWrapper;
        synchronized (LogWrapper.class) {
            try {
                if (f30975a == null) {
                    f30975a = new LogWrapper();
                }
                logWrapper = f30975a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return logWrapper;
    }

    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
