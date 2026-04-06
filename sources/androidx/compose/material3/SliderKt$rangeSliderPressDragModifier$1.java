package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
final class SliderKt$rangeSliderPressDragModifier$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11122A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11123B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11124z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(pointerInputScope, rangeSliderState, rangeSliderLogic, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.E;
                PointerInputScope pointerInputScope = pointerInputScope;
                final RangeSliderState rangeSliderState = rangeSliderState;
                final RangeSliderLogic rangeSliderLogic = rangeSliderLogic;
                AnonymousClass1 r3 = new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>((Continuation) null) {

                    /* renamed from: B  reason: collision with root package name */
                    public Object f11125B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public /* synthetic */ Object G;

                    public static final Unit B(RangeSliderState rangeSliderState, Ref.BooleanRef booleanRef, PointerInputChange pointerInputChange) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.g(pointerInputChange) >> 32));
                        boolean z2 = booleanRef.f40901z;
                        if (rangeSliderState.t()) {
                            intBitsToFloat = -intBitsToFloat;
                        }
                        rangeSliderState.u(z2, intBitsToFloat);
                        return Unit.f40552a;
                    }

                    /* renamed from: A */
                    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                        return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                            final RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.f11124z, this.f11122A, this.f11123B);
                            final RangeSliderState rangeSliderState = this.f11124z;
                            Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
                            return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
                        }
                    }
