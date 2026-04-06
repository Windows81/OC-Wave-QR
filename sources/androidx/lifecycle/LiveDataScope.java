package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface LiveDataScope<T> {
    Object c(Object obj, Continuation continuation);
}
