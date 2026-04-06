package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.BoundsTransformDeferredAnimation$animate$1", f = "AnimateBoundsModifier.kt", l = {428}, m = "invokeSuspend")
public final class BoundsTransformDeferredAnimation$animate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ Rect F;
    public final /* synthetic */ BoundsTransform G;
    public final /* synthetic */ BoundsTransformDeferredAnimation H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundsTransformDeferredAnimation$animate$1(Animatable animatable, Rect rect, BoundsTransform boundsTransform, BoundsTransformDeferredAnimation boundsTransformDeferredAnimation, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = rect;
        this.G = boundsTransform;
        this.H = boundsTransformDeferredAnimation;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoundsTransformDeferredAnimation$animate$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new BoundsTransformDeferredAnimation$animate$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable animatable = this.E;
            Rect rect = this.F;
            BoundsTransform boundsTransform = this.G;
            Rect c2 = this.H.c();
            Intrinsics.f(c2);
            FiniteAnimationSpec a2 = boundsTransform.a(c2, this.F);
            this.D = 1;
            if (Animatable.f(animatable, rect, a2, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
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
