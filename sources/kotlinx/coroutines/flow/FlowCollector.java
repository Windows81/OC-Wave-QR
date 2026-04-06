package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface FlowCollector<T> {
    Object c(Object obj, Continuation continuation);
}
