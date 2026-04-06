package kotlinx.serialization.json;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class JsonElementSerializer implements KSerializer<JsonElement> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonElementSerializer f42310a = new JsonElementSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptor f42311b = SerialDescriptorsKt.g("kotlinx.serialization.json.JsonElement", PolymorphicKind.SEALED.f42028a, new SerialDescriptor[0], new a());

    public static final Unit l(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = classSerialDescriptorBuilder;
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "JsonPrimitive", JsonElementSerializersKt.f(new b()), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "JsonNull", JsonElementSerializersKt.f(new c()), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "JsonLiteral", JsonElementSerializersKt.f(new d()), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "JsonObject", JsonElementSerializersKt.f(new e()), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "JsonArray", JsonElementSerializersKt.f(new f()), (List) null, false, 12, (Object) null);
        return Unit.f40552a;
    }

    public static final SerialDescriptor m() {
        return JsonPrimitiveSerializer.f42331a.a();
    }

    public static final SerialDescriptor n() {
        return JsonNullSerializer.f42323a.a();
    }

    public static final SerialDescriptor o() {
        return JsonLiteralSerializer.f42316a.a();
    }

    public static final SerialDescriptor p() {
        return JsonObjectSerializer.f42326a.a();
    }

    public static final SerialDescriptor q() {
        return JsonArraySerializer.f42266a.a();
    }

    public SerialDescriptor a() {
        return f42311b;
    }

    /* renamed from: r */
    public JsonElement c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        return JsonElementSerializersKt.d(decoder).i();
    }

    /* renamed from: s */
    public void d(Encoder encoder, JsonElement jsonElement) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(jsonElement, "value");
        JsonElementSerializersKt.h(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.e(JsonPrimitiveSerializer.f42331a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.e(JsonObjectSerializer.f42326a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.e(JsonArraySerializer.f42266a, jsonElement);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
