package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1 extends Lambda implements Function0<LazyStaggeredGridItemProviderImpl> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5064A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f5065z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1(State state, LazyStaggeredGridState lazyStaggeredGridState) {
        super(0);
        this.f5065z = state;
        this.f5064A = lazyStaggeredGridState;
    }

    /* renamed from: b */
    public final LazyStaggeredGridItemProviderImpl invoke() {
        LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent = (LazyStaggeredGridIntervalContent) this.f5065z.getValue();
        return new LazyStaggeredGridItemProviderImpl(this.f5064A, lazyStaggeredGridIntervalContent, new NearestRangeKeyIndexMap(this.f5064A.B(), lazyStaggeredGridIntervalContent));
    }
}
