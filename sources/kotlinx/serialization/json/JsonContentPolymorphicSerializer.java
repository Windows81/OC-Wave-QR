package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KClass f42307a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42308b;

    public SerialDescriptor a() {
        return this.f42308b;
    }

    public final Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonDecoder d2 = JsonElementSerializersKt.d(decoder);
        JsonElement i2 = d2.i();
        DeserializationStrategy f2 = f(i2);
        Intrinsics.g(f2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d2.d().f((KSerializer) f2, i2);
    }

    public final void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        SerializationStrategy f2 = encoder.a().f(this.f42307a, obj);
        if (f2 == null) {
            KSerializer e2 = SerializersKt.e(Reflection.b(obj.getClass()));
            if (e2 != null) {
                f2 = e2;
            } else {
                g(Reflection.b(obj.getClass()), this.f42307a);
                throw new KotlinNothingValueException();
            }
        }
        ((KSerializer) f2).d(encoder, obj);
    }

    public abstract DeserializationStrategy f(JsonElement jsonElement);

    public final Void g(KClass kClass, KClass kClass2) {
        String e2 = kClass.e();
        if (e2 == null) {
            e2 = String.valueOf(kClass);
        }
        throw new SerializationException("Class '" + e2 + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.e() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
