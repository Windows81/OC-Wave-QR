package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@Deprecated
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    /* renamed from: B  reason: collision with root package name */
    public final boolean f9052B;
    public final float C;
    public final State D;
    public final State E;
    public final SnapshotStateMap F;
    public float G;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z2, float f2, State state, State state2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state, state2);
    }

    public void a(ContentDrawScope contentDrawScope) {
        this.G = Float.isNaN(this.C) ? RippleAnimationKt.a(contentDrawScope, this.f9052B, contentDrawScope.c()) : contentDrawScope.B1(this.C);
        long v2 = ((Color) this.D.getValue()).v();
        contentDrawScope.q2();
        c(contentDrawScope, this.C, v2);
        j(contentDrawScope, v2);
    }

    public void b(PressInteraction.Press press, CoroutineScope coroutineScope) {
        for (Map.Entry value : this.F.entrySet()) {
            ((RippleAnimation) value.getValue()).h();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.f9052B ? Offset.d(press.a()) : null, this.G, this.f9052B, (DefaultConstructorMarker) null);
        this.F.put(press, rippleAnimation);
        Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, (Continuation) null), 3, (Object) null);
    }

    public void d(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.F.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.h();
        }
    }

    public void e() {
        this.F.clear();
    }

    public void f() {
        this.F.clear();
    }

    public void h() {
    }

    public final void j(DrawScope drawScope, long j2) {
        for (Map.Entry value : this.F.entrySet()) {
            RippleAnimation rippleAnimation = (RippleAnimation) value.getValue();
            float d2 = ((RippleAlpha) this.E.getValue()).d();
            if (d2 != 0.0f) {
                rippleAnimation.e(drawScope, Color.l(j2, d2, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            }
        }
    }

    public CommonRippleIndicationInstance(boolean z2, float f2, State state, State state2) {
        super(z2, state2);
        this.f9052B = z2;
        this.C = f2;
        this.D = state;
        this.E = state2;
        this.F = SnapshotStateKt.h();
        this.G = Float.NaN;
    }
}
