package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ChipKt$Chip$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7490A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7491B;
    public final /* synthetic */ MutableInteractionSource C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ BorderStroke E;
    public final /* synthetic */ ChipColors F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7492z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2 function2, Function3 function3, int i2, int i3) {
        super(2);
        this.f7492z = function0;
        this.f7490A = modifier;
        this.f7491B = z2;
        this.C = mutableInteractionSource;
        this.D = shape;
        this.E = borderStroke;
        this.F = chipColors;
        this.G = function2;
        this.H = function3;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        ChipKt.a(this.f7492z, this.f7490A, this.f7491B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
