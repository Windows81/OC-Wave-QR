package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public RippleContainer Y;
    public RippleHostView Z;

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f2, colorProducer, function0);
    }

    private final RippleContainer o3() {
        RippleContainer rippleContainer = this.Y;
        if (rippleContainer != null) {
            Intrinsics.f(rippleContainer);
            return rippleContainer;
        }
        RippleContainer a2 = Ripple_androidKt.c(Ripple_androidKt.e((View) CompositionLocalConsumerModifierNodeKt.a(this, AndroidCompositionLocals_androidKt.j())));
        this.Y = a2;
        Intrinsics.f(a2);
        return a2;
    }

    private final void p3(RippleHostView rippleHostView) {
        this.Z = rippleHostView;
        DrawModifierNodeKt.a(this);
    }

    public void J2() {
        RippleContainer rippleContainer = this.Y;
        if (rippleContainer != null) {
            rippleContainer.a(this);
        }
    }

    public void c1() {
        p3((RippleHostView) null);
    }

    public void e3(PressInteraction.Press press, long j2, float f2) {
        RippleHostView b2 = o3().b(this);
        b2.b(press, g3(), j2, MathKt.d(f2), i3(), ((RippleAlpha) h3().invoke()).d(), new AndroidRippleNode$addRipple$1$1$1(this));
        p3(b2);
    }

    public void f3(DrawScope drawScope) {
        Canvas j2 = drawScope.G1().j();
        RippleHostView rippleHostView = this.Z;
        if (rippleHostView != null) {
            rippleHostView.f(j3(), MathKt.d(k3()), i3(), ((RippleAlpha) h3().invoke()).d());
            rippleHostView.draw(AndroidCanvas_androidKt.d(j2));
        }
    }

    public void m3(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.Z;
        if (rippleHostView != null) {
            rippleHostView.e();
        }
    }

    public AndroidRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0) {
        super(interactionSource, z2, f2, colorProducer, function0, (DefaultConstructorMarker) null);
    }
}
