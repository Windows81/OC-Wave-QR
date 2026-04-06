package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ComposableSingletons$AppBarKt$lambda$1921811868$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AppBarKt$lambda$1921811868$1 f9535z = new ComposableSingletons$AppBarKt$lambda$1921811868$1();

    public final void b(RowScope rowScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1921811868, i2, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda$1921811868.<anonymous> (AppBar.kt:756)");
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
