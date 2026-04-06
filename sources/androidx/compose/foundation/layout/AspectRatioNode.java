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
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public boolean O;

    public AspectRatioNode(float f2, boolean z2) {
        this.N = f2;
        this.O = z2;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(((float) i2) * this.N) : intrinsicMeasurable.a0(i2);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(((float) i2) / this.N) : intrinsicMeasurable.q0(i2);
    }

    public final long Z2(long j2) {
        if (!this.O) {
            long d3 = d3(j2, true);
            IntSize.Companion companion = IntSize.f19170b;
            if (!IntSize.e(d3, companion.a())) {
                return d3;
            }
            long c3 = c3(j2, true);
            if (!IntSize.e(c3, companion.a())) {
                return c3;
            }
            long f3 = f3(j2, true);
            if (!IntSize.e(f3, companion.a())) {
                return f3;
            }
            long e3 = e3(j2, true);
            if (!IntSize.e(e3, companion.a())) {
                return e3;
            }
            long d32 = d3(j2, false);
            if (!IntSize.e(d32, companion.a())) {
                return d32;
            }
            long c32 = c3(j2, false);
            if (!IntSize.e(c32, companion.a())) {
                return c32;
            }
            long f32 = f3(j2, false);
            if (!IntSize.e(f32, companion.a())) {
                return f32;
            }
            long e32 = e3(j2, false);
            if (!IntSize.e(e32, companion.a())) {
                return e32;
            }
        } else {
            long c33 = c3(j2, true);
            IntSize.Companion companion2 = IntSize.f19170b;
            if (!IntSize.e(c33, companion2.a())) {
                return c33;
            }
            long d33 = d3(j2, true);
            if (!IntSize.e(d33, companion2.a())) {
                return d33;
            }
            long e33 = e3(j2, true);
            if (!IntSize.e(e33, companion2.a())) {
                return e33;
            }
            long f33 = f3(j2, true);
            if (!IntSize.e(f33, companion2.a())) {
                return f33;
            }
            long c34 = c3(j2, false);
            if (!IntSize.e(c34, companion2.a())) {
                return c34;
            }
            long d34 = d3(j2, false);
            if (!IntSize.e(d34, companion2.a())) {
                return d34;
            }
            long e34 = e3(j2, false);
            if (!IntSize.e(e34, companion2.a())) {
                return e34;
            }
            long f34 = f3(j2, false);
            if (!IntSize.e(f34, companion2.a())) {
                return f34;
            }
        }
        return IntSize.f19170b.a();
    }

    public final void a3(float f2) {
        this.N = f2;
    }

    public final void b3(boolean z2) {
        this.O = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = java.lang.Math.round(((float) r0) * r4.N);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c3(long r5, boolean r7) {
        /*
            r4 = this;
            int r0 = androidx.compose.ui.unit.Constraints.k(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x002c
            float r1 = (float) r0
            float r2 = r4.N
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            if (r1 <= 0) goto L_0x002c
            if (r7 == 0) goto L_0x001b
            boolean r5 = androidx.compose.foundation.layout.AspectRatioKt.c(r5, r1, r0)
            if (r5 == 0) goto L_0x002c
        L_0x001b:
            long r5 = (long) r1
            r7 = 32
            long r5 = r5 << r7
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r5 = r5 | r0
            long r5 = androidx.compose.ui.unit.IntSize.c(r5)
            return r5
        L_0x002c:
            androidx.compose.ui.unit.IntSize$Companion r5 = androidx.compose.ui.unit.IntSize.f19170b
            long r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.c3(long, boolean):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = java.lang.Math.round(((float) r0) / r4.N);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d3(long r5, boolean r7) {
        /*
            r4 = this;
            int r0 = androidx.compose.ui.unit.Constraints.l(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x002c
            float r1 = (float) r0
            float r2 = r4.N
            float r1 = r1 / r2
            int r1 = java.lang.Math.round(r1)
            if (r1 <= 0) goto L_0x002c
            if (r7 == 0) goto L_0x001b
            boolean r5 = androidx.compose.foundation.layout.AspectRatioKt.c(r5, r0, r1)
            if (r5 == 0) goto L_0x002c
        L_0x001b:
            long r5 = (long) r0
            r7 = 32
            long r5 = r5 << r7
            long r0 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r5 = r5 | r0
            long r5 = androidx.compose.ui.unit.IntSize.c(r5)
            return r5
        L_0x002c:
            androidx.compose.ui.unit.IntSize$Companion r5 = androidx.compose.ui.unit.IntSize.f19170b
            long r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.d3(long, boolean):long");
    }

    public final long e3(long j2, boolean z2) {
        int m2 = Constraints.m(j2);
        int round = Math.round(((float) m2) * this.N);
        return (round <= 0 || (z2 && !AspectRatioKt.c(j2, round, m2))) ? IntSize.f19170b.a() : IntSize.c((((long) round) << 32) | (((long) m2) & 4294967295L));
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        long Z2 = Z2(j2);
        if (!IntSize.e(Z2, IntSize.f19170b.a())) {
            j2 = Constraints.f19137b.c((int) (Z2 >> 32), (int) (Z2 & 4294967295L));
        }
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new AspectRatioNode$measure$1(c0), 4, (Object) null);
    }

    public final long f3(long j2, boolean z2) {
        int n2 = Constraints.n(j2);
        int round = Math.round(((float) n2) / this.N);
        return (round <= 0 || (z2 && !AspectRatioKt.c(j2, n2, round))) ? IntSize.f19170b.a() : IntSize.c((((long) n2) << 32) | (((long) round) & 4294967295L));
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(((float) i2) / this.N) : intrinsicMeasurable.C(i2);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return i2 != Integer.MAX_VALUE ? Math.round(((float) i2) * this.N) : intrinsicMeasurable.Z(i2);
    }
}
