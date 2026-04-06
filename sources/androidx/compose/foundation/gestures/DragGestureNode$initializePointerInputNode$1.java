package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3489z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public /* synthetic */ Object E;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(dragGestureNode, pointerInputScope2, dragGestureNode$initializePointerInputNode$1$onDragStart$1, dragGestureNode$initializePointerInputNode$1$onDragEnd$1, dragGestureNode$initializePointerInputNode$1$onDragCancel$1, dragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1, dragGestureNode$initializePointerInputNode$1$onDrag$1, continuation);
            r0.E = obj;
            return r0;
        }

        public final Object x(Object obj) {
            CancellationException e2;
            CoroutineScope coroutineScope;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.E;
                try {
                    Orientation g3 = dragGestureNode.P;
                    PointerInputScope pointerInputScope = pointerInputScope2;
                    Function3 function3 = dragGestureNode$initializePointerInputNode$1$onDragStart$1;
                    Function1 function1 = dragGestureNode$initializePointerInputNode$1$onDragEnd$1;
                    Function0 function0 = dragGestureNode$initializePointerInputNode$1$onDragCancel$1;
                    Function0 function02 = dragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1;
                    Function2 function2 = dragGestureNode$initializePointerInputNode$1$onDrag$1;
                    this.E = coroutineScope2;
                    this.D = 1;
                    if (DragGestureDetectorKt.n(pointerInputScope, function3, function1, function0, function02, g3, function2, this) == f2) {
                        return f2;
                    }
                } catch (CancellationException e3) {
                    CancellationException cancellationException = e3;
                    coroutineScope = coroutineScope2;
                    e2 = cancellationException;
                    Channel f3 = dragGestureNode.U;
                    if (f3 != null) {
                        ChannelResult.b(f3.L(DragEvent.DragCancelled.f3456a));
                    }
                    if (!CoroutineScopeKt.h(coroutineScope)) {
                        throw e2;
                    }
                    return Unit.f40552a;
                }
            } else if (i2 == 1) {
                coroutineScope = (CoroutineScope) this.E;
                try {
                    ResultKt.b(obj);
                } catch (CancellationException e4) {
                    e2 = e4;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f40552a;
        }
    }

    public DragGestureNode$initializePointerInputNode$1(DragGestureNode dragGestureNode) {
        this.f3489z = dragGestureNode;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        VelocityTracker velocityTracker = new VelocityTracker();
        final DragGestureNode$initializePointerInputNode$1$onDragStart$1 dragGestureNode$initializePointerInputNode$1$onDragStart$1 = new DragGestureNode$initializePointerInputNode$1$onDragStart$1(this.f3489z, velocityTracker);
        final DragGestureNode$initializePointerInputNode$1$onDragEnd$1 dragGestureNode$initializePointerInputNode$1$onDragEnd$1 = new DragGestureNode$initializePointerInputNode$1$onDragEnd$1(velocityTracker, pointerInputScope, this.f3489z);
        final DragGestureNode$initializePointerInputNode$1$onDragCancel$1 dragGestureNode$initializePointerInputNode$1$onDragCancel$1 = new DragGestureNode$initializePointerInputNode$1$onDragCancel$1(this.f3489z);
        final DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1 dragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1 = new DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1(this.f3489z);
        final DragGestureNode$initializePointerInputNode$1$onDrag$1 dragGestureNode$initializePointerInputNode$1$onDrag$1 = new DragGestureNode$initializePointerInputNode$1$onDrag$1(velocityTracker, this.f3489z);
        final DragGestureNode dragGestureNode = this.f3489z;
        final PointerInputScope pointerInputScope2 = pointerInputScope;
        Object f2 = CoroutineScopeKt.f(new AnonymousClass1((Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }
}
