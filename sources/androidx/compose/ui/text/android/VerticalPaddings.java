package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class VerticalPaddings {

    /* renamed from: a  reason: collision with root package name */
    public final long f18601a;

    public static long a(long j2) {
        return j2;
    }

    public static boolean b(long j2, Object obj) {
        return (obj instanceof VerticalPaddings) && j2 == ((VerticalPaddings) obj).g();
    }

    public static final int c(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static final int d(long j2) {
        return (int) (j2 >> 32);
    }

    public static int e(long j2) {
        return Long.hashCode(j2);
    }

    public static String f(long j2) {
        return "VerticalPaddings(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f18601a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f18601a;
    }

    public int hashCode() {
        return e(this.f18601a);
    }

    public String toString() {
        return f(this.f18601a);
    }
}
