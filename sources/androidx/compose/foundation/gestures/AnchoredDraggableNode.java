package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class AnchoredDraggableNode<T> extends DragGestureNode {
    public AnchoredDraggableState Y;
    public Orientation Z;
    public Boolean a0;
    public OverscrollEffect b0;
    public Boolean c0;
    public FlingBehavior d0;
    public FlingBehavior e0;
    public Density f0;

    public AnchoredDraggableNode(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        super(AnchoredDraggableKt.f3328a, z2, mutableInteractionSource, orientation);
        this.Y = anchoredDraggableState;
        this.Z = orientation;
        this.a0 = bool;
        this.b0 = overscrollEffect;
        this.c0 = bool2;
        this.d0 = flingBehavior;
    }

    private final boolean M3() {
        Boolean bool = this.a0;
        if (bool == null) {
            return DelegatableNodeKt.n(this) == LayoutDirection.Rtl && this.Z == Orientation.Horizontal;
        }
        Intrinsics.f(bool);
        return bool.booleanValue();
    }

    public void G() {
        X0();
        if (F2()) {
            V3();
        }
    }

    public void I2() {
        W3(this.d0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K3(float r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            if (r0 == 0) goto L_0x0014
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.F = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$1
            r0.<init>(r7, r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r4.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.F
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 == r3) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r8 = r4.C
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.b(r9)
            goto L_0x0073
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.ResultKt.b(r9)
            goto L_0x0054
        L_0x003e:
            kotlin.ResultKt.b(r9)
            androidx.compose.foundation.gestures.AnchoredDraggableState r9 = r7.Y
            boolean r9 = r9.w()
            if (r9 == 0) goto L_0x0055
            androidx.compose.foundation.gestures.AnchoredDraggableState r9 = r7.Y
            r4.F = r3
            java.lang.Object r9 = r9.L(r8, r4)
            if (r9 != r0) goto L_0x0054
            return r0
        L_0x0054:
            return r9
        L_0x0055:
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r9.f40905z = r8
            androidx.compose.foundation.gestures.AnchoredDraggableState r1 = r7.Y
            androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2 r3 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2
            r5 = 0
            r3.<init>(r7, r9, r8, r5)
            r4.C = r9
            r4.F = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableState.j(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x0072
            return r0
        L_0x0072:
            r8 = r9
        L_0x0073:
            float r8 = r8.f40905z
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode.K3(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final FlingBehavior L3() {
        FlingBehavior flingBehavior = this.e0;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        Intrinsics.y("resolvedFlingBehavior");
        return null;
    }

    public final long N3(long j2) {
        return Velocity.m(j2, M3() ? -1.0f : 1.0f);
    }

    public final long O3(long j2) {
        return Offset.r(j2, M3() ? -1.0f : 1.0f);
    }

    public final void P3(FlingBehavior flingBehavior) {
        this.e0 = flingBehavior;
    }

    public final float Q3(long j2) {
        return this.Z == Orientation.Vertical ? Velocity.i(j2) : Velocity.h(j2);
    }

    public final float R3(long j2) {
        return Float.intBitsToFloat((int) (this.Z == Orientation.Vertical ? j2 & 4294967295L : j2 >> 32));
    }

    public final long S3(float f2) {
        Orientation orientation = this.Z;
        float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return Offset.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    public final long T3(float f2) {
        Orientation orientation = this.Z;
        float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f2 = 0.0f;
        }
        return VelocityKt.a(f3, f2);
    }

    public final void U3(AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        boolean z3;
        AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
        Orientation orientation2 = orientation;
        Boolean bool3 = bool;
        FlingBehavior flingBehavior2 = flingBehavior;
        this.d0 = flingBehavior2;
        boolean z4 = true;
        if (!Intrinsics.d(this.Y, anchoredDraggableState)) {
            this.Y = anchoredDraggableState2;
            W3(flingBehavior2);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.Z != orientation2) {
            this.Z = orientation2;
            z3 = true;
        }
        if (!Intrinsics.d(this.a0, bool)) {
            this.a0 = bool3;
        } else {
            z4 = z3;
        }
        this.c0 = bool2;
        this.b0 = overscrollEffect;
        DragGestureNode.A3(this, (Function1) null, z2, mutableInteractionSource, orientation, z4, 1, (Object) null);
    }

    public final void V3() {
        Density k2 = DelegatableNodeKt.k(this);
        Density density = this.f0;
        if (density == null || !Intrinsics.d(density, k2)) {
            this.f0 = k2;
            W3(this.d0);
        }
    }

    public final void W3(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.f3319a;
            AnimationSpec c2 = anchoredDraggableDefaults.c();
            Function1 b2 = anchoredDraggableDefaults.b();
            Density k2 = DelegatableNodeKt.k(this);
            this.f0 = k2;
            flingBehavior = AnchoredDraggableKt.k(this.Y, k2, b2, c2);
        }
        P3(flingBehavior);
    }

    public Object o3(Function2 function2, Continuation continuation) {
        Object j2 = AnchoredDraggableState.j(this.Y, (MutatePriority) null, new AnchoredDraggableNode$drag$2(function2, this, (Continuation) null), continuation, 1, (Object) null);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }

    public void s3(long j2) {
    }

    public void t3(long j2) {
        if (F2()) {
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new AnchoredDraggableNode$onDragStopped$1(this, j2, (Continuation) null), 3, (Object) null);
        }
    }

    public boolean x3() {
        Boolean bool = this.c0;
        return bool != null ? bool.booleanValue() : this.Y.y();
    }
}
