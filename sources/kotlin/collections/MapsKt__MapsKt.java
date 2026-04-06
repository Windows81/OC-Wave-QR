package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public static Map h() {
        EmptyMap emptyMap = EmptyMap.f40616z;
        Intrinsics.g(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object i(Map map, Object obj) {
        Intrinsics.i(map, "<this>");
        return MapsKt__MapWithDefaultKt.a(map, obj);
    }

    public static HashMap j(Pair... pairArr) {
        Intrinsics.i(pairArr, "pairs");
        HashMap hashMap = new HashMap(MapsKt.e(pairArr.length));
        p(hashMap, pairArr);
        return hashMap;
    }

    public static Map k(Pair... pairArr) {
        Intrinsics.i(pairArr, "pairs");
        return pairArr.length > 0 ? t(pairArr, new LinkedHashMap(MapsKt.e(pairArr.length))) : MapsKt.h();
    }

    public static Map l(Pair... pairArr) {
        Intrinsics.i(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.e(pairArr.length));
        p(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map m(Map map) {
        Intrinsics.i(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : MapsKt__MapsJVMKt.g(map) : MapsKt.h();
    }

    public static Map n(Map map, Map map2) {
        Intrinsics.i(map, "<this>");
        Intrinsics.i(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void o(Map map, Iterable iterable) {
        Intrinsics.i(map, "<this>");
        Intrinsics.i(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.a(), pair.b());
        }
    }

    public static final void p(Map map, Pair[] pairArr) {
        Intrinsics.i(map, "<this>");
        Intrinsics.i(pairArr, "pairs");
        for (Pair pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    public static Map q(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(r(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return MapsKt.h();
        }
        if (size != 1) {
            return r(iterable, new LinkedHashMap(MapsKt.e(collection.size())));
        }
        return MapsKt.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map r(Iterable iterable, Map map) {
        Intrinsics.i(iterable, "<this>");
        Intrinsics.i(map, "destination");
        o(map, iterable);
        return map;
    }

    public static Map s(Map map) {
        Intrinsics.i(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? MapsKt.u(map) : MapsKt__MapsJVMKt.g(map) : MapsKt.h();
    }

    public static final Map t(Pair[] pairArr, Map map) {
        Intrinsics.i(pairArr, "<this>");
        Intrinsics.i(map, "destination");
        p(map, pairArr);
        return map;
    }

    public static Map u(Map map) {
        Intrinsics.i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
