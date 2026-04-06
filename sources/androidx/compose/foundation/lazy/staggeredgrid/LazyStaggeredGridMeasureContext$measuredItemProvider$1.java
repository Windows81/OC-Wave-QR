package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LazyStaggeredGridMeasureContext$measuredItemProvider$1 extends LazyStaggeredGridMeasureProvider {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridMeasureContext f5100e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureContext$measuredItemProvider$1(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, boolean z2, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        super(z2, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots);
        this.f5100e = lazyStaggeredGridMeasureContext;
    }

    public LazyStaggeredGridMeasuredItem c(int i2, int i3, int i4, Object obj, Object obj2, List list, long j2) {
        return new LazyStaggeredGridMeasuredItem(i2, obj, list, this.f5100e.v(), this.f5100e.l(), i3, i4, this.f5100e.c(), this.f5100e.a(), obj2, this.f5100e.s().v(), j2, (DefaultConstructorMarker) null);
    }
}
