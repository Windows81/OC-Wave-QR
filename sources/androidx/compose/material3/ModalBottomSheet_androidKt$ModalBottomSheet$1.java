package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class ModalBottomSheet_androidKt$ModalBottomSheet$1 implements Function2<Composer, Integer, WindowInsets> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10341z;

    public final WindowInsets b(Composer composer, int i2) {
        composer.X(-677688734);
        if (ComposerKt.P()) {
            ComposerKt.Y(-677688734, i2, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:354)");
        }
        WindowInsets windowInsets = this.f10341z;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return windowInsets;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return b((Composer) obj, ((Number) obj2).intValue());
    }
}
