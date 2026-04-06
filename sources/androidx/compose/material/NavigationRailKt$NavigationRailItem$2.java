package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$NavigationRailItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8062A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8063B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ MutableInteractionSource G;
    public final /* synthetic */ long H;
    public final /* synthetic */ long I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8064z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$2(boolean z2, Function0 function0, Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3) {
        super(2);
        this.f8064z = z2;
        this.f8062A = function0;
        this.f8063B = function2;
        this.C = modifier;
        this.D = z3;
        this.E = function22;
        this.F = z4;
        this.G = mutableInteractionSource;
        this.H = j2;
        this.I = j3;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        NavigationRailKt.c(this.f8064z, this.f8062A, this.f8063B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
