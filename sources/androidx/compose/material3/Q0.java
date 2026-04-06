package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Q0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10637A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10638B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ DatePickerColors H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10639z;

    public /* synthetic */ Q0(Modifier modifier, boolean z2, boolean z3, boolean z4, String str, Function0 function0, Function0 function02, Function0 function03, DatePickerColors datePickerColors, int i2) {
        this.f10639z = modifier;
        this.f10637A = z2;
        this.f10638B = z3;
        this.C = z4;
        this.D = str;
        this.E = function0;
        this.F = function02;
        this.G = function03;
        this.H = datePickerColors;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.Z(this.f10639z, this.f10637A, this.f10638B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
