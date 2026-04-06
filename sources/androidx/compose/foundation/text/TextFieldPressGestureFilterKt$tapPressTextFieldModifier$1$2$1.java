package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f5942A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5943B;
    public final /* synthetic */ State C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5944z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;
        public /* synthetic */ long F;

        public final Object A(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(coroutineScope, mutableState, mutableInteractionSource, continuation);
            r0.E = pressGestureScope;
            r0.F = j2;
            return r0.x(Unit.f40552a);
        }

        public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
            return A((PressGestureScope) obj, ((Offset) obj2).t(), (Continuation) obj3);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                final long j2 = this.F;
                CoroutineScope coroutineScope = coroutineScope;
                final MutableState mutableState = mutableState;
                final MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                    public Object D;
                    public int E;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        return 

                        public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1(CoroutineScope coroutineScope, MutableState mutableState, MutableInteractionSource mutableInteractionSource, State state) {
                            this.f5944z = coroutineScope;
                            this.f5942A = mutableState;
                            this.f5943B = mutableInteractionSource;
                            this.C = state;
                        }

                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            final CoroutineScope coroutineScope = this.f5944z;
                            final MutableState mutableState = this.f5942A;
                            final MutableInteractionSource mutableInteractionSource = this.f5943B;
                            AnonymousClass1 r0 = new AnonymousClass1((Continuation) null);
                            final State state = this.C;
                            Object k2 = TapGestureDetectorKt.k(pointerInputScope, r0, new Function1<Offset, Unit>() {
                                public final void b(long j2) {
                                    ((Function1) state.getValue()).invoke(Offset.d(j2));
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    b(((Offset) obj).t());
                                    return Unit.f40552a;
                                }
                            }, continuation);
                            return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
                        }
                    }
