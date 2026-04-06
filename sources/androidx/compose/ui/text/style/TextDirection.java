package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextDirection {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19094b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19095c = h(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19096d = h(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19097e = h(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f19098f = h(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f19099g = h(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f19100h = h(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    public final int f19101a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextDirection.f19097e;
        }

        public final int b() {
            return TextDirection.f19098f;
        }

        public final int c() {
            return TextDirection.f19099g;
        }

        public final int d() {
            return TextDirection.f19095c;
        }

        public final int e() {
            return TextDirection.f19096d;
        }

        public final int f() {
            return TextDirection.f19100h;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextDirection(int i2) {
        this.f19101a = i2;
    }

    public static final /* synthetic */ TextDirection g(int i2) {
        return new TextDirection(i2);
    }

    public static int h(int i2) {
        return i2;
    }

    public static boolean i(int i2, Object obj) {
        return (obj instanceof TextDirection) && i2 == ((TextDirection) obj).m();
    }

    public static final boolean j(int i2, int i3) {
        return i2 == i3;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static String l(int i2) {
        return j(i2, f19095c) ? "Ltr" : j(i2, f19096d) ? "Rtl" : j(i2, f19097e) ? "Content" : j(i2, f19098f) ? "ContentOrLtr" : j(i2, f19099g) ? "ContentOrRtl" : j(i2, f19100h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f19101a, obj);
    }

    public int hashCode() {
        return k(this.f19101a);
    }

    public final /* synthetic */ int m() {
        return this.f19101a;
    }

    public String toString() {
        return l(this.f19101a);
    }
}
