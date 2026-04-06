package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {313}, m = "animateDecay")
public final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {
    public float C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public SnapFlingBehaviorKt$animateDecay$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.f((ScrollScope) null, 0.0f, (AnimationState) null, (DecayAnimationSpec) null, (Function1) null, this);
    }
}
