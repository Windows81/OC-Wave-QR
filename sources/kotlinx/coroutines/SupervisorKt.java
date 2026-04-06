package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata
public final class SupervisorKt {
    public static final CompletableJob a(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static /* synthetic */ CompletableJob b(Job job, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            job = null;
        }
        return a(job);
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(continuation.f(), continuation);
        Object d2 = UndispatchedKt.d(supervisorCoroutine, supervisorCoroutine, function2);
        if (d2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return d2;
    }
}
