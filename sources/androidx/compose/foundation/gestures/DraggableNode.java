package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class DraggableNode extends DragGestureNode {
    public DraggableState Y;
    public Orientation Z;
    public boolean a0;
    public Function3 b0;
    public Function3 c0;
    public boolean d0;

    public DraggableNode(DraggableState draggableState, Function1 function1, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4) {
        super(function1, z2, mutableInteractionSource, orientation);
        this.Y = draggableState;
        this.Z = orientation;
        this.a0 = z3;
        this.b0 = function3;
        this.c0 = function32;
        this.d0 = z4;
    }

    /* access modifiers changed from: private */
    public final long G3(long j2) {
        return Velocity.m(j2, this.d0 ? -1.0f : 1.0f);
    }

    /* access modifiers changed from: private */
    public final long H3(long j2) {
        return Offset.r(j2, this.d0 ? -1.0f : 1.0f);
    }

    public final void I3(DraggableState draggableState, Function1 function1, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4) {
        boolean z5;
        boolean z6;
        Function3 function33;
        DraggableState draggableState2 = draggableState;
        Orientation orientation2 = orientation;
        boolean z7 = z4;
        if (!Intrinsics.d(this.Y, draggableState)) {
            this.Y = draggableState2;
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.Z != orientation2) {
            this.Z = orientation2;
            z5 = true;
        }
        if (this.d0 != z7) {
            this.d0 = z7;
            function33 = function3;
            z6 = true;
        } else {
            z6 = z5;
            function33 = function3;
        }
        this.b0 = function33;
        this.c0 = function32;
        this.a0 = z3;
        z3(function1, z2, mutableInteractionSource, orientation, z6);
    }

    public Object o3(Function2 function2, Continuation continuation) {
        Object a2 = this.Y.a(MutatePriority.UserInput, new DraggableNode$drag$2(function2, this, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public void s3(long j2) {
        if (F2() && !Intrinsics.d(this.b0, DraggableKt.f3516a)) {
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStarted$1(this, j2, (Continuation) null), 1, (Object) null);
        }
    }

    public void t3(long j2) {
        if (F2() && !Intrinsics.d(this.c0, DraggableKt.f3517b)) {
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new DraggableNode$onDragStopped$1(this, j2, (Continuation) null), 1, (Object) null);
        }
    }

    public boolean x3() {
        return this.a0;
    }
}
