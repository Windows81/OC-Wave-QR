package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface DataMigration<T> {
    Object a(Continuation continuation);

    Object b(Object obj, Continuation continuation);

    Object c(Object obj, Continuation continuation);
}
