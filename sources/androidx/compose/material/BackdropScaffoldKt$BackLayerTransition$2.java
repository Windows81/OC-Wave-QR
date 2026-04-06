package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$BackLayerTransition$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7203A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7204B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackdropValue f7205z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackLayerTransition$2(BackdropValue backdropValue, Function2 function2, Function2 function22, int i2) {
        super(2);
        this.f7205z = backdropValue;
        this.f7203A = function2;
        this.f7204B = function22;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        BackdropScaffoldKt.a(this.f7205z, this.f7203A, this.f7204B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
