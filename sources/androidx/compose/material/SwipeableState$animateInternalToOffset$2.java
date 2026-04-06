package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
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

@Metadata
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {217}, m = "invokeSuspend")
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ SwipeableState F;
    public final /* synthetic */ float G;
    public final /* synthetic */ AnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState swipeableState, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = swipeableState;
        this.G = f2;
        this.H = animationSpec;
    }

    /* renamed from: A */
    public final Object m(DragScope dragScope, Continuation continuation) {
        return ((SwipeableState$animateInternalToOffset$2) s(dragScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.F, this.G, this.H, continuation);
        swipeableState$animateInternalToOffset$2.E = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final DragScope dragScope = (DragScope) this.E;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.f40905z = this.F.f8587g.c();
            this.F.f8588h.setValue(Boxing.b(this.G));
            this.F.C(true);
            Animatable b2 = AnimatableKt.b(floatRef.f40905z, 0.0f, 2, (Object) null);
            Float b3 = Boxing.b(this.G);
            AnimationSpec animationSpec = this.H;
            AnonymousClass1 r7 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() {
                public final void b(Animatable animatable) {
                    dragScope.a(((Number) animatable.m()).floatValue() - floatRef.f40905z);
                    floatRef.f40905z = ((Number) animatable.m()).floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Animatable) obj);
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (Animatable.f(b2, b3, animationSpec, (Object) null, r7, this, 4, (Object) null) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            try {
                ResultKt.b(obj);
            } catch (Throwable th) {
                this.F.f8588h.setValue((Object) null);
                this.F.C(false);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.F.f8588h.setValue((Object) null);
        this.F.C(false);
        return Unit.f40552a;
    }
}
