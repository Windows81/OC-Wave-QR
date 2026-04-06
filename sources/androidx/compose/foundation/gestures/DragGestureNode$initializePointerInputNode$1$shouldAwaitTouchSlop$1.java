package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3498z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$initializePointerInputNode$1$shouldAwaitTouchSlop$1(DragGestureNode dragGestureNode) {
        super(0);
        this.f3498z = dragGestureNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf(!this.f3498z.x3());
    }
}
