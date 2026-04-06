package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
public final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PagerState F;
    public final /* synthetic */ int G;
    public final /* synthetic */ float H;
    public final /* synthetic */ AnimationSpec I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i2, float f2, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.F = pagerState;
        this.G = i2;
        this.H = f2;
        this.I = animationSpec;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((PagerState$animateScrollToPage$3) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.F, this.G, this.H, this.I, continuation);
        pagerState$animateScrollToPage$3.E = obj;
        return pagerState$animateScrollToPage$3;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            LazyLayoutScrollScope a2 = PagerScrollScopeKt.a(this.F, (ScrollScope) this.E);
            int i3 = this.G;
            float f3 = this.H;
            AnimationSpec animationSpec = this.I;
            final PagerState pagerState = this.F;
            AnonymousClass1 r7 = new Function2<ScrollScope, Integer, Unit>() {
                public final void b(ScrollScope scrollScope, int i2) {
                    pagerState.o0(scrollScope, i2);
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((ScrollScope) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            };
            this.D = 1;
            if (PagerStateKt.d(a2, i3, f3, animationSpec, r7, this) == f2) {
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
