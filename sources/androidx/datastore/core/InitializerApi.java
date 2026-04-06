package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public interface InitializerApi<T> {
    Object a(Function2 function2, Continuation continuation);
}
