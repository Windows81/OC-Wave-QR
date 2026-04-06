package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class N0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f10383A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f10384B;
    public final /* synthetic */ SelectableDates C;
    public final /* synthetic */ CalendarModel D;
    public final /* synthetic */ IntRange E;
    public final /* synthetic */ DatePickerColors F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10385z;

    public /* synthetic */ N0(Modifier modifier, long j2, Function1 function1, SelectableDates selectableDates, CalendarModel calendarModel, IntRange intRange, DatePickerColors datePickerColors, int i2) {
        this.f10385z = modifier;
        this.f10383A = j2;
        this.f10384B = function1;
        this.C = selectableDates;
        this.D = calendarModel;
        this.E = intRange;
        this.F = datePickerColors;
        this.G = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.q0(this.f10385z, this.f10383A, this.f10384B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
