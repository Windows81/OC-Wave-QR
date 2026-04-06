package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class TouchBoundsExpansion {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f17451b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f17452c = TouchBoundsExpansionKt.c(0, 0, 0, 0, 14, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f17453a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long b() {
            return TouchBoundsExpansion.f17452c;
        }

        public final long c(int i2, int i3, int i4, int i5, boolean z2) {
            return d(i3, 1) | d(i2, 0) | d(i4, 2) | d(i5, 3) | (z2 ? Long.MIN_VALUE : 0);
        }

        public final long d(int i2, int i3) {
            return ((long) (i2 & 32767)) << (i3 * 15);
        }

        public final int e(long j2, int i2) {
            return ((int) (j2 >> (i2 * 15))) & 32767;
        }

        public Companion() {
        }
    }

    public static final int b(long j2, LayoutDirection layoutDirection) {
        return (!k(j2) || layoutDirection == LayoutDirection.Ltr) ? h(j2) : g(j2);
    }

    public static final int c(long j2, LayoutDirection layoutDirection) {
        return (!k(j2) || layoutDirection == LayoutDirection.Ltr) ? g(j2) : h(j2);
    }

    public static long d(long j2) {
        return j2;
    }

    public static boolean e(long j2, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j2 == ((TouchBoundsExpansion) obj).m();
    }

    public static final int f(long j2) {
        return f17451b.e(j2, 3);
    }

    public static final int g(long j2) {
        return f17451b.e(j2, 2);
    }

    public static final int h(long j2) {
        return f17451b.e(j2, 0);
    }

    public static final int i(long j2) {
        return f17451b.e(j2, 1);
    }

    public static int j(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean k(long j2) {
        return (j2 & Long.MIN_VALUE) != 0;
    }

    public static String l(long j2) {
        return "TouchBoundsExpansion(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f17453a, obj);
    }

    public int hashCode() {
        return j(this.f17453a);
    }

    public final /* synthetic */ long m() {
        return this.f17453a;
    }

    public String toString() {
        return l(this.f17453a);
    }
}
