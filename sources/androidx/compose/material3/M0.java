package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class M0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f10257A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f10258B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f10259z;

    public /* synthetic */ M0(DatePickerColors datePickerColors, CalendarModel calendarModel, int i2) {
        this.f10259z = datePickerColors;
        this.f10257A = calendarModel;
        this.f10258B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.l0(this.f10259z, this.f10257A, this.f10258B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
