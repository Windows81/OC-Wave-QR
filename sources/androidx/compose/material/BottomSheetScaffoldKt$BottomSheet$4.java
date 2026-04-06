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
public final class BottomSheetScaffoldKt$BottomSheet$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f7374A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shape f7375B;
    public final /* synthetic */ float C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Modifier G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BottomSheetState f7376z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$4(BottomSheetState bottomSheetState, boolean z2, Shape shape, float f2, long j2, long j3, float f3, Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f7376z = bottomSheetState;
        this.f7374A = z2;
        this.f7375B = shape;
        this.C = f2;
        this.D = j2;
        this.E = j3;
        this.F = f3;
        this.G = modifier;
        this.H = function3;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        BottomSheetScaffoldKt.a(this.f7376z, this.f7374A, this.f7375B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
