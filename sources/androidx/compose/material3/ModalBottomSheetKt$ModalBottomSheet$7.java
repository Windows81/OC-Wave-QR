package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class ModalBottomSheetKt$ModalBottomSheet$7 implements Function2<Composer, Integer, WindowInsets> {

    /* renamed from: z  reason: collision with root package name */
    public static final ModalBottomSheetKt$ModalBottomSheet$7 f10324z = new ModalBottomSheetKt$ModalBottomSheet$7();

    public final WindowInsets b(Composer composer, int i2) {
        composer.X(69134487);
        if (ComposerKt.P()) {
            ComposerKt.Y(69134487, i2, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:233)");
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
