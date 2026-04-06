package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class SerializersKt {
    public static final KSerializer a(KClass kClass, List list, Function0 function0) {
        return SerializersKt__SerializersKt.e(kClass, list, function0);
    }

    public static final KSerializer b(KClass kClass) {
        return SerializersKt__SerializersKt.f(kClass);
    }

    public static final KSerializer c(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.d(serializersModule, type);
    }

    public static final KSerializer d(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.g(serializersModule, kType);
    }

    public static final KSerializer e(KClass kClass) {
        return SerializersKt__SerializersKt.j(kClass);
    }

    public static final KSerializer f(KType kType) {
        return SerializersKt__SerializersKt.k(kType);
    }

    public static final KSerializer g(SerializersModule serializersModule, Type type) {
        return SerializersKt__SerializersJvmKt.g(serializersModule, type);
    }

    public static final KSerializer h(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.l(serializersModule, kType);
    }

    public static final List i(SerializersModule serializersModule, List list, boolean z2) {
        return SerializersKt__SerializersKt.m(serializersModule, list, z2);
    }
}
