package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1$onDrag$1 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3490A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3491z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDrag$1(VelocityTracker velocityTracker, DragGestureNode dragGestureNode) {
        super(2);
        this.f3491z = velocityTracker;
        this.f3490A = dragGestureNode;
    }

    public final void b(PointerInputChange pointerInputChange, long j2) {
        VelocityTrackerKt.c(this.f3491z, pointerInputChange);
        Channel f3 = this.f3490A.U;
        if (f3 != null) {
            ChannelResult.b(f3.L(new DragEvent.DragDelta(j2, (DefaultConstructorMarker) null)));
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
