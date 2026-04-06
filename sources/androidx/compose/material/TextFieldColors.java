package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;

@Metadata
public interface TextFieldColors {
    State a(boolean z2, Composer composer, int i2);

    State b(boolean z2, boolean z3, Composer composer, int i2);

    State c(boolean z2, Composer composer, int i2);

    State d(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(-1036335134);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1036335134, i2, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:124)");
        }
        State b2 = b(z2, z3, composer, (i2 & 126) | ((i2 >> 3) & 896));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return b2;
    }

    State e(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2);

    State f(boolean z2, Composer composer, int i2);

    State g(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(454310320);
        if (ComposerKt.P()) {
            ComposerKt.Y(454310320, i2, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
        }
        State h2 = h(z2, z3, composer, (i2 & 126) | ((i2 >> 3) & 896));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return h2;
    }

    State h(boolean z2, boolean z3, Composer composer, int i2);

    State i(boolean z2, Composer composer, int i2);

    State j(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2);
}
