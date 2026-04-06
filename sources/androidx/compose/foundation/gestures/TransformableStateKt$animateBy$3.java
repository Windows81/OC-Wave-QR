package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", l = {230}, m = "invokeSuspend")
final class TransformableStateKt$animateBy$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.ObjectRef F;
    public final /* synthetic */ AnimationData G;
    public final /* synthetic */ DelegatingAnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref.ObjectRef objectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = objectRef;
        this.G = animationData;
        this.H = delegatingAnimationSpec;
    }

    /* renamed from: A */
    public final Object m(TransformScope transformScope, Continuation continuation) {
        return ((TransformableStateKt$animateBy$3) s(transformScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.F, this.G, this.H, continuation);
        transformableStateKt$animateBy$3.E = obj;
        return transformableStateKt$animateBy$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final TransformScope transformScope = (TransformScope) this.E;
            AnimationState d2 = AnimationStateKt.d(AnimationDataConverter.f3395a, this.F.f40908z, TransformableStateKt.f3621a, 0, 0, false, 56, (Object) null);
            AnimationData animationData = this.G;
            DelegatingAnimationSpec delegatingAnimationSpec = this.H;
            final Ref.ObjectRef objectRef = this.F;
            AnonymousClass1 r5 = new Function1<AnimationScope<AnimationData, AnimationVector4D>, Unit>() {
                public final void b(AnimationScope animationScope) {
                    float c2 = ((AnimationData) objectRef.f40908z).c() == 0.0f ? 1.0f : ((AnimationData) animationScope.e()).c() / ((AnimationData) objectRef.f40908z).c();
                    transformScope.a(c2, Offset.p(((AnimationData) animationScope.e()).b(), ((AnimationData) objectRef.f40908z).b()), ((AnimationData) animationScope.e()).a() - ((AnimationData) objectRef.f40908z).a());
                    objectRef.f40908z = animationScope.e();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((AnimationScope) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (SuspendAnimationKt.k(d2, animationData, delegatingAnimationSpec, false, r5, this, 4, (Object) null) == f2) {
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
