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
public final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7388A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f7389B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Shape H;
    public final /* synthetic */ float I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;
    public final /* synthetic */ float L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ Function3 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f7390z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(Function3 function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, Function3 function32, Function2 function22, int i2, boolean z2, Shape shape, float f2, long j2, long j3, float f3, long j4, long j5, Function3 function33, int i3, int i4, int i5) {
        super(2);
        this.f7390z = function3;
        this.f7388A = modifier;
        this.f7389B = bottomSheetScaffoldState;
        this.C = function2;
        this.D = function32;
        this.E = function22;
        this.F = i2;
        this.G = z2;
        this.H = shape;
        this.I = f2;
        this.J = j2;
        this.K = j3;
        this.L = f3;
        this.M = j4;
        this.N = j5;
        this.O = function33;
        this.P = i3;
        this.Q = i4;
        this.R = i5;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        Function3 function3 = this.f7390z;
        Function3 function32 = function3;
        BottomSheetScaffoldKt.b(function32, this.f7388A, this.f7389B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, composer2, RecomposeScopeImplKt.a(this.P | 1), RecomposeScopeImplKt.a(this.Q), this.R);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
