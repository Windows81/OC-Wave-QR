package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
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

    private final void i3() {
        this.T = Z2(RippleKt.c(this.P, this.Q, this.R, new DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1(this), new C0192n2(this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.ripple.RippleAlpha j3(androidx.compose.material3.DelegatingThemeAwareRippleNode r1) {
        /*
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.RippleKt.c()
            java.lang.Object r1 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r1, r0)
            androidx.compose.material3.RippleConfiguration r1 = (androidx.compose.material3.RippleConfiguration) r1
            if (r1 == 0) goto L_0x0012
            androidx.compose.material.ripple.RippleAlpha r1 = r1.b()
            if (r1 != 0) goto L_0x0018
        L_0x0012:
            androidx.compose.material3.RippleDefaults r1 = androidx.compose.material3.RippleDefaults.f10735a
            androidx.compose.material.ripple.RippleAlpha r1 = r1.a()
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DelegatingThemeAwareRippleNode.j3(androidx.compose.material3.DelegatingThemeAwareRippleNode):androidx.compose.material.ripple.RippleAlpha");
    }

    private final void k3() {
        DelegatableNode delegatableNode = this.T;
        if (delegatableNode != null) {
            c3(delegatableNode);
        }
        this.T = null;
    }

    private final void l3() {
        ObserverModifierNodeKt.a(this, new C0183m2(this));
    }

    public static final Unit m3(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.a(delegatingThemeAwareRippleNode, RippleKt.c())) == null) {
            delegatingThemeAwareRippleNode.k3();
        } else if (delegatingThemeAwareRippleNode.T == null) {
            delegatingThemeAwareRippleNode.i3();
        }
        return Unit.f40552a;
    }

    public void I2() {
        l3();
    }

    public void L1() {
        l3();
    }

    public DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer) {
        this.P = interactionSource;
        this.Q = z2;
        this.R = f2;
        this.S = colorProducer;
    }
}
