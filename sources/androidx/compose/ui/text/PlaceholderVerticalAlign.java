package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PlaceholderVerticalAlign {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18332b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18333c = h(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18334d = h(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18335e = h(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18336f = h(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f18337g = h(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f18338h = h(6);

    /* renamed from: i  reason: collision with root package name */
    public static final int f18339i = h(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f18340a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PlaceholderVerticalAlign.f18333c;
        }

        public final int b() {
            return PlaceholderVerticalAlign.f18335e;
        }

        public final int c() {
            return PlaceholderVerticalAlign.f18336f;
        }

        public final int d() {
            return PlaceholderVerticalAlign.f18338h;
        }

        public final int e() {
            return PlaceholderVerticalAlign.f18339i;
        }

        public final int f() {
            return PlaceholderVerticalAlign.f18337g;
        }

        public final int g() {
            return PlaceholderVerticalAlign.f18334d;
        }

        public Companion() {
        }
    }

    public static int h(int i2) {
        return i2;
    }

    public static boolean i(int i2, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i2 == ((PlaceholderVerticalAlign) obj).m();
    }

    public static final boolean j(int i2, int i3) {
        return i2 == i3;
    }

    public static int k(int i2) {
        return Integer.hashCode(i2);
    }

    public static String l(int i2) {
        return j(i2, f18333c) ? "AboveBaseline" : j(i2, f18334d) ? "Top" : j(i2, f18335e) ? "Bottom" : j(i2, f18336f) ? "Center" : j(i2, f18337g) ? "TextTop" : j(i2, f18338h) ? "TextBottom" : j(i2, f18339i) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f18340a, obj);
    }

    public int hashCode() {
        return k(this.f18340a);
    }

    public final /* synthetic */ int m() {
        return this.f18340a;
    }

    public String toString() {
        return l(this.f18340a);
    }
}
