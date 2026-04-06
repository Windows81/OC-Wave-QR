package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        Intrinsics.i(str, "msg");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(KClass kClass, KClass kClass2) {
        this("Serializer for " + kClass2 + " already registered in the scope of " + kClass);
        Intrinsics.i(kClass, "baseClass");
        Intrinsics.i(kClass2, "concreteClass");
    }
}
