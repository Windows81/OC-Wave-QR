package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {1053}, m = "invokeSuspend")
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f2, float f3, float f4, Continuation continuation) {
        super(2, continuation);
        this.F = f2;
        this.G = f3;
        this.H = f4;
    }

    /* renamed from: A */
    public final Object m(DragScope dragScope, Continuation continuation) {
        return ((SliderKt$animateToTarget$2) s(dragScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.F, this.G, this.H, continuation);
        sliderKt$animateToTarget$2.E = obj;
        return sliderKt$animateToTarget$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final DragScope dragScope = (DragScope) this.E;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f3 = this.F;
            floatRef.f40905z = f3;
            Animatable b2 = AnimatableKt.b(f3, 0.0f, 2, (Object) null);
            Float b3 = Boxing.b(this.G);
            TweenSpec p2 = SliderKt.f8347i;
            Float b4 = Boxing.b(this.H);
            AnonymousClass1 r11 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() {
                public final void b(Animatable animatable) {
                    dragScope.a(((Number) animatable.m()).floatValue() - floatRef.f40905z);
                    floatRef.f40905z = ((Number) animatable.m()).floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Animatable) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (b2.e(b3, p2, b4, r11, this) == f2) {
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
