package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public interface State<T> {
    Object getValue();
}
