package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1$onDragStart$1 extends Lambda implements Function3<PointerInputChange, PointerInputChange, Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ VelocityTracker f3496A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3497z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragStart$1(DragGestureNode dragGestureNode, VelocityTracker velocityTracker) {
        super(3);
        this.f3497z = dragGestureNode;
        this.f3496A = velocityTracker;
    }

    public final void b(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
        if (((Boolean) this.f3497z.p3().invoke(pointerInputChange)).booleanValue()) {
            if (!this.f3497z.W) {
                if (this.f3497z.U == null) {
                    this.f3497z.U = ChannelKt.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
                }
                this.f3497z.y3();
            }
            VelocityTrackerKt.c(this.f3496A, pointerInputChange);
            long p2 = Offset.p(pointerInputChange2.h(), j2);
            Channel f3 = this.f3497z.U;
            if (f3 != null) {
                ChannelResult.b(f3.L(new DragEvent.DragStarted(p2, (DefaultConstructorMarker) null)));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).t());
        return Unit.f40552a;
    }
}
