package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {610, 617}, m = "animateScrollToPage")
public final class PagerState$animateScrollToPage$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public int E;
    public float F;
    public /* synthetic */ Object G;
    public final /* synthetic */ PagerState H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.H = pagerState;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.m(0, 0.0f, (AnimationSpec) null, this);
    }
}
