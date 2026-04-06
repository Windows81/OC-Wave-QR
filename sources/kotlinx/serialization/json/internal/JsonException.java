package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

@Metadata
public class JsonException extends SerializationException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        Intrinsics.i(str, "message");
    }
}
