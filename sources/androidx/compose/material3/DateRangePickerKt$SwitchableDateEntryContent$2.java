package androidx.compose.material3;

import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.IntRange;

@Metadata
public final class DateRangePickerKt$SwitchableDateEntryContent$2 implements Function3<DisplayMode, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f9801A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f9802B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ CalendarModel E;
    public final /* synthetic */ IntRange F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ SelectableDates H;
    public final /* synthetic */ DatePickerColors I;
    public final /* synthetic */ FocusRequester J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f9803z;

    public DateRangePickerKt$SwitchableDateEntryContent$2(Long l2, Long l3, long j2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester) {
        this.f9803z = l2;
        this.f9801A = l3;
        this.f9802B = j2;
        this.C = function2;
        this.D = function1;
        this.E = calendarModel;
        this.F = intRange;
        this.G = datePickerFormatter;
        this.H = selectableDates;
        this.I = datePickerColors;
        this.J = focusRequester;
    }

    public final void b(int i2, Composer composer, int i3) {
        int i4;
        int i5 = i2;
        Composer composer2 = composer;
        if ((i3 & 6) == 0) {
            i4 = i3 | (composer2.i(i5) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (composer2.E((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-773828161, i4, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
            }
            DisplayMode.Companion companion = DisplayMode.f9856b;
            if (DisplayMode.f(i5, companion.b())) {
                composer2.X(-619517270);
                DateRangePickerKt.g(this.f9803z, this.f9801A, this.f9802B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, 0);
                composer.M();
            } else if (DisplayMode.f(i5, companion.a())) {
                composer2.X(-619495944);
                DateRangeInputKt.d(this.f9803z, this.f9801A, this.C, this.E, this.F, this.G, this.H, this.I, this.J, composer, 0);
                composer.M();
            } else {
                composer2.X(-2023979101);
                composer.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((DisplayMode) obj).i(), (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
