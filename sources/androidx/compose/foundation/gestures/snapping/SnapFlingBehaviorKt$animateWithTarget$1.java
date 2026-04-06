package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {354}, m = "animateWithTarget")
public final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    public float C;
    public float D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public int H;

    public SnapFlingBehaviorKt$animateWithTarget$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.H |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.h((ScrollScope) null, 0.0f, 0.0f, (AnimationState) null, (AnimationSpec) null, (Function1) null, this);
    }
}
