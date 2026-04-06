package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta")
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public int I;

    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.I |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.s((MouseWheelScrollingLogic) null, (Ref.ObjectRef) null, (Ref.FloatRef) null, (ScrollingLogic) null, (Ref.ObjectRef) null, 0, this);
    }
}
