package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static List Q(List list) {
        Intrinsics.i(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    public static final int R(List list, int i2) {
        if (i2 >= 0 && i2 <= CollectionsKt.o(list)) {
            return CollectionsKt.o(list) - i2;
        }
        throw new IndexOutOfBoundsException("Element index " + i2 + " must be in range [" + new IntRange(0, CollectionsKt.o(list)) + "].");
    }

    public static final int S(List list, int i2) {
        return CollectionsKt.o(list) - i2;
    }

    public static final int T(List list, int i2) {
        if (i2 >= 0 && i2 <= list.size()) {
            return list.size() - i2;
        }
        throw new IndexOutOfBoundsException("Position index " + i2 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
