package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface ReadScope<T> extends Closeable {
    Object d(Continuation continuation);
}
