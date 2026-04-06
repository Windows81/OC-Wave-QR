package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1 extends Lambda implements Function0<LazyStaggeredGridIntervalContent> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f5063z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1(State state) {
        super(0);
        this.f5063z = state;
    }

    /* renamed from: b */
    public final LazyStaggeredGridIntervalContent invoke() {
        return new LazyStaggeredGridIntervalContent((Function1) this.f5063z.getValue());
    }
}
