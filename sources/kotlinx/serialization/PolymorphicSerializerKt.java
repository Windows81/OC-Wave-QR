package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;

@Metadata
public final class PolymorphicSerializerKt {
    public static final DeserializationStrategy a(AbstractPolymorphicSerializer abstractPolymorphicSerializer, CompositeDecoder compositeDecoder, String str) {
        Intrinsics.i(abstractPolymorphicSerializer, "<this>");
        Intrinsics.i(compositeDecoder, "decoder");
        DeserializationStrategy h2 = abstractPolymorphicSerializer.h(compositeDecoder, str);
        if (h2 != null) {
            return h2;
        }
        AbstractPolymorphicSerializerKt.a(str, abstractPolymorphicSerializer.j());
        throw new KotlinNothingValueException();
    }

    public static final SerializationStrategy b(AbstractPolymorphicSerializer abstractPolymorphicSerializer, Encoder encoder, Object obj) {
        Intrinsics.i(abstractPolymorphicSerializer, "<this>");
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        SerializationStrategy i2 = abstractPolymorphicSerializer.i(encoder, obj);
        if (i2 != null) {
            return i2;
        }
        AbstractPolymorphicSerializerKt.b(Reflection.b(obj.getClass()), abstractPolymorphicSerializer.j());
        throw new KotlinNothingValueException();
    }
}
