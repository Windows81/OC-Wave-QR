package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class E0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Long f9889A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f9890B;
    public final /* synthetic */ CalendarModel C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ DateInputValidator G;
    public final /* synthetic */ DateInputFormat H;
    public final /* synthetic */ Locale I;
    public final /* synthetic */ DatePickerColors J;
    public final /* synthetic */ FocusRequester K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f9891z;

    public /* synthetic */ E0(Modifier modifier, Long l2, Function1 function1, CalendarModel calendarModel, Function2 function2, Function2 function22, int i2, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, FocusRequester focusRequester, int i3, int i4) {
        this.f9891z = modifier;
        this.f9889A = l2;
        this.f9890B = function1;
        this.C = calendarModel;
        this.D = function2;
        this.E = function22;
        this.F = i2;
        this.G = dateInputValidator;
        this.H = dateInputFormat;
        this.I = locale;
        this.J = datePickerColors;
        this.K = focusRequester;
        this.L = i3;
        this.M = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return DateInputKt.l(this.f9891z, this.f9889A, this.f9890B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Composer) obj, ((Integer) obj2).intValue());
    }
}
