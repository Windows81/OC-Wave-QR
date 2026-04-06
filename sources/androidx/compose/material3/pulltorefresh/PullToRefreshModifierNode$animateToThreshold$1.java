package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {371}, m = "animateToThreshold")
public final class PullToRefreshModifierNode$animateToThreshold$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PullToRefreshModifierNode D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToThreshold$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(continuation);
        this.D = pullToRefreshModifierNode;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.l3(this);
    }
}
