package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;

@Metadata
public final class InterruptibleKt {
    public static final Object b(CoroutineContext coroutineContext, Function0 function0, Continuation continuation) {
        return BuildersKt.g(coroutineContext, new InterruptibleKt$runInterruptible$2(function0, (Continuation) null), continuation);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f40721z;
        }
        return b(coroutineContext, function0, continuation);
    }

    public static final Object d(CoroutineContext coroutineContext, Function0 function0) {
        ThreadState threadState;
        try {
            threadState = new ThreadState();
            threadState.C(JobKt.k(coroutineContext));
            Object invoke = function0.invoke();
            threadState.z();
            return invoke;
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        } catch (Throwable th) {
            threadState.z();
            throw th;
        }
    }
}
