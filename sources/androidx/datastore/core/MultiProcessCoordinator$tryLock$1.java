package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
public final class MultiProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ MultiProcessCoordinator H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$tryLock$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.H = multiProcessCoordinator;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b((Function2) null, this);
    }
}
