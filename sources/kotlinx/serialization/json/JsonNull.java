package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Metadata
@Serializable(with = JsonNullSerializer.class)
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: z  reason: collision with root package name */
    public static final String f42322z = "null";

    public JsonNull() {
        super((DefaultConstructorMarker) null);
    }

    public String e() {
        return f42322z;
    }

    public final KSerializer<JsonNull> serializer() {
        return JsonNullSerializer.f42323a;
    }
}
