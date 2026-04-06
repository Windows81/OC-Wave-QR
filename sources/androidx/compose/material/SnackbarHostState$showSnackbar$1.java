package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {368, 371}, m = "showSnackbar")
public final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public /* synthetic */ Object I;
    public final /* synthetic */ SnackbarHostState J;
    public int K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, Continuation continuation) {
        super(continuation);
        this.J = snackbarHostState;
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.d((String) null, (String) null, (SnackbarDuration) null, this);
    }
}
