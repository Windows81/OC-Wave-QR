package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class ScrollState$scrollableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollState f3178z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.f3178z = scrollState;
    }

    public final Float b(float f2) {
        float n2 = ((float) this.f3178z.n()) + f2 + this.f3178z.f3170e;
        float n3 = RangesKt.n(n2, 0.0f, (float) this.f3178z.m());
        boolean z2 = n2 == n3;
        float n4 = n3 - ((float) this.f3178z.n());
        int round = Math.round(n4);
        ScrollState scrollState = this.f3178z;
        scrollState.p(scrollState.n() + round);
        this.f3178z.f3170e = n4 - ((float) round);
        if (!z2) {
            f2 = n4;
        }
        return Float.valueOf(f2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
