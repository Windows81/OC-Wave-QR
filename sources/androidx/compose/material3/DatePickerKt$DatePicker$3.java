package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DatePickerKt$DatePicker$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9718A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9719B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerState f9720z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1439279037, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
            }
            DatePickerDefaults.f9682a.d(this.f9720z.i(), this.f9720z.b(), this.f9718A, PaddingKt.h(Modifier.f15489d, DatePickerKt.f9709f), this.f9719B.g(), composer, 199680, 0);
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
