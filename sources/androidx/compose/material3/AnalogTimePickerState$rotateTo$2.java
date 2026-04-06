package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
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
@DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
public final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    public int D;
    public final /* synthetic */ AnalogTimePickerState E;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ AnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, AnimationSpec animationSpec, Continuation continuation) {
        super(1, continuation);
        this.E = analogTimePickerState;
        this.F = f2;
        this.G = z2;
        this.H = animationSpec;
    }

    public final Continuation A(Continuation continuation) {
        return new AnalogTimePickerState$rotateTo$2(this.E, this.F, this.G, this.H, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((AnalogTimePickerState$rotateTo$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (TimePickerSelectionMode.f(this.E.e(), TimePickerSelectionMode.f11521b.a())) {
                AnalogTimePickerState analogTimePickerState = this.E;
                int i3 = 12;
                analogTimePickerState.f9156d = ((float) (analogTimePickerState.C(this.F) % 12)) * 0.5235988f;
                TimePickerState u2 = this.E.u();
                AnalogTimePickerState analogTimePickerState2 = this.E;
                int o2 = analogTimePickerState2.C(analogTimePickerState2.f9156d) % 12;
                if (!TimePickerKt.A0(this.E)) {
                    i3 = 0;
                }
                u2.a(o2 + i3);
            } else {
                AnalogTimePickerState analogTimePickerState3 = this.E;
                analogTimePickerState3.f9157e = ((float) analogTimePickerState3.D(this.F)) * 0.10471976f;
                TimePickerState u3 = this.E.u();
                AnalogTimePickerState analogTimePickerState4 = this.E;
                u3.b(analogTimePickerState4.D(analogTimePickerState4.f9157e));
            }
            if (!this.G) {
                Animatable i4 = this.E.f9158f;
                Float b2 = Boxing.b(this.E.x(this.F));
                this.D = 1;
                if (i4.t(b2, this) == f2) {
                    return f2;
                }
            } else {
                AnalogTimePickerState analogTimePickerState5 = this.E;
                float h2 = analogTimePickerState5.r(analogTimePickerState5.x(this.F));
                Animatable i5 = this.E.f9158f;
                Float b3 = Boxing.b(h2);
                AnimationSpec animationSpec = this.H;
                this.D = 2;
                Object f3 = Animatable.f(i5, b3, animationSpec, (Object) null, (Function1) null, this, 12, (Object) null);
                return f3 == f2 ? f2 : f3;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
