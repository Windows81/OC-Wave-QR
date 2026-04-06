package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Flow<T> {
    Object a(FlowCollector flowCollector, Continuation continuation);
}
