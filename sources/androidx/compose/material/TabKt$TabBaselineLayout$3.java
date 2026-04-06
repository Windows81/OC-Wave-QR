package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$TabBaselineLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8673A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8674B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8675z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$3(Function2 function2, Function2 function22, int i2) {
        super(2);
        this.f8675z = function2;
        this.f8673A = function22;
        this.f8674B = i2;
    }

    public final void b(Composer composer, int i2) {
        TabKt.d(this.f8675z, this.f8673A, composer, RecomposeScopeImplKt.a(this.f8674B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
