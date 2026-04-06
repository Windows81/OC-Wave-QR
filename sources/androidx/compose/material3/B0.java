package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class B0 implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CalendarModel f9219A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DateInputFormat f9220B;
    public final /* synthetic */ Locale C;
    public final /* synthetic */ int D;
    public final /* synthetic */ MutableState E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateInputValidator f9221z;

    public /* synthetic */ B0(DateInputValidator dateInputValidator, CalendarModel calendarModel, DateInputFormat dateInputFormat, Locale locale, int i2, MutableState mutableState) {
        this.f9221z = dateInputValidator;
        this.f9219A = calendarModel;
        this.f9220B = dateInputFormat;
        this.C = locale;
        this.D = i2;
        this.E = mutableState;
    }

    public final Object invoke() {
        return DateInputKt.p(this.f9221z, this.f9219A, this.f9220B, this.C, this.D, this.E);
    }
}
