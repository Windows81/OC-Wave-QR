package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class PagerScrollPositionKt {
    public static final long a(PagerState pagerState) {
        return (((long) pagerState.v()) * ((long) pagerState.J())) + MathKt.f(pagerState.w() * ((float) pagerState.J()));
    }
}
