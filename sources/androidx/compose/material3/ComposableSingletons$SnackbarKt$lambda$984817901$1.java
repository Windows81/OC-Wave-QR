package androidx.compose.material3;

import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ComposableSingletons$SnackbarKt$lambda$984817901$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarKt$lambda$984817901$1 f9590z = new ComposableSingletons$SnackbarKt$lambda$984817901$1();

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(984817901, i2, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda$984817901.<anonymous> (Snackbar.kt:226)");
            }
            ImageVector c2 = Icons.Filled.f12257a.c();
            Strings.Companion companion = Strings.f12320b;
            IconKt.e(c2, Strings_androidKt.b(Strings.a(R.string.N), composer, 0), (Modifier) null, 0, composer, 0, 12);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
