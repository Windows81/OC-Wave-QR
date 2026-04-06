package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {211, 47, 48}, m = "lock")
public final class MultiProcessCoordinator$lock$1<T> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ MultiProcessCoordinator G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lock$1(MultiProcessCoordinator multiProcessCoordinator, Continuation continuation) {
        super(continuation);
        this.G = multiProcessCoordinator;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c((Function1) null, this);
    }
}
