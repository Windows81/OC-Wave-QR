package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class IntSize {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19170b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f19171c = c(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f19172a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return IntSize.f19171c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ IntSize(long j2) {
        this.f19172a = j2;
    }

    public static final /* synthetic */ IntSize b(long j2) {
        return new IntSize(j2);
    }

    public static long c(long j2) {
        return j2;
    }

    public static boolean d(long j2, Object obj) {
        return (obj instanceof IntSize) && j2 == ((IntSize) obj).j();
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public static final int f(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static final int g(long j2) {
        return (int) (j2 >> 32);
    }

    public static int h(long j2) {
        return Long.hashCode(j2);
    }

    public static String i(long j2) {
        return ((int) (j2 >> 32)) + " x " + ((int) (j2 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.f19172a, obj);
    }

    public int hashCode() {
        return h(this.f19172a);
    }

    public final /* synthetic */ long j() {
        return this.f19172a;
    }

    public String toString() {
        return i(this.f19172a);
    }
}
