package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {304}, m = "awaitPrimaryFirstDown")
public final class TapGestureDetectorKt$awaitPrimaryFirstDown$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public boolean E;
    public /* synthetic */ Object F;
    public int G;

    public TapGestureDetectorKt$awaitPrimaryFirstDown$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.g((AwaitPointerEventScope) null, false, (PointerEventPass) null, this);
    }
}
