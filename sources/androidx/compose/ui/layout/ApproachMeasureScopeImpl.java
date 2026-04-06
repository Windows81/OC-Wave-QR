package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {

    /* renamed from: A  reason: collision with root package name */
    public ApproachLayoutModifierNode f17004A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f17005B;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutModifierNodeCoordinator f17006z;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f17006z = layoutModifierNodeCoordinator;
        this.f17004A = approachLayoutModifierNode;
    }

    public long A(float f2) {
        return this.f17006z.A(f2);
    }

    public float B1(float f2) {
        return this.f17006z.B1(f2);
    }

    public final ApproachLayoutModifierNode C() {
        return this.f17004A;
    }

    public float D(int i2) {
        return this.f17006z.D(i2);
    }

    public float E(float f2) {
        return this.f17006z.E(f2);
    }

    public final LayoutModifierNodeCoordinator F() {
        return this.f17006z;
    }

    public final void G(boolean z2) {
        this.f17005B = z2;
    }

    public final void H(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f17004A = approachLayoutModifierNode;
    }

    public int K1(long j2) {
        return this.f17006z.K1(j2);
    }

    public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
        if (!((i2 & -16777216) == 0 && (-16777216 & i3) == 0)) {
            InlineClassHelperKt.c("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ApproachMeasureScopeImpl$layout$1(i2, i3, map, function1, function12, this);
    }

    public int P1(float f2) {
        return this.f17006z.P1(f2);
    }

    public long V(long j2) {
        return this.f17006z.V(j2);
    }

    public long b0() {
        LookaheadDelegate Q2 = this.f17006z.Q2();
        Intrinsics.f(Q2);
        MeasureResult g1 = Q2.g1();
        return IntSize.c((((long) g1.b()) << 32) | (((long) g1.a()) & 4294967295L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = r0.r2();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.LayoutCoordinates f(androidx.compose.ui.layout.LayoutCoordinates r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates
            if (r0 == 0) goto L_0x0005
            return r2
        L_0x0005:
            boolean r0 = r2 instanceof androidx.compose.ui.node.NodeCoordinator
            if (r0 == 0) goto L_0x001a
            r0 = r2
            androidx.compose.ui.node.NodeCoordinator r0 = (androidx.compose.ui.node.NodeCoordinator) r0
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.Q2()
            if (r0 == 0) goto L_0x0019
            androidx.compose.ui.layout.LookaheadLayoutCoordinates r0 = r0.r2()
            if (r0 == 0) goto L_0x0019
            r2 = r0
        L_0x0019:
            return r2
        L_0x001a:
            java.lang.String r2 = "Unsupported LayoutCoordinates"
            androidx.compose.ui.internal.InlineClassHelperKt.b(r2)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.ApproachMeasureScopeImpl.f(androidx.compose.ui.layout.LayoutCoordinates):androidx.compose.ui.layout.LayoutCoordinates");
    }

    public float f2(long j2) {
        return this.f17006z.f2(j2);
    }

    public float getDensity() {
        return this.f17006z.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f17006z.getLayoutDirection();
    }

    public long r(float f2) {
        return this.f17006z.r(f2);
    }

    public long s(long j2) {
        return this.f17006z.s(j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = r0.V();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.LayoutCoordinates u(androidx.compose.ui.layout.Placeable.PlacementScope r2) {
        /*
            r1 = this;
            androidx.compose.ui.node.LayoutModifierNodeCoordinator r2 = r1.f17006z
            androidx.compose.ui.node.LayoutNode r2 = r2.X1()
            androidx.compose.ui.node.LayoutNode r2 = r2.l0()
            if (r2 == 0) goto L_0x0033
            boolean r0 = r2.Y0()
            if (r0 == 0) goto L_0x002e
            androidx.compose.ui.node.LayoutNode r0 = r2.C0()
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.node.NodeCoordinator r0 = r0.V()
            if (r0 != 0) goto L_0x0032
        L_0x001e:
            java.util.List r2 = r2.M()
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            androidx.compose.ui.node.NodeCoordinator r0 = r2.y0()
            goto L_0x0032
        L_0x002e:
            androidx.compose.ui.node.NodeCoordinator r0 = r2.y0()
        L_0x0032:
            return r0
        L_0x0033:
            java.lang.String r2 = "Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope."
            androidx.compose.ui.internal.InlineClassHelperKt.b(r2)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.ApproachMeasureScopeImpl.u(androidx.compose.ui.layout.Placeable$PlacementScope):androidx.compose.ui.layout.LayoutCoordinates");
    }

    public float u1() {
        return this.f17006z.u1();
    }

    public float v(long j2) {
        return this.f17006z.v(j2);
    }

    public final boolean w() {
        return this.f17005B;
    }

    public boolean w1() {
        return false;
    }

    public MeasureResult y0(int i2, int i3, Map map, Function1 function1) {
        return this.f17006z.y0(i2, i3, map, function1);
    }
}
