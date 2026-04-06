package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PagerState$scrollableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PagerState f5383z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$scrollableState$1(PagerState pagerState) {
        super(1);
        this.f5383z = pagerState;
    }

    public final Float b(float f2) {
        return Float.valueOf(this.f5383z.Y(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
