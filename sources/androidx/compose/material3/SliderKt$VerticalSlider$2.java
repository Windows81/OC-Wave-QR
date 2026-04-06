package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$VerticalSlider$2 implements Function3<SliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11117A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11118B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11119z;

    public final void b(SliderState sliderState, Composer composer, int i2) {
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(1896624690, i3, -1, "androidx.compose.material3.VerticalSlider.<anonymous> (Slider.kt:422)");
        }
        SliderDefaults.f11057a.r(this.f11119z, sliderState, (Modifier) null, this.f11117A, this.f11118B, SliderKt.f11072e, composer, ((i3 << 3) & 112) | 1769472, 4);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
