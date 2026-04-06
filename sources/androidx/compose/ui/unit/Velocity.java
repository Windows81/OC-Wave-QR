package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Velocity {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19186b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19187c = c(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f19188a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Velocity.f19187c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Velocity(long j2) {
        this.f19188a = j2;
    }

    public static final /* synthetic */ Velocity b(long j2) {
        return new Velocity(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static final long d(long j2, float f2, float f3) {
        return c((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public static /* synthetic */ long e(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (4294967295L & j2));
        }
        return d(j2, f2, f3);
    }

    public static boolean f(long j2, Object obj) {
        return (obj instanceof Velocity) && j2 == ((Velocity) obj).o();
    }

    public static final boolean g(long j2, long j3) {
        return j2 == j3;
    }

    public static final float h(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float i(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int j(long j2) {
        return Long.hashCode(j2);
    }

    public static final long k(long j2, long j3) {
        return c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long l(long j2, long j3) {
        return c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long m(long j2, float f2) {
        return c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2)) & 4294967295L));
    }

    public static String n(long j2) {
        return '(' + h(j2) + ", " + i(j2) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f19188a, obj);
    }

    public int hashCode() {
        return j(this.f19188a);
    }

    public final /* synthetic */ long o() {
        return this.f19188a;
    }

    public String toString() {
        return n(this.f19188a);
    }
}
