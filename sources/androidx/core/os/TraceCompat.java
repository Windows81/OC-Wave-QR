package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class TraceCompat {

    /* renamed from: a  reason: collision with root package name */
    public static long f19974a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f19975b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f19976c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f19977d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f19978e;

    public static class Api29Impl {
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f19974a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f19975b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f19976c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f19977d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f19978e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
