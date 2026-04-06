package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class IntIntPair {

    /* renamed from: a  reason: collision with root package name */
    public final long f1782a;

    public /* synthetic */ IntIntPair(long j2) {
        this.f1782a = j2;
    }

    public static final /* synthetic */ IntIntPair a(long j2) {
        return new IntIntPair(j2);
    }

    public static long b(int i2, int i3) {
        return c((((long) i3) & 4294967295L) | (((long) i2) << 32));
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof IntIntPair) && j2 == ((IntIntPair) obj).i();
    }

    public static final int e(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int f(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static int g(long j2) {
        return Long.hashCode(j2);
    }

    public static String h(long j2) {
        return '(' + e(j2) + ", " + f(j2) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f1782a, obj);
    }

    public int hashCode() {
        return g(this.f1782a);
    }

    public final /* synthetic */ long i() {
        return this.f1782a;
    }

    public String toString() {
        return h(this.f1782a);
    }
}
