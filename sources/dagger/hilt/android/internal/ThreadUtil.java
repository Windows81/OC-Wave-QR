package dagger.hilt.android.internal;

import android.os.Looper;

public final class ThreadUtil {

    /* renamed from: a  reason: collision with root package name */
    public static Thread f39711a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (f39711a == null) {
            f39711a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f39711a;
    }
}
