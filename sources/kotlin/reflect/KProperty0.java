package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

@Metadata
public interface KProperty0<V> extends KProperty<V>, Function0<V> {

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
    }

    Getter a();

    Object get();
}
