package androidx.savedstate.serialization.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata
public final class BuiltInSerializerKt {
    public static final String a(String str, Decoder decoder) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(decoder, "decoder");
        return "Cannot deserialize " + str + " with '" + Reflection.b(decoder.getClass()).e() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String b(String str, Encoder encoder) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(encoder, "encoder");
        return "Cannot serialize " + str + " with '" + Reflection.b(encoder.getClass()).e() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
