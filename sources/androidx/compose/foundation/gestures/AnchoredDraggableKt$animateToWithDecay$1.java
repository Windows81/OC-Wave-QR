package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1380}, m = "animateToWithDecay")
public final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    public float C;
    public Object D;
    public /* synthetic */ Object E;
    public int F;

    public AnchoredDraggableKt$animateToWithDecay$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.m((AnchoredDraggableState) null, (Object) null, 0.0f, (AnimationSpec) null, (DecayAnimationSpec) null, this);
    }
}
