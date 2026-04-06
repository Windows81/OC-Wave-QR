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
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
public final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ LazyLayoutItemAnimation F;
    public final /* synthetic */ FiniteAnimationSpec G;
    public final /* synthetic */ GraphicsLayer H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z2, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.E = z2;
        this.F = lazyLayoutItemAnimation;
        this.G = finiteAnimationSpec;
        this.H = graphicsLayer;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.E, this.F, this.G, this.H, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E) {
                Animatable d2 = this.F.f4817p;
                Float b2 = Boxing.b(0.0f);
                this.D = 1;
                if (d2.t(b2, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else if (i2 == 2) {
            try {
                ResultKt.b(obj);
                this.F.z(false);
                return Unit.f40552a;
            } catch (Throwable th) {
                this.F.z(false);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Animatable d3 = this.F.f4817p;
        Float b3 = Boxing.b(1.0f);
        FiniteAnimationSpec finiteAnimationSpec = this.G;
        final GraphicsLayer graphicsLayer = this.H;
        final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.F;
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
        this.D = 2;
        if (Animatable.f(d3, b3, finiteAnimationSpec, (Object) null, r8, this, 4, (Object) null) == f2) {
            return f2;
        }
        this.F.z(false);
        return Unit.f40552a;
    }
}
