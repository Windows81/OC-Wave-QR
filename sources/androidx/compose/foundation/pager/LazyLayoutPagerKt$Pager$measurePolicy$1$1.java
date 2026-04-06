package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyLayoutPagerKt$Pager$measurePolicy$1$1 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5233z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$Pager$measurePolicy$1$1(PagerState pagerState) {
        super(0);
        this.f5233z = pagerState;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.f5233z.H());
    }
}
