package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarKt$NewLineButtonSnackbar$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8467A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f8468B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f8469z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$NewLineButtonSnackbar$2(Function2 function2, Function2 function22, int i2) {
        super(2);
        this.f8469z = function2;
        this.f8467A = function22;
        this.f8468B = i2;
    }

    public final void b(Composer composer, int i2) {
        SnackbarKt.a(this.f8469z, this.f8467A, composer, RecomposeScopeImplKt.a(this.f8468B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
