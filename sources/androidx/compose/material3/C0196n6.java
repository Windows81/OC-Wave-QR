package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.n6  reason: case insensitive filesystem */
public final /* synthetic */ class C0196n6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f12541A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12542B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ SliderColors D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f12543z;

    public /* synthetic */ C0196n6(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f2, float f3, int i2, int i3) {
        this.f12543z = sliderDefaults;
        this.f12541A = rangeSliderState;
        this.f12542B = modifier;
        this.C = z2;
        this.D = sliderColors;
        this.E = function2;
        this.F = function3;
        this.G = f2;
        this.H = f3;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.K(this.f12543z, this.f12541A, this.f12542B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
