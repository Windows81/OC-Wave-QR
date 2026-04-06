package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class DpOffset {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19147b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19148c = c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f19149d = c(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    public final long f19150a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return DpOffset.f19148c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ DpOffset(long j2) {
        this.f19150a = j2;
    }

    public static final /* synthetic */ DpOffset b(long j2) {
        return new DpOffset(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof DpOffset) && j2 == ((DpOffset) obj).j();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static final float f(long j2) {
        return Dp.m(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final float g(long j2) {
        return Dp.m(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        if (j2 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + Dp.r(f(j2)) + ", " + Dp.r(g(j2)) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f19150a, obj);
    }

    public int hashCode() {
        return h(this.f19150a);
    }

    public final /* synthetic */ long j() {
        return this.f19150a;
    }

    public String toString() {
        return i(this.f19150a);
    }
}
