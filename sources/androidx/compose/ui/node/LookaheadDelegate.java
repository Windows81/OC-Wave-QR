package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    public final NodeCoordinator O;
    public long P = IntOffset.f19160b.b();
    public Map Q;
    public final LookaheadLayoutCoordinates R = new LookaheadLayoutCoordinates(this);
    public MeasureResult S;
    public final MutableObjectIntMap T = ObjectIntMapKt.b();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator) {
        this.O = nodeCoordinator;
    }

    public int C(int i2) {
        NodeCoordinator V2 = this.O.V2();
        Intrinsics.f(V2);
        LookaheadDelegate Q2 = V2.Q2();
        Intrinsics.f(Q2);
        return Q2.C(i2);
    }

    public void L1() {
        R0(j1(), 0.0f, (Function1) null);
    }

    public final void R0(long j2, float f2, Function1 function1) {
        u2(j2);
        if (!F1()) {
            t2();
        }
    }

    public LayoutNode X1() {
        return this.O.X1();
    }

    public int Z(int i2) {
        NodeCoordinator V2 = this.O.V2();
        Intrinsics.f(V2);
        LookaheadDelegate Q2 = V2.Q2();
        Intrinsics.f(Q2);
        return Q2.Z(i2);
    }

    public int a0(int i2) {
        NodeCoordinator V2 = this.O.V2();
        Intrinsics.f(V2);
        LookaheadDelegate Q2 = V2.Q2();
        Intrinsics.f(Q2);
        return Q2.a0(i2);
    }

    public LookaheadCapablePlaceable d1() {
        NodeCoordinator V2 = this.O.V2();
        if (V2 != null) {
            return V2.Q2();
        }
        return null;
    }

    public LayoutCoordinates e1() {
        return this.R;
    }

    public AlignmentLinesOwner e2() {
        AlignmentLinesOwner p2 = this.O.X1().f0().p();
        Intrinsics.f(p2);
        return p2;
    }

    public boolean f1() {
        return this.S != null;
    }

    public MeasureResult g1() {
        MeasureResult measureResult = this.S;
        if (measureResult != null) {
            return measureResult;
        }
        InlineClassHelperKt.d("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new KotlinNothingValueException();
    }

    public final int g2(AlignmentLine alignmentLine) {
        return this.T.e(alignmentLine, Integer.MIN_VALUE);
    }

    public float getDensity() {
        return this.O.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.O.getLayoutDirection();
    }

    public LookaheadCapablePlaceable h1() {
        NodeCoordinator W2 = this.O.W2();
        if (W2 != null) {
            return W2.Q2();
        }
        return null;
    }

    public final MutableObjectIntMap h2() {
        return this.T;
    }

    public final long i2() {
        return J0();
    }

    public long j1() {
        return this.P;
    }

    public final NodeCoordinator n2() {
        return this.O;
    }

    public int q0(int i2) {
        NodeCoordinator V2 = this.O.V2();
        Intrinsics.f(V2);
        LookaheadDelegate Q2 = V2.Q2();
        Intrinsics.f(Q2);
        return Q2.q0(i2);
    }

    public final LookaheadLayoutCoordinates r2() {
        return this.R;
    }

    public final long s2() {
        int L0 = L0();
        return IntSize.c((((long) C0()) & 4294967295L) | (((long) L0) << 32));
    }

    public Object t() {
        return this.O.t();
    }

    public void t2() {
        g1().r();
    }

    public float u1() {
        return this.O.u1();
    }

    public final void u2(long j2) {
        if (!IntOffset.j(j1(), j2)) {
            x2(j2);
            LookaheadPassDelegate v2 = X1().f0().v();
            if (v2 != null) {
                v2.W1();
            }
            t1(this.O);
        }
        if (!C1()) {
            Z0(g1());
        }
    }

    public final void v2(long j2) {
        u2(IntOffset.o(j2, A0()));
    }

    public boolean w1() {
        return true;
    }

    public final long w2(LookaheadDelegate lookaheadDelegate, boolean z2) {
        long b2 = IntOffset.f19160b.b();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!Intrinsics.d(lookaheadDelegate2, lookaheadDelegate)) {
            if (!lookaheadDelegate2.x1() || !z2) {
                b2 = IntOffset.o(b2, lookaheadDelegate2.j1());
            }
            NodeCoordinator W2 = lookaheadDelegate2.O.W2();
            Intrinsics.f(W2);
            lookaheadDelegate2 = W2.Q2();
            Intrinsics.f(lookaheadDelegate2);
        }
        return b2;
    }

    public void x2(long j2) {
        this.P = j2;
    }

    public final void y2(MeasureResult measureResult) {
        Unit unit;
        Map map;
        if (measureResult != null) {
            int b2 = measureResult.b();
            S0(IntSize.c((((long) measureResult.a()) & 4294967295L) | (((long) b2) << 32)));
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            S0(IntSize.f19170b.a());
        }
        if (!Intrinsics.d(this.S, measureResult) && measureResult != null && ((((map = this.Q) != null && !map.isEmpty()) || !measureResult.q().isEmpty()) && !Intrinsics.d(measureResult.q(), this.Q))) {
            e2().q().m();
            Map map2 = this.Q;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.Q = map2;
            }
            map2.clear();
            map2.putAll(measureResult.q());
        }
        this.S = measureResult;
    }
}
