package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata
public interface SerializerCache<T> {

    @Metadata
    public static final class DefaultImpls {
    }

    KSerializer a(KClass kClass);
}
