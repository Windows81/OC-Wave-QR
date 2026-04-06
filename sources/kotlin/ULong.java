package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@JvmInline
@Metadata
public final class ULong implements Comparable<ULong> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f40541A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final long f40542z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ULong(long j2) {
        this.f40542z = j2;
    }

    public static final /* synthetic */ ULong d(long j2) {
        return new ULong(j2);
    }

    public static long f(long j2) {
        return j2;
    }

    public static boolean h(long j2, Object obj) {
        return (obj instanceof ULong) && j2 == ((ULong) obj).m();
    }

    public static final boolean j(long j2, long j3) {
        return j2 == j3;
    }

    public static int k(long j2) {
        return Long.hashCode(j2);
    }

    public static String l(long j2) {
        return UnsignedKt.d(j2, 10);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.b(m(), ((ULong) obj).m());
    }

    public boolean equals(Object obj) {
        return h(this.f40542z, obj);
    }

    public int hashCode() {
        return k(this.f40542z);
    }

    public final /* synthetic */ long m() {
        return this.f40542z;
    }

    public String toString() {
        return l(this.f40542z);
    }
}
