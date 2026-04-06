package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$lambda$-655173438$1  reason: invalid class name */
public final class ComposableSingletons$ModalBottomSheetKt$lambda$655173438$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ModalBottomSheetKt$lambda$655173438$1 f9560z = new ComposableSingletons$ModalBottomSheetKt$lambda$655173438$1();

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-655173438, i2, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda$-655173438.<anonymous> (ModalBottomSheet.kt:232)");
            }
            BottomSheetDefaults.f9266a.c((Modifier) null, 0.0f, 0.0f, (Shape) null, 0, composer, 196608, 31);
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
