package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {154, 179, 182}, m = "processNewAnchors$material_release")
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public float E;
    public /* synthetic */ Object F;
    public final /* synthetic */ SwipeableState G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState swipeableState, Continuation continuation) {
        super(continuation);
        this.G = swipeableState;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.A((Map) null, (Map) null, this);
    }
}
