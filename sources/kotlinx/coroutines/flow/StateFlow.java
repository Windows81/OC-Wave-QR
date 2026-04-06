package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata
public interface StateFlow<T> extends SharedFlow<T> {
    Object getValue();
}
