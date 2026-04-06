package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.j6  reason: case insensitive filesystem */
public final /* synthetic */ class C0160j6 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12480A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12481B;
    public final /* synthetic */ SliderColors C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ long E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f12482z;

    public /* synthetic */ C0160j6(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, int i2, int i3) {
        this.f12482z = sliderDefaults;
        this.f12480A = mutableInteractionSource;
        this.f12481B = modifier;
        this.C = sliderColors;
        this.D = z2;
        this.E = j2;
        this.F = i2;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return SliderDefaults.s(this.f12482z, this.f12480A, this.f12481B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
