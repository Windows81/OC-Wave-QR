package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 extends Lambda implements Function2<PointerInputChange, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f3481z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1(Ref.FloatRef floatRef) {
        super(2);
        this.f3481z = floatRef;
    }

    public final void b(PointerInputChange pointerInputChange, float f2) {
        pointerInputChange.a();
        this.f3481z.f40905z = f2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Number) obj2).floatValue());
        return Unit.f40552a;
    }
}
