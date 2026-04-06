package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata
public interface ParametrizedSerializerCache<T> {

    @Metadata
    public static final class DefaultImpls {
    }

    Object a(KClass kClass, List list);
}
