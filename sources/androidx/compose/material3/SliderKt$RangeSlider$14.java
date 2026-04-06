package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$RangeSlider$14 implements Function3<RangeSliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11079A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11080B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11081z;

    public final void b(RangeSliderState rangeSliderState, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1597255314, i2, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:706)");
        }
        SliderDefaults.f11057a.q(this.f11081z, (Modifier) null, this.f11079A, this.f11080B, 0, composer, 196608, 18);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
