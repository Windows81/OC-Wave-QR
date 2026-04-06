package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata
final class DispatcherExecutor implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineDispatcher f41396z;

    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f41396z;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f40721z;
        if (DispatchedContinuationKt.d(coroutineDispatcher, emptyCoroutineContext)) {
            DispatchedContinuationKt.c(this.f41396z, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f41396z.toString();
    }
}
