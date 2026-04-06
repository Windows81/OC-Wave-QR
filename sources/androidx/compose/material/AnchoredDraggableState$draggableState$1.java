package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {

    /* renamed from: a  reason: collision with root package name */
    public final AnchoredDraggableState$draggableState$1$dragScope$1 f7111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f7112b;

    public AnchoredDraggableState$draggableState$1(AnchoredDraggableState anchoredDraggableState) {
        this.f7112b = anchoredDraggableState;
        this.f7111a = new AnchoredDraggableState$draggableState$1$dragScope$1(anchoredDraggableState);
    }

    public Object a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object i2 = this.f7112b.i(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, function2, (Continuation) null), continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public void b(float f2) {
        this.f7112b.n(f2);
    }
}
