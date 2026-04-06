package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {804}, m = "invokeSuspend")
public final class AnalogTimePickerState$onGestureEnd$2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    public int D;
    public final /* synthetic */ AnalogTimePickerState E;
    public final /* synthetic */ float F;
    public final /* synthetic */ AnimationSpec G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$onGestureEnd$2(AnalogTimePickerState analogTimePickerState, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(1, continuation);
        this.E = analogTimePickerState;
        this.F = f2;
        this.G = animationSpec;
    }

    public final Continuation A(Continuation continuation) {
        return new AnalogTimePickerState$onGestureEnd$2(this.E, this.F, this.G, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((AnalogTimePickerState$onGestureEnd$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable i3 = this.E.f9158f;
            Float b2 = Boxing.b(this.F);
            AnimationSpec animationSpec = this.G;
            this.D = 1;
            obj = Animatable.f(i3, b2, animationSpec, (Object) null, (Function1) null, this, 12, (Object) null);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
