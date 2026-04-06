package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;

@Metadata
public final class JsonStreamsKt {
    public static final void a(Json json, InternalJsonWriter internalJsonWriter, SerializationStrategy serializationStrategy, Object obj) {
        Intrinsics.i(json, "json");
        Intrinsics.i(internalJsonWriter, "writer");
        Intrinsics.i(serializationStrategy, "serializer");
        new StreamingJsonEncoder(internalJsonWriter, json, WriteMode.OBJ, new JsonEncoder[WriteMode.f().size()]).e(serializationStrategy, obj);
    }
}
