package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SliderKt$SliderImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8393A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f8394B;
    public final /* synthetic */ SliderColors C;
    public final /* synthetic */ float D;
    public final /* synthetic */ MutableInteractionSource E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8395z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$2(boolean z2, float f2, List list, SliderColors sliderColors, float f3, MutableInteractionSource mutableInteractionSource, Modifier modifier, int i2) {
        super(2);
        this.f8395z = z2;
        this.f8393A = f2;
        this.f8394B = list;
        this.C = sliderColors;
        this.D = f3;
        this.E = mutableInteractionSource;
        this.F = modifier;
        this.G = i2;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.e(this.f8395z, this.f8393A, this.f8394B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
