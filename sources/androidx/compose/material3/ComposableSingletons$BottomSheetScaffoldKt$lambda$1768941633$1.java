package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class ComposableSingletons$BottomSheetScaffoldKt$lambda$1768941633$1 implements Function3<SnackbarHostState, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda$1768941633$1 f9546z = new ComposableSingletons$BottomSheetScaffoldKt$lambda$1768941633$1();

    public final void b(SnackbarHostState snackbarHostState, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.W(snackbarHostState) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1768941633, i2, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1768941633.<anonymous> (BottomSheetScaffold.kt:131)");
            }
            SnackbarHostKt.f(snackbarHostState, (Modifier) null, (Function3) null, composer, i2 & 14, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
