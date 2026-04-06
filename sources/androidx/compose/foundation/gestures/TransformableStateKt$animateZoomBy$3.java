package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
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
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", l = {142}, m = "invokeSuspend")
final class TransformableStateKt$animateZoomBy$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.FloatRef F;
    public final /* synthetic */ float G;
    public final /* synthetic */ AnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$3(Ref.FloatRef floatRef, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = floatRef;
        this.G = f2;
        this.H = animationSpec;
    }

    /* renamed from: A */
    public final Object m(TransformScope transformScope, Continuation continuation) {
        return ((TransformableStateKt$animateZoomBy$3) s(transformScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.F, this.G, this.H, continuation);
        transformableStateKt$animateZoomBy$3.E = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final TransformScope transformScope = (TransformScope) this.E;
            AnimationState c2 = AnimationStateKt.c(this.F.f40905z, 0.0f, 0, 0, false, 30, (Object) null);
            Float b2 = Boxing.b(this.G);
            AnimationSpec animationSpec = this.H;
            final Ref.FloatRef floatRef = this.F;
            AnonymousClass1 r5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() {
                public final void b(AnimationScope animationScope) {
                    TransformScope.b(transformScope, floatRef.f40905z == 0.0f ? 1.0f : ((Number) animationScope.e()).floatValue() / floatRef.f40905z, 0, 0.0f, 6, (Object) null);
                    floatRef.f40905z = ((Number) animationScope.e()).floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((AnimationScope) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (SuspendAnimationKt.k(c2, b2, animationSpec, false, r5, this, 4, (Object) null) == f2) {
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
