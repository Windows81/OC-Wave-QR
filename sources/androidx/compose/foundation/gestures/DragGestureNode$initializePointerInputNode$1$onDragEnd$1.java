package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1$onDragEnd$1 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PointerInputScope f3493A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3494B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3495z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragEnd$1(VelocityTracker velocityTracker, PointerInputScope pointerInputScope, DragGestureNode dragGestureNode) {
        super(1);
        this.f3495z = velocityTracker;
        this.f3493A = pointerInputScope;
        this.f3494B = dragGestureNode;
    }

    public final void b(PointerInputChange pointerInputChange) {
        VelocityTrackerKt.c(this.f3495z, pointerInputChange);
        float f2 = this.f3493A.getViewConfiguration().f();
        long b2 = this.f3495z.b(VelocityKt.a(f2, f2));
        this.f3495z.e();
        Channel f3 = this.f3494B.U;
        if (f3 != null) {
            ChannelResult.b(f3.L(new DragEvent.DragStopped(DraggableKt.l(b2), (DefaultConstructorMarker) null)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
