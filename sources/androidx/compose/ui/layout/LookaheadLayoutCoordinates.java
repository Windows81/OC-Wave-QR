package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {

    /* renamed from: z  reason: collision with root package name */
    public final LookaheadDelegate f17099z;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.f17099z = lookaheadDelegate;
    }

    public long G(long j2) {
        return c().G(Offset.q(j2, d()));
    }

    public boolean H() {
        return this.f17099z.x1();
    }

    public long I(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).f17099z;
            lookaheadDelegate.n2().l3();
            LookaheadDelegate Q2 = c().G2(lookaheadDelegate.n2()).Q2();
            if (Q2 != null) {
                long n2 = IntOffset.n(IntOffset.o(lookaheadDelegate.w2(Q2, !z2), IntOffsetKt.d(j2)), this.f17099z.w2(Q2, !z2));
                return Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.k(n2))) << 32) | (((long) Float.floatToRawIntBits((float) IntOffset.l(n2))) & 4294967295L));
            }
            LookaheadDelegate a2 = LookaheadLayoutCoordinatesKt.a(lookaheadDelegate);
            long o2 = IntOffset.o(IntOffset.o(lookaheadDelegate.w2(a2, !z2), a2.j1()), IntOffsetKt.d(j2));
            LookaheadDelegate a3 = LookaheadLayoutCoordinatesKt.a(this.f17099z);
            long n3 = IntOffset.n(o2, IntOffset.o(this.f17099z.w2(a3, !z2), a3.j1()));
            long e2 = Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.l(n3))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) IntOffset.k(n3))) << 32));
            NodeCoordinator W2 = a3.n2().W2();
            Intrinsics.f(W2);
            NodeCoordinator W22 = a2.n2().W2();
            Intrinsics.f(W22);
            return W2.I(W22, e2, z2);
        }
        LookaheadDelegate a4 = LookaheadLayoutCoordinatesKt.a(this.f17099z);
        long I = I(a4.r2(), j2, z2);
        long j1 = a4.j1();
        long p2 = Offset.p(I, Offset.e((4294967295L & ((long) Float.floatToRawIntBits((float) IntOffset.l(j1)))) | (((long) Float.floatToRawIntBits((float) IntOffset.k(j1))) << 32)));
        LayoutCoordinates P = a4.n2().P();
        if (P == null) {
            P = a4.n2().e1();
        }
        return Offset.q(p2, P.I(layoutCoordinates, Offset.f15855b.c(), z2));
    }

    public long N(LayoutCoordinates layoutCoordinates, long j2) {
        return I(layoutCoordinates, j2, true);
    }

    public LayoutCoordinates P() {
        LookaheadDelegate Q2;
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator W2 = c().W2();
        if (W2 == null || (Q2 = W2.Q2()) == null) {
            return null;
        }
        return Q2.e1();
    }

    public void W(float[] fArr) {
        c().W(fArr);
    }

    public Rect X(LayoutCoordinates layoutCoordinates, boolean z2) {
        return c().X(layoutCoordinates, z2);
    }

    public long a() {
        LookaheadDelegate lookaheadDelegate = this.f17099z;
        return IntSize.c((((long) lookaheadDelegate.L0()) << 32) | (((long) lookaheadDelegate.C0()) & 4294967295L));
    }

    public boolean b() {
        return c().b();
    }

    public final NodeCoordinator c() {
        return this.f17099z.n2();
    }

    public final long d() {
        LookaheadDelegate a2 = LookaheadLayoutCoordinatesKt.a(this.f17099z);
        LayoutCoordinates e1 = a2.e1();
        Offset.Companion companion = Offset.f15855b;
        return Offset.p(N(e1, companion.c()), c().N(a2.n2(), companion.c()));
    }

    public long d0(long j2) {
        return Offset.q(c().d0(j2), d());
    }

    public void e0(LayoutCoordinates layoutCoordinates, float[] fArr) {
        c().e0(layoutCoordinates, fArr);
    }

    public long f(long j2) {
        return c().f(Offset.q(j2, d()));
    }

    public LayoutCoordinates g0() {
        LookaheadDelegate Q2;
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator W2 = c().X1().y0().W2();
        if (W2 == null || (Q2 = W2.Q2()) == null) {
            return null;
        }
        return Q2.e1();
    }

    public long o0(long j2) {
        return c().o0(Offset.q(j2, d()));
    }

    public long w(long j2) {
        return Offset.q(c().w(j2), d());
    }
}
