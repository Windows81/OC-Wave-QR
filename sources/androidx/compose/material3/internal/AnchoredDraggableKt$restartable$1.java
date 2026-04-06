package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {706}, m = "restartable")
public final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public AnchoredDraggableKt$restartable$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.i((Function0) null, (Function2) null, this);
    }
}
