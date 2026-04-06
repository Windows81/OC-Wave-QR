package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {38}, m = "animateScrollBy")
public final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public ScrollExtensionsKt$animateScrollBy$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a((ScrollableState) null, 0.0f, (AnimationSpec) null, this);
    }
}
