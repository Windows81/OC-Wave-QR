package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class Q1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f10640A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f10641B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ CalendarModel F;
    public final /* synthetic */ IntRange G;
    public final /* synthetic */ DatePickerFormatter H;
    public final /* synthetic */ SelectableDates I;
    public final /* synthetic */ DatePickerColors J;
    public final /* synthetic */ FocusRequester K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f10642z;

    public /* synthetic */ Q1(Long l2, Long l3, long j2, int i2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4) {
        this.f10642z = l2;
        this.f10640A = l3;
        this.f10641B = j2;
        this.C = i2;
        this.D = function2;
        this.E = function1;
        this.F = calendarModel;
        this.G = intRange;
        this.H = datePickerFormatter;
        this.I = selectableDates;
        this.J = datePickerColors;
        this.K = focusRequester;
        this.L = i3;
        this.M = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DateRangePickerKt.k(this.f10642z, this.f10640A, this.f10641B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Composer) obj, ((Integer) obj2).intValue());
    }
}
