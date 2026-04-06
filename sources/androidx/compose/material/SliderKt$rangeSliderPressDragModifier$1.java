package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {1082}, m = "invokeSuspend")
public final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ State H;
    public final /* synthetic */ State I;
    public final /* synthetic */ State J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ float L;
    public final /* synthetic */ State M;

    @Metadata
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {1083}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(pointerInputScope, z2, f3, rangeSliderLogic2, state, state2, state3, state4, continuation);
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
                final boolean z2 = z2;
                final float f3 = f3;
                final RangeSliderLogic rangeSliderLogic = rangeSliderLogic2;
                final State state = state;
                final State state2 = state2;
                final State state3 = state3;
                final State state4 = state4;
                AnonymousClass1 r3 = new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>((Continuation) null) {

                    /* renamed from: B  reason: collision with root package name */
                    public Object f8409B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public /* synthetic */ Object G;

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, State state3, boolean z2, float f2, State state4, Continuation continuation) {
                            super(2, continuation);
                            this.F = mutableInteractionSource;
                            this.G = mutableInteractionSource2;
                            this.H = state;
                            this.I = state2;
                            this.J = state3;
                            this.K = z2;
                            this.L = f2;
                            this.M = state4;
                        }

                        /* renamed from: A */
                        public final Object m(PointerInputScope pointerInputScope, Continuation continuation) {
                            return ((SliderKt$rangeSliderPressDragModifier$1) s(pointerInputScope, continuation)).x(Unit.f40552a);
                        }

                        public final Continuation s(Object obj, Continuation continuation) {
                            SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, continuation);
                            sliderKt$rangeSliderPressDragModifier$1.E = obj;
                            return sliderKt$rangeSliderPressDragModifier$1;
                        }

                        public final Object x(Object obj) {
                            Object f2 = IntrinsicsKt.f();
                            int i2 = this.D;
                            if (i2 == 0) {
                                ResultKt.b(obj);
                                final PointerInputScope pointerInputScope = (PointerInputScope) this.E;
                                RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.F, this.G, this.H, this.I, this.J);
                                final boolean z2 = this.K;
                                final float f3 = this.L;
                                final State state = this.H;
                                final State state2 = this.M;
                                final State state3 = this.I;
                                final State state4 = this.J;
                                final RangeSliderLogic rangeSliderLogic2 = rangeSliderLogic;
                                AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
                                this.D = 1;
                                if (CoroutineScopeKt.f(r3, this) == f2) {
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
