package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DownstreamExceptionContext implements CoroutineContext {

    /* renamed from: A  reason: collision with root package name */
    public final Throwable f41802A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f41803z;

    public DownstreamExceptionContext(Throwable th, CoroutineContext coroutineContext) {
        this.f41803z = coroutineContext;
        this.f41802A = th;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return this.f41803z.d(key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return this.f41803z.g(key);
    }

    public Object k(Object obj, Function2 function2) {
        return this.f41803z.k(obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return this.f41803z.y(coroutineContext);
    }
}
