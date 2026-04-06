package kotlinx.collections.immutable.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MapImplementation {

    /* renamed from: a  reason: collision with root package name */
    public static final MapImplementation f41358a = new MapImplementation();

    public final boolean a(Map map, Map.Entry entry) {
        Intrinsics.i(map, "map");
        Intrinsics.i(entry, "element");
        Object obj = map.get(entry.getKey());
        return obj != null ? Intrinsics.d(obj, entry.getValue()) : entry.getValue() == null && map.containsKey(entry.getKey());
    }

    public final boolean b(Map map, Map map2) {
        Intrinsics.i(map, "thisMap");
        Intrinsics.i(map2, "otherMap");
        if (map.size() != map2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (map2.isEmpty()) {
            return true;
        } else {
            for (Map.Entry a2 : map2.entrySet()) {
                if (!f41358a.a(map, a2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int c(Map map) {
        Intrinsics.i(map, "map");
        return map.entrySet().hashCode();
    }
}
