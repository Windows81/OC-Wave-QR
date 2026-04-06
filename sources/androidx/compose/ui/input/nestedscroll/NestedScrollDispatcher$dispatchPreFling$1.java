package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {200}, m = "dispatchPreFling-QWom1Mo")
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ NestedScrollDispatcher D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, Continuation continuation) {
        super(continuation);
        this.D = nestedScrollDispatcher;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(0, this);
    }
}
