package com.google.android.datatransport.runtime.logging;

import android.util.Log;

public final class Logging {
    public static void a(String str, String str2, Object obj) {
        String d2 = d(str);
        if (Log.isLoggable(d2, 3)) {
            Log.d(d2, String.format(str2, new Object[]{obj}));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String d2 = d(str);
        if (Log.isLoggable(d2, 3)) {
            Log.d(d2, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String d2 = d(str);
        if (Log.isLoggable(d2, 6)) {
            Log.e(d2, str2, th);
        }
    }

    public static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String d2 = d(str);
        if (Log.isLoggable(d2, 4)) {
            Log.i(d2, String.format(str2, new Object[]{obj}));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String d2 = d(str);
        if (Log.isLoggable(d2, 5)) {
            Log.w(d2, String.format(str2, new Object[]{obj}));
        }
    }
}
