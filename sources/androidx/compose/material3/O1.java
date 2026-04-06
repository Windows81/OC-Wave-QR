package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class O1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f10516A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f10517B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ CalendarModel E;
    public final /* synthetic */ IntRange F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ SelectableDates H;
    public final /* synthetic */ DatePickerColors I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f10518z;

    public /* synthetic */ O1(Long l2, Long l3, long j2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        this.f10518z = l2;
        this.f10516A = l3;
        this.f10517B = j2;
        this.C = function2;
        this.D = function1;
        this.E = calendarModel;
        this.F = intRange;
        this.G = datePickerFormatter;
        this.H = selectableDates;
        this.I = datePickerColors;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DateRangePickerKt.h(this.f10518z, this.f10516A, this.f10517B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
