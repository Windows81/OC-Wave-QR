package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1 extends Lambda implements Function0<LazyGridItemProviderImpl> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4601A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f4602z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(State state, LazyGridState lazyGridState) {
        super(0);
        this.f4602z = state;
        this.f4601A = lazyGridState;
    }

    /* renamed from: b */
    public final LazyGridItemProviderImpl invoke() {
        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) this.f4602z.getValue();
        return new LazyGridItemProviderImpl(this.f4601A, lazyGridIntervalContent, new NearestRangeKeyIndexMap(this.f4601A.y(), lazyGridIntervalContent));
    }
}
