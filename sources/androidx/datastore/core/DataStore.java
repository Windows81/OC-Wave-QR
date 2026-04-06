package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata
public interface DataStore<T> {
    Object a(Function2 function2, Continuation continuation);

    Flow getData();
}
