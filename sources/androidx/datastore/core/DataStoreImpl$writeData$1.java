package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
public final class DataStoreImpl$writeData$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ DataStoreImpl E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.E = dataStoreImpl;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.B((Object) null, false, this);
    }
}
