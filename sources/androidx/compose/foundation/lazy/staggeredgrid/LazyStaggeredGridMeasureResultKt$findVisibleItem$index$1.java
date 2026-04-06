package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1 extends Lambda implements Function1<LazyStaggeredGridItemInfo, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f5144z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(int i2) {
        super(1);
        this.f5144z = i2;
    }

    /* renamed from: b */
    public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
        return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - this.f5144z);
    }
}
