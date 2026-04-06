package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;

@Metadata
public final class JsonNullSerializer implements KSerializer<JsonNull> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonNullSerializer f42323a = new JsonNullSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42324b = SerialDescriptorsKt.h("kotlinx.serialization.json.JsonNull", SerialKind.ENUM.f42057a, new SerialDescriptor[0], (Function1) null, 8, (Object) null);

    public SerialDescriptor a() {
        return f42324b;
    }

    /* renamed from: f */
    public JsonNull c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonElementSerializersKt.g(decoder);
        if (!decoder.u()) {
            decoder.l();
            return JsonNull.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    /* renamed from: g */
    public void d(Encoder encoder, JsonNull jsonNull) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonNull, "value");
        JsonElementSerializersKt.h(encoder);
        encoder.f();
    }
}
