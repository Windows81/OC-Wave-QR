package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FocusInteractionKt {
    public static final State a(InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1805515472, i2, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.N(g2);
        }
        MutableState mutableState = (MutableState) g2;
        int i3 = i2 & 14;
        boolean z2 = ((i3 ^ 6) > 4 && composer.W(interactionSource)) || (i2 & 6) == 4;
        Object g3 = composer.g();
        if (z2 || g3 == companion.a()) {
            g3 = new FocusInteractionKt$collectIsFocusedAsState$1$1(interactionSource, mutableState, (Continuation) null);
            composer.N(g3);
        }
        EffectsKt.g(interactionSource, (Function2) g3, composer, i3);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return mutableState;
    }
}
