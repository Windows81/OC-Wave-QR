package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SliderKt$SliderThumb$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8397A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8398B;
    public final /* synthetic */ MutableInteractionSource C;
    public final /* synthetic */ SliderColors D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BoxScope f8399z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(BoxScope boxScope, Modifier modifier, float f2, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2, float f3, int i2) {
        super(2);
        this.f8399z = boxScope;
        this.f8397A = modifier;
        this.f8398B = f2;
        this.C = mutableInteractionSource;
        this.D = sliderColors;
        this.E = z2;
        this.F = f3;
        this.G = i2;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.f(this.f8399z, this.f8397A, this.f8398B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
