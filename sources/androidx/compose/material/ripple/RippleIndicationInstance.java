package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@Deprecated
public abstract class RippleIndicationInstance implements IndicationInstance {

    /* renamed from: A  reason: collision with root package name */
    public final StateLayer f9083A;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f9084z;

    public RippleIndicationInstance(boolean z2, State state) {
        this.f9084z = z2;
        this.f9083A = new StateLayer(z2, new RippleIndicationInstance$stateLayer$1(state));
    }

    public abstract void b(PressInteraction.Press press, CoroutineScope coroutineScope);

    public final void c(DrawScope drawScope, float f2, long j2) {
        this.f9083A.b(drawScope, Float.isNaN(f2) ? RippleAnimationKt.a(drawScope, this.f9084z, drawScope.c()) : drawScope.B1(f2), j2);
    }

    public abstract void d(PressInteraction.Press press);

    public final void g(Interaction interaction, CoroutineScope coroutineScope) {
        this.f9083A.c(interaction, coroutineScope);
    }
}
