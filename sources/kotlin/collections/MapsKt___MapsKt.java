package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
class MapsKt___MapsKt extends MapsKt___MapsJvmKt {
    public static Sequence v(Map map) {
        Intrinsics.i(map, "<this>");
        return CollectionsKt.V(map.entrySet());
    }
}
