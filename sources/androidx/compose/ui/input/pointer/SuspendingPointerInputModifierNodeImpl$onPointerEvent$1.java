package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {717, 719}, m = "invokeSuspend")
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, Continuation continuation) {
        super(2, continuation);
        this.E = suspendingPointerInputModifierNodeImpl;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.E.Q != null) {
                Function2 d3 = this.E.Q;
                Intrinsics.f(d3);
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.E;
                this.D = 1;
                if (d3.m(suspendingPointerInputModifierNodeImpl, this) == f2) {
                    return f2;
                }
            } else {
                PointerInputEventHandler f3 = this.E.f3();
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl2 = this.E;
                this.D = 2;
                if (f3.invoke(suspendingPointerInputModifierNodeImpl2, this) == f2) {
                    return f2;
                }
            }
        } else if (i2 == 1 || i2 == 2) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
