package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final InteractionSource P;
    public final boolean Q;
    public final float R;
    public final ColorProducer S;
    public DelegatableNode T;

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f2, colorProducer);
    }

    public void I2() {
        l3();
    }

    public void L1() {
        l3();
    }

    public final void j3() {
        this.T = Z2(RippleKt.c(this.P, this.Q, this.R, new DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1(this), new DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1(this)));
    }

    public final void k3() {
        DelegatableNode delegatableNode = this.T;
        if (delegatableNode != null) {
            c3(delegatableNode);
        }
        this.T = null;
    }

    public final void l3() {
        ObserverModifierNodeKt.a(this, new DelegatingThemeAwareRippleNode$updateConfiguration$1(this));
    }

    public DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer) {
        this.P = interactionSource;
        this.Q = z2;
        this.R = f2;
        this.S = colorProducer;
    }
}
