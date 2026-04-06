package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class StartOffset {

    /* renamed from: a  reason: collision with root package name */
    public final long f2682a;

    public static long a(int i2, int i3) {
        return b((long) (i2 * i3));
    }

    public static long b(long j2) {
        return j2;
    }

    public static /* synthetic */ long c(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 2) != 0) {
            i3 = StartOffsetType.f2683b.a();
        }
        return a(i2, i3);
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof StartOffset) && j2 == ((StartOffset) obj).h();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static int f(long j2) {
        return Long.hashCode(j2);
    }

    public static String g(long j2) {
        return "StartOffset(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2682a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f2682a;
    }

    public int hashCode() {
        return f(this.f2682a);
    }

    public String toString() {
        return g(this.f2682a);
    }
}
