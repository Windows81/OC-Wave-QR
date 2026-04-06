package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {898, 901}, m = "onPostFling-RZ2iAVY")
public final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    public long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ScrollableNestedScrollConnection E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.E = scrollableNestedScrollConnection;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.q0(0, 0, this);
    }
}
