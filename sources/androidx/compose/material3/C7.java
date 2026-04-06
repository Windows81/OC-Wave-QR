package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f9348A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TimePickerState f9349B;
    public final /* synthetic */ int C;
    public final /* synthetic */ TimePickerColors D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f9350z;

    public /* synthetic */ C7(Modifier modifier, int i2, TimePickerState timePickerState, int i3, TimePickerColors timePickerColors, int i4) {
        this.f9350z = modifier;
        this.f9348A = i2;
        this.f9349B = timePickerState;
        this.C = i3;
        this.D = timePickerColors;
        this.E = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return TimePickerKt.V(this.f9350z, this.f9348A, this.f9349B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
