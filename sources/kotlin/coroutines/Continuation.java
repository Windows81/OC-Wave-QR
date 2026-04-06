package kotlin.coroutines;

import kotlin.Metadata;

@Metadata
public interface Continuation<T> {
    CoroutineContext f();

    void q(Object obj);
}
