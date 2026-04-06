package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

@Metadata
final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonLiteralSerializer f42316a = new JsonLiteralSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42317b = SerialDescriptorsKt.c("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.f42037a);

    public SerialDescriptor a() {
        return f42317b;
    }

    /* renamed from: f */
    public JsonLiteral c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonElement i2 = JsonElementSerializersKt.d(decoder).i();
        if (i2 instanceof JsonLiteral) {
            return (JsonLiteral) i2;
        }
        throw JsonExceptionsKt.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.b(i2.getClass()), i2.toString());
    }

    /* renamed from: g */
    public void d(Encoder encoder, JsonLiteral jsonLiteral) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonLiteral, "value");
        JsonElementSerializersKt.h(encoder);
        if (jsonLiteral.h()) {
            encoder.G(jsonLiteral.e());
        } else if (jsonLiteral.g() != null) {
            encoder.z(jsonLiteral.g()).G(jsonLiteral.e());
        } else {
            Long s2 = StringsKt.s(jsonLiteral.e());
            if (s2 != null) {
                encoder.D(s2.longValue());
                return;
            }
            ULong h2 = UStringsKt.h(jsonLiteral.e());
            if (h2 != null) {
                encoder.z(BuiltinSerializersKt.x(ULong.f40541A).a()).D(h2.m());
                return;
            }
            Double n2 = StringsKt.n(jsonLiteral.e());
            if (n2 != null) {
                encoder.i(n2.doubleValue());
                return;
            }
            Boolean e1 = StringsKt.e1(jsonLiteral.e());
            if (e1 != null) {
                encoder.l(e1.booleanValue());
            } else {
                encoder.G(jsonLiteral.e());
            }
        }
    }
}
