package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class LazyLayoutSemanticsKt {
    public static final float a(int i2, int i3, boolean z2) {
        return z2 ? b(i2, i3) + ((float) 100) : b(i2, i3);
    }

    public static final float b(int i2, int i3) {
        return (float) (i3 + (i2 * 500));
    }

    public static final Modifier c(Modifier modifier, Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1070136913, i2, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier o0 = modifier.o0(new LazyLayoutSemanticsModifier(function0, lazyLayoutSemanticState, orientation, z2, z3));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return o0;
    }
}
