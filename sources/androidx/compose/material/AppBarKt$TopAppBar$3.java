package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AppBarKt$TopAppBar$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7172A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7173B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7174z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$3(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, long j2, long j3, float f2, int i2, int i3) {
        super(2);
        this.f7174z = function2;
        this.f7172A = modifier;
        this.f7173B = function22;
        this.C = function3;
        this.D = j2;
        this.E = j3;
        this.F = f2;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AppBarKt.g(this.f7174z, this.f7172A, this.f7173B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
