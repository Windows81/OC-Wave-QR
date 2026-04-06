package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class P0 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f10599A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10600B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ String H;
    public final /* synthetic */ DatePickerColors I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f10601z;

    public /* synthetic */ P0(String str, Modifier modifier, boolean z2, Function0 function0, boolean z3, boolean z4, boolean z5, boolean z6, String str2, DatePickerColors datePickerColors, int i2) {
        this.f10601z = str;
        this.f10599A = modifier;
        this.f10600B = z2;
        this.C = function0;
        this.D = z3;
        this.E = z4;
        this.F = z5;
        this.G = z6;
        this.H = str2;
        this.I = datePickerColors;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DatePickerKt.N(this.f10601z, this.f10599A, this.f10600B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
