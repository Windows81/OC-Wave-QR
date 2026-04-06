package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlertDialogKt$AlertDialogContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7060A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7061B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7062z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$2(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j2, long j3, int i2, int i3) {
        super(2);
        this.f7062z = function2;
        this.f7060A = modifier;
        this.f7061B = function22;
        this.C = function23;
        this.D = shape;
        this.E = j2;
        this.F = j3;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AlertDialogKt.b(this.f7062z, this.f7060A, this.f7061B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
