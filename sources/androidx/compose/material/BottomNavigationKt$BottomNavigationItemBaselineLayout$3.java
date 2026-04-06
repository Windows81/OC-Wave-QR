package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigationItemBaselineLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7340A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7341B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7342z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItemBaselineLayout$3(Function2 function2, Function2 function22, float f2, int i2) {
        super(2);
        this.f7342z = function2;
        this.f7340A = function22;
        this.f7341B = f2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        BottomNavigationKt.d(this.f7342z, this.f7340A, this.f7341B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
