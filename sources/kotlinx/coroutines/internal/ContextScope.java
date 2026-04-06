package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class ContextScope implements CoroutineScope {

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f41829z;

    public ContextScope(CoroutineContext coroutineContext) {
        this.f41829z = coroutineContext;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f41829z;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
