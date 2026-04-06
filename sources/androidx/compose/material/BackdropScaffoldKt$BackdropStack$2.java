package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$BackdropStack$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7249A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f7250B;
    public final /* synthetic */ Function4 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7251z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$2(Modifier modifier, Function2 function2, Function1 function1, Function4 function4, int i2) {
        super(2);
        this.f7251z = modifier;
        this.f7249A = function2;
        this.f7250B = function1;
        this.C = function4;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        BackdropScaffoldKt.e(this.f7251z, this.f7249A, this.f7250B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
