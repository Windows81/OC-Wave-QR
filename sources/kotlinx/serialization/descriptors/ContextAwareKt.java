package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerializersModule;

@Metadata
public final class ContextAwareKt {
    public static final KClass a(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "<this>");
        if (serialDescriptor instanceof ContextDescriptor) {
            return ((ContextDescriptor) serialDescriptor).f42025b;
        }
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return a(((SerialDescriptorForNullable) serialDescriptor).l());
        }
        return null;
    }

    public static final SerialDescriptor b(SerializersModule serializersModule, SerialDescriptor serialDescriptor) {
        KSerializer c2;
        Intrinsics.i(serializersModule, "<this>");
        Intrinsics.i(serialDescriptor, "descriptor");
        KClass a2 = a(serialDescriptor);
        if (a2 == null || (c2 = SerializersModule.c(serializersModule, a2, (List) null, 2, (Object) null)) == null) {
            return null;
        }
        return c2.a();
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, KClass kClass) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(kClass, "context");
        return new ContextDescriptor(serialDescriptor, kClass);
    }
}
