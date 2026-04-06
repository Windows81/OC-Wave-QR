package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class H7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f10096A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f10097B;
    public final /* synthetic */ TimePickerState C;
    public final /* synthetic */ int D;
    public final /* synthetic */ KeyboardOptions E;
    public final /* synthetic */ KeyboardActions F;
    public final /* synthetic */ TimePickerColors G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10098z;

    public /* synthetic */ H7(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, TimePickerState timePickerState, int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i3, int i4) {
        this.f10098z = modifier;
        this.f10096A = textFieldValue;
        this.f10097B = function1;
        this.C = timePickerState;
        this.D = i2;
        this.E = keyboardOptions;
        this.F = keyboardActions;
        this.G = timePickerColors;
        this.H = i3;
        this.I = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerKt.R(this.f10098z, this.f10096A, this.f10097B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
