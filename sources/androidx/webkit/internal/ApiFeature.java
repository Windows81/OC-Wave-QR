package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public abstract class ApiFeature implements ConditionallySupportedFeature {

    /* renamed from: c  reason: collision with root package name */
    public static final Set f23137c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final String f23138a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23139b;

    public static class LAZY_HOLDER {

        /* renamed from: a  reason: collision with root package name */
        public static final Set f23140a = new HashSet(Arrays.asList(WebViewGlueCommunicator.d().a()));
    }

    public static class M extends ApiFeature {
        public M(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return true;
        }
    }

    public static class N extends ApiFeature {
        public N(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return true;
        }
    }

    public static class NoFramework extends ApiFeature {
        public NoFramework(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        public O(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return true;
        }
    }

    public static class O_MR1 extends ApiFeature {
        public O_MR1(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class P extends ApiFeature {
        public P(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class Q extends ApiFeature {
        public Q(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class T extends ApiFeature {
        public T(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public ApiFeature(String str, String str2) {
        this.f23138a = str;
        this.f23139b = str2;
        f23137c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f23137c);
    }

    public boolean a() {
        return c() || d();
    }

    public String b() {
        return this.f23138a;
    }

    public abstract boolean c();

    public boolean d() {
        return BoundaryInterfaceReflectionUtil.b(LAZY_HOLDER.f23140a, this.f23139b);
    }
}
