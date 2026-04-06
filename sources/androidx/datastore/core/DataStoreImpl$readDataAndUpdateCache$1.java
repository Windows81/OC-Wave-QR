package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
public final class DataStoreImpl$readDataAndUpdateCache$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ DataStoreImpl G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.G = dataStoreImpl;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.w(false, this);
    }
}
