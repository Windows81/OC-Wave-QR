package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

@Metadata
public final class JsonPrimitiveSerializer implements KSerializer<JsonPrimitive> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonPrimitiveSerializer f42331a = new JsonPrimitiveSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42332b = SerialDescriptorsKt.h("kotlinx.serialization.json.JsonPrimitive", PrimitiveKind.STRING.f42037a, new SerialDescriptor[0], (Function1) null, 8, (Object) null);

    public SerialDescriptor a() {
        return f42332b;
    }

    /* renamed from: f */
    public JsonPrimitive c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonElement i2 = JsonElementSerializersKt.d(decoder).i();
        if (i2 instanceof JsonPrimitive) {
            return (JsonPrimitive) i2;
        }
        throw JsonExceptionsKt.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.b(i2.getClass()), i2.toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, JsonPrimitive jsonPrimitive) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonPrimitive, "value");
        JsonElementSerializersKt.h(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.e(JsonNullSerializer.f42323a, JsonNull.INSTANCE);
        } else {
            encoder.e(JsonLiteralSerializer.f42316a, (JsonLiteral) jsonPrimitive);
        }
    }
}
