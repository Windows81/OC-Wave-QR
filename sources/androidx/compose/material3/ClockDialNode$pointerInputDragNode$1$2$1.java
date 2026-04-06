package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
public final class ClockDialNode$pointerInputDragNode$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ ClockDialNode E;
    public final /* synthetic */ Offset F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1$2$1(ClockDialNode clockDialNode, Offset offset, Continuation continuation) {
        super(2, continuation);
        this.E = clockDialNode;
        this.F = offset;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClockDialNode$pointerInputDragNode$1$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ClockDialNode$pointerInputDragNode$1$2$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ClockDialNode clockDialNode = this.E;
            clockDialNode.T = clockDialNode.T + Float.intBitsToFloat((int) (this.F.t() >> 32));
            ClockDialNode clockDialNode2 = this.E;
            clockDialNode2.U = clockDialNode2.U + Float.intBitsToFloat((int) (this.F.t() & 4294967295L));
            AnalogTimePickerState l3 = this.E.P;
            float j0 = TimePickerKt.v0(this.E.U - ((float) IntOffset.l(this.E.o3())), this.E.T - ((float) IntOffset.k(this.E.o3())));
            AnimationSpec f3 = this.E.S;
            this.D = 1;
            if (AnalogTimePickerState.A(l3, j0, f3, false, this, 4, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TimePickerKt.B0(this.E.P, this.E.T, this.E.U, this.E.p3(), this.E.o3());
        return Unit.f40552a;
    }
}
