package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$sliderTapModifier$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderState f11129z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ long E;

        public final Object A(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
            AnonymousClass1 r2 = new AnonymousClass1(sliderState, continuation);
            r2.E = j2;
            return r2.x(Unit.f40552a);
        }

        public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
            return A((PressGestureScope) obj, ((Offset) obj2).t(), (Continuation) obj3);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                sliderState.v(this.E);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit b(SliderState sliderState, Offset offset) {
        sliderState.b(0.0f);
        sliderState.i().invoke();
        return Unit.f40552a;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final SliderState sliderState = this.f11129z;
        Object m2 = TapGestureDetectorKt.m(pointerInputScope, (Function1) null, (Function1) null, new AnonymousClass1((Continuation) null), new C0259u6(this.f11129z), continuation, 3, (Object) null);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
