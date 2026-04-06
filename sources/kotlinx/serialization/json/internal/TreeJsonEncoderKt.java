package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

@Metadata
public final class TreeJsonEncoderKt {
    public static final boolean c(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.e() instanceof PrimitiveKind) || serialDescriptor.e() == SerialKind.ENUM.f42057a;
    }

    public static final JsonElement d(Json json, Object obj, SerializationStrategy serializationStrategy) {
        Intrinsics.i(json, "json");
        Intrinsics.i(serializationStrategy, "serializer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new JsonTreeEncoder(json, new d(objectRef)).e(serializationStrategy, obj);
        Object obj2 = objectRef.f40908z;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        Intrinsics.y("result");
        return null;
    }

    public static final Unit e(Ref.ObjectRef objectRef, JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "it");
        objectRef.f40908z = jsonElement;
        return Unit.f40552a;
    }
}
