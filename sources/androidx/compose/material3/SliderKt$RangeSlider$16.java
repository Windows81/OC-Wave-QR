package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$RangeSlider$16 implements Function3<RangeSliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11085A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11086z;

    public final void b(RangeSliderState rangeSliderState, Composer composer, int i2) {
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-453269015, i3, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:720)");
        }
        SliderDefaults.f11057a.u(rangeSliderState, (Modifier) null, this.f11086z, this.f11085A, (Function2) null, (Function3) null, 0.0f, 0.0f, composer, (i3 & 14) | 100663296, 242);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RangeSliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
