package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class T0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f11258A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11259B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ CalendarModel E;
    public final /* synthetic */ IntRange F;
    public final /* synthetic */ DatePickerFormatter G;
    public final /* synthetic */ SelectableDates H;
    public final /* synthetic */ DatePickerColors I;
    public final /* synthetic */ FocusRequester J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f11260z;

    public /* synthetic */ T0(Long l2, long j2, int i2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4) {
        this.f11260z = l2;
        this.f11258A = j2;
        this.f11259B = i2;
        this.C = function1;
        this.D = function12;
        this.E = calendarModel;
        this.F = intRange;
        this.G = datePickerFormatter;
        this.H = selectableDates;
        this.I = datePickerColors;
        this.J = focusRequester;
        this.K = i3;
        this.L = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.i0(this.f11260z, this.f11258A, this.f11259B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (Composer) obj, ((Integer) obj2).intValue());
    }
}
