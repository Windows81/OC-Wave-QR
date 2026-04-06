package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$Slider$11 implements Function3<SliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11104A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f11105z;

    public final void b(SliderState sliderState, Composer composer, int i2) {
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-81224541, i3, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:369)");
        }
        SliderDefaults.f11057a.v(sliderState, (Modifier) null, this.f11105z, this.f11104A, (Function2) null, (Function3) null, 0.0f, 0.0f, composer, (i3 & 14) | 100663296, 242);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
