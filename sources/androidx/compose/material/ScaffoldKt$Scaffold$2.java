package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
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
public final class ScaffoldKt$Scaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8259A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ScaffoldState f8260B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Shape K;
    public final /* synthetic */ float L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ long O;
    public final /* synthetic */ long P;
    public final /* synthetic */ long Q;
    public final /* synthetic */ Function3 R;
    public final /* synthetic */ int S;
    public final /* synthetic */ int T;
    public final /* synthetic */ int U;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WindowInsets f8261z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$2(WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i2, boolean z2, Function3 function32, boolean z3, Shape shape, float f2, long j2, long j3, long j4, long j5, long j6, Function3 function33, int i3, int i4, int i5) {
        super(2);
        this.f8261z = windowInsets;
        this.f8259A = modifier;
        this.f8260B = scaffoldState;
        this.C = function2;
        this.D = function22;
        this.E = function3;
        this.F = function23;
        this.G = i2;
        this.H = z2;
        this.I = function32;
        this.J = z3;
        this.K = shape;
        this.L = f2;
        this.M = j2;
        this.N = j3;
        this.O = j4;
        this.P = j5;
        this.Q = j6;
        this.R = function33;
        this.S = i3;
        this.T = i4;
        this.U = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        WindowInsets windowInsets = this.f8261z;
        WindowInsets windowInsets2 = windowInsets;
        ScaffoldKt.b(windowInsets2, this.f8259A, this.f8260B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, composer2, RecomposeScopeImplKt.a(this.S | 1), RecomposeScopeImplKt.a(this.T), this.U);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
