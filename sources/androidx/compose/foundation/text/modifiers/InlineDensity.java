package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class InlineDensity {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f6596b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f6597c = b(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    public final long f6598a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return InlineDensity.f6597c;
        }

        public Companion() {
        }
    }

    public static long b(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return c((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static long c(long j2) {
        return j2;
    }

    public static long d(Density density) {
        return b(density.getDensity(), density.u1());
    }

    public static boolean e(long j2, Object obj) {
        return (obj instanceof InlineDensity) && j2 == ((InlineDensity) obj).k();
    }

    public static final boolean f(long j2, long j3) {
        return j2 == j3;
    }

    public static final float g(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float h(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static int i(long j2) {
        return Long.hashCode(j2);
    }

    public static String j(long j2) {
        return "InlineDensity(density=" + g(j2) + ", fontScale=" + h(j2) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f6598a, obj);
    }

    public int hashCode() {
        return i(this.f6598a);
    }

    public final /* synthetic */ long k() {
        return this.f6598a;
    }

    public String toString() {
        return j(this.f6598a);
    }
}
