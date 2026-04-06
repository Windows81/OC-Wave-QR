package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Y0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f11808A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f11809B;
    public final /* synthetic */ DatePickerColors C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f11810z;

    public /* synthetic */ Y0(Modifier modifier, int i2, Function1 function1, DatePickerColors datePickerColors, int i3) {
        this.f11810z = modifier;
        this.f11808A = i2;
        this.f11809B = function1;
        this.C = datePickerColors;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.P(this.f11810z, this.f11808A, this.f11809B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
