package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.e6  reason: case insensitive filesystem */
public final /* synthetic */ class C0089e6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderState f12017A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12018B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ SliderColors E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f12019z;

    public /* synthetic */ C0089e6(SliderDefaults sliderDefaults, SliderState sliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, boolean z3, boolean z4, int i2, int i3) {
        this.f12019z = sliderDefaults;
        this.f12017A = sliderState;
        this.f12018B = f2;
        this.C = modifier;
        this.D = z2;
        this.E = sliderColors;
        this.F = function2;
        this.G = function3;
        this.H = f3;
        this.I = f4;
        this.J = z3;
        this.K = z4;
        this.L = i2;
        this.M = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.C(this.f12019z, this.f12017A, this.f12018B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (Composer) obj, ((Integer) obj2).intValue());
    }
}
