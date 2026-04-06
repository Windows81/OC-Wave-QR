package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavigationRailKt$NavigationRailTransition$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f8073A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8074B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8075z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailTransition$2(long j2, long j3, boolean z2, Function3 function3, int i2) {
        super(2);
        this.f8075z = j2;
        this.f8073A = j3;
        this.f8074B = z2;
        this.C = function3;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        NavigationRailKt.e(this.f8075z, this.f8073A, this.f8074B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
