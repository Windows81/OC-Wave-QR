package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DatePickerKt$HorizontalMonthsList$1$2$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9739A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f9740B;
    public final /* synthetic */ CalendarDate C;
    public final /* synthetic */ Long D;
    public final /* synthetic */ DatePickerFormatter E;
    public final /* synthetic */ SelectableDates F;
    public final /* synthetic */ DatePickerColors G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9741z;

    public DatePickerKt$HorizontalMonthsList$1$2$1$1(CalendarModel calendarModel, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.f9741z = calendarModel;
        this.f9739A = calendarMonth;
        this.f9740B = function1;
        this.C = calendarDate;
        this.D = l2;
        this.E = datePickerFormatter;
        this.F = selectableDates;
        this.G = datePickerColors;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        LazyItemScope lazyItemScope2 = lazyItemScope;
        int i5 = i2;
        Composer composer2 = composer;
        if ((i3 & 6) == 0) {
            i4 = i3 | (composer2.W(lazyItemScope2) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer2.i(i5) ? 32 : 16;
        }
        if (composer2.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(72599078, i4, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
            }
            CalendarMonth m2 = this.f9741z.m(this.f9739A, i5);
            Modifier a2 = LazyItemScope.a(lazyItemScope2, Modifier.f15489d, 0.0f, 1, (Object) null);
            Function1 function1 = this.f9740B;
            CalendarDate calendarDate = this.C;
            Long l2 = this.D;
            DatePickerFormatter datePickerFormatter = this.E;
            SelectableDates selectableDates = this.F;
            DatePickerColors datePickerColors = this.G;
            CalendarModel calendarModel = this.f9741z;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            DatePickerKt.U(m2, function1, calendarDate.j(), l2, (Long) null, (SelectedRangeInfo) null, datePickerFormatter, selectableDates, datePickerColors, calendarModel.f(), composer, 221184);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
