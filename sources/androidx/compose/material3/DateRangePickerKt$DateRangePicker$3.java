package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
final class DateRangePickerKt$DateRangePicker$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9793A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9794B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9795z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-331385278, i3, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
            }
            DateRangePickerDefaults.f9781a.f(this.f9795z.j(), this.f9795z.g(), this.f9795z.b(), this.f9793A, PaddingKt.h(Modifier.f15489d, DateRangePickerKt.f9789c), this.f9794B.g(), composer, 1597440, 0);
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
