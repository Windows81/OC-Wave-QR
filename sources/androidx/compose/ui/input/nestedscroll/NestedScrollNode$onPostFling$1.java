package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {103, 113}, m = "onPostFling-RZ2iAVY")
public final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    public Object C;
    public long D;
    public long E;
    public /* synthetic */ Object F;
    public final /* synthetic */ NestedScrollNode G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, Continuation continuation) {
        super(continuation);
        this.G = nestedScrollNode;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.q0(0, 0, this);
    }
}
