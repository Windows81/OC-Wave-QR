package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

@Metadata
public final class JsonSchemaCacheKt {
    public static final DescriptorSchemaCache a(Json json) {
        Intrinsics.i(json, "<this>");
        return json.h();
    }
}
