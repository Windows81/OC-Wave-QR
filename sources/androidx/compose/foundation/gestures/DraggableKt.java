package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata
public final class DraggableKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function3 f3516a = new DraggableKt$NoOpOnDragStarted$1((Continuation) null);

    /* renamed from: b  reason: collision with root package name */
    public static final Function3 f3517b = new DraggableKt$NoOpOnDragStopped$1((Continuation) null);

    public static final DraggableState a(Function1 function1) {
        return new DefaultDraggableState(function1);
    }

    public static final Modifier g(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4) {
        Modifier modifier2 = modifier;
        return modifier.o0(new DraggableElement(draggableState, orientation, z2, mutableInteractionSource, z3, function3, function32, z4));
    }

    public static /* synthetic */ Modifier h(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4, int i2, Object obj) {
        int i3 = i2;
        return g(modifier, draggableState, orientation, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? null : mutableInteractionSource, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? f3516a : function3, (i3 & 64) != 0 ? f3517b : function32, (i3 & 128) != 0 ? false : z4);
    }

    public static final DraggableState i(Function1 function1, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-183245213, i2, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:127)");
        }
        State p2 = SnapshotStateKt.p(function1, composer, i2 & 14);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = a(new DraggableKt$rememberDraggableState$1$1(p2));
            composer.N(g2);
        }
        DraggableState draggableState = (DraggableState) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return draggableState;
    }

    public static final float j(long j2, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j2 & 4294967295L : j2 >> 32));
    }

    public static final float k(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.i(j2) : Velocity.h(j2);
    }

    public static final long l(long j2) {
        float f2 = 0.0f;
        float h2 = Float.isNaN(Velocity.h(j2)) ? 0.0f : Velocity.h(j2);
        if (!Float.isNaN(Velocity.i(j2))) {
            f2 = Velocity.i(j2);
        }
        return VelocityKt.a(h2, f2);
    }
}
