package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class DispatchException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final Throwable f41394z;

    public DispatchException(Throwable th, CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + coroutineContext, th);
        this.f41394z = th;
    }

    public Throwable getCause() {
        return this.f41394z;
    }
}
