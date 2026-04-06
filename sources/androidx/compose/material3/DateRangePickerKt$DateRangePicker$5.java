package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class DateRangePickerKt$DateRangePicker$5 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9796A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateRangePickerState f9797z;

    public static final Unit e(DateRangePickerState dateRangePickerState, DisplayMode displayMode) {
        dateRangePickerState.a(displayMode.i());
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1343236786, i2, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
            }
            Modifier h2 = PaddingKt.h(Modifier.f15489d, DatePickerKt.F0());
            int b2 = this.f9797z.b();
            boolean W = composer.W(this.f9797z);
            DateRangePickerState dateRangePickerState = this.f9797z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new U1(dateRangePickerState);
                composer.N(g2);
            }
            DatePickerKt.O(h2, b2, (Function1) g2, this.f9796A, composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
