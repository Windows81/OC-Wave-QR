package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* renamed from: androidx.compose.material3.w1  reason: case insensitive filesystem */
public final /* synthetic */ class C0272w1 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f14445A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f14446B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ CalendarDate D;
    public final /* synthetic */ Long E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntRange f14447z;

    public /* synthetic */ C0272w1(IntRange intRange, CalendarModel calendarModel, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l2, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.f14447z = intRange;
        this.f14445A = calendarModel;
        this.f14446B = calendarMonth;
        this.C = function1;
        this.D = calendarDate;
        this.E = l2;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
    }

    public final Object invoke(Object obj) {
        return DatePickerKt$HorizontalMonthsList$1.p(this.f14447z, this.f14445A, this.f14446B, this.C, this.D, this.E, this.F, this.G, this.H, (LazyListScope) obj);
    }
}
