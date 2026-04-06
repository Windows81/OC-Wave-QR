package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {102, 153}, m = "animateToZero")
public final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public float F;
    public /* synthetic */ Object G;
    public final /* synthetic */ UpdatableAnimationState H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, Continuation continuation) {
        super(continuation);
        this.H = updatableAnimationState;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.h((Function1) null, (Function0) null, this);
    }
}
