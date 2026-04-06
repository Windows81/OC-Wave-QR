package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

@Metadata
final class JsonTreeMapDecoder extends JsonTreeDecoder {

    /* renamed from: k  reason: collision with root package name */
    public final JsonObject f42417k;

    /* renamed from: l  reason: collision with root package name */
    public final List f42418l;

    /* renamed from: m  reason: collision with root package name */
    public final int f42419m;

    /* renamed from: n  reason: collision with root package name */
    public int f42420n = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeMapDecoder(Json json, JsonObject jsonObject) {
        super(json, jsonObject, (String) null, (SerialDescriptor) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(jsonObject, "value");
        this.f42417k = jsonObject;
        List M0 = CollectionsKt.M0(C0().keySet());
        this.f42418l = M0;
        this.f42419m = M0.size() * 2;
    }

    /* renamed from: H0 */
    public JsonObject C0() {
        return this.f42417k;
    }

    public void b(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
    }

    public String h0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return (String) this.f42418l.get(i2 / 2);
    }

    public JsonElement n0(String str) {
        Intrinsics.i(str, "tag");
        return this.f42420n % 2 == 0 ? JsonElementKt.c(str) : (JsonElement) MapsKt.i(C0(), str);
    }

    public int x(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "descriptor");
        int i2 = this.f42420n;
        if (i2 >= this.f42419m - 1) {
            return -1;
        }
        int i3 = i2 + 1;
        this.f42420n = i3;
        return i3;
    }
}
