package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
@JvmInline
public final class OrientationIndependentConstraints {

    /* renamed from: a  reason: collision with root package name */
    public final long f4103a;

    public static long a(int i2, int i3, int i4, int i5) {
        return b(ConstraintsKt.a(i2, i3, i4, i5));
    }

    public static long b(long j2) {
        return j2;
    }

    public static long c(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return a(layoutOrientation == layoutOrientation2 ? Constraints.n(j2) : Constraints.m(j2), layoutOrientation == layoutOrientation2 ? Constraints.l(j2) : Constraints.k(j2), layoutOrientation == layoutOrientation2 ? Constraints.m(j2) : Constraints.n(j2), layoutOrientation == layoutOrientation2 ? Constraints.k(j2) : Constraints.l(j2));
    }

    public static final long d(long j2, int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, i5);
    }

    public static /* synthetic */ long e(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = Constraints.n(j2);
        }
        int i7 = i2;
        if ((i6 & 2) != 0) {
            i3 = Constraints.l(j2);
        }
        int i8 = i3;
        if ((i6 & 4) != 0) {
            i4 = Constraints.m(j2);
        }
        int i9 = i4;
        if ((i6 & 8) != 0) {
            i5 = Constraints.k(j2);
        }
        return d(j2, i7, i8, i9, i5);
    }

    public static boolean f(long j2, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.f(j2, ((OrientationIndependentConstraints) obj).j());
    }

    public static int g(long j2) {
        return Constraints.o(j2);
    }

    public static final long h(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.a(Constraints.n(j2), Constraints.l(j2), Constraints.m(j2), Constraints.k(j2)) : ConstraintsKt.a(Constraints.m(j2), Constraints.k(j2), Constraints.n(j2), Constraints.l(j2));
    }

    public static String i(long j2) {
        return "OrientationIndependentConstraints(value=" + Constraints.q(j2) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f4103a, obj);
    }

    public int hashCode() {
        return g(this.f4103a);
    }

    public final /* synthetic */ long j() {
        return this.f4103a;
    }

    public String toString() {
        return i(this.f4103a);
    }
}
