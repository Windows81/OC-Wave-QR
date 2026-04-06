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
public final class ChipKt$FilterChip$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7503A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7504B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ MutableInteractionSource D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ BorderStroke F;
    public final /* synthetic */ SelectableChipColors G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function3 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7505z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$3(boolean z2, Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2 function2, Function2 function22, Function2 function23, Function3 function3, int i2, int i3, int i4) {
        super(2);
        this.f7505z = z2;
        this.f7503A = function0;
        this.f7504B = modifier;
        this.C = z3;
        this.D = mutableInteractionSource;
        this.E = shape;
        this.F = borderStroke;
        this.G = selectableChipColors;
        this.H = function2;
        this.I = function22;
        this.J = function23;
        this.K = function3;
        this.L = i2;
        this.M = i3;
        this.N = i4;
    }

    public final void b(Composer composer, int i2) {
        ChipKt.c(this.f7505z, this.f7503A, this.f7504B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, RecomposeScopeImplKt.a(this.L | 1), RecomposeScopeImplKt.a(this.M), this.N);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
