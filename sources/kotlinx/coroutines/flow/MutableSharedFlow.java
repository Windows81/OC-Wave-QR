package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    Object c(Object obj, Continuation continuation);

    void h();

    boolean i(Object obj);

    StateFlow k();
}
