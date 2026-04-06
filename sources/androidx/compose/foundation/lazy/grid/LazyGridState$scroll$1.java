package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {377, 378}, m = "scroll")
public final class LazyGridState$scroll$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ LazyGridState G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$scroll$1(LazyGridState lazyGridState, Continuation continuation) {
        super(continuation);
        this.G = lazyGridState;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e((MutatePriority) null, (Function2) null, this);
    }
}
