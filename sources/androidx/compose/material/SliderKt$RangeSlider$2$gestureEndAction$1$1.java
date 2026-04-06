package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SliderKt$RangeSlider$2$gestureEndAction$1$1 extends Lambda implements Function1<Boolean, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8362A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f8363B;
    public final /* synthetic */ Ref.FloatRef C;
    public final /* synthetic */ Ref.FloatRef D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ CoroutineScope F;
    public final /* synthetic */ State G;
    public final /* synthetic */ ClosedFloatingPointRange H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8364z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {467}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(c2, v2, function02, z3, mutableFloatState, mutableFloatState2, state, floatRef, floatRef2, closedFloatingPointRange, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                Animatable b2 = AnimatableKt.b(c2, 0.0f, 2, (Object) null);
                Float b3 = Boxing.b(v2);
                TweenSpec p2 = SliderKt.f8347i;
                Float b4 = Boxing.b(0.0f);
                final boolean z2 = z3;
                final MutableFloatState mutableFloatState = mutableFloatState;
                final MutableFloatState mutableFloatState2 = mutableFloatState2;
                final State state = state;
                final Ref.FloatRef floatRef = floatRef;
                final Ref.FloatRef floatRef2 = floatRef2;
                final ClosedFloatingPointRange closedFloatingPointRange = closedFloatingPointRange;
                AnonymousClass1 r8 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() {
                    public final void b(Animatable animatable) {
                        (z2 ? mutableFloatState : mutableFloatState2).j(((Number) animatable.m()).floatValue());
                        ((Function1) state.getValue()).invoke(SliderKt$RangeSlider$2.g(floatRef, floatRef2, closedFloatingPointRange, RangesKt.b(mutableFloatState.c(), mutableFloatState2.c())));
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Animatable) obj);
                        return Unit.f40552a;
                    }
                };
                this.D = 1;
                if (b2.e(b3, p2, b4, r8, this) == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0 function0 = function02;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$gestureEndAction$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Function0 function0, CoroutineScope coroutineScope, State state, ClosedFloatingPointRange closedFloatingPointRange) {
        super(1);
        this.f8364z = mutableFloatState;
        this.f8362A = mutableFloatState2;
        this.f8363B = list;
        this.C = floatRef;
        this.D = floatRef2;
        this.E = function0;
        this.F = coroutineScope;
        this.G = state;
        this.H = closedFloatingPointRange;
    }

    public final void b(boolean z2) {
        final float c2 = (z2 ? this.f8364z : this.f8362A).c();
        final float v2 = SliderKt.G(c2, this.f8363B, this.C.f40905z, this.D.f40905z);
        if (c2 == v2) {
            Function0 function0 = this.E;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        CoroutineScope coroutineScope = this.F;
        final Function0 function02 = this.E;
        final MutableFloatState mutableFloatState = this.f8364z;
        final MutableFloatState mutableFloatState2 = this.f8362A;
        final State state = this.G;
        final Ref.FloatRef floatRef = this.C;
        final Ref.FloatRef floatRef2 = this.D;
        final ClosedFloatingPointRange closedFloatingPointRange = this.H;
        final boolean z3 = z2;
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }
}
