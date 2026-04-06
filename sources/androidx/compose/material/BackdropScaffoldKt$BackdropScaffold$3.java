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
public final class BackdropScaffoldKt$BackdropScaffold$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7233A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7234B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ BackdropScaffoldState D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ long K;
    public final /* synthetic */ long L;
    public final /* synthetic */ Shape M;
    public final /* synthetic */ float N;
    public final /* synthetic */ long O;
    public final /* synthetic */ long P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7235z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$3(Function2 function2, Function2 function22, Function2 function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, Function3 function3, boolean z2, float f2, float f3, boolean z3, boolean z4, long j2, long j3, Shape shape, float f4, long j4, long j5, long j6, int i2, int i3, int i4) {
        super(2);
        this.f7235z = function2;
        this.f7233A = function22;
        this.f7234B = function23;
        this.C = modifier;
        this.D = backdropScaffoldState;
        this.E = function3;
        this.F = z2;
        this.G = f2;
        this.H = f3;
        this.I = z3;
        this.J = z4;
        this.K = j2;
        this.L = j3;
        this.M = shape;
        this.N = f4;
        this.O = j4;
        this.P = j5;
        this.Q = j6;
        this.R = i2;
        this.S = i3;
        this.T = i4;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Function2 function2 = this.f7235z;
        Function2 function22 = function2;
        BackdropScaffoldKt.c(function22, this.f7233A, this.f7234B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, composer2, RecomposeScopeImplKt.a(this.R | 1), RecomposeScopeImplKt.a(this.S), this.T);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
