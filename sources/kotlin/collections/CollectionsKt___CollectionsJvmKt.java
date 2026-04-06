package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    public static void U(List list) {
        Intrinsics.i(list, "<this>");
        Collections.reverse(list);
    }
}
