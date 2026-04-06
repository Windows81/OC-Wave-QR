package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

@Metadata
public final class ComposersKt {
    public static final Composer a(InternalJsonWriter internalJsonWriter, Json json) {
        Intrinsics.i(internalJsonWriter, "sb");
        Intrinsics.i(json, "json");
        return json.g().m() ? new ComposerWithPrettyPrint(internalJsonWriter, json) : new Composer(internalJsonWriter);
    }
}
