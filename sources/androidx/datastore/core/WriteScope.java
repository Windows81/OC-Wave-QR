package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface WriteScope<T> extends ReadScope<T> {
    Object a(Object obj, Continuation continuation);
}
