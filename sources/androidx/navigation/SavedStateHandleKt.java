package androidx.navigation;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata
public final class SavedStateHandleKt {
    public static final Object a(SavedStateHandle savedStateHandle, KClass kClass, Map map) {
        Intrinsics.i(savedStateHandle, "<this>");
        Intrinsics.i(kClass, "route");
        Intrinsics.i(map, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer b2 = SerializersKt.b(kClass);
        for (NamedNavArgument namedNavArgument : RouteSerializerKt.h(b2, map)) {
            linkedHashMap.put(namedNavArgument.b(), namedNavArgument.a().a());
        }
        return RouteDeserializerKt.b(b2, savedStateHandle, linkedHashMap);
    }
}
