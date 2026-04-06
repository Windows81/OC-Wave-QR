package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9810A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9811B;
    public final /* synthetic */ List C;
    public final /* synthetic */ DatePickerColors D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerFormatter f9812z;

    public DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(DatePickerFormatter datePickerFormatter, CalendarMonth calendarMonth, CalendarModel calendarModel, List list, DatePickerColors datePickerColors) {
        this.f9812z = datePickerFormatter;
        this.f9810A = calendarMonth;
        this.f9811B = calendarModel;
        this.C = list;
        this.D = datePickerColors;
    }

    public static final Unit e(List list, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.g0(semanticsPropertyReceiver, list);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-577031469, i3, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
            }
            String c2 = this.f9812z.c(Long.valueOf(this.f9810A.e()), this.f9811B.f());
            if (c2 == null) {
                c2 = "-";
            }
            String str = c2;
            Modifier h2 = PaddingKt.h(Modifier.f15489d, DateRangePickerKt.x());
            boolean l2 = composer2.l(this.C);
            List list = this.C;
            Object g2 = composer.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new C0065c2(list);
                composer2.N(g2);
            }
            TextKt.j(str, SemanticsModifierKt.d(h2, false, (Function1) g2, 1, (Object) null), this.D.i(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 262136);
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
