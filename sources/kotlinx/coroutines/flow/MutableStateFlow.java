package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata
public interface MutableStateFlow<T> extends StateFlow<T>, MutableSharedFlow<T> {
    boolean g(Object obj, Object obj2);

    Object getValue();

    void setValue(Object obj);
}
