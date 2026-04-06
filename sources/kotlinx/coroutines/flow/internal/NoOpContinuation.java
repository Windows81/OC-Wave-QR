package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata
final class NoOpContinuation implements Continuation<Object> {

    /* renamed from: A  reason: collision with root package name */
    public static final CoroutineContext f41805A = EmptyCoroutineContext.f40721z;

    /* renamed from: z  reason: collision with root package name */
    public static final NoOpContinuation f41806z = new NoOpContinuation();

    public CoroutineContext f() {
        return f41805A;
    }

    public void q(Object obj) {
    }
}
