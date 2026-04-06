package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

public final /* synthetic */ class B1 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9222A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f9223B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ SelectableDates E;
    public final /* synthetic */ DatePickerColors F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ IntRange f9224z;

    public /* synthetic */ B1(IntRange intRange, CalendarModel calendarModel, int i2, int i3, Function1 function1, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        this.f9224z = intRange;
        this.f9222A = calendarModel;
        this.f9223B = i2;
        this.C = i3;
        this.D = function1;
        this.E = selectableDates;
        this.F = datePickerColors;
    }

    public final Object invoke(Object obj) {
        return DatePickerKt$YearPicker$1.e(this.f9224z, this.f9222A, this.f9223B, this.C, this.D, this.E, this.F, (LazyGridScope) obj);
    }
}
