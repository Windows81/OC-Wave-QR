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
public final class DrawerKt$ModalDrawer$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7765A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DrawerState f7766B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ float E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f7767z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$2(Function3 function3, Modifier modifier, DrawerState drawerState, boolean z2, Shape shape, float f2, long j2, long j3, long j4, Function2 function2, int i2, int i3) {
        super(2);
        this.f7767z = function3;
        this.f7765A = modifier;
        this.f7766B = drawerState;
        this.C = z2;
        this.D = shape;
        this.E = f2;
        this.F = j2;
        this.G = j3;
        this.H = j4;
        this.I = function2;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        DrawerKt.e(this.f7767z, this.f7765A, this.f7766B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
