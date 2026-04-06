package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$consumeWindowInsets$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f4261z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$consumeWindowInsets$2(WindowInsets windowInsets) {
        super(3);
        this.f4261z = windowInsets;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(788931215);
        if (ComposerKt.P()) {
            ComposerKt.Y(788931215, i2, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:100)");
        }
        boolean W = composer.W(this.f4261z);
        WindowInsets windowInsets = this.f4261z;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new UnionInsetsConsumingModifier(windowInsets);
            composer.N(g2);
        }
        UnionInsetsConsumingModifier unionInsetsConsumingModifier = (UnionInsetsConsumingModifier) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return unionInsetsConsumingModifier;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
