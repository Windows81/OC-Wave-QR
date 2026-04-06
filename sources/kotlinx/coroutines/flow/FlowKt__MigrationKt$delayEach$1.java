package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", l = {423}, m = "invokeSuspend")
final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ long E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayEach$1(long j2, Continuation continuation) {
        super(2, continuation);
        this.E = j2;
    }

    /* renamed from: A */
    public final Object m(Object obj, Continuation continuation) {
        return ((FlowKt__MigrationKt$delayEach$1) s(obj, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FlowKt__MigrationKt$delayEach$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            long j2 = this.E;
            this.D = 1;
            if (DelayKt.b(j2, this) == f2) {
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
