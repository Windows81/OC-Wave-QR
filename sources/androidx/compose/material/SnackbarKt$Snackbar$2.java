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
public final class SnackbarKt$Snackbar$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8487A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8488B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8489z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$2(Modifier modifier, Function2 function2, boolean z2, Shape shape, long j2, long j3, float f2, Function2 function22, int i2, int i3) {
        super(2);
        this.f8489z = modifier;
        this.f8487A = function2;
        this.f8488B = z2;
        this.C = shape;
        this.D = j2;
        this.E = j3;
        this.F = f2;
        this.G = function22;
        this.H = i2;
        this.I = i3;
    }

    public final void b(Composer composer, int i2) {
        SnackbarKt.c(this.f8489z, this.f8487A, this.f8488B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1), this.I);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
