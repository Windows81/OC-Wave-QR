package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SliderKt$Track$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SliderColors f8403A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8404B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ List E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8405z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$2(Modifier modifier, SliderColors sliderColors, boolean z2, float f2, float f3, List list, float f4, float f5, int i2) {
        super(2);
        this.f8405z = modifier;
        this.f8403A = sliderColors;
        this.f8404B = z2;
        this.C = f2;
        this.D = f3;
        this.E = list;
        this.F = f4;
        this.G = f5;
        this.H = i2;
    }

    public final void b(Composer composer, int i2) {
        SliderKt.g(this.f8405z, this.f8403A, this.f8404B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
