package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$NavigationRailItemBaselineLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8068A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f8069B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8070z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemBaselineLayout$3(Function2 function2, Function2 function22, float f2, int i2) {
        super(2);
        this.f8070z = function2;
        this.f8068A = function22;
        this.f8069B = f2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        NavigationRailKt.d(this.f8070z, this.f8068A, this.f8069B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
