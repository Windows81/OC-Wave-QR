package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(359872873);
        if (ComposerKt.P()) {
            ComposerKt.Y(359872873, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
        }
        WindowInsetsHolder c2 = WindowInsetsHolder.f4215x.c(composer, 6);
        boolean W = composer.W(c2);
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new InsetsPaddingModifier(c2.f());
            composer.N(g2);
        }
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return insetsPaddingModifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
