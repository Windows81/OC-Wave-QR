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
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultTextFieldColors implements TextFieldColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7633a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7634b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7635c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7636d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7637e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7638f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7639g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7640h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7641i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7642j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7643k;

    /* renamed from: l  reason: collision with root package name */
    public final long f7644l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7645m;

    /* renamed from: n  reason: collision with root package name */
    public final long f7646n;

    /* renamed from: o  reason: collision with root package name */
    public final long f7647o;

    /* renamed from: p  reason: collision with root package name */
    public final long f7648p;

    /* renamed from: q  reason: collision with root package name */
    public final long f7649q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7650r;

    /* renamed from: s  reason: collision with root package name */
    public final long f7651s;

    /* renamed from: t  reason: collision with root package name */
    public final long f7652t;

    /* renamed from: u  reason: collision with root package name */
    public final long f7653u;

    public /* synthetic */ DefaultTextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    public static final boolean k(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final boolean l(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public State a(boolean z2, Composer composer, int i2) {
        composer.X(-1423938813);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1423938813, i2, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:868)");
        }
        State p2 = SnapshotStateKt.p(Color.h(this.f7647o), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State b(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(1016171324);
        if (ComposerKt.P()) {
            ComposerKt.Y(1016171324, i2, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7642j : z3 ? this.f7643k : this.f7641i), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State c(boolean z2, Composer composer, int i2) {
        composer.X(9804418);
        if (ComposerKt.P()) {
            ComposerKt.Y(9804418, i2, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:896)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7633a : this.f7634b), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State d(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(-1519634405);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1519634405, i2, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:808)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7642j : z3 ? this.f7643k : this.f7641i), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State e(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        State state;
        composer.X(998675979);
        if (ComposerKt.P()) {
            ComposerKt.Y(998675979, i2, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:850)");
        }
        long j2 = !z2 ? this.f7640h : z3 ? this.f7639g : k(FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14)) ? this.f7637e : this.f7638f;
        if (z2) {
            composer.X(1614254271);
            state = SingleValueAnimationKt.a(j2, AnimationSpecKt.n(150, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 48, 12);
            composer.M();
        } else {
            composer.X(1614357129);
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
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        return Color.n(this.f7633a, defaultTextFieldColors.f7633a) && Color.n(this.f7634b, defaultTextFieldColors.f7634b) && Color.n(this.f7635c, defaultTextFieldColors.f7635c) && Color.n(this.f7636d, defaultTextFieldColors.f7636d) && Color.n(this.f7637e, defaultTextFieldColors.f7637e) && Color.n(this.f7638f, defaultTextFieldColors.f7638f) && Color.n(this.f7639g, defaultTextFieldColors.f7639g) && Color.n(this.f7640h, defaultTextFieldColors.f7640h) && Color.n(this.f7641i, defaultTextFieldColors.f7641i) && Color.n(this.f7642j, defaultTextFieldColors.f7642j) && Color.n(this.f7643k, defaultTextFieldColors.f7643k) && Color.n(this.f7644l, defaultTextFieldColors.f7644l) && Color.n(this.f7645m, defaultTextFieldColors.f7645m) && Color.n(this.f7646n, defaultTextFieldColors.f7646n) && Color.n(this.f7647o, defaultTextFieldColors.f7647o) && Color.n(this.f7648p, defaultTextFieldColors.f7648p) && Color.n(this.f7649q, defaultTextFieldColors.f7649q) && Color.n(this.f7650r, defaultTextFieldColors.f7650r) && Color.n(this.f7651s, defaultTextFieldColors.f7651s) && Color.n(this.f7652t, defaultTextFieldColors.f7652t) && Color.n(this.f7653u, defaultTextFieldColors.f7653u);
    }

    public State f(boolean z2, Composer composer, int i2) {
        composer.X(-1446422485);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1446422485, i2, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:901)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7636d : this.f7635c), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State g(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(1383318157);
        if (ComposerKt.P()) {
            ComposerKt.Y(1383318157, i2, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:835)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7645m : z3 ? this.f7646n : this.f7644l), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State h(boolean z2, boolean z3, Composer composer, int i2) {
        composer.X(225259054);
        if (ComposerKt.P()) {
            ComposerKt.Y(225259054, i2, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7645m : z3 ? this.f7646n : this.f7644l), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Color.t(this.f7633a) * 31) + Color.t(this.f7634b)) * 31) + Color.t(this.f7635c)) * 31) + Color.t(this.f7636d)) * 31) + Color.t(this.f7637e)) * 31) + Color.t(this.f7638f)) * 31) + Color.t(this.f7639g)) * 31) + Color.t(this.f7640h)) * 31) + Color.t(this.f7641i)) * 31) + Color.t(this.f7642j)) * 31) + Color.t(this.f7643k)) * 31) + Color.t(this.f7644l)) * 31) + Color.t(this.f7645m)) * 31) + Color.t(this.f7646n)) * 31) + Color.t(this.f7647o)) * 31) + Color.t(this.f7648p)) * 31) + Color.t(this.f7649q)) * 31) + Color.t(this.f7650r)) * 31) + Color.t(this.f7651s)) * 31) + Color.t(this.f7652t)) * 31) + Color.t(this.f7653u);
    }

    public State i(boolean z2, Composer composer, int i2) {
        composer.X(264799724);
        if (ComposerKt.P()) {
            ComposerKt.Y(264799724, i2, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:873)");
        }
        State p2 = SnapshotStateKt.p(Color.h(z2 ? this.f7652t : this.f7653u), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public State j(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(727091888);
        if (ComposerKt.P()) {
            ComposerKt.Y(727091888, i2, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:882)");
        }
        State p2 = SnapshotStateKt.p(Color.h(!z2 ? this.f7650r : z3 ? this.f7651s : l(FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14)) ? this.f7648p : this.f7649q), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return p2;
    }

    public DefaultTextFieldColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.f7633a = j2;
        this.f7634b = j3;
        this.f7635c = j4;
        this.f7636d = j5;
        this.f7637e = j6;
        this.f7638f = j7;
        this.f7639g = j8;
        this.f7640h = j9;
        this.f7641i = j10;
        this.f7642j = j11;
        this.f7643k = j12;
        this.f7644l = j13;
        this.f7645m = j14;
        this.f7646n = j15;
        this.f7647o = j16;
        this.f7648p = j17;
        this.f7649q = j18;
        this.f7650r = j19;
        this.f7651s = j20;
        this.f7652t = j21;
        this.f7653u = j22;
    }
}
