package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class SetsKt___SetsKt extends SetsKt__SetsKt {
    public static Set g(Set set, Object obj) {
        Intrinsics.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.e(set.size()));
        boolean z2 = false;
        for (Object next : set) {
            boolean z3 = true;
            if (!z2 && Intrinsics.d(next, obj)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static Set h(Set set, Iterable iterable) {
        int i2;
        Intrinsics.i(set, "<this>");
        Intrinsics.i(iterable, "elements");
        Integer y2 = CollectionsKt__IterablesKt.y(iterable);
        if (y2 != null) {
            i2 = set.size() + y2.intValue();
        } else {
            i2 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.e(i2));
        linkedHashSet.addAll(set);
        CollectionsKt.B(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set i(Set set, Object obj) {
        Intrinsics.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
