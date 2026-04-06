package androidx.datastore.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
public final class OkioStorageConnection$readScope$1<R> extends ContinuationImpl {
    public Object C;
    public Object D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ OkioStorageConnection G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$readScope$1(OkioStorageConnection okioStorageConnection, Continuation continuation) {
        super(continuation);
        this.G = okioStorageConnection;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e((Function3) null, this);
    }
}
