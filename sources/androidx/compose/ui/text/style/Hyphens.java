package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Hyphens {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19027b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19028c = e(1);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19029d = e(2);

    /* renamed from: e  reason: collision with root package name */
    public static final int f19030e = e(Integer.MIN_VALUE);

    /* renamed from: a  reason: collision with root package name */
    public final int f19031a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Hyphens.f19029d;
        }

        public final int b() {
            return Hyphens.f19028c;
        }

        public final int c() {
            return Hyphens.f19030e;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Hyphens(int i2) {
        this.f19031a = i2;
    }

    public static final /* synthetic */ Hyphens d(int i2) {
        return new Hyphens(i2);
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof Hyphens) && i2 == ((Hyphens) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        return g(i2, f19028c) ? "Hyphens.None" : g(i2, f19029d) ? "Hyphens.Auto" : g(i2, f19030e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f19031a, obj);
    }

    public int hashCode() {
        return h(this.f19031a);
    }

    public final /* synthetic */ int j() {
        return this.f19031a;
    }

    public String toString() {
        return i(this.f19031a);
    }
}
