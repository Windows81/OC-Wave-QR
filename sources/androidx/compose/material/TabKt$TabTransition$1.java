package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$TabTransition$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f8676A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8677B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8678z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$TabTransition$1(long j2, long j3, boolean z2, Function2 function2, int i2) {
        super(2);
        this.f8678z = j2;
        this.f8676A = j3;
        this.f8677B = z2;
        this.C = function2;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        TabKt.e(this.f8678z, this.f8676A, this.f8677B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
