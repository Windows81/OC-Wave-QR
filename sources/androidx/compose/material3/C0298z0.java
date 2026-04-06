package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* renamed from: androidx.compose.material3.z0  reason: case insensitive filesystem */
public final /* synthetic */ class C0298z0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f14504A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f14505B;
    public final /* synthetic */ IntRange C;
    public final /* synthetic */ DatePickerFormatter D;
    public final /* synthetic */ SelectableDates E;
    public final /* synthetic */ DatePickerColors F;
    public final /* synthetic */ FocusRequester G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f14506z;

    public /* synthetic */ C0298z0(Long l2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2) {
        this.f14506z = l2;
        this.f14504A = function1;
        this.f14505B = calendarModel;
        this.C = intRange;
        this.D = datePickerFormatter;
        this.E = selectableDates;
        this.F = datePickerColors;
        this.G = focusRequester;
        this.H = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DateInputKt.h(this.f14506z, this.f14504A, this.f14505B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
