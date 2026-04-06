package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Offset {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15855b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f15856c = e(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f15857d = e(9187343241974906880L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f15858e = e(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    public final long f15859a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Offset.f15857d;
        }

        public final long b() {
            return Offset.f15858e;
        }

        public final long c() {
            return Offset.f15856c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Offset(long j2) {
        this.f15859a = j2;
    }

    public static final /* synthetic */ Offset d(long j2) {
        return new Offset(j2);
    }

    public static long e(long j2) {
        return j2;
    }

    public static final long f(long j2, float f2, float f3) {
        return e((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (4294967295L & j2));
        }
        return f(j2, f2, f3);
    }

    public static final long h(long j2, float f2) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / f2)) & 4294967295L));
    }

    public static boolean i(long j2, Object obj) {
        return (obj instanceof Offset) && j2 == ((Offset) obj).t();
    }

    public static final boolean j(long j2, long j3) {
        return j2 == j3;
    }

    public static final float k(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (float) Math.sqrt((double) ((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2)));
    }

    public static final float l(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
    }

    public static final float m(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float n(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int o(long j2) {
        return Long.hashCode(j2);
    }

    public static final long p(long j2, long j3) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long q(long j2, long j3) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long r(long j2, float f2) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2)) & 4294967295L));
    }

    public static String s(long j2) {
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.a(Float.intBitsToFloat((int) (j2 >> 32)), 1) + ", " + GeometryUtilsKt.a(Float.intBitsToFloat((int) (j2 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f15859a, obj);
    }

    public int hashCode() {
        return o(this.f15859a);
    }

    public final /* synthetic */ long t() {
        return this.f15859a;
    }

    public String toString() {
        return s(this.f15859a);
    }
}
