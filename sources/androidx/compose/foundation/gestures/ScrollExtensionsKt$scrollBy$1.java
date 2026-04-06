package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {57}, m = "scrollBy")
public final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public ScrollExtensionsKt$scrollBy$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.b((ScrollableState) null, 0.0f, this);
    }
}
