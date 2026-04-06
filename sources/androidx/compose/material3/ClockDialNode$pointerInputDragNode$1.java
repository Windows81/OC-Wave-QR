package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ClockDialNode$pointerInputDragNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ClockDialNode f9448z;

    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode) {
        this.f9448z = clockDialNode;
    }

    public static final Unit c(ClockDialNode clockDialNode) {
        Job unused = BuildersKt__Builders_commonKt.d(clockDialNode.y2(), (CoroutineContext) null, (CoroutineStart) null, new ClockDialNode$pointerInputDragNode$1$1$1(clockDialNode, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit d(ClockDialNode clockDialNode, PointerInputChange pointerInputChange, Offset offset) {
        Job unused = BuildersKt__Builders_commonKt.d(clockDialNode.y2(), (CoroutineContext) null, (CoroutineStart) null, new ClockDialNode$pointerInputDragNode$1$2$1(clockDialNode, offset, (Continuation) null), 3, (Object) null);
        return Unit.f40552a;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object o2 = DragGestureDetectorKt.o(pointerInputScope, (Function1) null, new C0226r0(this.f9448z), (Function0) null, new C0235s0(this.f9448z), continuation, 5, (Object) null);
        return o2 == IntrinsicsKt.f() ? o2 : Unit.f40552a;
    }
}
