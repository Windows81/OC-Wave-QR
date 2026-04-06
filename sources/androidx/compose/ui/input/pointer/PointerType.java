package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PointerType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16933b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16934c = f(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16935d = f(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16936e = f(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16937f = f(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f16938g = f(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f16939a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PointerType.f16938g;
        }

        public final int b() {
            return PointerType.f16936e;
        }

        public final int c() {
            return PointerType.f16937f;
        }

        public final int d() {
            return PointerType.f16935d;
        }

        public final int e() {
            return PointerType.f16934c;
        }

        public Companion() {
        }
    }

    public static int f(int i2) {
        return i2;
    }

    public static boolean g(int i2, Object obj) {
        return (obj instanceof PointerType) && i2 == ((PointerType) obj).k();
    }

    public static final boolean h(int i2, int i3) {
        return i2 == i3;
    }

    public static int i(int i2) {
        return Integer.hashCode(i2);
    }

    public static String j(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return g(this.f16939a, obj);
    }

    public int hashCode() {
        return i(this.f16939a);
    }

    public final /* synthetic */ int k() {
        return this.f16939a;
    }

    public String toString() {
        return j(this.f16939a);
    }
}
