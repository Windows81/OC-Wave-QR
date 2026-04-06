package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7399A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7400B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ BottomSheetState H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7401z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, float f2, Function0 function0, int i2, BottomSheetState bottomSheetState, int i3) {
        super(2);
        this.f7401z = function2;
        this.f7399A = function22;
        this.f7400B = function23;
        this.C = function24;
        this.D = function25;
        this.E = f2;
        this.F = function0;
        this.G = i2;
        this.H = bottomSheetState;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        BottomSheetScaffoldKt.c(this.f7401z, this.f7399A, this.f7400B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
