package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LazyLayoutMeasuredItemKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f4891a = new a();

    public static final int b(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return Intrinsics.k(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    public static final List c(int i2, int i3, List list, List list2) {
        if (list.isEmpty()) {
            return CollectionsKt.m();
        }
        List P0 = CollectionsKt.P0(list2);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) list.get(i4);
            int index = lazyLayoutMeasuredItem.getIndex();
            if (i2 <= index && index <= i3) {
                P0.add(lazyLayoutMeasuredItem);
            }
        }
        CollectionsKt.A(P0, f4891a);
        return P0;
    }
}
