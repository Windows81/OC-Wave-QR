package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata
final class JsonTreeMapEncoder extends JsonTreeEncoder {

    /* renamed from: h  reason: collision with root package name */
    public String f42421h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f42422i = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeMapEncoder(Json json, Function1 function1) {
        super(json, function1);
        Intrinsics.i(json, "json");
        Intrinsics.i(function1, "nodeConsumer");
    }

    public void A0(String str, JsonElement jsonElement) {
        Intrinsics.i(str, "key");
        Intrinsics.i(jsonElement, "element");
        if (!this.f42422i) {
            Map B0 = B0();
            String str2 = this.f42421h;
            if (str2 == null) {
                Intrinsics.y("tag");
                str2 = null;
            }
            B0.put(str2, jsonElement);
            this.f42422i = true;
        } else if (jsonElement instanceof JsonPrimitive) {
            this.f42421h = ((JsonPrimitive) jsonElement).e();
            this.f42422i = false;
        } else if (jsonElement instanceof JsonObject) {
            throw JsonExceptionsKt.d(JsonObjectSerializer.f42326a.a());
        } else if (jsonElement instanceof JsonArray) {
            throw JsonExceptionsKt.d(JsonArraySerializer.f42266a.a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public JsonElement w0() {
        return new JsonObject(B0());
    }
}
