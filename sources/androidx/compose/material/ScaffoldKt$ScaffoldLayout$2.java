package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScaffoldKt$ScaffoldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8285A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8286B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ WindowInsets F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f8287z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$2(boolean z2, int i2, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i3) {
        super(2);
        this.f8287z = z2;
        this.f8285A = i2;
        this.f8286B = function2;
        this.C = function3;
        this.D = function22;
        this.E = function23;
        this.F = windowInsets;
        this.G = function24;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        ScaffoldKt.c(this.f8287z, this.f8285A, this.f8286B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
