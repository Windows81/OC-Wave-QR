package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata
@ExperimentalSerializationApi
public interface SerializersModuleCollector {

    @Metadata
    public static final class DefaultImpls {
        public static void b(SerializersModuleCollector serializersModuleCollector, KClass kClass, KSerializer kSerializer) {
            Intrinsics.i(kClass, "kClass");
            Intrinsics.i(kSerializer, "serializer");
            serializersModuleCollector.e(kClass, new a(kSerializer));
        }

        public static KSerializer c(KSerializer kSerializer, List list) {
            Intrinsics.i(list, "it");
            return kSerializer;
        }
    }

    void a(KClass kClass, Function1 function1);

    void b(KClass kClass, KClass kClass2, KSerializer kSerializer);

    void c(KClass kClass, Function1 function1);

    void d(KClass kClass, KSerializer kSerializer);

    void e(KClass kClass, Function1 function1);
}
