package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TextAlign {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19080b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19081c = i(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19082d = i(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19083e = i(3);

    /* renamed from: f  reason: collision with root package name */
    public static final int f19084f = i(4);

    /* renamed from: g  reason: collision with root package name */
    public static final int f19085g = i(5);

    /* renamed from: h  reason: collision with root package name */
    public static final int f19086h = i(6);

    /* renamed from: i  reason: collision with root package name */
    public static final int f19087i = i(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    public final int f19088a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return TextAlign.f19083e;
        }

        public final int b() {
            return TextAlign.f19086h;
        }

        public final int c() {
            return TextAlign.f19084f;
        }

        public final int d() {
            return TextAlign.f19081c;
        }

        public final int e() {
            return TextAlign.f19082d;
        }

        public final int f() {
            return TextAlign.f19085g;
        }

        public final int g() {
            return TextAlign.f19087i;
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextAlign(int i2) {
        this.f19088a = i2;
    }

    public static final /* synthetic */ TextAlign h(int i2) {
        return new TextAlign(i2);
    }

    public static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof TextAlign) && i2 == ((TextAlign) obj).n();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return k(i2, f19081c) ? "Left" : k(i2, f19082d) ? "Right" : k(i2, f19083e) ? "Center" : k(i2, f19084f) ? "Justify" : k(i2, f19085g) ? "Start" : k(i2, f19086h) ? "End" : k(i2, f19087i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f19088a, obj);
    }

    public int hashCode() {
        return l(this.f19088a);
    }

    public final /* synthetic */ int n() {
        return this.f19088a;
    }

    public String toString() {
        return m(this.f19088a);
    }
}
