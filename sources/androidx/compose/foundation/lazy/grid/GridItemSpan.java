package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class GridItemSpan {

    /* renamed from: a  reason: collision with root package name */
    public final long f4517a;

    public /* synthetic */ GridItemSpan(long j2) {
        this.f4517a = j2;
    }

    public static final /* synthetic */ GridItemSpan a(long j2) {
        return new GridItemSpan(j2);
    }

    public static long b(long j2) {
        return j2;
    }

    public static boolean c(long j2, Object obj) {
        return (obj instanceof GridItemSpan) && j2 == ((GridItemSpan) obj).g();
    }

    public static final int d(long j2) {
        return (int) j2;
    }

    public static int e(long j2) {
        return Long.hashCode(j2);
    }

    public static String f(long j2) {
        return "GridItemSpan(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4517a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f4517a;
    }

    public int hashCode() {
        return e(this.f4517a);
    }

    public String toString() {
        return f(this.f4517a);
    }
}
