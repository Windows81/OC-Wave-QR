package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

@Metadata
public final class AbstractPolymorphicSerializerKt {
    public static final Void a(String str, KClass kClass) {
        String str2;
        Intrinsics.i(kClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + kClass.e() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + kClass.e() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(KClass kClass, KClass kClass2) {
        Intrinsics.i(kClass, "subClass");
        Intrinsics.i(kClass2, "baseClass");
        String e2 = kClass.e();
        if (e2 == null) {
            e2 = String.valueOf(kClass);
        }
        a(e2, kClass2);
        throw new KotlinNothingValueException();
    }
}
