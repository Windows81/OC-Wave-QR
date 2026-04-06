package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KProperty;

@Metadata
public interface KMutableProperty<V> extends KProperty<V> {

    @Metadata
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<Unit> {
    }
}
