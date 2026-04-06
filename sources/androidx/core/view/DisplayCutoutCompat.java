package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.ObjectsCompat;

public final class DisplayCutoutCompat {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f20221a;

    public static class Api28Impl {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public static class Api29Impl {
    }

    public static class Api30Impl {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public static class Api31Impl {
    }

    public static class Api33Impl {
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f20221a = displayCutout;
    }

    public static DisplayCutoutCompat f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new DisplayCutoutCompat(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a(this.f20221a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.b(this.f20221a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.c(this.f20221a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.d(this.f20221a);
        }
        return 0;
    }

    public androidx.core.graphics.Insets e() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.d(Api30Impl.a(this.f20221a)) : androidx.core.graphics.Insets.f19773e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.a(this.f20221a, ((DisplayCutoutCompat) obj).f20221a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f20221a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f20221a + "}";
    }
}
