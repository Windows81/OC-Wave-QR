package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigationItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7334A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f7335B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Modifier D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ MutableInteractionSource H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RowScope f7336z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$2(RowScope rowScope, boolean z2, Function0 function0, Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, MutableInteractionSource mutableInteractionSource, long j2, long j3, int i2, int i3, int i4) {
        super(2);
        this.f7336z = rowScope;
        this.f7334A = z2;
        this.f7335B = function0;
        this.C = function2;
        this.D = modifier;
        this.E = z3;
        this.F = function22;
        this.G = z4;
        this.H = mutableInteractionSource;
        this.I = j2;
        this.J = j3;
        this.K = i2;
        this.L = i3;
        this.M = i4;
    }

    public final void b(Composer composer, int i2) {
        RowScope rowScope = this.f7336z;
        boolean z2 = this.f7334A;
        Function0 function0 = this.f7335B;
        Function2 function2 = this.C;
        Modifier modifier = this.D;
        boolean z3 = this.E;
        Function2 function22 = this.F;
        boolean z4 = this.G;
        MutableInteractionSource mutableInteractionSource = this.H;
        long j2 = this.I;
        long j3 = this.J;
        RowScope rowScope2 = rowScope;
        BottomNavigationKt.c(rowScope2, z2, function0, function2, modifier, z3, function22, z4, mutableInteractionSource, j2, j3, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L), this.M);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
