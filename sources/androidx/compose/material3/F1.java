package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class F1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f9984A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9985B;
    public final /* synthetic */ CalendarModel C;
    public final /* synthetic */ IntRange D;
    public final /* synthetic */ DatePickerFormatter E;
    public final /* synthetic */ SelectableDates F;
    public final /* synthetic */ DatePickerColors G;
    public final /* synthetic */ FocusRequester H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f9986z;

    public /* synthetic */ F1(Long l2, Long l3, Function2 function2, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2) {
        this.f9986z = l2;
        this.f9984A = l3;
        this.f9985B = function2;
        this.C = calendarModel;
        this.D = intRange;
        this.E = datePickerFormatter;
        this.F = selectableDates;
        this.G = datePickerColors;
        this.H = focusRequester;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DateRangeInputKt.g(this.f9986z, this.f9984A, this.f9985B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
