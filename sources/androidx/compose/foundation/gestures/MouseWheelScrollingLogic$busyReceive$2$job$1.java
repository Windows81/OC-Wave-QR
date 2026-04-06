package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
public final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;

    public MouseWheelScrollingLogic$busyReceive$2$job$1(Continuation continuation) {
        super(2, continuation);
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(continuation);
        mouseWheelScrollingLogic$busyReceive$2$job$1.E = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    public final Object x(Object obj) {
        CoroutineScope coroutineScope;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.E;
        } else if (i2 == 1) {
            coroutineScope = (CoroutineScope) this.E;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (JobKt.n(coroutineScope.getCoroutineContext())) {
            AnonymousClass1 r4 = AnonymousClass1.f3542z;
            this.E = coroutineScope;
            this.D = 1;
            if (MonotonicFrameClockKt.c(r4, this) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }
}
