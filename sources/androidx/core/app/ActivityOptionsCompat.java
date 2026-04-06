package androidx.core.app;

import android.app.ActivityOptions;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ActivityOptionsCompat {

    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {

        /* renamed from: a  reason: collision with root package name */
        public final ActivityOptions f19468a;

        public Bundle a() {
            return this.f19468a.toBundle();
        }
    }

    public static class Api21Impl {
    }

    public static class Api23Impl {
    }

    public static class Api24Impl {
    }

    public static class Api33Impl {
    }

    public static class Api34Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackgroundActivityStartMode {
    }

    public Bundle a() {
        return null;
    }
}
