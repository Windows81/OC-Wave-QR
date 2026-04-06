package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.b6  reason: case insensitive filesystem */
public final /* synthetic */ class C0059b6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11872A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f11873B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ SliderColors E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f11874z;

    public /* synthetic */ C0059b6(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, float f2, Modifier modifier, boolean z2, SliderColors sliderColors, Function2 function2, Function3 function3, float f3, float f4, int i2) {
        this.f11874z = sliderDefaults;
        this.f11872A = rangeSliderState;
        this.f11873B = f2;
        this.C = modifier;
        this.D = z2;
        this.E = sliderColors;
        this.F = function2;
        this.G = function3;
        this.H = f3;
        this.I = f4;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.G(this.f11874z, this.f11872A, this.f11873B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
