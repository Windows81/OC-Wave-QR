package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;

@Metadata
public abstract class DragGestureNode extends DelegatingNode implements PointerInputModifierNode {
    public Orientation P;
    public Function1 Q;
    public boolean R;
    public MutableInteractionSource S;
    public final Function1 T = new DragGestureNode$_canDrag$1(this);
    public Channel U;
    public DragInteraction.Start V;
    public boolean W;
    public SuspendingPointerInputModifierNode X;

    public DragGestureNode(Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation) {
        this.P = orientation;
        this.Q = function1;
        this.R = z2;
        this.S = mutableInteractionSource;
    }

    public static /* synthetic */ void A3(DragGestureNode dragGestureNode, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                function1 = dragGestureNode.Q;
            }
            if ((i2 & 2) != 0) {
                z2 = dragGestureNode.R;
            }
            boolean z4 = z2;
            if ((i2 & 4) != 0) {
                mutableInteractionSource = dragGestureNode.S;
            }
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 8) != 0) {
                orientation = dragGestureNode.P;
            }
            Orientation orientation2 = orientation;
            if ((i2 & 16) != 0) {
                z3 = false;
            }
            dragGestureNode.z3(function1, z4, mutableInteractionSource2, orientation2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }

    public void J2() {
        this.W = false;
        n3();
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (this.R && this.X == null) {
            this.X = (SuspendingPointerInputModifierNode) Z2(r3());
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.X;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.S0(pointerEvent, pointerEventPass, j2);
        }
    }

    public void X0() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.X;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.X0();
        }
    }

    public final void n3() {
        DragInteraction.Start start = this.V;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.S;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.b(new DragInteraction.Cancel(start));
            }
            this.V = null;
        }
    }

    public abstract Object o3(Function2 function2, Continuation continuation);

    public final Function1 p3() {
        return this.Q;
    }

    public final boolean q3() {
        return this.R;
    }

    public final SuspendingPointerInputModifierNode r3() {
        return SuspendingPointerInputFilterKt.a(new DragGestureNode$initializePointerInputNode$1(this));
    }

    public abstract void s3(long j2);

    public abstract void t3(long j2);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u3(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.ResultKt.b(r6)
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.interaction.DragInteraction$Start r6 = r5.V
            if (r6 == 0) goto L_0x0055
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.S
            if (r2 == 0) goto L_0x0050
            androidx.compose.foundation.interaction.DragInteraction$Cancel r4 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r4.<init>(r6)
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r5
        L_0x0051:
            r6 = 0
            r0.V = r6
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.f19186b
            long r1 = r6.a()
            r0.t3(r1)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.u3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v3(androidx.compose.foundation.gestures.DragEvent.DragStarted r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.E
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = (androidx.compose.foundation.interaction.DragInteraction.Start) r7
            java.lang.Object r1 = r0.D
            androidx.compose.foundation.gestures.DragEvent$DragStarted r1 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r1
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.ResultKt.b(r8)
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.D
            androidx.compose.foundation.gestures.DragEvent$DragStarted r7 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r7
            java.lang.Object r2 = r0.C
            androidx.compose.foundation.gestures.DragGestureNode r2 = (androidx.compose.foundation.gestures.DragGestureNode) r2
            kotlin.ResultKt.b(r8)
            goto L_0x006a
        L_0x004c:
            kotlin.ResultKt.b(r8)
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r6.V
            if (r8 == 0) goto L_0x0069
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r6.S
            if (r2 == 0) goto L_0x0069
            androidx.compose.foundation.interaction.DragInteraction$Cancel r5 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r5.<init>(r8)
            r0.C = r6
            r0.D = r7
            r0.H = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r2 = r6
        L_0x006a:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r8.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r2.S
            if (r4 == 0) goto L_0x0088
            r0.C = r2
            r0.D = r7
            r0.E = r8
            r0.H = r3
            java.lang.Object r0 = r4.a(r8, r0)
            if (r0 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r1 = r7
            r7 = r8
            r0 = r2
        L_0x0085:
            r8 = r7
            r2 = r0
            r7 = r1
        L_0x0088:
            r2.V = r8
            long r7 = r7.a()
            r2.s3(r7)
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.v3(androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w3(androidx.compose.foundation.gestures.DragEvent.DragStopped r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.D
            androidx.compose.foundation.gestures.DragEvent$DragStopped r6 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r6
            java.lang.Object r0 = r0.C
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            kotlin.ResultKt.b(r7)
            goto L_0x0057
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.b(r7)
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = r5.V
            if (r7 == 0) goto L_0x005b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r5.S
            if (r2 == 0) goto L_0x0056
            androidx.compose.foundation.interaction.DragInteraction$Stop r4 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r4.<init>(r7)
            r0.C = r5
            r0.D = r6
            r0.G = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r5
        L_0x0057:
            r7 = 0
            r0.V = r7
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r6 = r6.a()
            r0.t3(r6)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.w3(androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract boolean x3();

    public final void y3() {
        this.W = true;
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new DragGestureNode$startListeningForEvents$1(this, (Continuation) null), 3, (Object) null);
    }

    public final void z3(Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, Orientation orientation, boolean z3) {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode;
        this.Q = function1;
        boolean z4 = true;
        if (this.R != z2) {
            this.R = z2;
            if (!z2) {
                n3();
                SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.X;
                if (suspendingPointerInputModifierNode2 != null) {
                    c3(suspendingPointerInputModifierNode2);
                }
                this.X = null;
            }
            z3 = true;
        }
        if (!Intrinsics.d(this.S, mutableInteractionSource)) {
            n3();
            this.S = mutableInteractionSource;
        }
        if (this.P != orientation) {
            this.P = orientation;
        } else {
            z4 = z3;
        }
        if (z4 && (suspendingPointerInputModifierNode = this.X) != null) {
            suspendingPointerInputModifierNode.u2();
        }
    }
}
