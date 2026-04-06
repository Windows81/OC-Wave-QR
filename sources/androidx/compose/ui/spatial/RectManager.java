package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
public final class RectManager {

    /* renamed from: a  reason: collision with root package name */
    public final IntObjectMap f18163a;

    /* renamed from: b  reason: collision with root package name */
    public final RectList f18164b = new RectList();

    /* renamed from: c  reason: collision with root package name */
    public final ThrottledCallbacks f18165c = new ThrottledCallbacks();

    /* renamed from: d  reason: collision with root package name */
    public final MutableObjectList f18166d = new MutableObjectList(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public boolean f18167e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18168f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18169g;

    /* renamed from: h  reason: collision with root package name */
    public Object f18170h;

    /* renamed from: i  reason: collision with root package name */
    public long f18171i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final Function0 f18172j = new RectManager$dispatchLambda$1(this);

    /* renamed from: k  reason: collision with root package name */
    public final MutableRect f18173k = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    public RectManager(IntObjectMap intObjectMap) {
        this.f18163a = intObjectMap;
    }

    public final void c(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer P2 = nodeCoordinator.P2();
            long j1 = nodeCoordinator.j1();
            mutableRect.m(Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.k(j1))) << 32) | (((long) Float.floatToRawIntBits((float) IntOffset.l(j1))) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.W2();
            if (P2 != null) {
                float[] r0 = P2.m2getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.a(r0)) {
                    Matrix.g(r0, mutableRect);
                }
            }
        }
    }

    public final void d() {
        int i2;
        long b2 = Actual_androidKt.b();
        boolean z2 = this.f18167e;
        boolean z3 = z2 || this.f18168f;
        if (z2) {
            this.f18167e = false;
            MutableObjectList mutableObjectList = this.f18166d;
            Object[] objArr = mutableObjectList.f1937a;
            int i3 = mutableObjectList.f1938b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((Function0) objArr[i4]).invoke();
            }
            RectList rectList = this.f18164b;
            long[] jArr = rectList.f18155a;
            int i5 = rectList.f18157c;
            int i6 = 0;
            while (i6 < jArr.length - 2 && i6 < i5) {
                long j2 = jArr[i6 + 2];
                if ((((int) (j2 >> 61)) & 1) != 0) {
                    i2 = i6;
                    this.f18165c.g(67108863 & ((int) j2), jArr[i6], jArr[i6 + 1], b2);
                } else {
                    i2 = i6;
                }
                i6 = i2 + 3;
            }
            this.f18164b.a();
        }
        if (this.f18168f) {
            this.f18168f = false;
            this.f18165c.f(b2);
        }
        if (z3) {
            this.f18165c.e(b2);
        }
        if (this.f18169g) {
            this.f18169g = false;
            this.f18164b.b();
        }
        this.f18165c.r(b2);
    }

    public final RectList e() {
        return this.f18164b;
    }

    public final void f(LayoutNode layoutNode, boolean z2, int i2, int i3, int i4, int i5) {
        int v2 = layoutNode.v();
        if (z2 || !this.f18164b.g(v2, i2, i3, i4, i5)) {
            LayoutNode C0 = layoutNode.C0();
            RectList.e(this.f18164b, v2, i2, i3, i4, i5, C0 != null ? C0.v() : -1, false, false, 192, (Object) null);
        }
        i();
    }

    public final void g(LayoutNode layoutNode, long j2, boolean z2) {
        NodeCoordinator y0 = layoutNode.y0();
        MeasurePassDelegate n0 = layoutNode.n0();
        int H0 = n0.H0();
        int E0 = n0.E0();
        MutableRect mutableRect = this.f18173k;
        mutableRect.g((float) IntOffset.k(j2), (float) IntOffset.l(j2), (float) (IntOffset.k(j2) + H0), (float) (IntOffset.l(j2) + E0));
        c(y0, mutableRect);
        int b2 = (int) mutableRect.b();
        int d2 = (int) mutableRect.d();
        int c2 = (int) mutableRect.c();
        int a2 = (int) mutableRect.a();
        int v2 = layoutNode.v();
        if (z2 || !this.f18164b.j(v2, b2, d2, c2, a2)) {
            LayoutNode C0 = layoutNode.C0();
            RectList.e(this.f18164b, v2, b2, d2, c2, a2, C0 != null ? C0.v() : -1, false, false, 192, (Object) null);
        }
        i();
    }

    public final void h(LayoutNode layoutNode) {
        MutableVector J0 = layoutNode.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            g(layoutNode2, layoutNode2.y0().j1(), false);
            h(layoutNode2);
        }
    }

    public final void i() {
        this.f18167e = true;
    }

    public final void j(LayoutNode layoutNode) {
        this.f18167e = true;
        this.f18164b.f(layoutNode.v());
        r(true);
    }

    public final void k(LayoutNode layoutNode) {
        if (ComposeUiFlags.f15474b) {
            long m2 = m(layoutNode);
            if (RectManagerKt.d(m2)) {
                layoutNode.W1(m2);
                layoutNode.X1(false);
                MutableVector J0 = layoutNode.J0();
                Object[] objArr = J0.f15005z;
                int p2 = J0.p();
                for (int i2 = 0; i2 < p2; i2++) {
                    LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                    l(layoutNode2, layoutNode2.y0().j1(), false);
                }
                j(layoutNode);
                return;
            }
            h(layoutNode);
        }
    }

    public final void l(LayoutNode layoutNode, long j2, boolean z2) {
        long j3;
        long j4;
        LayoutNode layoutNode2 = layoutNode;
        if (ComposeUiFlags.f15474b) {
            MeasurePassDelegate n0 = layoutNode.n0();
            int H0 = n0.H0();
            int E0 = n0.E0();
            LayoutNode C0 = layoutNode.C0();
            long w0 = layoutNode.w0();
            long e0 = layoutNode.e0();
            int i2 = (int) (e0 >> 32);
            int i3 = (int) (e0 & 4294967295L);
            boolean z3 = false;
            if (C0 != null) {
                boolean A0 = C0.A0();
                long w02 = C0.w0();
                long z0 = C0.z0();
                if (RectManagerKt.d(w02)) {
                    if (A0) {
                        j4 = m(C0);
                        C0.W1(j4);
                        C0.X1(false);
                    } else {
                        j4 = z0;
                    }
                    z3 = !RectManagerKt.d(j4);
                    j3 = IntOffset.o(IntOffset.o(w02, j4), j2);
                } else {
                    long j5 = j2;
                    j3 = n(layoutNode.y0());
                }
            } else {
                j3 = j2;
            }
            if (z3 || !RectManagerKt.d(j3)) {
                g(layoutNode, j2, z2);
                return;
            }
            layoutNode2.T1(j3);
            layoutNode2.Q1(IntSize.c((((long) E0) & 4294967295L) | (((long) H0) << 32)));
            int k2 = IntOffset.k(j3);
            int l2 = IntOffset.l(j3);
            int i4 = k2 + H0;
            int i5 = l2 + E0;
            if (z2 || !IntOffset.j(j3, w0) || i2 != H0 || i3 != E0) {
                f(layoutNode, z2, k2, l2, i4, i5);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r3 = r3.m2getUnderlyingMatrixsQKQjiQ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m(androidx.compose.ui.node.LayoutNode r7) {
        /*
            r6 = this;
            androidx.compose.ui.node.NodeCoordinator r0 = r7.y0()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.f15855b
            long r1 = r1.c()
            androidx.compose.ui.node.NodeCoordinator r7 = r7.V()
        L_0x000e:
            if (r7 == 0) goto L_0x0040
            if (r7 == r0) goto L_0x0040
            androidx.compose.ui.node.OwnedLayer r3 = r7.P2()
            long r4 = r7.j1()
            long r1 = androidx.compose.ui.unit.IntOffsetKt.c(r1, r4)
            androidx.compose.ui.node.NodeCoordinator r7 = r7.W2()
            if (r3 == 0) goto L_0x000e
            float[] r3 = r3.m2getUnderlyingMatrixsQKQjiQ()
            int r4 = androidx.compose.ui.spatial.RectManagerKt.c(r3)
            r5 = 3
            if (r4 != r5) goto L_0x0030
            goto L_0x000e
        L_0x0030:
            r4 = r4 & 2
            if (r4 != 0) goto L_0x003b
            androidx.compose.ui.unit.IntOffset$Companion r7 = androidx.compose.ui.unit.IntOffset.f19160b
            long r0 = r7.a()
            return r0
        L_0x003b:
            long r1 = androidx.compose.ui.graphics.Matrix.f(r3, r1)
            goto L_0x000e
        L_0x0040:
            long r0 = androidx.compose.ui.unit.IntOffsetKt.d(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.m(androidx.compose.ui.node.LayoutNode):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r2 = r2.m2getUnderlyingMatrixsQKQjiQ();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long n(androidx.compose.ui.node.NodeCoordinator r6) {
        /*
            r5 = this;
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r0 = r0.c()
        L_0x0006:
            if (r6 == 0) goto L_0x0035
            androidx.compose.ui.node.OwnedLayer r2 = r6.P2()
            long r3 = r6.j1()
            long r0 = androidx.compose.ui.unit.IntOffsetKt.c(r0, r3)
            androidx.compose.ui.node.NodeCoordinator r6 = r6.W2()
            if (r2 == 0) goto L_0x0006
            float[] r2 = r2.m2getUnderlyingMatrixsQKQjiQ()
            int r3 = androidx.compose.ui.spatial.RectManagerKt.c(r2)
            r4 = 3
            if (r3 == r4) goto L_0x0006
            r3 = r3 & 2
            if (r3 != 0) goto L_0x0030
            androidx.compose.ui.unit.IntOffset$Companion r6 = androidx.compose.ui.unit.IntOffset.f19160b
            long r0 = r6.a()
            return r0
        L_0x0030:
            long r0 = androidx.compose.ui.graphics.Matrix.f(r2, r0)
            goto L_0x0006
        L_0x0035:
            long r0 = androidx.compose.ui.unit.IntOffsetKt.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectManager.n(androidx.compose.ui.node.NodeCoordinator):long");
    }

    public final Object o(Function0 function0) {
        this.f18166d.n(function0);
        return function0;
    }

    public final DelegatableNode.RegistrationHandle p(int i2, long j2, long j3, DelegatableNode delegatableNode, Function1 function1) {
        return this.f18165c.p(i2, j2, j3, delegatableNode, function1);
    }

    public final void q(LayoutNode layoutNode) {
        this.f18164b.h(layoutNode.v());
        i();
        this.f18169g = true;
    }

    public final void r(boolean z2) {
        boolean z3 = !z2 || this.f18170h != null;
        long i2 = this.f18165c.i();
        if (i2 < 0 && z3) {
            return;
        }
        if (this.f18171i != i2 || !z3) {
            Object obj = this.f18170h;
            if (obj != null) {
                Actual_androidKt.e(obj);
            }
            long b2 = Actual_androidKt.b();
            long max = Math.max(i2, ((long) 16) + b2);
            this.f18171i = max;
            this.f18170h = Actual_androidKt.c(max - b2, this.f18172j);
        }
    }

    public final void s(Object obj) {
        if ((TypeIntrinsics.k(obj, 0) ? (Function0) obj : null) != null) {
            this.f18166d.y(obj);
        }
    }

    public final void t(long j2, long j3, float[] fArr) {
        int a2 = RectManagerKt.c(fArr);
        ThrottledCallbacks throttledCallbacks = this.f18165c;
        if ((a2 & 2) != 0) {
            fArr = null;
        }
        this.f18168f = throttledCallbacks.s(j2, j3, fArr) || this.f18168f;
    }
}
