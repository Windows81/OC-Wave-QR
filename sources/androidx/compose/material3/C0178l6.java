package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.l6  reason: case insensitive filesystem */
public final /* synthetic */ class C0178l6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderState f12515A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12516B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ SliderColors E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f12517z;

    public /* synthetic */ C0178l6(SliderDefaults sliderDefaults, SliderState sliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, int i2, int i3) {
        this.f12517z = sliderDefaults;
        this.f12515A = sliderState;
        this.f12516B = f2;
        this.C = modifier;
        this.D = z2;
        this.E = sliderColors;
        this.F = function2;
        this.G = function3;
        this.H = f3;
        this.I = f4;
        this.J = i2;
        this.K = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.M(this.f12517z, this.f12515A, this.f12516B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
