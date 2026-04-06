package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerState$settledPage$2 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5384z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$settledPage$2(PagerState pagerState) {
        super(0);
        this.f5384z = pagerState;
    }

    public final Integer invoke() {
        int i2;
        if (this.f5384z.a()) {
            i2 = this.f5384z.S();
        } else {
            i2 = this.f5384z.v();
        }
        return Integer.valueOf(i2);
    }
}
