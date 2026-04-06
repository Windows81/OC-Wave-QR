package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {1030, 1037}, m = "runFrameLoop")
public final class Recomposer$runFrameLoop$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Recomposer H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$1(Recomposer recomposer, Continuation continuation) {
        super(continuation);
        this.H = recomposer;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.Y0((MonotonicFrameClock) null, (ProduceFrameSignal) null, this);
    }
}
