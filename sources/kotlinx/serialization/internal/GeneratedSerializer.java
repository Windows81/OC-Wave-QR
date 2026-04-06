package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata
@InternalSerializationApi
public interface GeneratedSerializer<T> extends KSerializer<T> {

    @Metadata
    public static final class DefaultImpls {
        public static KSerializer[] a(GeneratedSerializer generatedSerializer) {
            return PluginHelperInterfacesKt.f42181a;
        }
    }

    KSerializer[] b();

    KSerializer[] e();
}
