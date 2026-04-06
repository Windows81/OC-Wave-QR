package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.i6  reason: case insensitive filesystem */
public final /* synthetic */ class C0126i6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12090A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SliderState f12091B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ SliderColors D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f12092z;

    public /* synthetic */ C0126i6(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, int i2, int i3) {
        this.f12092z = sliderDefaults;
        this.f12090A = mutableInteractionSource;
        this.f12091B = sliderState;
        this.C = modifier;
        this.D = sliderColors;
        this.E = z2;
        this.F = j2;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.t(this.f12092z, this.f12090A, this.f12091B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
