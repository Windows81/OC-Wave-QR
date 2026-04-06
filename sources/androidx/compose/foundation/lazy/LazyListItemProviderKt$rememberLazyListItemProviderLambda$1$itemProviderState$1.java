package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1 extends Lambda implements Function0<LazyListItemProviderImpl> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyListState f4374A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ LazyItemScopeImpl f4375B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f4376z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$itemProviderState$1(State state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        super(0);
        this.f4376z = state;
        this.f4374A = lazyListState;
        this.f4375B = lazyItemScopeImpl;
    }

    /* renamed from: b */
    public final LazyListItemProviderImpl invoke() {
        LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) this.f4376z.getValue();
        return new LazyListItemProviderImpl(this.f4374A, lazyListIntervalContent, this.f4375B, new NearestRangeKeyIndexMap(this.f4374A.z(), lazyListIntervalContent));
    }
}
