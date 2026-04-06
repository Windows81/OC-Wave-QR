package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1 extends Lambda implements Function0<PagerLazyLayoutItemProvider> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f5240A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f5241z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(State state, PagerState pagerState) {
        super(0);
        this.f5241z = state;
        this.f5240A = pagerState;
    }

    /* renamed from: b */
    public final PagerLazyLayoutItemProvider invoke() {
        PagerLayoutIntervalContent pagerLayoutIntervalContent = (PagerLayoutIntervalContent) this.f5241z.getValue();
        return new PagerLazyLayoutItemProvider(this.f5240A, pagerLayoutIntervalContent, new NearestRangeKeyIndexMap(this.f5240A.G(), pagerLayoutIntervalContent));
    }
}
