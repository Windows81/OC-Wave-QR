package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerMeasureKt$measurePager$extraPagesAfter$1 extends Lambda implements Function1<Integer, MeasuredPage> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f5308A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5309B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Orientation D;
    public final /* synthetic */ Alignment.Horizontal E;
    public final /* synthetic */ Alignment.Vertical F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f5310z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesAfter$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i2) {
        super(1);
        this.f5310z = lazyLayoutMeasureScope;
        this.f5308A = j2;
        this.f5309B = pagerLazyLayoutItemProvider;
        this.C = j3;
        this.D = orientation;
        this.E = horizontal;
        this.F = vertical;
        this.G = z2;
        this.H = i2;
    }

    public final MeasuredPage b(int i2) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5310z;
        return PagerMeasureKt.g(lazyLayoutMeasureScope, i2, this.f5308A, this.f5309B, this.C, this.D, this.E, this.F, lazyLayoutMeasureScope.getLayoutDirection(), this.G, this.H);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
