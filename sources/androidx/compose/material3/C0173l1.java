package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* renamed from: androidx.compose.material3.l1  reason: case insensitive filesystem */
public final /* synthetic */ class C0173l1 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f12500A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f12501B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ CalendarModel D;
    public final /* synthetic */ IntRange E;
    public final /* synthetic */ DatePickerFormatter F;
    public final /* synthetic */ SelectableDates G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f12502z;

    public /* synthetic */ C0173l1(Long l2, long j2, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        this.f12502z = l2;
        this.f12500A = j2;
        this.f12501B = function1;
        this.C = function12;
        this.D = calendarModel;
        this.E = intRange;
        this.F = datePickerFormatter;
        this.G = selectableDates;
        this.H = datePickerColors;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.K(this.f12502z, this.f12500A, this.f12501B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
