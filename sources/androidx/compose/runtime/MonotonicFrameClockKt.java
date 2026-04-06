package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

@Metadata
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock a(CoroutineContext coroutineContext) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.d(MonotonicFrameClock.f14706b);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(Function1 function1, Continuation continuation) {
        return a(continuation.f()).Q(new MonotonicFrameClockKt$withFrameMillis$2(function1), continuation);
    }

    public static final Object c(Function1 function1, Continuation continuation) {
        return a(continuation.f()).Q(function1, continuation);
    }
}
