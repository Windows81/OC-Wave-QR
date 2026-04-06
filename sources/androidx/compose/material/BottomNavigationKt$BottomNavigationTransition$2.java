package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BottomNavigationKt$BottomNavigationTransition$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f7345A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7346B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7347z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationTransition$2(long j2, long j3, boolean z2, Function3 function3, int i2) {
        super(2);
        this.f7347z = j2;
        this.f7345A = j3;
        this.f7346B = z2;
        this.C = function3;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        BottomNavigationKt.e(this.f7347z, this.f7345A, this.f7346B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
