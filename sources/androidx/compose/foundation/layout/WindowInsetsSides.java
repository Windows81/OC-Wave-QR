package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class WindowInsetsSides {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f4266b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f4267c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4268d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4269e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4270f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4271g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4272h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4273i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4274j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f4275k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f4276l;

    /* renamed from: m  reason: collision with root package name */
    public static final int f4277m;

    /* renamed from: n  reason: collision with root package name */
    public static final int f4278n;

    /* renamed from: a  reason: collision with root package name */
    public final int f4279a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return WindowInsetsSides.f4267c;
        }

        public final int b() {
            return WindowInsetsSides.f4269e;
        }

        public final int c() {
            return WindowInsetsSides.f4268d;
        }

        public final int d() {
            return WindowInsetsSides.f4270f;
        }

        public final int e() {
            return WindowInsetsSides.f4274j;
        }

        public final int f() {
            return WindowInsetsSides.f4272h;
        }

        public final int g() {
            return WindowInsetsSides.f4277m;
        }

        public final int h() {
            return WindowInsetsSides.f4275k;
        }

        public final int i() {
            return WindowInsetsSides.f4276l;
        }

        public final int j() {
            return WindowInsetsSides.f4271g;
        }

        public final int k() {
            return WindowInsetsSides.f4273i;
        }

        public Companion() {
        }
    }

    static {
        int l2 = l(8);
        f4267c = l2;
        int l3 = l(4);
        f4268d = l3;
        int l4 = l(2);
        f4269e = l4;
        int l5 = l(1);
        f4270f = l5;
        f4271g = q(l2, l5);
        f4272h = q(l3, l4);
        int l6 = l(16);
        f4273i = l6;
        int l7 = l(32);
        f4274j = l7;
        int q2 = q(l2, l4);
        f4275k = q2;
        int q3 = q(l3, l5);
        f4276l = q3;
        f4277m = q(q2, q3);
        f4278n = q(l6, l7);
    }

    public static int l(int i2) {
        return i2;
    }

    public static boolean m(int i2, Object obj) {
        return (obj instanceof WindowInsetsSides) && i2 == ((WindowInsetsSides) obj).s();
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static final boolean o(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static int p(int i2) {
        return Integer.hashCode(i2);
    }

    public static final int q(int i2, int i3) {
        return l(i2 | i3);
    }

    public static String r(int i2) {
        return "WindowInsetsSides(" + t(i2) + ')';
    }

    public static final String t(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = f4271g;
        if ((i2 & i3) == i3) {
            u(sb, "Start");
        }
        int i4 = f4275k;
        if ((i2 & i4) == i4) {
            u(sb, "Left");
        }
        int i5 = f4273i;
        if ((i2 & i5) == i5) {
            u(sb, "Top");
        }
        int i6 = f4272h;
        if ((i2 & i6) == i6) {
            u(sb, "End");
        }
        int i7 = f4276l;
        if ((i2 & i7) == i7) {
            u(sb, "Right");
        }
        int i8 = f4274j;
        if ((i2 & i8) == i8) {
            u(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public static final void u(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m(this.f4279a, obj);
    }

    public int hashCode() {
        return p(this.f4279a);
    }

    public final /* synthetic */ int s() {
        return this.f4279a;
    }

    public String toString() {
        return r(this.f4279a);
    }
}
