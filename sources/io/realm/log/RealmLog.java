package io.realm.log;

import android.util.Log;
import java.util.Locale;
import javax.annotation.Nullable;

public final class RealmLog {

    /* renamed from: a  reason: collision with root package name */
    public static String f40374a = "REALM_JAVA";

    public static void a(String str, Object... objArr) {
        b((Throwable) null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        f(6, th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d((Throwable) null, str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        f(7, th, str, objArr);
    }

    public static int e() {
        return nativeGetLogLevel();
    }

    public static void f(int i2, Throwable th, String str, Object... objArr) {
        if (i2 >= e()) {
            StringBuilder sb = new StringBuilder();
            if (!(str == null || objArr == null || objArr.length <= 0)) {
                str = String.format(Locale.US, str, objArr);
            }
            if (th != null) {
                sb.append(Log.getStackTraceString(th));
            }
            if (str != null) {
                if (th != null) {
                    sb.append("\n");
                }
                sb.append(str);
            }
            nativeLog(i2, f40374a, th, sb.toString());
        }
    }

    public static void g(String str, Object... objArr) {
        h((Throwable) null, str, objArr);
    }

    public static void h(Throwable th, String str, Object... objArr) {
        f(5, th, str, objArr);
    }

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i2, String str, @Nullable Throwable th, @Nullable String str2);
}
