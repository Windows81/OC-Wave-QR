package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f7824A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7825z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2(Function0 function0, int i2) {
        super(2);
        this.f7825z = function0;
        this.f7824A = i2;
    }

    public final void b(Composer composer, int i2) {
        ExposedDropdownMenu_android.a(this.f7825z, composer, RecomposeScopeImplKt.a(this.f7824A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
