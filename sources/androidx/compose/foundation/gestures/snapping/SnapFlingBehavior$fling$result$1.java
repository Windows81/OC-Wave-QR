package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
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
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ SnapFlingBehavior F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ ScrollScope I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f2, Function1 function1, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.F = snapFlingBehavior;
        this.G = f2;
        this.H = function1;
        this.I = scrollScope;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SnapFlingBehavior$fling$result$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.F, this.G, this.H, this.I, continuation);
    }

    public final Object x(Object obj) {
        final Ref.FloatRef floatRef;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            float a2 = this.F.f3660a.a(this.G, DecayAnimationSpecKt.a(this.F.f3661b, 0.0f, this.G));
            if (Float.isNaN(a2)) {
                InlineClassHelperKt.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float abs = Math.abs(a2) * Math.signum(this.G);
            floatRef.f40905z = abs;
            this.H.invoke(Boxing.b(abs));
            SnapFlingBehavior snapFlingBehavior = this.F;
            ScrollScope scrollScope = this.I;
            float f3 = floatRef.f40905z;
            float f4 = this.G;
            SnapFlingBehavior$fling$result$1$animationState$1 snapFlingBehavior$fling$result$1$animationState$1 = new SnapFlingBehavior$fling$result$1$animationState$1(floatRef, this.H);
            this.D = floatRef;
            this.E = 1;
            obj = snapFlingBehavior.l(scrollScope, f3, f4, snapFlingBehavior$fling$result$1$animationState$1, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            floatRef = (Ref.FloatRef) this.D;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationState animationState = (AnimationState) obj;
        float b2 = this.F.f3660a.b(((Number) animationState.m()).floatValue());
        if (Float.isNaN(b2)) {
            InlineClassHelperKt.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.f40905z = b2;
        ScrollScope scrollScope2 = this.I;
        AnimationState g2 = AnimationStateKt.g(animationState, 0.0f, 0.0f, 0, 0, false, 30, (Object) null);
        AnimationSpec f5 = this.F.f3662c;
        final Function1 function1 = this.H;
        AnonymousClass4 r10 = new Function1<Float, Unit>() {
            public final void b(float f2) {
                Ref.FloatRef floatRef = floatRef;
                float f3 = floatRef.f40905z - f2;
                floatRef.f40905z = f3;
                function1.invoke(Float.valueOf(f3));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).floatValue());
                return Unit.f40552a;
            }
        };
        this.D = null;
        this.E = 2;
        obj = SnapFlingBehaviorKt.h(scrollScope2, b2, b2, g2, f5, r10, this);
        return obj == f2 ? f2 : obj;
    }
}
