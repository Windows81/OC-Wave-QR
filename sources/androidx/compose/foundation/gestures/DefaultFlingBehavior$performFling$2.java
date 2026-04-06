package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
public final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
    public Object D;
    public Object E;
    public int F;
    public final /* synthetic */ float G;
    public final /* synthetic */ DefaultFlingBehavior H;
    public final /* synthetic */ ScrollScope I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f2, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.G = f2;
        this.H = defaultFlingBehavior;
        this.I = scrollScope;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DefaultFlingBehavior$performFling$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new DefaultFlingBehavior$performFling$2(this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        float f2;
        Ref.FloatRef floatRef;
        AnimationState animationState;
        Object f3 = IntrinsicsKt.f();
        int i2 = this.F;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (Math.abs(this.G) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.f40905z = this.G;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState c2 = AnimationStateKt.c(0.0f, this.G, 0, 0, false, 28, (Object) null);
                try {
                    DecayAnimationSpec d2 = this.H.f3431a;
                    final ScrollScope scrollScope = this.I;
                    final DefaultFlingBehavior defaultFlingBehavior = this.H;
                    AnonymousClass1 r3 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() {
                        public final void b(AnimationScope animationScope) {
                            float floatValue = ((Number) animationScope.e()).floatValue() - floatRef3.f40905z;
                            float g2 = scrollScope.g(floatValue);
                            floatRef3.f40905z = ((Number) animationScope.e()).floatValue();
                            floatRef2.f40905z = ((Number) animationScope.f()).floatValue();
                            if (Math.abs(floatValue - g2) > 0.5f) {
                                animationScope.a();
                            }
                            DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                            defaultFlingBehavior.f(defaultFlingBehavior.e() + 1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((AnimationScope) obj);
                            return Unit.f40552a;
                        }
                    };
                    this.D = floatRef2;
                    this.E = c2;
                    this.F = 1;
                    if (SuspendAnimationKt.i(c2, d2, false, r3, this, 2, (Object) null) == f3) {
                        return f3;
                    }
                    floatRef = floatRef2;
                } catch (CancellationException unused) {
                    floatRef = floatRef2;
                    animationState = c2;
                    floatRef.f40905z = ((Number) animationState.m()).floatValue();
                    f2 = floatRef.f40905z;
                    return Boxing.b(f2);
                }
            } else {
                f2 = this.G;
                return Boxing.b(f2);
            }
        } else if (i2 == 1) {
            animationState = (AnimationState) this.E;
            floatRef = (Ref.FloatRef) this.D;
            try {
                ResultKt.b(obj);
            } catch (CancellationException unused2) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f2 = floatRef.f40905z;
        return Boxing.b(f2);
    }
}
