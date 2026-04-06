package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class Unconfined extends CoroutineDispatcher {

    /* renamed from: B  reason: collision with root package name */
    public static final Unconfined f41440B = new Unconfined();

    public CoroutineDispatcher E0(int i2, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        YieldContext yieldContext = (YieldContext) coroutineContext.d(YieldContext.f41442B);
        if (yieldContext != null) {
            yieldContext.f41443A = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    public boolean w0(CoroutineContext coroutineContext) {
        return false;
    }
}
