package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate")
public final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public int H;

    public SuspendAnimationKt$animate$4(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.H |= Integer.MIN_VALUE;
        return SuspendAnimationKt.c((AnimationState) null, (Animation) null, 0, (Function1) null, this);
    }
}
