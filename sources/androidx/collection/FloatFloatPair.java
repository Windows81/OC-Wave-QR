package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class FloatFloatPair {

    /* renamed from: a  reason: collision with root package name */
    public final long f1739a;

    public static long a(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return b((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static long b(long j2) {
        return j2;
    }

    public static boolean c(long j2, Object obj) {
        return (obj instanceof FloatFloatPair) && j2 == ((FloatFloatPair) obj).f();
    }

    public static int d(long j2) {
        return Long.hashCode(j2);
    }

    public static String e(long j2) {
        return '(' + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f1739a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f1739a;
    }

    public int hashCode() {
        return d(this.f1739a);
    }

    public String toString() {
        return e(this.f1739a);
    }
}
