package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Size {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15876b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f15877c = d(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f15878d = d(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    public final long f15879a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Size.f15878d;
        }

        public final long b() {
            return Size.f15877c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Size(long j2) {
        this.f15879a = j2;
    }

    public static final /* synthetic */ Size c(long j2) {
        return new Size(j2);
    }

    public static long d(long j2) {
        return j2;
    }

    public static boolean e(long j2, Object obj) {
        return (obj instanceof Size) && j2 == ((Size) obj).m();
    }

    public static final boolean f(long j2, long j3) {
        return j2 == j3;
    }

    public static final float g(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final float h(long j2) {
        return Math.min(Float.intBitsToFloat((int) ((j2 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j2 & 2147483647L)));
    }

    public static final float i(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static int j(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean k(long j2) {
        long j3 = (~(((-9223372034707292160L & j2) >>> 31) * ((long) -1))) & j2;
        boolean z2 = false;
        boolean z3 = ((j3 & 4294967295L) & (j3 >>> 32)) == 0;
        if (j2 == 9205357640488583168L) {
            z2 = true;
        }
        return z3 | z2;
    }

    public static String l(long j2) {
        if (j2 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.a(Float.intBitsToFloat((int) (j2 >> 32)), 1) + ", " + GeometryUtilsKt.a(Float.intBitsToFloat((int) (j2 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f15879a, obj);
    }

    public int hashCode() {
        return j(this.f15879a);
    }

    public final /* synthetic */ long m() {
        return this.f15879a;
    }

    public String toString() {
        return l(this.f15879a);
    }
}
