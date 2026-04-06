package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata
public final class GlobalScope implements CoroutineScope {

    /* renamed from: z  reason: collision with root package name */
    public static final GlobalScope f41412z = new GlobalScope();

    public CoroutineContext getCoroutineContext() {
        return EmptyCoroutineContext.f40721z;
    }
}
