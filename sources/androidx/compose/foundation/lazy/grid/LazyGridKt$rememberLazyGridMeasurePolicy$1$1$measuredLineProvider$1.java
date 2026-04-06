package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;

@Metadata
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 extends LazyGridMeasuredLineProvider {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f4620g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ LazyGridSlots f4621h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1(boolean z2, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        super(z2, lazyGridSlots, i2, i3, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, lazyGridSpanLayoutProvider);
        this.f4620g = z2;
        this.f4621h = lazyGridSlots;
    }

    public LazyGridMeasuredLine b(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, int i3) {
        return new LazyGridMeasuredLine(i2, lazyGridMeasuredItemArr, this.f4621h, list, this.f4620g, i3);
    }
}
