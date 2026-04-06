package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$VerticalSlider$3 implements Function3<SliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11120A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11121z;

    public final void b(SliderState sliderState, Composer composer, int i2) {
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1702448035, i3, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:431)");
        }
        SliderDefaults.f11057a.w(sliderState, Dp.f19144A.c(), (Modifier) null, this.f11121z, this.f11120A, (Function2) null, (Function3) null, 0.0f, 0.0f, composer, (i3 & 14) | 805306416, 484);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
