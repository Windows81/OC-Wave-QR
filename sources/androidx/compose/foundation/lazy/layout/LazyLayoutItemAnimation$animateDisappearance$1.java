package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
public final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ LazyLayoutItemAnimation E;
    public final /* synthetic */ FiniteAnimationSpec F;
    public final /* synthetic */ GraphicsLayer G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.E = lazyLayoutItemAnimation;
        this.F = finiteAnimationSpec;
        this.G = graphicsLayer;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Animatable d2 = this.E.f4817p;
            Float b2 = Boxing.b(0.0f);
            FiniteAnimationSpec finiteAnimationSpec = this.F;
            final GraphicsLayer graphicsLayer = this.G;
            final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.E;
            AnonymousClass1 r8 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() {
                public final void b(Animatable animatable) {
                    graphicsLayer.L(((Number) animatable.m()).floatValue());
                    lazyLayoutItemAnimation.f4804c.invoke();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Animatable) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (Animatable.f(d2, b2, finiteAnimationSpec, (Object) null, r8, this, 4, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                this.E.B(false);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.E.A(true);
        this.E.B(false);
        return Unit.f40552a;
    }
}
