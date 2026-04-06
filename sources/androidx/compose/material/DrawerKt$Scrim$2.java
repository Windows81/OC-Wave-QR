package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawerKt$Scrim$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7770A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f7771B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7772z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$2(boolean z2, Function0 function0, Function0 function02, long j2, int i2) {
        super(2);
        this.f7772z = z2;
        this.f7770A = function0;
        this.f7771B = function02;
        this.C = j2;
        this.D = i2;
    }

    public final void b(Composer composer, int i2) {
        DrawerKt.f(this.f7772z, this.f7770A, this.f7771B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
