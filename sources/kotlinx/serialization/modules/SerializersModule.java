package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

@Metadata
public abstract class SerializersModule {
    public /* synthetic */ SerializersModule(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer c(SerializersModule serializersModule, KClass kClass, List list, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                list = CollectionsKt.m();
            }
            return serializersModule.b(kClass, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(SerializersModuleCollector serializersModuleCollector);

    public abstract KSerializer b(KClass kClass, List list);

    public abstract boolean d();

    public abstract DeserializationStrategy e(KClass kClass, String str);

    public abstract SerializationStrategy f(KClass kClass, Object obj);

    public SerializersModule() {
    }
}
