package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ModalBottomSheetKt$Scrim$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8007A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f8008B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8009z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$2(long j2, Function0 function0, boolean z2, int i2) {
        super(2);
        this.f8009z = j2;
        this.f8007A = function0;
        this.f8008B = z2;
        this.C = i2;
    }

    public final void b(Composer composer, int i2) {
        ModalBottomSheetKt.c(this.f8009z, this.f8007A, this.f8008B, composer, RecomposeScopeImplKt.a(this.C | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
