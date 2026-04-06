package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class SpanRange {

    /* renamed from: a  reason: collision with root package name */
    public final long f5217a;

    public static long a(int i2, int i3) {
        return b((((long) (i3 + i2)) & 4294967295L) | (((long) i2) << 32));
    }

    public static long b(long j2) {
        return j2;
    }

    public static boolean c(long j2, Object obj) {
        return (obj instanceof SpanRange) && j2 == ((SpanRange) obj).f();
    }

    public static int d(long j2) {
        return Long.hashCode(j2);
    }

    public static String e(long j2) {
        return "SpanRange(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f5217a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f5217a;
    }

    public int hashCode() {
        return d(this.f5217a);
    }

    public String toString() {
        return e(this.f5217a);
    }
}
