package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DefaultRadioButtonColors implements RadioButtonColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f7603a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7604b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7605c;

    public /* synthetic */ DefaultRadioButtonColors(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public State a(boolean z2, boolean z3, Composer composer, int i2) {
        State state;
        composer.X(1243421834);
        if (ComposerKt.P()) {
            ComposerKt.Y(1243421834, i2, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:177)");
        }
        long j2 = !z2 ? this.f7605c : !z3 ? this.f7604b : this.f7603a;
        if (z2) {
            composer.X(1872435883);
            state = SingleValueAnimationKt.a(j2, AnimationSpecKt.n(100, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 48, 12);
            composer.M();
        } else {
            composer.X(1872538586);
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
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        return Color.n(this.f7603a, defaultRadioButtonColors.f7603a) && Color.n(this.f7604b, defaultRadioButtonColors.f7604b) && Color.n(this.f7605c, defaultRadioButtonColors.f7605c);
    }

    public int hashCode() {
        return (((Color.t(this.f7603a) * 31) + Color.t(this.f7604b)) * 31) + Color.t(this.f7605c);
    }

    public DefaultRadioButtonColors(long j2, long j3, long j4) {
        this.f7603a = j2;
        this.f7604b = j3;
        this.f7605c = j4;
    }
}
