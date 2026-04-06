package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class ComposablesKt {
    public static final int a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(524444915, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int O = composer.O();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return O;
    }

    public static final long b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-168259424, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long D = composer.D();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return D;
    }

    public static final RecomposeScope c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(394957799, i2, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        RecomposeScope b2 = composer.b();
        if (b2 != null) {
            composer.L(b2);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return b2;
        }
        throw new IllegalStateException("no recompose scope found");
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final CompositionContext e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1165786124, i2, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        CompositionContext P = composer.P();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return P;
    }
}
