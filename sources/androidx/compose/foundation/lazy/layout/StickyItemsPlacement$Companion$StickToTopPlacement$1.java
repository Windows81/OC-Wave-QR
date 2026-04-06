package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class StickyItemsPlacement$Companion$StickToTopPlacement$1 implements StickyItemsPlacement {
    public IntList a(int i2, int i3, IntList intList) {
        int i4;
        if (i3 - i2 < 0 || (i4 = intList.f1784b) == 0) {
            return IntListKt.a();
        }
        IntRange v2 = RangesKt.v(0, i4);
        int n2 = v2.n();
        int o2 = v2.o();
        int i5 = -1;
        if (n2 <= o2) {
            while (intList.e(n2) <= i2) {
                i5 = intList.e(n2);
                if (n2 == o2) {
                    break;
                }
                n2++;
            }
        }
        return i5 == -1 ? IntListKt.a() : IntListKt.b(i5);
    }

    public int b(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object obj;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i9);
            if (((LazyLayoutMeasuredItem) obj).getIndex() != i2) {
                break;
            }
            i9++;
        }
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) obj;
        int a2 = lazyLayoutMeasuredItem != null ? LazyLayoutStickyItemsKt.c(lazyLayoutMeasuredItem) : Integer.MIN_VALUE;
        int max = i4 == Integer.MIN_VALUE ? -i5 : Math.max(-i5, i4);
        return a2 != Integer.MIN_VALUE ? Math.min(max, a2 - i3) : max;
    }
}
