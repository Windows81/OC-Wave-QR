package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class JsonKt {
    public static final Json a(Json json, Function1 function1) {
        Intrinsics.i(json, "from");
        Intrinsics.i(function1, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(json);
        function1.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.a(), jsonBuilder.b());
    }

    public static /* synthetic */ Json b(Json json, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            json = Json.f42261d;
        }
        return a(json, function1);
    }
}
