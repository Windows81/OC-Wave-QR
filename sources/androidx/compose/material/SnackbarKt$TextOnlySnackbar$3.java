package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarKt$TextOnlySnackbar$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f8502A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8503z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$TextOnlySnackbar$3(Function2 function2, int i2) {
        super(2);
        this.f8503z = function2;
        this.f8502A = i2;
    }

    public final void b(Composer composer, int i2) {
        SnackbarKt.e(this.f8503z, composer, RecomposeScopeImplKt.a(this.f8502A | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
