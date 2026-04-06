package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class DistanceAndFlags {

    /* renamed from: a  reason: collision with root package name */
    public final long f17247a;

    public static final int a(long j2, long j3) {
        boolean g2 = g(j2);
        if (g2 != g(j3)) {
            return g2 ? -1 : 1;
        }
        int signum = (int) Math.signum(d(j2) - d(j3));
        return (Math.min(d(j2), d(j3)) >= 0.0f && f(j2) != f(j3)) ? f(j2) ? -1 : 1 : signum;
    }

    public static long b(long j2) {
        return j2;
    }

    public static boolean c(long j2, Object obj) {
        return (obj instanceof DistanceAndFlags) && j2 == ((DistanceAndFlags) obj).i();
    }

    public static final float d(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static int e(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean f(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean g(long j2) {
        return (j2 & 1) != 0;
    }

    public static String h(long j2) {
        return "DistanceAndFlags(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f17247a, obj);
    }

    public int hashCode() {
        return e(this.f17247a);
    }

    public final /* synthetic */ long i() {
        return this.f17247a;
    }

    public String toString() {
        return h(this.f17247a);
    }
}
