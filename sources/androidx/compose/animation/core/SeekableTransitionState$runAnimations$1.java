package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {353, 356}, m = "runAnimations")
public final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ SeekableTransitionState E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState seekableTransitionState, Continuation continuation) {
        super(continuation);
        this.E = seekableTransitionState;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.O(this);
    }
}
