package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface MutableState<T> extends State<T> {
    Object getValue();

    void setValue(Object obj);
}
