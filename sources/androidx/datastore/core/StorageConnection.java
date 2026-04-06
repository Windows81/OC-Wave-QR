package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public interface StorageConnection<T> extends Closeable {
    Object b(Function2 function2, Continuation continuation);

    InterProcessCoordinator c();

    Object e(Function3 function3, Continuation continuation);
}
