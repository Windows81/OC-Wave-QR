package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PathOperation {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16081b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16082c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16083d = e(1);

    /* renamed from: e  reason: collision with root package name */
    public static final int f16084e = e(2);

    /* renamed from: f  reason: collision with root package name */
    public static final int f16085f = e(3);

    /* renamed from: g  reason: collision with root package name */
    public static final int f16086g = e(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f16087a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PathOperation.f16082c;
        }

        public final int b() {
            return PathOperation.f16083d;
        }

        public final int c() {
            return PathOperation.f16086g;
        }

        public final int d() {
            return PathOperation.f16084e;
        }

        public Companion() {
        }
    }

    public static int e(int i2) {
        return i2;
    }

    public static boolean f(int i2, Object obj) {
        return (obj instanceof PathOperation) && i2 == ((PathOperation) obj).j();
    }

    public static final boolean g(int i2, int i3) {
        return i2 == i3;
    }

    public static int h(int i2) {
        return Integer.hashCode(i2);
    }

    public static String i(int i2) {
        return g(i2, f16082c) ? "Difference" : g(i2, f16083d) ? "Intersect" : g(i2, f16084e) ? "Union" : g(i2, f16085f) ? "Xor" : g(i2, f16086g) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16087a, obj);
    }

    public int hashCode() {
        return h(this.f16087a);
    }

    public final /* synthetic */ int j() {
        return this.f16087a;
    }

    public String toString() {
        return i(this.f16087a);
    }
}
