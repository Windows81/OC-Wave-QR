package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

public final /* synthetic */ class U0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f11693A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f11694B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ CalendarModel D;
    public final /* synthetic */ IntRange E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyListState f11695z;

    public /* synthetic */ U0(LazyListState lazyListState, Long l2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        this.f11695z = lazyListState;
        this.f11693A = l2;
        this.f11694B = function1;
        this.C = function12;
        this.D = calendarModel;
        this.E = intRange;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.R(this.f11695z, this.f11693A, this.f11694B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
