package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

@Metadata
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List a(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        if (!lazyLayoutBeyondBoundsInfo.d() && lazyLayoutPinnedItemList.isEmpty()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        IntRange intRange = lazyLayoutBeyondBoundsInfo.d() ? new IntRange(lazyLayoutBeyondBoundsInfo.c(), Math.min(lazyLayoutBeyondBoundsInfo.b(), lazyLayoutItemProvider.b() - 1)) : IntRange.D.a();
        int size = lazyLayoutPinnedItemList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i2);
            int a2 = LazyLayoutItemProviderKt.a(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int n2 = intRange.n();
            if ((a2 > intRange.o() || n2 > a2) && a2 >= 0 && a2 < lazyLayoutItemProvider.b()) {
                arrayList.add(Integer.valueOf(a2));
            }
        }
        int n3 = intRange.n();
        int o2 = intRange.o();
        if (n3 <= o2) {
            while (true) {
                arrayList.add(Integer.valueOf(n3));
                if (n3 == o2) {
                    break;
                }
                n3++;
            }
        }
        return arrayList;
    }
}
