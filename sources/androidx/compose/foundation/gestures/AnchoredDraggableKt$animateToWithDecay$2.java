package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1391, 1409, 1433}, m = "invokeSuspend")
public final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ AnchoredDraggableState H;
    public final /* synthetic */ float I;
    public final /* synthetic */ AnimationSpec J;
    public final /* synthetic */ Ref.FloatRef K;
    public final /* synthetic */ DecayAnimationSpec L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState anchoredDraggableState, float f2, AnimationSpec animationSpec, Ref.FloatRef floatRef, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        super(4, continuation);
        this.H = anchoredDraggableState;
        this.I = f2;
        this.J = animationSpec;
        this.K = floatRef;
        this.L = decayAnimationSpec;
    }

    /* renamed from: A */
    public final Object j(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.H, this.I, this.J, this.K, this.L, continuation);
        anchoredDraggableKt$animateToWithDecay$2.E = anchoredDragScope;
        anchoredDraggableKt$animateToWithDecay$2.F = draggableAnchors;
        anchoredDraggableKt$animateToWithDecay$2.G = obj;
        return anchoredDraggableKt$animateToWithDecay$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.E;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.F;
            Object obj2 = this.G;
            final float c2 = draggableAnchors.c(obj2);
            if (!Float.isNaN(c2)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float r2 = Float.isNaN(this.H.r()) ? 0.0f : this.H.r();
                floatRef.f40905z = r2;
                if (r2 != c2) {
                    float f3 = this.I;
                    if ((c2 - r2) * f3 < 0.0f || f3 == 0.0f) {
                        AnchoredDraggableState anchoredDraggableState = this.H;
                        AnimationSpec animationSpec = this.J;
                        this.E = null;
                        this.F = null;
                        this.D = 1;
                        if (AnchoredDraggableKt.l(anchoredDraggableState, f3, anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == f2) {
                            return f2;
                        }
                        this.K.f40905z = 0.0f;
                    } else {
                        float a2 = DecayAnimationSpecKt.a(this.L, r2, f3);
                        float f4 = this.I;
                        if (f4 <= 0.0f ? a2 > c2 : a2 < c2) {
                            AnchoredDraggableState anchoredDraggableState2 = this.H;
                            AnimationSpec animationSpec2 = this.J;
                            this.E = null;
                            this.F = null;
                            this.D = 3;
                            if (AnchoredDraggableKt.l(anchoredDraggableState2, f4, anchoredDragScope, draggableAnchors, obj2, animationSpec2, this) == f2) {
                                return f2;
                            }
                        } else {
                            AnimationState c3 = AnimationStateKt.c(floatRef.f40905z, f4, 0, 0, false, 28, (Object) null);
                            DecayAnimationSpec decayAnimationSpec = this.L;
                            final Ref.FloatRef floatRef2 = this.K;
                            AnonymousClass3 r5 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() {
                                public final void b(AnimationScope animationScope) {
                                    float floatValue = ((Number) animationScope.e()).floatValue();
                                    float f2 = c2;
                                    if (floatValue >= f2 || floatRef.f40905z <= f2) {
                                        float floatValue2 = ((Number) animationScope.e()).floatValue();
                                        float f3 = c2;
                                        if (floatValue2 <= f3 || floatRef.f40905z >= f3) {
                                            anchoredDragScope.a(((Number) animationScope.e()).floatValue(), ((Number) animationScope.f()).floatValue());
                                            floatRef2.f40905z = ((Number) animationScope.f()).floatValue();
                                            floatRef.f40905z = ((Number) animationScope.e()).floatValue();
                                            return;
                                        }
                                    }
                                    float e2 = AnchoredDraggableKt.o(((Number) animationScope.e()).floatValue(), c2);
                                    anchoredDragScope.a(e2, ((Number) animationScope.f()).floatValue());
                                    floatRef2.f40905z = Float.isNaN(((Number) animationScope.f()).floatValue()) ? 0.0f : ((Number) animationScope.f()).floatValue();
                                    floatRef.f40905z = e2;
                                    animationScope.a();
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b((AnimationScope) obj);
                                    return Unit.f40552a;
                                }
                            };
                            this.E = null;
                            this.F = null;
                            this.D = 2;
                            if (SuspendAnimationKt.i(c3, decayAnimationSpec, false, r5, this, 2, (Object) null) == f2) {
                                return f2;
                            }
                        }
                    }
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
            this.K.f40905z = 0.0f;
            return Unit.f40552a;
        } else if (i2 == 2) {
            ResultKt.b(obj);
            return Unit.f40552a;
        } else if (i2 == 3) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.K.f40905z = 0.0f;
        return Unit.f40552a;
    }
}
