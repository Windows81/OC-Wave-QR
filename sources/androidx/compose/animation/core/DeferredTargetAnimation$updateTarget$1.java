package androidx.compose.animation.core;

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
@DebugMetadata(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", l = {76}, m = "invokeSuspend")
final class DeferredTargetAnimation$updateTarget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Animatable E;
    public final /* synthetic */ DeferredTargetAnimation F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ FiniteAnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeferredTargetAnimation$updateTarget$1(Animatable animatable, DeferredTargetAnimation deferredTargetAnimation, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.E = animatable;
        this.F = deferredTargetAnimation;
        this.G = obj;
        this.H = finiteAnimationSpec;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DeferredTargetAnimation$updateTarget$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DeferredTargetAnimation$updateTarget$1(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!Intrinsics.d(this.E.k(), this.F.b())) {
                Animatable animatable = this.E;
                Object obj2 = this.G;
                FiniteAnimationSpec finiteAnimationSpec = this.H;
                this.D = 1;
                if (Animatable.f(animatable, obj2, finiteAnimationSpec, (Object) null, (Function1) null, this, 12, (Object) null) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
