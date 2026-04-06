package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, 56}, m = "forEachGesture")
public final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public ForEachGestureKt$forEachGesture$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return ForEachGestureKt.f((PointerInputScope) null, (Function2) null, this);
    }
}
