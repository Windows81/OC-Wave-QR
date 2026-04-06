package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
public final class SingleProcessCoordinator$tryLock$1<T> extends ContinuationImpl {
    public Object C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ SingleProcessCoordinator F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$tryLock$1(SingleProcessCoordinator singleProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.F = singleProcessCoordinator;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b((Function2) null, this);
    }
}
