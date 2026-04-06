package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$BottomDrawerScrim$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7735A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f7736B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f7737z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$2(long j2, Function0 function0, boolean z2, int i2) {
        super(2);
        this.f7737z = j2;
        this.f7735A = function0;
        this.f7736B = z2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        DrawerKt.b(this.f7737z, this.f7735A, this.f7736B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
