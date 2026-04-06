package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class IntOffset {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19160b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19161c = f(0);

    /* renamed from: d  reason: collision with root package name */
    public static final long f19162d = f(9223372034707292159L);

    /* renamed from: a  reason: collision with root package name */
    public final long f19163a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return IntOffset.f19162d;
        }

        public final long b() {
            return IntOffset.f19161c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ IntOffset(long j2) {
        this.f19163a = j2;
    }

    public static final /* synthetic */ IntOffset c(long j2) {
        return new IntOffset(j2);
    }

    public static final int d(long j2) {
        return k(j2);
    }

    public static final int e(long j2) {
        return l(j2);
    }

    public static long f(long j2) {
        return j2;
    }

    public static final long g(long j2, int i2, int i3) {
        return f((((long) i2) << 32) | (((long) i3) & 4294967295L));
    }

    public static /* synthetic */ long h(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = (int) (j2 >> 32);
        }
        if ((i4 & 2) != 0) {
            i3 = (int) (4294967295L & j2);
        }
        return g(j2, i2, i3);
    }

    public static boolean i(long j2, Object obj) {
        return (obj instanceof IntOffset) && j2 == ((IntOffset) obj).r();
    }

    public static final boolean j(long j2, long j3) {
        return j2 == j3;
    }

    public static final int k(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int l(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static int m(long j2) {
        return Long.hashCode(j2);
    }

    public static final long n(long j2, long j3) {
        return f((((long) (((int) (j2 >> 32)) - ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long o(long j2, long j3) {
        return f((((long) (((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static String p(long j2) {
        return '(' + k(j2) + ", " + l(j2) + ')';
    }

    public static final long q(long j2) {
        return f((((long) (-((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) (-((int) (j2 >> 32)))) << 32));
    }

    public boolean equals(Object obj) {
        return i(this.f19163a, obj);
    }

    public int hashCode() {
        return m(this.f19163a);
    }

    public final /* synthetic */ long r() {
        return this.f19163a;
    }

    public String toString() {
        return p(this.f19163a);
    }
}
