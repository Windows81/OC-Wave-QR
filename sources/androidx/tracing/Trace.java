package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Trace {

    /* renamed from: a  reason: collision with root package name */
    public static long f22936a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f22937b;

    public static void a(String str) {
        TraceApi18Impl.a(f(str));
    }

    public static void b() {
        TraceApi18Impl.b();
    }

    public static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? TraceApi29Impl.a() : e();
    }

    public static boolean e() {
        Class<android.os.Trace> cls = android.os.Trace.class;
        try {
            if (f22937b == null) {
                f22936a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f22937b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f22937b.invoke((Object) null, new Object[]{Long.valueOf(f22936a)})).booleanValue();
        } catch (Exception e2) {
            c("isTagEnabled", e2);
            return false;
        }
    }

    public static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
