package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
public final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AnchoredDraggableState D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState anchoredDraggableState, Continuation continuation) {
        super(continuation);
        this.D = anchoredDraggableState;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.j((Object) null, (MutatePriority) null, (Function4) null, this);
    }
}
