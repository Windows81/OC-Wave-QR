package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class SliderKt$Slider$2$gestureEndAction$1$1 extends Lambda implements Function1<Float, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f8387A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8388B;
    public final /* synthetic */ Ref.FloatRef C;
    public final /* synthetic */ CoroutineScope D;
    public final /* synthetic */ SliderDraggableState E;
    public final /* synthetic */ Function0 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f8389z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {235}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(sliderDraggableState, c2, v2, f3, function02, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                SliderDraggableState sliderDraggableState = sliderDraggableState;
                float f3 = c2;
                float f4 = v2;
                float f5 = f3;
                this.D = 1;
                if (SliderKt.w(sliderDraggableState, f3, f4, f5, this) == f2) {
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
    public SliderKt$Slider$2$gestureEndAction$1$1(MutableFloatState mutableFloatState, List list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, CoroutineScope coroutineScope, SliderDraggableState sliderDraggableState, Function0 function0) {
        super(1);
        this.f8389z = mutableFloatState;
        this.f8387A = list;
        this.f8388B = floatRef;
        this.C = floatRef2;
        this.D = coroutineScope;
        this.E = sliderDraggableState;
        this.F = function0;
    }

    public final void b(float f2) {
        Function0 function0;
        final float c2 = this.f8389z.c();
        final float v2 = SliderKt.G(c2, this.f8387A, this.f8388B.f40905z, this.C.f40905z);
        if (c2 != v2) {
            CoroutineScope coroutineScope = this.D;
            final SliderDraggableState sliderDraggableState = this.E;
            final Function0 function02 = this.F;
            final float f3 = f2;
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
        } else if (!this.E.h() && (function0 = this.F) != null) {
            function0.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Number) obj).floatValue());
        return Unit.f40552a;
    }
}
