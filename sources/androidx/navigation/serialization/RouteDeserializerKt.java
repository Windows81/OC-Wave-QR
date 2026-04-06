package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata
public final class RouteDeserializerKt {
    public static final Object a(KSerializer kSerializer, Bundle bundle, Map map) {
        Intrinsics.i(kSerializer, "<this>");
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(map, "typeMap");
        return new RouteDecoder(bundle, map).K(kSerializer);
    }

    public static final Object b(KSerializer kSerializer, SavedStateHandle savedStateHandle, Map map) {
        Intrinsics.i(kSerializer, "<this>");
        Intrinsics.i(savedStateHandle, "handle");
        Intrinsics.i(map, "typeMap");
        return new RouteDecoder(savedStateHandle, map).K(kSerializer);
    }
}
