package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

@Metadata
public abstract class JsonTransformingSerializer<T> implements KSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final KSerializer f42333a;

    public SerialDescriptor a() {
        return this.f42333a.a();
    }

    public final Object c(Decoder decoder) {
        Intrinsics.i(decoder, "decoder");
        JsonDecoder d2 = JsonElementSerializersKt.d(decoder);
        return d2.d().f(this.f42333a, f(d2.i()));
    }

    public final void d(Encoder encoder, Object obj) {
        Intrinsics.i(encoder, "encoder");
        Intrinsics.i(obj, "value");
        JsonEncoder e2 = JsonElementSerializersKt.e(encoder);
        e2.x(g(TreeJsonEncoderKt.d(e2.d(), obj, this.f42333a)));
    }

    public JsonElement f(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        return jsonElement;
    }

    public JsonElement g(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        return jsonElement;
    }
}
