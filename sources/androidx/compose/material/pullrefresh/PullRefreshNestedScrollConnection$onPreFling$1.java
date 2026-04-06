package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo")
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    public float C;
    public /* synthetic */ Object D;
    public final /* synthetic */ PullRefreshNestedScrollConnection E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.E = pullRefreshNestedScrollConnection;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.H1(0, this);
    }
}
