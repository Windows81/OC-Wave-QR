package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {
    public static int x(Iterable iterable, int i2) {
        Intrinsics.i(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static final Integer y(Iterable iterable) {
        Intrinsics.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
