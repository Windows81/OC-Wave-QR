package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {96, 97}, m = "onPreFling-QWom1Mo")
public final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    public Object C;
    public long D;
    public /* synthetic */ Object E;
    public final /* synthetic */ NestedScrollNode F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation continuation) {
        super(continuation);
        this.F = nestedScrollNode;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.H1(0, this);
    }
}
