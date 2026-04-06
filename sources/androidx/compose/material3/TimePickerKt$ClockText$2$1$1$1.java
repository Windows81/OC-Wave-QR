package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1769}, m = "invokeSuspend")
public final class TimePickerKt$ClockText$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AnalogTimePickerState E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ MutableState H;
    public final /* synthetic */ MutableState I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2$1$1$1(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.E = analogTimePickerState;
        this.F = f2;
        this.G = z2;
        this.H = mutableState;
        this.I = mutableState2;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TimePickerKt$ClockText$2$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new TimePickerKt$ClockText$2$1$1$1(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            AnalogTimePickerState analogTimePickerState = this.E;
            float intBitsToFloat = Float.intBitsToFloat((int) (TimePickerKt.s(this.H) >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (TimePickerKt.s(this.H) & 4294967295L));
            float f3 = this.F;
            boolean z2 = this.G;
            long Z = TimePickerKt.u(this.I);
            SnapSpec snapSpec = new SnapSpec(0, 1, (DefaultConstructorMarker) null);
            this.D = 1;
            if (TimePickerKt.D0(analogTimePickerState, intBitsToFloat, intBitsToFloat2, f3, z2, Z, snapSpec, this) == f2) {
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
