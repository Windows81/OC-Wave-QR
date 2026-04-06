package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata
final class JsonPrimitiveEncoder extends AbstractJsonTreeEncoder {

    /* renamed from: g  reason: collision with root package name */
    public JsonElement f42400g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveEncoder(Json json, Function1 function1) {
        super(json, function1, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(function1, "nodeConsumer");
        c0("primitive");
    }

    public void A0(String str, JsonElement jsonElement) {
        Intrinsics.i(str, "key");
        Intrinsics.i(jsonElement, "element");
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        } else if (this.f42400g == null) {
            this.f42400g = jsonElement;
            x0().invoke(jsonElement);
        } else {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
    }

    public JsonElement w0() {
        JsonElement jsonElement = this.f42400g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }
}
