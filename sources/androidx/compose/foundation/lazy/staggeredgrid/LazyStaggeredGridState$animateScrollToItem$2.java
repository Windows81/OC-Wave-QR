package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", l = {364}, m = "invokeSuspend")
final class LazyStaggeredGridState$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ LazyStaggeredGridState F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ LazyStaggeredGridMeasureResult J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$animateScrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, int i4, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, Continuation continuation) {
        super(2, continuation);
        this.F = lazyStaggeredGridState;
        this.G = i2;
        this.H = i3;
        this.I = i4;
        this.J = lazyStaggeredGridMeasureResult;
    }

    /* renamed from: A */
    public final Object m(ScrollScope scrollScope, Continuation continuation) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) s(scrollScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.F, this.G, this.H, this.I, this.J, continuation);
        lazyStaggeredGridState$animateScrollToItem$2.E = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            LazyLayoutScrollScope a2 = LazyStaggeredGridScrollScopeKt.a(this.F, (ScrollScope) this.E);
            int i3 = this.G;
            int i4 = this.H;
            int i5 = this.I;
            Density o2 = this.J.o();
            this.D = 1;
            if (LazyLayoutScrollScopeKt.b(a2, i3, i4, i5, o2, this) == f2) {
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
