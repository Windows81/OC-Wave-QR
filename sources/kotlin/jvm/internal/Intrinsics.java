package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

public class Intrinsics {

    public static class Kotlin {
    }

    public static boolean a(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean b(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean c(Float f2, Float f3) {
        if (f2 == null) {
            if (f3 != null) {
                return false;
            }
        } else if (f3 == null || f2.floatValue() != f3.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) p(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) p(new NullPointerException(str + " must not be null")));
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static int k(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int l(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void n() {
        v();
    }

    public static void o(int i2, String str) {
        v();
    }

    public static Throwable p(Throwable th) {
        return q(th, Intrinsics.class.getName());
    }

    public static Throwable q(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return th;
    }

    public static void r() {
        throw ((NullPointerException) p(new NullPointerException()));
    }

    public static void s(String str) {
        throw ((NullPointerException) p(new NullPointerException(str)));
    }

    public static void t(String str) {
        throw ((IllegalArgumentException) p(new IllegalArgumentException(m(str))));
    }

    public static void u(String str) {
        throw ((NullPointerException) p(new NullPointerException(m(str))));
    }

    public static void v() {
        w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void x(String str) {
        throw ((UninitializedPropertyAccessException) p(new UninitializedPropertyAccessException(str)));
    }

    public static void y(String str) {
        x("lateinit property " + str + " has not been initialized");
    }
}
