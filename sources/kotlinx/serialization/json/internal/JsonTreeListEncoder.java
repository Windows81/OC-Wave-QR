package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

@Metadata
final class JsonTreeListEncoder extends AbstractJsonTreeEncoder {

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f42416g = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeListEncoder(Json json, Function1 function1) {
        super(json, function1, (DefaultConstructorMarker) null);
        Intrinsics.i(json, "json");
        Intrinsics.i(function1, "nodeConsumer");
    }

    public void A0(String str, JsonElement jsonElement) {
        Intrinsics.i(str, "key");
        Intrinsics.i(jsonElement, "element");
        this.f42416g.add(Integer.parseInt(str), jsonElement);
    }

    public String e0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return String.valueOf(i2);
    }

    public JsonElement w0() {
        return new JsonArray(this.f42416g);
    }
}
