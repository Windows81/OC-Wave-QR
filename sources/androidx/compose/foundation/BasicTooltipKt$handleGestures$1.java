package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class BasicTooltipKt$handleGestures$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2955z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {162}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(pointerInputScope, basicTooltipState, continuation);
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
                final BasicTooltipState basicTooltipState = basicTooltipState;
                AnonymousClass1 r3 = new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>((Continuation) null) {

                    /* renamed from: B  reason: collision with root package name */
                    public Object f2956B;
                    public int C;
                    public /* synthetic */ Object D;

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        public BasicTooltipKt$handleGestures$1(BasicTooltipState basicTooltipState) {
                            this.f2955z = basicTooltipState;
                        }

                        public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                            final BasicTooltipState basicTooltipState = this.f2955z;
                            Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
                            return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
                        }
                    }
