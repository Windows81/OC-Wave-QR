package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class FontLoadingStrategy {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f18719b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f18720c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18721d = d(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f18722e = d(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f18723a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return FontLoadingStrategy.f18722e;
        }

        public final int b() {
            return FontLoadingStrategy.f18720c;
        }

        public final int c() {
            return FontLoadingStrategy.f18721d;
        }

        public Companion() {
        }
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i2 == ((FontLoadingStrategy) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        if (f(i2, f18720c)) {
            return "Blocking";
        }
        if (f(i2, f18721d)) {
            return "Optional";
        }
        if (f(i2, f18722e)) {
            return "Async";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f18723a, obj);
    }

    public int hashCode() {
        return g(this.f18723a);
    }

    public final /* synthetic */ int i() {
        return this.f18723a;
    }

    public String toString() {
        return h(this.f18723a);
    }
}
