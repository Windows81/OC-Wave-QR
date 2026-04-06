package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class PointerId {

    /* renamed from: a  reason: collision with root package name */
    public final long f16873a;

    public static long a(long j2) {
        return j2;
    }

    public static boolean b(long j2, Object obj) {
        return (obj instanceof PointerId) && j2 == ((PointerId) obj).f();
    }

    public static final boolean c(long j2, long j3) {
        return j2 == j3;
    }

    public static int d(long j2) {
        return Long.hashCode(j2);
    }

    public static String e(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f16873a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f16873a;
    }

    public int hashCode() {
        return d(this.f16873a);
    }

    public String toString() {
        return e(this.f16873a);
    }
}
