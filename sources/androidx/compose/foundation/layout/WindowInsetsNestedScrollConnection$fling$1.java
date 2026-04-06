package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {301, 327, 352}, m = "fling-huYlsQE")
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public long E;
    public float F;
    public /* synthetic */ Object G;
    public final /* synthetic */ WindowInsetsNestedScrollConnection H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.H = windowInsetsNestedScrollConnection;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.k(0, 0.0f, false, this);
    }
}
