package androidx.compose.material3;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {2188}, m = "awaitSlop-8vUncbI")
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public SliderKt$awaitSlop$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return SliderKt.l((AwaitPointerEventScope) null, 0, 0, this);
    }
}
