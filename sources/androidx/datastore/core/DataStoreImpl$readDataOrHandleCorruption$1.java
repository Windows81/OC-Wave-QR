package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
public final class DataStoreImpl$readDataOrHandleCorruption$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public boolean G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ DataStoreImpl J;
    public int K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.J = dataStoreImpl;
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.y(false, this);
    }
}
