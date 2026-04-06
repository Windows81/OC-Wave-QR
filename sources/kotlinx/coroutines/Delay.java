package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public interface Delay {

    @Metadata
    public static final class DefaultImpls {
        public static DisposableHandle a(Delay delay, long j2, Runnable runnable, CoroutineContext coroutineContext) {
            return DefaultExecutorKt.a().O(j2, runnable, coroutineContext);
        }
    }

    DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext);

    void f(long j2, CancellableContinuation cancellableContinuation);
}
