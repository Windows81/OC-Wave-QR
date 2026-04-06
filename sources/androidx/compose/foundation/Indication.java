package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public interface Indication {
    IndicationInstance a(InteractionSource interactionSource, Composer composer, int i2) {
        composer.X(1257603829);
        if (ComposerKt.P()) {
            ComposerKt.Y(1257603829, i2, -1, "androidx.compose.foundation.Indication.rememberUpdatedInstance (Indication.kt:74)");
        }
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.f3132z;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return noIndicationInstance;
    }
}
