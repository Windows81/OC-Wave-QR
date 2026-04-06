package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class C0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f9330A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f9331B;
    public final /* synthetic */ CalendarModel C;
    public final /* synthetic */ Locale D;
    public final /* synthetic */ DateInputValidator E;
    public final /* synthetic */ int F;
    public final /* synthetic */ MutableState G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DateInputFormat f9332z;

    public /* synthetic */ C0(DateInputFormat dateInputFormat, MutableState mutableState, Function1 function1, CalendarModel calendarModel, Locale locale, DateInputValidator dateInputValidator, int i2, MutableState mutableState2) {
        this.f9332z = dateInputFormat;
        this.f9330A = mutableState;
        this.f9331B = function1;
        this.C = calendarModel;
        this.D = locale;
        this.E = dateInputValidator;
        this.F = i2;
        this.G = mutableState2;
    }

    public final Object invoke(Object obj) {
        return DateInputKt.j(this.f9332z, this.f9330A, this.f9331B, this.C, this.D, this.E, this.F, this.G, (TextFieldValue) obj);
    }
}
