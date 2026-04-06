package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SpacerKt {
    public static final void a(Modifier modifier, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-72882467, i2, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f4194a;
        int a2 = ComposablesKt.a(composer, 0);
        Modifier e2 = ComposedModifierKt.e(composer, modifier);
        CompositionLocalMap I = composer.I();
        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
        Function0 a3 = companion.a();
        if (composer.v() == null) {
            ComposablesKt.d();
        }
        composer.s();
        if (composer.n()) {
            composer.y(a3);
        } else {
            composer.K();
        }
        Composer b2 = Updater.b(composer);
        Updater.g(b2, spacerMeasurePolicy, companion.c());
        Updater.g(b2, I, companion.e());
        Updater.g(b2, e2, companion.d());
        Function2 b3 = companion.b();
        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
            b2.N(Integer.valueOf(a2));
            b2.A(Integer.valueOf(a2), b3);
        }
        composer.T();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }
}
