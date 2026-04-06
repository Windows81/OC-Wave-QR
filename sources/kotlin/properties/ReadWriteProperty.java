package kotlin.properties;

import kotlin.Metadata;

@Metadata
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
}
