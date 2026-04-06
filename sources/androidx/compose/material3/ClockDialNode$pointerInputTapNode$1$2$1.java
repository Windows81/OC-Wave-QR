package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.geometry.Offset;
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
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1509}, m = "invokeSuspend")
public final class ClockDialNode$pointerInputTapNode$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ ClockDialNode E;
    public final /* synthetic */ Offset F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1$2$1(ClockDialNode clockDialNode, Offset offset, Continuation continuation) {
        super(2, continuation);
        this.E = clockDialNode;
        this.F = offset;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClockDialNode$pointerInputTapNode$1$2$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new ClockDialNode$pointerInputTapNode$1$2$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnalogTimePickerState l3 = this.E.P;
            float intBitsToFloat = Float.intBitsToFloat((int) (this.F.t() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.F.t() & 4294967295L));
            float i3 = this.E.p3();
            boolean g3 = this.E.Q;
            long h3 = this.E.o3();
            AnimationSpec f3 = this.E.S;
            this.D = 1;
            if (TimePickerKt.D0(l3, intBitsToFloat, intBitsToFloat2, i3, g3, h3, f3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
