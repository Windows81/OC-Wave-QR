package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScaffoldKt$Scaffold$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ScaffoldState f8262A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8263B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ Shape J;
    public final /* synthetic */ float K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ long O;
    public final /* synthetic */ long P;
    public final /* synthetic */ Function3 Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8264z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$3(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i2, boolean z2, Function3 function32, boolean z3, Shape shape, float f2, long j2, long j3, long j4, long j5, long j6, Function3 function33, int i3, int i4, int i5) {
        super(2);
        this.f8264z = modifier;
        this.f8262A = scaffoldState;
        this.f8263B = function2;
        this.C = function22;
        this.D = function3;
        this.E = function23;
        this.F = i2;
        this.G = z2;
        this.H = function32;
        this.I = z3;
        this.J = shape;
        this.K = f2;
        this.L = j2;
        this.M = j3;
        this.N = j4;
        this.O = j5;
        this.P = j6;
        this.Q = function33;
        this.R = i3;
        this.S = i4;
        this.T = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Modifier modifier = this.f8264z;
        Modifier modifier2 = modifier;
        ScaffoldKt.a(modifier2, this.f8262A, this.f8263B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, composer2, RecomposeScopeImplKt.a(this.R | 1), RecomposeScopeImplKt.a(this.S), this.T);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
