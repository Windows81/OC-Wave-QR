package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@Deprecated
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {

    /* renamed from: B  reason: collision with root package name */
    public final boolean f9049B;
    public final float C;
    public final State D;
    public final State E;
    public final ViewGroup F;
    public RippleContainer G;
    public final MutableState H;
    public final MutableState I;
    public long J;
    public int K;
    public final Function0 L;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z2, float f2, State state, State state2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state, state2, viewGroup);
    }

    private final void k() {
        RippleContainer rippleContainer = this.G;
        if (rippleContainer != null) {
            rippleContainer.a(this);
        }
    }

    public void a(ContentDrawScope contentDrawScope) {
        this.J = contentDrawScope.c();
        this.K = Float.isNaN(this.C) ? MathKt.d(RippleAnimationKt.a(contentDrawScope, this.f9049B, contentDrawScope.c())) : contentDrawScope.P1(this.C);
        long v2 = ((Color) this.D.getValue()).v();
        float d2 = ((RippleAlpha) this.E.getValue()).d();
        contentDrawScope.q2();
        c(contentDrawScope, this.C, v2);
        Canvas j2 = contentDrawScope.G1().j();
        l();
        RippleHostView n2 = n();
        if (n2 != null) {
            n2.f(contentDrawScope.c(), this.K, v2, d2);
            n2.draw(AndroidCanvas_androidKt.d(j2));
        }
    }

    public void b(PressInteraction.Press press, CoroutineScope coroutineScope) {
        RippleHostView b2 = m().b(this);
        b2.b(press, this.f9049B, this.J, this.K, ((Color) this.D.getValue()).v(), ((RippleAlpha) this.E.getValue()).d(), this.L);
        p(b2);
    }

    public void c1() {
        p((RippleHostView) null);
    }

    public void d(PressInteraction.Press press) {
        RippleHostView n2 = n();
        if (n2 != null) {
            n2.e();
        }
    }

    public void e() {
        k();
    }

    public void f() {
        k();
    }

    public void h() {
    }

    public final boolean l() {
        return ((Boolean) this.I.getValue()).booleanValue();
    }

    public final RippleContainer m() {
        RippleContainer rippleContainer = this.G;
        if (rippleContainer != null) {
            Intrinsics.f(rippleContainer);
            return rippleContainer;
        }
        RippleContainer a2 = Ripple_androidKt.c(this.F);
        this.G = a2;
        Intrinsics.f(a2);
        return a2;
    }

    public final RippleHostView n() {
        return (RippleHostView) this.H.getValue();
    }

    public final void o(boolean z2) {
        this.I.setValue(Boolean.valueOf(z2));
    }

    public final void p(RippleHostView rippleHostView) {
        this.H.setValue(rippleHostView);
    }

    public AndroidRippleIndicationInstance(boolean z2, float f2, State state, State state2, ViewGroup viewGroup) {
        super(z2, state2);
        this.f9049B = z2;
        this.C = f2;
        this.D = state;
        this.E = state2;
        this.F = viewGroup;
        this.H = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.I = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.J = Size.f15876b.b();
        this.K = -1;
        this.L = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }
}
