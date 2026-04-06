package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DatePickerKt$DatePicker$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9716A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerState f9717z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1655706771, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
            }
            DatePickerDefaults.f9682a.g(this.f9717z.b(), PaddingKt.h(Modifier.f15489d, DatePickerKt.f9708e), this.f9716A.j(), composer, 3120, 0);
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
