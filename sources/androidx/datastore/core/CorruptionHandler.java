package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface CorruptionHandler<T> {
    Object a(CorruptionException corruptionException, Continuation continuation);
}
