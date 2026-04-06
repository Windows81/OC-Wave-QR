package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    public Object a(CorruptionException corruptionException, Continuation continuation) {
        throw corruptionException;
    }
}
