package androidx.compose.foundation.gestures;

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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TransformableNode$pointerInputNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformableNode f3618z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {196}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(pointerInputScope, transformableNode, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.E;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                final TransformableNode transformableNode = transformableNode;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, coroutineStart, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation) null) {
                    public Object D;
                    public Object E;
                    public int F;
                    public /* synthetic */ Object G;

                    /* renamed from: A */
                    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
                    }

                    public final Continuation s(Object obj, Continuation continuation) {
                        AnonymousClass1 r0 = 

                        public TransformableNode$pointerInputNode$1(TransformableNode transformableNode) {
                            this.f3618z = transformableNode;
                        }

                        public final Object invoke(final PointerInputScope pointerInputScope, Continuation continuation) {
                            if (!this.f3618z.S) {
                                return Unit.f40552a;
                            }
                            final TransformableNode transformableNode = this.f3618z;
                            Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
                            return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
                        }
                    }
