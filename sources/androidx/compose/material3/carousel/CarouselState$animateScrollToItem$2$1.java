package androidx.compose.material3.carousel;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerScrollScopeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1", f = "CarouselState.kt", l = {111}, m = "invokeSuspend")
final class CarouselState$animateScrollToItem$2$1 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ CarouselPagerState F;
    public final /* synthetic */ int G;
    public final /* synthetic */ AnimationSpec H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselState$animateScrollToItem$2$1(CarouselPagerState carouselPagerState, int i2, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = carouselPagerState;
        this.G = i2;
        this.H = animationSpec;
    }

    public static final Unit C(CarouselPagerState carouselPagerState, ScrollScope scrollScope, int i2) {
        carouselPagerState.o0(scrollScope, i2);
        return Unit.f40552a;
    }

    /* renamed from: B */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((CarouselState$animateScrollToItem$2$1) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CarouselState$animateScrollToItem$2$1 carouselState$animateScrollToItem$2$1 = new CarouselState$animateScrollToItem$2$1(this.F, this.G, this.H, continuation);
        carouselState$animateScrollToItem$2$1.E = obj;
        return carouselState$animateScrollToItem$2$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            LazyLayoutScrollScope a2 = PagerScrollScopeKt.a(this.F, (ScrollScope) this.E);
            CarouselPagerState carouselPagerState = this.F;
            int i3 = this.G;
            AnimationSpec animationSpec = this.H;
            m mVar = new m(carouselPagerState);
            this.D = 1;
            if (CarouselStateKt.c(a2, carouselPagerState, i3, 0.0f, animationSpec, mVar, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
