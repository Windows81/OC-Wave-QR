package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ModalBottomSheetKt$ModalBottomSheetContent$1 implements Function2<Composer, Integer, WindowInsets> {

    /* renamed from: z  reason: collision with root package name */
    public static final ModalBottomSheetKt$ModalBottomSheetContent$1 f10325z = new ModalBottomSheetKt$ModalBottomSheetContent$1();

    public final WindowInsets b(Composer composer, int i2) {
        composer.X(1023699493);
        if (ComposerKt.P()) {
            ComposerKt.Y(1023699493, i2, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:270)");
        }
        WindowInsets m2 = BottomSheetDefaults.f9266a.m(composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return m2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }
}
