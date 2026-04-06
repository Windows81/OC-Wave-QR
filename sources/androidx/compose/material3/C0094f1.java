package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.f1  reason: case insensitive filesystem */
public final /* synthetic */ class C0094f1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f12029A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f12030B;
    public final /* synthetic */ Long C;
    public final /* synthetic */ Long D;
    public final /* synthetic */ SelectedRangeInfo E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ Locale I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CalendarMonth f12031z;

    public /* synthetic */ C0094f1(CalendarMonth calendarMonth, Function1 function1, long j2, Long l2, Long l3, SelectedRangeInfo selectedRangeInfo, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Locale locale, int i2) {
        this.f12031z = calendarMonth;
        this.f12029A = function1;
        this.f12030B = j2;
        this.C = l2;
        this.D = l3;
        this.E = selectedRangeInfo;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
        this.I = locale;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.X(this.f12031z, this.f12029A, this.f12030B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
