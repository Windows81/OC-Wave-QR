package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FontSynthesis {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18728b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18729c = f(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18730d = f(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18731e = f(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f18732f = f(65535);

    /* renamed from: a  reason: collision with root package name */
    public final int f18733a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FontSynthesis.f18732f;
        }

        public final int b() {
            return FontSynthesis.f18729c;
        }

        public final int c() {
            return FontSynthesis.f18731e;
        }

        public final int d() {
            return FontSynthesis.f18730d;
        }

        public Companion() {
        }
    }

    public /* synthetic */ FontSynthesis(int i2) {
        this.f18733a = i2;
    }

    public static final /* synthetic */ FontSynthesis e(int i2) {
        return new FontSynthesis(i2);
    }

    public static int f(int i2) {
        return i2;
    }

    public static boolean g(int i2, Object obj) {
        return (obj instanceof FontSynthesis) && i2 == ((FontSynthesis) obj).m();
    }

    public static final boolean h(int i2, int i3) {
        return i2 == i3;
    }

    public static int i(int i2) {
        return Integer.hashCode(i2);
    }

    public static final boolean j(int i2) {
        return (i2 & 2) != 0;
    }

    public static final boolean k(int i2) {
        return (i2 & 1) != 0;
    }

    public static String l(int i2) {
        return h(i2, f18729c) ? "None" : h(i2, f18730d) ? "Weight" : h(i2, f18731e) ? "Style" : h(i2, f18732f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f18733a, obj);
    }

    public int hashCode() {
        return i(this.f18733a);
    }

    public final /* synthetic */ int m() {
        return this.f18733a;
    }

    public String toString() {
        return l(this.f18733a);
    }
}
