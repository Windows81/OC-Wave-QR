package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
final class SliderKt$Slider$2 implements Function3<SliderState, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f11106A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f11107B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11108z;

    public final void b(SliderState sliderState, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(308249025, i2, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:202)");
        }
        SliderDefaults.f11057a.q(this.f11108z, (Modifier) null, this.f11106A, this.f11107B, 0, composer, 196608, 18);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((SliderState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
