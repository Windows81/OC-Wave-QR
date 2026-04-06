package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class PathFillType {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f16071b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f16072c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f16073d = d(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f16074a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return PathFillType.f16073d;
        }

        public final int b() {
            return PathFillType.f16072c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ PathFillType(int i2) {
        this.f16074a = i2;
    }

    public static final /* synthetic */ PathFillType c(int i2) {
        return new PathFillType(i2);
    }

    public static int d(int i2) {
        return i2;
    }

    public static boolean e(int i2, Object obj) {
        return (obj instanceof PathFillType) && i2 == ((PathFillType) obj).i();
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static int g(int i2) {
        return Integer.hashCode(i2);
    }

    public static String h(int i2) {
        return f(i2, f16072c) ? "NonZero" : f(i2, f16073d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f16074a, obj);
    }

    public int hashCode() {
        return g(this.f16074a);
    }

    public final /* synthetic */ int i() {
        return this.f16074a;
    }

    public String toString() {
        return h(this.f16074a);
    }
}
