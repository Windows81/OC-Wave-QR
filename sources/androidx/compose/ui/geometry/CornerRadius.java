package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class CornerRadius {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15848b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f15849c = b(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f15850a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return CornerRadius.f15849c;
        }

        public Companion() {
        }
    }

    public static long b(long j2) {
        return j2;
    }

    public static boolean c(long j2, Object obj) {
        return (obj instanceof CornerRadius) && j2 == ((CornerRadius) obj).g();
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public static int e(long j2) {
        return Long.hashCode(j2);
    }

    public static String f(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.a(Float.intBitsToFloat(i2), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.a(Float.intBitsToFloat(i2), 1) + ", " + GeometryUtilsKt.a(Float.intBitsToFloat(i3), 1) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f15850a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f15850a;
    }

    public int hashCode() {
        return e(this.f15850a);
    }

    public String toString() {
        return f(this.f15850a);
    }
}
