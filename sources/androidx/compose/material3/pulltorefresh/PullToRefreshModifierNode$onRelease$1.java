package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {345}, m = "onRelease")
public final class PullToRefreshModifierNode$onRelease$1 extends ContinuationImpl {
    public float C;
    public /* synthetic */ Object D;
    public final /* synthetic */ PullToRefreshModifierNode E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onRelease$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(continuation);
        this.E = pullToRefreshModifierNode;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.v3(0.0f, this);
    }
}
