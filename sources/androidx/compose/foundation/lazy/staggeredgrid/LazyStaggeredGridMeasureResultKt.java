package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class LazyStaggeredGridMeasureResultKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5139a;

    /* renamed from: b  reason: collision with root package name */
    public static final LazyStaggeredGridMeasureResult f5140b;

    static {
        int[] iArr = new int[0];
        int[] iArr2 = iArr;
        int[] iArr3 = iArr;
        f5139a = iArr;
        LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1 lazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1 = r1;
        LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1 lazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$12 = new LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1();
        List m2 = CollectionsKt.m();
        long a2 = IntSize.f19170b.a();
        LazyStaggeredGridSlots lazyStaggeredGridSlots = r1;
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = new LazyStaggeredGridSlots(iArr, iArr);
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = r0;
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider2 = new LazyStaggeredGridSpanProvider(new MutableIntervalList());
        f5140b = new LazyStaggeredGridMeasureResult(iArr2, iArr3, 0.0f, lazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1, 0.0f, false, false, false, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, DensityKt.b(1.0f, 0.0f, 2, (Object) null), 0, m2, a2, 0, 0, 0, 0, 0, CoroutineScopeKt.a(EmptyCoroutineContext.f40721z), (DefaultConstructorMarker) null);
    }

    public static final LazyStaggeredGridItemInfo a(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i2) {
        if (lazyStaggeredGridLayoutInfo.k().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt.e0(lazyStaggeredGridLayoutInfo.k())).getIndex();
        if (i2 > ((LazyStaggeredGridItemInfo) CollectionsKt.p0(lazyStaggeredGridLayoutInfo.k())).getIndex() || index > i2) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) CollectionsKt.h0(lazyStaggeredGridLayoutInfo.k(), CollectionsKt.k(lazyStaggeredGridLayoutInfo.k(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i2), 3, (Object) null));
    }

    public static final LazyStaggeredGridMeasureResult b() {
        return f5140b;
    }

    public static final int c(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.e() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.c() & 4294967295L : lazyStaggeredGridLayoutInfo.c() >> 32);
    }

    public static final int d(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List k2 = lazyStaggeredGridLayoutInfo.k();
        if (k2.isEmpty()) {
            return 0;
        }
        int size = k2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) k2.get(i3);
            i2 += (int) (lazyStaggeredGridLayoutInfo.e() == Orientation.Vertical ? lazyStaggeredGridItemInfo.a() & 4294967295L : lazyStaggeredGridItemInfo.a() >> 32);
        }
        return (i2 / k2.size()) + lazyStaggeredGridLayoutInfo.i();
    }
}
