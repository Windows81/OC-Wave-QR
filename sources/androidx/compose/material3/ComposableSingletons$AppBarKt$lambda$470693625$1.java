package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda$-470693625$1  reason: invalid class name */
public final class ComposableSingletons$AppBarKt$lambda$470693625$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AppBarKt$lambda$470693625$1 f9522z = new ComposableSingletons$AppBarKt$lambda$470693625$1();

    public final void b(RowScope rowScope, Composer composer, int i2) {
        if (composer.E((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-470693625, i2, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda$-470693625.<anonymous> (AppBar.kt:955)");
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
