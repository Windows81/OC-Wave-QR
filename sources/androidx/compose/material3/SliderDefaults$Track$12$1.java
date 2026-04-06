package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class SliderDefaults$Track$12$1 implements Function3<DrawScope, Offset, Color, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final SliderDefaults$Track$12$1 f11064z = new SliderDefaults$Track$12$1();

    public final void b(DrawScope drawScope, long j2, long j3) {
        SliderDefaults sliderDefaults = SliderDefaults.f11057a;
        sliderDefaults.O(drawScope, j2, sliderDefaults.T(), j3);
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((DrawScope) obj, ((Offset) obj2).t(), ((Color) obj3).v());
        return Unit.f40552a;
    }
}
