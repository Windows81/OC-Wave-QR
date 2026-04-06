package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
public final class Animatable$runAnimation$2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
    public Object D;
    public Object E;
    public int F;
    public final /* synthetic */ Animatable G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Animation I;
    public final /* synthetic */ long J;
    public final /* synthetic */ Function1 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable animatable, Object obj, Animation animation, long j2, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.G = animatable;
        this.H = obj;
        this.I = animation;
        this.J = j2;
        this.K = function1;
    }

    public final Continuation A(Continuation continuation) {
        return new Animatable$runAnimation$2(this.G, this.H, this.I, this.J, this.K, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((Animatable$runAnimation$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.F;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.G.j().z((AnimationVector) this.G.l().a().invoke(this.H));
            this.G.s(this.I.g());
            this.G.r(true);
            final AnimationState h2 = AnimationStateKt.h(this.G.j(), (Object) null, (AnimationVector) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Animation animation = this.I;
            long j2 = this.J;
            final Animatable animatable = this.G;
            final Function1 function1 = this.K;
            AnonymousClass1 r6 = new Function1<AnimationScope<T, V>, Unit>() {
                public final void b(AnimationScope animationScope) {
                    SuspendAnimationKt.p(animationScope, animatable.j());
                    Object a2 = animatable.h(animationScope.e());
                    if (!Intrinsics.d(a2, animationScope.e())) {
                        animatable.j().y(a2);
                        h2.y(a2);
                        Function1 function1 = function1;
                        if (function1 != null) {
                            function1.invoke(animatable);
                        }
                        animationScope.a();
                        booleanRef2.f40901z = true;
                        return;
                    }
                    Function1 function12 = function1;
                    if (function12 != null) {
                        function12.invoke(animatable);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((AnimationScope) obj);
                    return Unit.f40552a;
                }
            };
            this.D = h2;
            this.E = booleanRef2;
            this.F = 1;
            if (SuspendAnimationKt.c(h2, animation, j2, r6, this) == f2) {
                return f2;
            }
            animationState = h2;
            booleanRef = booleanRef2;
        } else if (i2 == 1) {
            booleanRef = (Ref.BooleanRef) this.E;
            animationState = (AnimationState) this.D;
            try {
                ResultKt.b(obj);
            } catch (CancellationException e2) {
                this.G.i();
                throw e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationEndReason animationEndReason = booleanRef.f40901z ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
        this.G.i();
        return new AnimationResult(animationState, animationEndReason);
    }
}
