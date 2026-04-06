package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {100}, m = "bringIntoView")
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ BringIntoViewRequesterImpl H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, Continuation continuation) {
        super(continuation);
        this.H = bringIntoViewRequesterImpl;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a((Rect) null, this);
    }
}
