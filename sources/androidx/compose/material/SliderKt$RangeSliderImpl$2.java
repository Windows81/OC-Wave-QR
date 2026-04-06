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
public final class SliderKt$RangeSliderImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f8378A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8379B;
    public final /* synthetic */ List C;
    public final /* synthetic */ SliderColors D;
    public final /* synthetic */ float E;
    public final /* synthetic */ MutableInteractionSource F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ Modifier H;
    public final /* synthetic */ Modifier I;
    public final /* synthetic */ Modifier J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8380z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2(boolean z2, float f2, float f3, List list, SliderColors sliderColors, float f4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i2, int i3) {
        super(2);
        this.f8380z = z2;
        this.f8378A = f2;
        this.f8379B = f3;
        this.C = list;
        this.D = sliderColors;
        this.E = f4;
        this.F = mutableInteractionSource;
        this.G = mutableInteractionSource2;
        this.H = modifier;
        this.I = modifier2;
        this.J = modifier3;
        this.K = i2;
        this.L = i3;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.c(this.f8380z, this.f8378A, this.f8379B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
