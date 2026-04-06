package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {182}, m = "invokeSuspend")
final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.LongRef F;
    public final /* synthetic */ long G;
    public final /* synthetic */ AnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref.LongRef longRef, long j2, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = longRef;
        this.G = j2;
        this.H = animationSpec;
    }

    /* renamed from: A */
    public final Object m(TransformScope transformScope, Continuation continuation) {
        return ((TransformableStateKt$animatePanBy$2) s(transformScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.F, this.G, this.H, continuation);
        transformableStateKt$animatePanBy$2.E = obj;
        return transformableStateKt$animatePanBy$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final TransformScope transformScope = (TransformScope) this.E;
            AnimationState animationState = new AnimationState(VectorConvertersKt.b(Offset.f15855b), Offset.d(this.F.f40907z), (AnimationVector) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
            Offset d2 = Offset.d(this.G);
            AnimationSpec animationSpec = this.H;
            final Ref.LongRef longRef = this.F;
            AnonymousClass1 r7 = new Function1<AnimationScope<Offset, AnimationVector2D>, Unit>() {
                public final void b(AnimationScope animationScope) {
                    TransformScope.b(transformScope, 0.0f, Offset.p(((Offset) animationScope.e()).t(), longRef.f40907z), 0.0f, 5, (Object) null);
                    longRef.f40907z = ((Offset) animationScope.e()).t();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((AnimationScope) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (SuspendAnimationKt.k(animationState, d2, animationSpec, false, r7, this, 4, (Object) null) == f2) {
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
