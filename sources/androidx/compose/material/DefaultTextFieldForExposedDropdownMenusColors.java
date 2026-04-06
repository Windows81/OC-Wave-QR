package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7654a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7655b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7656c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7657d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7658e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7659f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7660g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7661h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7662i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7663j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7664k;

    /* renamed from: l  reason: collision with root package name */
    public final long f7665l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7666m;

    /* renamed from: n  reason: collision with root package name */
    public final long f7667n;

    /* renamed from: o  reason: collision with root package name */
    public final long f7668o;

    /* renamed from: p  reason: collision with root package name */
    public final long f7669p;

    /* renamed from: q  reason: collision with root package name */
    public final long f7670q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7671r;

    /* renamed from: s  reason: collision with root package name */
    public final long f7672s;

    /* renamed from: t  reason: collision with root package name */
    public final long f7673t;

    /* renamed from: u  reason: collision with root package name */
    public final long f7674u;

    /* renamed from: v  reason: collision with root package name */
    public final long f7675v;

    public static final boolean k(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final boolean l(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final boolean m(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public State a(boolean z2, Composer composer, int i2) {
        composer.X(-28962788);
        if (ComposerKt.P()) {
            ComposerKt.Y(-28962788, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:567)");
        }
        State p2 = SnapshotStateKt.p(Color.h(this.f7669p), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(-776179197);
        if (ComposerKt.P()) {
            ComposerKt.Y(-776179197, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:504)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7663j : z3 ? this.f7664k : this.f7662i), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, Composer composer, int i2) {
        composer.X(394526077);
        if (ComposerKt.P()) {
            ComposerKt.Y(394526077, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:595)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7654a : this.f7655b), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State e(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        State state;
        composer.X(476110356);
        if (ComposerKt.P()) {
            ComposerKt.Y(476110356, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:549)");
        }
        long j2 = !z2 ? this.f7661h : z3 ? this.f7660g : k(FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14)) ? this.f7658e : this.f7659f;
        if (z2) {
            composer.X(-889472281);
            state = SingleValueAnimationKt.a(j2, AnimationSpecKt.n(150, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 48, 12);
            composer.M();
        } else {
            composer.X(-889369423);
            state = SnapshotStateKt.p(Color.h(j2), composer, 0);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldForExposedDropdownMenusColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) obj;
        return Color.n(this.f7654a, defaultTextFieldForExposedDropdownMenusColors.f7654a) && Color.n(this.f7655b, defaultTextFieldForExposedDropdownMenusColors.f7655b) && Color.n(this.f7656c, defaultTextFieldForExposedDropdownMenusColors.f7656c) && Color.n(this.f7657d, defaultTextFieldForExposedDropdownMenusColors.f7657d) && Color.n(this.f7658e, defaultTextFieldForExposedDropdownMenusColors.f7658e) && Color.n(this.f7659f, defaultTextFieldForExposedDropdownMenusColors.f7659f) && Color.n(this.f7660g, defaultTextFieldForExposedDropdownMenusColors.f7660g) && Color.n(this.f7661h, defaultTextFieldForExposedDropdownMenusColors.f7661h) && Color.n(this.f7662i, defaultTextFieldForExposedDropdownMenusColors.f7662i) && Color.n(this.f7663j, defaultTextFieldForExposedDropdownMenusColors.f7663j) && Color.n(this.f7664k, defaultTextFieldForExposedDropdownMenusColors.f7664k) && Color.n(this.f7665l, defaultTextFieldForExposedDropdownMenusColors.f7665l) && Color.n(this.f7666m, defaultTextFieldForExposedDropdownMenusColors.f7666m) && Color.n(this.f7667n, defaultTextFieldForExposedDropdownMenusColors.f7667n) && Color.n(this.f7668o, defaultTextFieldForExposedDropdownMenusColors.f7668o) && Color.n(this.f7669p, defaultTextFieldForExposedDropdownMenusColors.f7669p) && Color.n(this.f7670q, defaultTextFieldForExposedDropdownMenusColors.f7670q) && Color.n(this.f7671r, defaultTextFieldForExposedDropdownMenusColors.f7671r) && Color.n(this.f7672s, defaultTextFieldForExposedDropdownMenusColors.f7672s) && Color.n(this.f7673t, defaultTextFieldForExposedDropdownMenusColors.f7673t) && Color.n(this.f7674u, defaultTextFieldForExposedDropdownMenusColors.f7674u) && Color.n(this.f7675v, defaultTextFieldForExposedDropdownMenusColors.f7675v);
    }

    public State f(boolean z2, Composer composer, int i2) {
        composer.X(-930693132);
        if (ComposerKt.P()) {
            ComposerKt.Y(-930693132, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:600)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7657d : this.f7656c), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State g(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(79259602);
        if (ComposerKt.P()) {
            ComposerKt.Y(79259602, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:531)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7667n : z3 ? this.f7668o : m(FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14)) ? this.f7666m : this.f7665l), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State h(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(1665901393);
        if (ComposerKt.P()) {
            ComposerKt.Y(1665901393, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:516)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7667n : z3 ? this.f7668o : this.f7665l), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.t(this.f7654a) * 31) + Color.t(this.f7655b)) * 31) + Color.t(this.f7656c)) * 31) + Color.t(this.f7657d)) * 31) + Color.t(this.f7658e)) * 31) + Color.t(this.f7659f)) * 31) + Color.t(this.f7660g)) * 31) + Color.t(this.f7661h)) * 31) + Color.t(this.f7662i)) * 31) + Color.t(this.f7663j)) * 31) + Color.t(this.f7664k)) * 31) + Color.t(this.f7665l)) * 31) + Color.t(this.f7666m)) * 31) + Color.t(this.f7667n)) * 31) + Color.t(this.f7668o)) * 31) + Color.t(this.f7669p)) * 31) + Color.t(this.f7670q)) * 31) + Color.t(this.f7671r)) * 31) + Color.t(this.f7672s)) * 31) + Color.t(this.f7673t)) * 31) + Color.t(this.f7674u)) * 31) + Color.t(this.f7675v);
    }

    public State i(boolean z2, Composer composer, int i2) {
        composer.X(1742462291);
        if (ComposerKt.P()) {
            ComposerKt.Y(1742462291, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:572)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7674u : this.f7675v), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State j(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(-1749156593);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1749156593, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:581)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7672s : z3 ? this.f7673t : l(FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14)) ? this.f7670q : this.f7671r), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }
}
