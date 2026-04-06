package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class Motion {

    /* renamed from: a  reason: collision with root package name */
    public final long f2619a;

    public static long a(long j2) {
        return j2;
    }

    public static boolean b(long j2, Object obj) {
        return (obj instanceof Motion) && j2 == ((Motion) obj).e();
    }

    public static int c(long j2) {
        return Long.hashCode(j2);
    }

    public static String d(long j2) {
        return "Motion(packedValue=" + j2 + ')';
    }

    public final /* synthetic */ long e() {
        return this.f2619a;
    }

    public boolean equals(Object obj) {
        return b(this.f2619a, obj);
    }

    public int hashCode() {
        return c(this.f2619a);
    }

    public String toString() {
        return d(this.f2619a);
    }
}
