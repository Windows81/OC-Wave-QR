package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@Metadata
class JsonTreeEncoder extends AbstractJsonTreeEncoder {

    /* renamed from: g  reason: collision with root package name */
    public final Map f42412g = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeEncoder(Json json, Function1 function1) {
        super(json, function1, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(function1, "nodeConsumer");
    }

    public void A0(String str, JsonElement jsonElement) {
        Intrinsics.i(str, "key");
        Intrinsics.i(jsonElement, "element");
        this.f42412g.put(str, jsonElement);
    }

    public final Map B0() {
        return this.f42412g;
    }

    public void m(SerialDescriptor serialDescriptor, int i2, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(serializationStrategy, "serializer");
        if (obj != null || this.f42344d.j()) {
            super.m(serialDescriptor, i2, serializationStrategy, obj);
        }
    }

    public JsonElement w0() {
        return new JsonObject(this.f42412g);
    }
}
