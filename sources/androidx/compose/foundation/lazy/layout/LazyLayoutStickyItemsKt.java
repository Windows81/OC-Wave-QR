package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LazyLayoutStickyItemsKt {
    public static final List b(StickyItemsPlacement stickyItemsPlacement, List list, IntList intList, int i2, int i3, int i4, int i5, Function1 function1) {
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        List list2 = list;
        IntList intList2 = intList;
        if (stickyItemsPlacement2 == null || list2.isEmpty() || intList2.f1784b == 0) {
            return CollectionsKt.m();
        }
        IntList a2 = stickyItemsPlacement2.a(((LazyLayoutMeasuredItem) CollectionsKt.e0(list)).getIndex(), ((LazyLayoutMeasuredItem) CollectionsKt.p0(list)).getIndex(), intList2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list2.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list2.get(i6);
            if (intList2.c(((LazyLayoutMeasuredItem) obj).getIndex())) {
                arrayList2.add(obj);
            }
        }
        int[] iArr = a2.f1783a;
        int i7 = a2.f1784b;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = iArr[i8];
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (((LazyLayoutMeasuredItem) it.next()).getIndex() == i9) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) function1.invoke(Integer.valueOf(i9));
            } else {
                Function1 function12 = function1;
                lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) list2.remove(i10);
            }
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem3 = lazyLayoutMeasuredItem2;
            int b2 = stickyItemsPlacement.b(arrayList2, i9, lazyLayoutMeasuredItem2.h(), i10 == -1 ? Integer.MIN_VALUE : c(lazyLayoutMeasuredItem2), i2, i3, i4, i5);
            lazyLayoutMeasuredItem3.g(true);
            lazyLayoutMeasuredItem3.o(b2, 0, i4, i5);
            arrayList.add(lazyLayoutMeasuredItem3);
        }
        return arrayList;
    }

    public static final int c(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long m2 = lazyLayoutMeasuredItem.m(0);
        return lazyLayoutMeasuredItem.l() ? IntOffset.l(m2) : IntOffset.k(m2);
    }
}
