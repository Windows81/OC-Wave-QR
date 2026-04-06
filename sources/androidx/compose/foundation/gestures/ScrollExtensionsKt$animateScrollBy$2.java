package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {39}, m = "invokeSuspend")
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ float F;
    public final /* synthetic */ AnimationSpec G;
    public final /* synthetic */ Ref.FloatRef H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f2, AnimationSpec animationSpec, Ref.FloatRef floatRef, Continuation continuation) {
        super(2, continuation);
        this.F = f2;
        this.G = animationSpec;
        this.H = floatRef;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((ScrollExtensionsKt$animateScrollBy$2) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.F, this.G, this.H, continuation);
        scrollExtensionsKt$animateScrollBy$2.E = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final ScrollScope scrollScope = (ScrollScope) this.E;
            float f3 = this.F;
            AnimationSpec animationSpec = this.G;
            final Ref.FloatRef floatRef = this.H;
            AnonymousClass1 r7 = new Function2<Float, Float, Unit>() {
                public final void b(float f2, float f3) {
                    Ref.FloatRef floatRef = floatRef;
                    float f4 = floatRef.f40905z;
                    floatRef.f40905z = f4 + scrollScope.g(f2 - f4);
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (SuspendAnimationKt.e(0.0f, f3, 0.0f, animationSpec, r7, this, 4, (Object) null) == f2) {
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
