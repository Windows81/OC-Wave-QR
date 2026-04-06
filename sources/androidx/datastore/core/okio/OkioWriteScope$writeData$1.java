package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {216}, m = "writeData")
public final class OkioWriteScope$writeData$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ OkioWriteScope G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OkioWriteScope$writeData$1(OkioWriteScope okioWriteScope, Continuation continuation) {
        super(continuation);
        this.G = okioWriteScope;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a((Object) null, this);
    }
}
