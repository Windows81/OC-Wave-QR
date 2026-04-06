package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {507}, m = "invokeSuspend")
public final class PagerState$scrollToPage$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PagerState E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f2, int i2, Continuation continuation) {
        super(2, continuation);
        this.E = pagerState;
        this.F = f2;
        this.G = i2;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((PagerState$scrollToPage$2) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PagerState$scrollToPage$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PagerState pagerState = this.E;
            this.D = 1;
            if (pagerState.q(this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f3 = this.F;
        double d2 = (double) f3;
        boolean z2 = false;
        if (-0.5d <= d2 && d2 <= 0.5d) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("pageOffsetFraction " + f3 + " is not within the range -0.5 to 0.5");
        }
        this.E.m0(this.E.s(this.G), this.F, true);
        return Unit.f40552a;
    }
}
