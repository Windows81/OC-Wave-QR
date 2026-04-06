package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$consumeWindowInsets$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f4262z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$consumeWindowInsets$4(PaddingValues paddingValues) {
        super(3);
        this.f4262z = paddingValues;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(114694318);
        if (ComposerKt.P()) {
            ComposerKt.Y(114694318, i2, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:124)");
        }
        boolean W = composer.W(this.f4262z);
        PaddingValues paddingValues = this.f4262z;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new PaddingValuesConsumingModifier(paddingValues);
            composer.N(g2);
        }
        PaddingValuesConsumingModifier paddingValuesConsumingModifier = (PaddingValuesConsumingModifier) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return paddingValuesConsumingModifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
