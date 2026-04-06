package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DateRangePickerKt$VerticalMonthsList$1$2$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f9807A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Long f9808B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ CalendarDate E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ List I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9809z;

    public DateRangePickerKt$VerticalMonthsList$1$2$1$1(CalendarModel calendarModel, CalendarMonth calendarMonth, Long l2, Long l3, Function1 function1, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List list) {
        this.f9809z = calendarModel;
        this.f9807A = calendarMonth;
        this.f9808B = l2;
        this.C = l3;
        this.D = function1;
        this.E = calendarDate;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
        this.I = list;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        SelectedRangeInfo selectedRangeInfo;
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
                ComposerKt.Y(682334170, i4, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
            }
            CalendarMonth m2 = this.f9809z.m(this.f9807A, i5);
            Modifier a2 = LazyItemScope.a(lazyItemScope2, Modifier.f15489d, 0.0f, 1, (Object) null);
            Long l2 = this.f9808B;
            Long l3 = this.C;
            Function1 function1 = this.D;
            CalendarDate calendarDate = this.E;
            DatePickerFormatter datePickerFormatter = this.F;
            SelectableDates selectableDates = this.G;
            DatePickerColors datePickerColors = this.H;
            CalendarModel calendarModel = this.f9809z;
            List list = this.I;
            MeasurePolicy a3 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a4 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a5 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a5);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            DatePickerColors datePickerColors2 = datePickerColors;
            Updater.g(b2, a3, companion.c());
            Updater.g(b2, I2, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            DatePickerColors datePickerColors3 = datePickerColors2;
            TextKt.h(TypographyKt.e(DatePickerModalTokens.f13010a.s(), composer2, 6), ComposableLambdaKt.e(-577031469, true, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1(datePickerFormatter, m2, calendarModel, list, datePickerColors3), composer2, 54), composer2, 48);
            if (l2 == null || l3 == null) {
                composer2.X(186488258);
                composer.M();
                selectedRangeInfo = null;
            } else {
                composer2.X(185956701);
                boolean W = composer2.W(l2) | composer2.W(l3);
                Object g2 = composer.g();
                if (W || g2 == Composer.f14567a.a()) {
                    g2 = SelectedRangeInfo.f10962e.a(m2, calendarModel.b(l2.longValue()), calendarModel.b(l3.longValue()));
                    composer2.N(g2);
                }
                composer.M();
                selectedRangeInfo = (SelectedRangeInfo) g2;
            }
            DatePickerKt.U(m2, function1, calendarDate.j(), l2, l3, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors3, calendarModel.f(), composer, 0);
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
