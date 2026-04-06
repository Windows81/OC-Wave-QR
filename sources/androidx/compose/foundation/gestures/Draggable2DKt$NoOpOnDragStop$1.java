package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Draggable2DKt$NoOpOnDragStop$1 extends Lambda implements Function1<Velocity, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final Draggable2DKt$NoOpOnDragStop$1 f3506z = new Draggable2DKt$NoOpOnDragStop$1();

    public Draggable2DKt$NoOpOnDragStop$1() {
        super(1);
    }

    public final void b(long j2) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Velocity) obj).o());
        return Unit.f40552a;
    }
}
