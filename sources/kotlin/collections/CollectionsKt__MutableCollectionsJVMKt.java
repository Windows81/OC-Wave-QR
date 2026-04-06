package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    public static void A(List list, Comparator comparator) {
        Intrinsics.i(list, "<this>");
        Intrinsics.i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void z(List list) {
        Intrinsics.i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
