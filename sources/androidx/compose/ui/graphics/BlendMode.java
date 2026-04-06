package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class BlendMode {

    /* renamed from: A  reason: collision with root package name */
    public static final int f15924A = D(24);

    /* renamed from: B  reason: collision with root package name */
    public static final int f15925B = D(25);
    public static final int C = D(26);
    public static final int D = D(27);
    public static final int E = D(28);

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15926b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f15927c = D(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f15928d = D(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f15929e = D(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15930f = D(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f15931g = D(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f15932h = D(5);

    /* renamed from: i  reason: collision with root package name */
    public static final int f15933i = D(6);

    /* renamed from: j  reason: collision with root package name */
    public static final int f15934j = D(7);

    /* renamed from: k  reason: collision with root package name */
    public static final int f15935k = D(8);

    /* renamed from: l  reason: collision with root package name */
    public static final int f15936l = D(9);

    /* renamed from: m  reason: collision with root package name */
    public static final int f15937m = D(10);

    /* renamed from: n  reason: collision with root package name */
    public static final int f15938n = D(11);

    /* renamed from: o  reason: collision with root package name */
    public static final int f15939o = D(12);

    /* renamed from: p  reason: collision with root package name */
    public static final int f15940p = D(13);

    /* renamed from: q  reason: collision with root package name */
    public static final int f15941q = D(14);

    /* renamed from: r  reason: collision with root package name */
    public static final int f15942r = D(15);

    /* renamed from: s  reason: collision with root package name */
    public static final int f15943s = D(16);

    /* renamed from: t  reason: collision with root package name */
    public static final int f15944t = D(17);

    /* renamed from: u  reason: collision with root package name */
    public static final int f15945u = D(18);

    /* renamed from: v  reason: collision with root package name */
    public static final int f15946v = D(19);

    /* renamed from: w  reason: collision with root package name */
    public static final int f15947w = D(20);

    /* renamed from: x  reason: collision with root package name */
    public static final int f15948x = D(21);

    /* renamed from: y  reason: collision with root package name */
    public static final int f15949y = D(22);

    /* renamed from: z  reason: collision with root package name */
    public static final int f15950z = D(23);

    /* renamed from: a  reason: collision with root package name */
    public final int f15951a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return BlendMode.f15934j;
        }

        public final int B() {
            return BlendMode.f15930f;
        }

        public final int C() {
            return BlendMode.f15938n;
        }

        public final int a() {
            return BlendMode.f15927c;
        }

        public final int b() {
            return BlendMode.D;
        }

        public final int c() {
            return BlendMode.f15946v;
        }

        public final int d() {
            return BlendMode.f15945u;
        }

        public final int e() {
            return BlendMode.f15943s;
        }

        public final int f() {
            return BlendMode.f15949y;
        }

        public final int g() {
            return BlendMode.f15929e;
        }

        public final int h() {
            return BlendMode.f15937m;
        }

        public final int i() {
            return BlendMode.f15933i;
        }

        public final int j() {
            return BlendMode.f15935k;
        }

        public final int k() {
            return BlendMode.f15931g;
        }

        public final int l() {
            return BlendMode.f15950z;
        }

        public final int m() {
            return BlendMode.f15947w;
        }

        public final int n() {
            return BlendMode.f15925B;
        }

        public final int o() {
            return BlendMode.f15944t;
        }

        public final int p() {
            return BlendMode.E;
        }

        public final int q() {
            return BlendMode.f15940p;
        }

        public final int r() {
            return BlendMode.f15924A;
        }

        public final int s() {
            return BlendMode.f15942r;
        }

        public final int t() {
            return BlendMode.f15939o;
        }

        public final int u() {
            return BlendMode.C;
        }

        public final int v() {
            return BlendMode.f15941q;
        }

        public final int w() {
            return BlendMode.f15948x;
        }

        public final int x() {
            return BlendMode.f15928d;
        }

        public final int y() {
            return BlendMode.f15936l;
        }

        public final int z() {
            return BlendMode.f15932h;
        }

        public Companion() {
        }
    }

    public static int D(int i2) {
        return i2;
    }

    public static boolean E(int i2, Object obj) {
        return (obj instanceof BlendMode) && i2 == ((BlendMode) obj).I();
    }

    public static final boolean F(int i2, int i3) {
        return i2 == i3;
    }

    public static int G(int i2) {
        return Integer.hashCode(i2);
    }

    public static String H(int i2) {
        return F(i2, f15927c) ? "Clear" : F(i2, f15928d) ? "Src" : F(i2, f15929e) ? "Dst" : F(i2, f15930f) ? "SrcOver" : F(i2, f15931g) ? "DstOver" : F(i2, f15932h) ? "SrcIn" : F(i2, f15933i) ? "DstIn" : F(i2, f15934j) ? "SrcOut" : F(i2, f15935k) ? "DstOut" : F(i2, f15936l) ? "SrcAtop" : F(i2, f15937m) ? "DstAtop" : F(i2, f15938n) ? "Xor" : F(i2, f15939o) ? "Plus" : F(i2, f15940p) ? "Modulate" : F(i2, f15941q) ? "Screen" : F(i2, f15942r) ? "Overlay" : F(i2, f15943s) ? "Darken" : F(i2, f15944t) ? "Lighten" : F(i2, f15945u) ? "ColorDodge" : F(i2, f15946v) ? "ColorBurn" : F(i2, f15947w) ? "HardLight" : F(i2, f15948x) ? "Softlight" : F(i2, f15949y) ? "Difference" : F(i2, f15950z) ? "Exclusion" : F(i2, f15924A) ? "Multiply" : F(i2, f15925B) ? "Hue" : F(i2, C) ? "Saturation" : F(i2, D) ? "Color" : F(i2, E) ? "Luminosity" : "Unknown";
    }

    public final /* synthetic */ int I() {
        return this.f15951a;
    }

    public boolean equals(Object obj) {
        return E(this.f15951a, obj);
    }

    public int hashCode() {
        return G(this.f15951a);
    }

    public String toString() {
        return H(this.f15951a);
    }
}
