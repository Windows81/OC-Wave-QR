package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", l = {164}, m = "invokeSuspend")
public final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f41546B;
    public /* synthetic */ Object C;
    public final /* synthetic */ DebugCoroutineInfoImpl D;
    public final /* synthetic */ StackTraceFrame E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, Continuation continuation) {
        super(2, continuation);
        this.D = debugCoroutineInfoImpl;
        this.E = stackTraceFrame;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.D, this.E, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.C = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f41546B;
        if (i2 == 0) {
            ResultKt.b(obj);
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.D;
            CoroutineStackFrame e2 = this.E.e();
            this.f41546B = 1;
            if (debugCoroutineInfoImpl.i((SequenceScope) this.C, e2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
