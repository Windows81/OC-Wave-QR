package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata
final class JsonTreeListDecoder extends AbstractJsonTreeDecoder {

    /* renamed from: g  reason: collision with root package name */
    public final JsonArray f42413g;

    /* renamed from: h  reason: collision with root package name */
    public final int f42414h = C0().size();

    /* renamed from: i  reason: collision with root package name */
    public int f42415i = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(Json json, JsonArray jsonArray) {
        super(json, jsonArray, (String) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(jsonArray, "value");
        this.f42413g = jsonArray;
    }

    /* renamed from: F0 */
    public JsonArray C0() {
        return this.f42413g;
    }

    public String h0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return String.valueOf(i2);
    }

    public JsonElement n0(String str) {
        Intrinsics.i(str, "tag");
        return C0().get(Integer.parseInt(str));
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        int i2 = this.f42415i;
        if (i2 >= this.f42414h - 1) {
            return -1;
        }
        int i3 = i2 + 1;
        this.f42415i = i3;
        return i3;
    }
}
