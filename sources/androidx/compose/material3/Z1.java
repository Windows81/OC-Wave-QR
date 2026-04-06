package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

public final /* synthetic */ class Z1 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f11833A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f11834B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ Long D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ CalendarDate F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ SelectableDates H;
    public final /* synthetic */ DatePickerColors I;
    public final /* synthetic */ List J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntRange f11835z;

    public /* synthetic */ Z1(IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, Long l2, Long l3, Function1 function1, CalendarDate calendarDate, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, List list) {
        this.f11835z = intRange;
        this.f11833A = calendarModel;
        this.f11834B = calendarMonth;
        this.C = l2;
        this.D = l3;
        this.E = function1;
        this.F = calendarDate;
        this.G = datePickerFormatter;
        this.H = selectableDates;
        this.I = datePickerColors;
        this.J = list;
    }

    public final Object invoke(Object obj) {
        return DateRangePickerKt$VerticalMonthsList$1.s(this.f11835z, this.f11833A, this.f11834B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (LazyListScope) obj);
    }
}
