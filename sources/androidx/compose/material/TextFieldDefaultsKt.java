package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextFieldDefaultsKt {
    public static final State b(boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State state;
        if (ComposerKt.P()) {
            ComposerKt.Y(1097899920, i2, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:970)");
        }
        State a2 = FocusInteractionKt.a(interactionSource, composer, (i2 >> 6) & 14);
        State e2 = textFieldColors.e(z2, z3, interactionSource, composer, i2 & 8190);
        float f4 = c(a2) ? f2 : f3;
        if (z2) {
            composer.X(773088894);
            state = AnimateAsStateKt.c(f4, AnimationSpecKt.n(150, 0, (Easing) null, 6, (Object) null), (String) null, (Function1) null, composer, 48, 12);
            composer.M();
        } else {
            composer.X(773193116);
            state = SnapshotStateKt.p(Dp.j(f3), composer, (i2 >> 15) & 14);
            composer.M();
        }
        State p2 = SnapshotStateKt.p(new BorderStroke(((Dp) state.getValue()).t(), new SolidColor(((Color) e2.getValue()).v(), (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return p2;
    }

    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
