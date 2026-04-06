package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class DpSize {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19156b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19157c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f19158d = d(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    public final long f19159a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return DpSize.f19158d;
        }

        public final long b() {
            return DpSize.f19157c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ DpSize(long j2) {
        this.f19159a = j2;
    }

    public static final /* synthetic */ DpSize c(long j2) {
        return new DpSize(j2);
    }

    public static long d(long j2) {
        return j2;
    }

    public static final long e(long j2, float f2, float f3) {
        return d((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public static /* synthetic */ long f(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = j(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = i(j2);
        }
        return e(j2, f2, f3);
    }

    public static boolean g(long j2, Object obj) {
        return (obj instanceof DpSize) && j2 == ((DpSize) obj).m();
    }

    public static final boolean h(long j2, long j3) {
        return j2 == j3;
    }

    public static final float i(long j2) {
        return Dp.m(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final float j(long j2) {
        return Dp.m(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static int k(long j2) {
        return Long.hashCode(j2);
    }

    public static String l(long j2) {
        if (j2 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return Dp.r(j(j2)) + " x " + Dp.r(i(j2));
    }

    public boolean equals(Object obj) {
        return g(this.f19159a, obj);
    }

    public int hashCode() {
        return k(this.f19159a);
    }

    public final /* synthetic */ long m() {
        return this.f19159a;
    }

    public String toString() {
        return l(this.f19159a);
    }
}
