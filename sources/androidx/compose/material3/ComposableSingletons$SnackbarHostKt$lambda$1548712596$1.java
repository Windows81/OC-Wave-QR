package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda$-1548712596$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarHostKt$lambda$1548712596$1 implements Function3<SnackbarData, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt$lambda$1548712596$1 f9587z = new ComposableSingletons$SnackbarHostKt$lambda$1548712596$1();

    public final void b(SnackbarData snackbarData, Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(snackbarData) ? 4 : 2);
        } else {
            SnackbarData snackbarData2 = snackbarData;
            i3 = i2;
        }
        if (composer2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1548712596, i3, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            SnackbarKt.j(snackbarData, (Modifier) null, false, (Shape) null, 0, 0, 0, 0, 0, composer, i3 & 14, 510);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
