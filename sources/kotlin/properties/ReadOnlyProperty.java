package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata
public interface ReadOnlyProperty<T, V> {
    Object a(Object obj, KProperty kProperty);
}
