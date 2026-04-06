package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public float O;
    public float P;
    public float Q;
    public boolean R;

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2);
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long Z2 = Z2(intrinsicMeasureScope);
        if (Constraints.j(Z2)) {
            return Constraints.l(Z2);
        }
        if (!this.R) {
            i2 = ConstraintsKt.f(Z2, i2);
        }
        return ConstraintsKt.g(Z2, intrinsicMeasurable.a0(i2));
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long Z2 = Z2(intrinsicMeasureScope);
        if (Constraints.i(Z2)) {
            return Constraints.k(Z2);
        }
        if (!this.R) {
            i2 = ConstraintsKt.g(Z2, i2);
        }
        return ConstraintsKt.f(Z2, intrinsicMeasurable.q0(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r4 != Integer.MAX_VALUE) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long Z2(androidx.compose.ui.unit.Density r7) {
        /*
            r6 = this;
            float r0 = r6.P
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L_0x0016
            float r0 = r6.P
            int r0 = r7.P1(r0)
            if (r0 >= 0) goto L_0x0017
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            float r3 = r6.Q
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x0029
            float r3 = r6.Q
            int r3 = r7.P1(r3)
            if (r3 >= 0) goto L_0x002a
            r3 = r2
            goto L_0x002a
        L_0x0029:
            r3 = r1
        L_0x002a:
            float r4 = r6.N
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0041
            float r4 = r6.N
            int r4 = r7.P1(r4)
            if (r4 >= 0) goto L_0x003b
            r4 = r2
        L_0x003b:
            if (r4 <= r0) goto L_0x003e
            r4 = r0
        L_0x003e:
            if (r4 == r1) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r4 = r2
        L_0x0042:
            float r5 = r6.O
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x0059
            float r5 = r6.O
            int r7 = r7.P1(r5)
            if (r7 >= 0) goto L_0x0053
            r7 = r2
        L_0x0053:
            if (r7 <= r3) goto L_0x0056
            r7 = r3
        L_0x0056:
            if (r7 == r1) goto L_0x0059
            r2 = r7
        L_0x0059:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.Z2(androidx.compose.ui.unit.Density):long");
    }

    public final void a3(boolean z2) {
        this.R = z2;
    }

    public final void b3(float f2) {
        this.Q = f2;
    }

    public final void c3(float f2) {
        this.P = f2;
    }

    public final void d3(float f2) {
        this.O = f2;
    }

    public final void e3(float f2) {
        this.N = f2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        long j3;
        int i2;
        int i3;
        int i4;
        int i5;
        long Z2 = Z2(measureScope);
        if (this.R) {
            j3 = ConstraintsKt.e(j2, Z2);
        } else {
            if (!Float.isNaN(this.N)) {
                i2 = Constraints.n(Z2);
            } else {
                i2 = Constraints.n(j2);
                int l2 = Constraints.l(Z2);
                if (i2 > l2) {
                    i2 = l2;
                }
            }
            if (!Float.isNaN(this.P)) {
                i3 = Constraints.l(Z2);
            } else {
                i3 = Constraints.l(j2);
                int n2 = Constraints.n(Z2);
                if (i3 < n2) {
                    i3 = n2;
                }
            }
            if (!Float.isNaN(this.O)) {
                i4 = Constraints.m(Z2);
            } else {
                i4 = Constraints.m(j2);
                int k2 = Constraints.k(Z2);
                if (i4 > k2) {
                    i4 = k2;
                }
            }
            if (!Float.isNaN(this.Q)) {
                i5 = Constraints.k(Z2);
            } else {
                i5 = Constraints.k(j2);
                int m2 = Constraints.m(Z2);
                if (i5 < m2) {
                    i5 = m2;
                }
            }
            j3 = ConstraintsKt.a(i2, i3, i4, i5);
        }
        Placeable c0 = measurable.c0(j3);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new SizeNode$measure$1(c0), 4, (Object) null);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long Z2 = Z2(intrinsicMeasureScope);
        if (Constraints.i(Z2)) {
            return Constraints.k(Z2);
        }
        if (!this.R) {
            i2 = ConstraintsKt.g(Z2, i2);
        }
        return ConstraintsKt.f(Z2, intrinsicMeasurable.C(i2));
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long Z2 = Z2(intrinsicMeasureScope);
        if (Constraints.j(Z2)) {
            return Constraints.l(Z2);
        }
        if (!this.R) {
            i2 = ConstraintsKt.f(Z2, i2);
        }
        return ConstraintsKt.g(Z2, intrinsicMeasurable.Z(i2));
    }

    public SizeNode(float f2, float f3, float f4, float f5, boolean z2) {
        this.N = f2;
        this.O = f3;
        this.P = f4;
        this.Q = f5;
        this.R = z2;
    }
}
