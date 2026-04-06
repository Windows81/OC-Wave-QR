package androidx.core.app;

import android.app.PendingIntent;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

public final class PendingIntentCompat {

    public static class Api23Impl {
    }

    public static class Api26Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static class GatedCallback implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public PendingIntent.OnFinished f19658A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f19659B;

        /* renamed from: z  reason: collision with root package name */
        public final CountDownLatch f19660z;

        public void close() {
            if (!this.f19659B) {
                this.f19658A = null;
            }
            this.f19660z.countDown();
        }
    }
}
