package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Draggable2DNode extends DragGestureNode {
    public Draggable2DState Y;
    public boolean Z;
    public boolean a0;
    public Function1 b0;
    public Function1 c0;

    public Draggable2DNode(Draggable2DState draggable2DState, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function1 function12, Function1 function13) {
        super(function1, z2, mutableInteractionSource, (Orientation) null);
        this.Y = draggable2DState;
        this.Z = z3;
        this.a0 = z4;
        this.b0 = function12;
        this.c0 = function13;
    }

    public final void C3(Draggable2DState draggable2DState, Function1 function1, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, boolean z4, Function1 function12, Function1 function13) {
        boolean z5;
        boolean z6;
        if (!Intrinsics.d(this.Y, draggable2DState)) {
            this.Y = draggable2DState;
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.a0 != z4) {
            this.a0 = z4;
            z6 = true;
        } else {
            z6 = z5;
        }
        this.b0 = function12;
        this.c0 = function13;
        this.Z = z3;
        z3(function1, z2, mutableInteractionSource, (Orientation) null, z6);
    }

    public Object o3(Function2 function2, Continuation continuation) {
        Object a2 = this.Y.a(MutatePriority.UserInput, new Draggable2DNode$drag$2(function2, this, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public void s3(long j2) {
        this.b0.invoke(Offset.d(j2));
    }

    public void t3(long j2) {
        this.c0.invoke(Velocity.b(j2));
    }

    public boolean x3() {
        return this.Z;
    }
}
