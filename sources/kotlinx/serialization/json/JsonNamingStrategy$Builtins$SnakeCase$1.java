package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNamingStrategy;

@Metadata
public final class JsonNamingStrategy$Builtins$SnakeCase$1 implements JsonNamingStrategy {
    public String a(SerialDescriptor serialDescriptor, int i2, String str) {
        Intrinsics.i(serialDescriptor, "descriptor");
        Intrinsics.i(str, "serialName");
        return JsonNamingStrategy.Builtins.f42319a.b(str, '_');
    }

    public String toString() {
        return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
    }
}
