package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {384}, m = "animateToHidden")
public final class PullToRefreshModifierNode$animateToHidden$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PullToRefreshModifierNode D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToHidden$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(continuation);
        this.D = pullToRefreshModifierNode;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.k3(this);
    }
}
