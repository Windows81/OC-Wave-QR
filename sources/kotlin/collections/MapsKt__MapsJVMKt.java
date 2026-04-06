package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    public static Map b(Map map) {
        Intrinsics.i(map, "builder");
        return ((MapBuilder) map).m();
    }

    public static Map c() {
        return new MapBuilder();
    }

    public static Map d(int i2) {
        return new MapBuilder(i2);
    }

    public static int e(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(Pair pair) {
        Intrinsics.i(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.e(), pair.f());
        Intrinsics.h(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map g(Map map) {
        Intrinsics.i(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.h(singletonMap, "with(...)");
        return singletonMap;
    }
}
