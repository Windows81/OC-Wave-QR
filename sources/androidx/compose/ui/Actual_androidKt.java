package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class Actual_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f15443a = new Handler(Looper.getMainLooper());

    public static final long b() {
        return System.currentTimeMillis();
    }

    public static final Object c(long j2, Function0 function0) {
        a aVar = new a(function0);
        f15443a.postDelayed(aVar, j2);
        return aVar;
    }

    public static final void d(Function0 function0) {
        function0.invoke();
    }

    public static final void e(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) != null) {
            f15443a.removeCallbacks((Runnable) obj);
        }
    }
}
