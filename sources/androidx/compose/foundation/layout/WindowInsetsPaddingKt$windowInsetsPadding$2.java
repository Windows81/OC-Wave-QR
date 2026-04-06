package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class WindowInsetsPaddingKt$windowInsetsPadding$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f4264z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPaddingKt$windowInsetsPadding$2(WindowInsets windowInsets) {
        super(3);
        this.f4264z = windowInsets;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(-1415685722);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1415685722, i2, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:79)");
        }
        boolean W = composer.W(this.f4264z);
        WindowInsets windowInsets = this.f4264z;
        Object g2 = composer.g();
        if (W || g2 == Composer.f14567a.a()) {
            g2 = new InsetsPaddingModifier(windowInsets);
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
