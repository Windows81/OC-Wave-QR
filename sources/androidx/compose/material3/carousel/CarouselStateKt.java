package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class CarouselStateKt {
    public static final Object c(LazyLayoutScrollScope lazyLayoutScrollScope, PagerState pagerState, int i2, float f2, AnimationSpec animationSpec, Function2 function2, Continuation continuation) {
        function2.m(lazyLayoutScrollScope, Boxing.c(i2));
        boolean z2 = i2 > lazyLayoutScrollScope.h();
        int c2 = (lazyLayoutScrollScope.c() - lazyLayoutScrollScope.h()) + 1;
        if (((z2 && i2 > lazyLayoutScrollScope.c()) || (!z2 && i2 < lazyLayoutScrollScope.h())) && Math.abs(i2 - lazyLayoutScrollScope.h()) >= 3) {
            lazyLayoutScrollScope.e(z2 ? RangesKt.e(i2 - c2, lazyLayoutScrollScope.h()) : RangesKt.j(c2 + i2, lazyLayoutScrollScope.h()), 0);
        }
        Object e2 = SuspendAnimationKt.e(0.0f, e(pagerState, pagerState.v(), i2) + f2, 0.0f, animationSpec, new n(new Ref.FloatRef(), lazyLayoutScrollScope), continuation, 4, (Object) null);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public static final Unit d(Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope, float f2, float f3) {
        floatRef.f40905z += lazyLayoutScrollScope.g(f2 - floatRef.f40905z);
        return Unit.f40552a;
    }

    public static final float e(PagerState pagerState, int i2, int i3) {
        int c2 = (int) (pagerState.C().e() == Orientation.Horizontal ? pagerState.C().c() >> 32 : pagerState.C().c() & 4294967295L);
        int i4 = i3;
        return (((float) (i3 - i2)) * (((float) pagerState.C().k()) + ((float) pagerState.C().l()))) + ((float) (pagerState.C().n().a(c2, pagerState.C().k(), pagerState.C().f(), pagerState.C().d(), i2, pagerState.H()) - pagerState.C().n().a(c2, pagerState.C().k(), pagerState.C().f(), pagerState.C().d(), i4, pagerState.H())));
    }
}
