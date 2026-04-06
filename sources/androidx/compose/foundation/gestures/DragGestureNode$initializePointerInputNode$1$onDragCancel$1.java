package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1$onDragCancel$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3492z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$onDragCancel$1(DragGestureNode dragGestureNode) {
        super(0);
        this.f3492z = dragGestureNode;
    }

    public final void invoke() {
        Channel f3 = this.f3492z.U;
        if (f3 != null) {
            ChannelResult.b(f3.L(DragEvent.DragCancelled.f3456a));
        }
    }
}
