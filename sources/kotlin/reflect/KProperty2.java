package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

@Metadata
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    Getter a();

    Object o(Object obj, Object obj2);
}
