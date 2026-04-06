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
final class DatePickerKt$DatePicker$5 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f9721A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerState f9722z;

    public static final Unit e(DatePickerState datePickerState, DisplayMode displayMode) {
        datePickerState.a(displayMode.i());
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1483431603, i2, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:206)");
            }
            Modifier h2 = PaddingKt.h(Modifier.f15489d, DatePickerKt.F0());
            int b2 = this.f9722z.b();
            boolean W = composer.W(this.f9722z);
            DatePickerState datePickerState = this.f9722z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new C0191n1(datePickerState);
                composer.N(g2);
            }
            DatePickerKt.O(h2, b2, (Function1) g2, this.f9721A, composer, 6);
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
