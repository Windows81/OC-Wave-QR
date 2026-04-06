package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata
final class JsonPrimitiveDecoder extends AbstractJsonTreeDecoder {

    /* renamed from: g  reason: collision with root package name */
    public final JsonElement f42399g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonPrimitiveDecoder(Json json, JsonElement jsonElement, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i2 & 4) != 0 ? null : str);
    }

    public JsonElement C0() {
        return this.f42399g;
    }

    public JsonElement n0(String str) {
        Intrinsics.i(str, "tag");
        if (str == "primitive") {
            return C0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveDecoder(Json json, JsonElement jsonElement, String str) {
        super(json, jsonElement, str, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(jsonElement, "value");
        this.f42399g = jsonElement;
        e0("primitive");
    }
}
