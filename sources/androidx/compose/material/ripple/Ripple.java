package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public abstract class Ripple implements Indication {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9054a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9055b;

    /* renamed from: c  reason: collision with root package name */
    public final State f9056c;

    public final IndicationInstance a(InteractionSource interactionSource, Composer composer, int i2) {
        long j2;
        composer.X(988743187);
        if (ComposerKt.P()) {
            ComposerKt.Y(988743187, i2, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.C(RippleThemeKt.d());
        boolean z2 = false;
        if (((Color) this.f9056c.getValue()).v() != 16) {
            composer.X(-303557454);
            composer.M();
            j2 = ((Color) this.f9056c.getValue()).v();
        } else {
            composer.X(-303499670);
            j2 = rippleTheme.a(composer, 0);
            composer.M();
        }
        State p2 = SnapshotStateKt.p(Color.h(j2), composer, 0);
        State p3 = SnapshotStateKt.p(rippleTheme.b(composer, 0), composer, 0);
        int i3 = i2 & 14;
        RippleIndicationInstance c2 = c(interactionSource, this.f9054a, this.f9055b, p2, p3, composer, i3 | ((i2 << 12) & 458752));
        if (((i3 ^ 6) > 4 && composer.W(interactionSource)) || (i2 & 6) == 4) {
            z2 = true;
        }
        boolean l2 = composer.l(c2) | z2;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new Ripple$rememberUpdatedInstance$1$1(interactionSource, c2, (Continuation) null);
            composer.N(g2);
        }
        EffectsKt.f(c2, interactionSource, (Function2) g2, composer, (i2 << 3) & 112);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }

    public abstract RippleIndicationInstance c(InteractionSource interactionSource, boolean z2, float f2, State state, State state2, Composer composer, int i2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.f9054a == ripple.f9054a && Dp.o(this.f9055b, ripple.f9055b) && Intrinsics.d(this.f9056c, ripple.f9056c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f9054a) * 31) + Dp.p(this.f9055b)) * 31) + this.f9056c.hashCode();
    }
}
