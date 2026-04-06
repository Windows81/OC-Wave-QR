package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerState$targetPage$2 extends Lambda implements Function0<Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5385z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$targetPage$2(PagerState pagerState) {
        super(0);
        this.f5385z = pagerState;
    }

    public final Integer invoke() {
        int i2;
        if (!this.f5385z.a()) {
            i2 = this.f5385z.v();
        } else if (this.f5385z.P() != -1) {
            i2 = this.f5385z.P();
        } else if (Math.abs(this.f5385z.w()) < Math.abs(this.f5385z.N())) {
            i2 = this.f5385z.v();
        } else if (this.f5385z.B()) {
            i2 = this.f5385z.y() + 1;
        } else {
            i2 = this.f5385z.y();
        }
        return Integer.valueOf(this.f5385z.s(i2));
    }
}
