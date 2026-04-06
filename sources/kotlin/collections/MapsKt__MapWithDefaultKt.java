package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class MapsKt__MapWithDefaultKt {
    public static final Object a(Map map, Object obj) {
        Intrinsics.i(map, "<this>");
        if (map instanceof MapWithDefault) {
            return ((MapWithDefault) map).m0(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
