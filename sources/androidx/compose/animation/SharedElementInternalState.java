package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SharedElementInternalState implements LayerRenderer, RememberObserver {

    /* renamed from: A  reason: collision with root package name */
    public final MutableFloatState f2328A;

    /* renamed from: B  reason: collision with root package name */
    public final MutableState f2329B;
    public final MutableState C;
    public final MutableState D;
    public final MutableState E;
    public final MutableState F;
    public final MutableState G;
    public final MutableState H;
    public Path I;
    public Function0 J = SharedElementInternalState$lookaheadCoords$1.f2331z;
    public SharedElementInternalState K;
    public final MutableState L = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: z  reason: collision with root package name */
    public boolean f2330z;

    public SharedElementInternalState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.OverlayClip overlayClip, boolean z3, SharedTransitionScope.SharedContentState sharedContentState, float f2) {
        this.f2328A = PrimitiveSnapshotStateKt.a(f2);
        this.f2329B = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z3), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.C = SnapshotStateKt__SnapshotStateKt.e(sharedElement, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.D = SnapshotStateKt__SnapshotStateKt.e(boundsAnimation, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.E = SnapshotStateKt__SnapshotStateKt.e(placeHolderSize, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.F = SnapshotStateKt__SnapshotStateKt.e(Boolean.valueOf(z2), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.G = SnapshotStateKt__SnapshotStateKt.e(overlayClip, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.H = SnapshotStateKt__SnapshotStateKt.e(sharedContentState, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public void A(SharedElementInternalState sharedElementInternalState) {
        this.K = sharedElementInternalState;
    }

    public final void B(SharedTransitionScope.PlaceHolderSize placeHolderSize) {
        this.E.setValue(placeHolderSize);
    }

    public final void C(boolean z2) {
        this.f2329B.setValue(Boolean.valueOf(z2));
    }

    public final void D(boolean z2) {
        this.F.setValue(Boolean.valueOf(z2));
    }

    public final void E(SharedElement sharedElement) {
        this.C.setValue(sharedElement);
    }

    public final void F(SharedTransitionScope.SharedContentState sharedContentState) {
        this.H.setValue(sharedContentState);
    }

    public void G(float f2) {
        this.f2328A.j(f2);
    }

    public float a() {
        return this.f2328A.c();
    }

    public void b(DrawScope drawScope) {
        GraphicsLayer i2 = i();
        if (i2 == null || !this.f2330z || !r()) {
            return;
        }
        if (p().c() != null) {
            Rect c2 = p().c();
            Unit unit = null;
            Offset d2 = c2 != null ? Offset.d(c2.t()) : null;
            Intrinsics.f(d2);
            long t2 = d2.t();
            float intBitsToFloat = Float.intBitsToFloat((int) (t2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (t2 & 4294967295L));
            Path path = this.I;
            if (path != null) {
                int b2 = ClipOp.f15971b.b();
                DrawContext G1 = drawScope.G1();
                long c3 = G1.c();
                G1.j().o();
                try {
                    G1.e().c(path, b2);
                    drawScope.G1().e().d(intBitsToFloat, intBitsToFloat2);
                    GraphicsLayerKt.a(drawScope, i2);
                    drawScope.G1().e().d(-intBitsToFloat, -intBitsToFloat2);
                    G1.j().t();
                    G1.f(c3);
                    unit = Unit.f40552a;
                } catch (Throwable th) {
                    G1.j().t();
                    G1.f(c3);
                    throw th;
                }
            }
            if (unit == null) {
                drawScope.G1().e().d(intBitsToFloat, intBitsToFloat2);
                try {
                    GraphicsLayerKt.a(drawScope, i2);
                } finally {
                    drawScope.G1().e().d(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        } else {
            throw new IllegalArgumentException("Error: current bounds not set yet.");
        }
    }

    public final long c() {
        Object invoke = this.J.invoke();
        if (invoke != null) {
            return p().f().j().N((LayoutCoordinates) invoke, Offset.f15855b.c());
        }
        throw new IllegalArgumentException("Error: lookahead coordinates is null.");
    }

    public final BoundsAnimation d() {
        return (BoundsAnimation) this.D.getValue();
    }

    public void e() {
    }

    public void f() {
        p().f().s(this);
        p().t();
    }

    public final Path g() {
        return this.I;
    }

    public void h() {
        p().f().r(this);
        p().t();
    }

    public final GraphicsLayer i() {
        return (GraphicsLayer) this.L.getValue();
    }

    public final long j() {
        Object invoke = this.J.invoke();
        if (invoke != null) {
            return IntSizeKt.e(((LayoutCoordinates) invoke).a());
        }
        throw new IllegalArgumentException(("Error: lookahead coordinates is null for " + p().e() + '.').toString());
    }

    public final SharedTransitionScope.OverlayClip k() {
        return (SharedTransitionScope.OverlayClip) this.G.getValue();
    }

    public SharedElementInternalState l() {
        return this.K;
    }

    public final SharedTransitionScope.PlaceHolderSize m() {
        return (SharedTransitionScope.PlaceHolderSize) this.E.getValue();
    }

    public final boolean n() {
        return ((Boolean) this.f2329B.getValue()).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    public final SharedElement p() {
        return (SharedElement) this.C.getValue();
    }

    public final boolean q() {
        return Intrinsics.d(p().i(), this) || !o();
    }

    public final boolean r() {
        return q() && p().d() && n();
    }

    public final boolean s() {
        return !p().d() || (!r() && q());
    }

    public final SharedTransitionScope.SharedContentState t() {
        return (SharedTransitionScope.SharedContentState) this.H.getValue();
    }

    public final void u(BoundsAnimation boundsAnimation) {
        this.D.setValue(boundsAnimation);
    }

    public final void v(Path path) {
        this.I = path;
    }

    public final void w(boolean z2) {
        this.f2330z = z2;
    }

    public final void x(GraphicsLayer graphicsLayer) {
        this.L.setValue(graphicsLayer);
    }

    public final void y(Function0 function0) {
        this.J = function0;
    }

    public final void z(SharedTransitionScope.OverlayClip overlayClip) {
        this.G.setValue(overlayClip);
    }
}
