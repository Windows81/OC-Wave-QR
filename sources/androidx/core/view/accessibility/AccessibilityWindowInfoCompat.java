package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.os.LocaleListCompat;

public class AccessibilityWindowInfoCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20417a;

    public static class Api21Impl {
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        public static int b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        public static AccessibilityWindowInfo e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        public static int f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        public static boolean g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        public static boolean h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }
    }

    public static class Api24Impl {
    }

    public static class Api26Impl {
    }

    public static class Api30Impl {
    }

    public static class Api33Impl {
    }

    public static class Api34Impl {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat(Object obj) {
        this.f20417a = obj;
    }

    public static String k(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static AccessibilityWindowInfoCompat l(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    public void a(Rect rect) {
        Api21Impl.a((AccessibilityWindowInfo) this.f20417a, rect);
    }

    public int b() {
        return Api21Impl.b((AccessibilityWindowInfo) this.f20417a);
    }

    public int c() {
        return Api21Impl.c((AccessibilityWindowInfo) this.f20417a);
    }

    public int d() {
        return Api21Impl.d((AccessibilityWindowInfo) this.f20417a);
    }

    public LocaleListCompat e() {
        return Build.VERSION.SDK_INT >= 34 ? LocaleListCompat.i(Api34Impl.a((AccessibilityWindowInfo) this.f20417a)) : LocaleListCompat.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        AccessibilityWindowInfoCompat accessibilityWindowInfoCompat = (AccessibilityWindowInfoCompat) obj;
        Object obj2 = this.f20417a;
        return obj2 == null ? accessibilityWindowInfoCompat.f20417a == null : obj2.equals(accessibilityWindowInfoCompat.f20417a);
    }

    public AccessibilityWindowInfoCompat f() {
        return l(Api21Impl.e((AccessibilityWindowInfo) this.f20417a));
    }

    public long g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.b((AccessibilityWindowInfo) this.f20417a);
        }
        return 0;
    }

    public int h() {
        return Api21Impl.f((AccessibilityWindowInfo) this.f20417a);
    }

    public int hashCode() {
        Object obj = this.f20417a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean i() {
        return Api21Impl.g((AccessibilityWindowInfo) this.f20417a);
    }

    public boolean j() {
        return Api21Impl.h((AccessibilityWindowInfo) this.f20417a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        a(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(c());
        sb.append(", type=");
        sb.append(k(h()));
        sb.append(", layer=");
        sb.append(d());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(j());
        sb.append(", active=");
        sb.append(i());
        sb.append(", hasParent=");
        boolean z2 = false;
        sb.append(f() != null);
        sb.append(", hasChildren=");
        if (b() > 0) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", transitionTime=");
        sb.append(g());
        sb.append(", locales=");
        sb.append(e());
        sb.append(']');
        return sb.toString();
    }
}
