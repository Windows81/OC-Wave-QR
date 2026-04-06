package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f7838A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7839B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7840z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6(boolean z2, Function1 function1, Modifier modifier, Function3 function3, int i2, int i3) {
        super(2);
        this.f7840z = z2;
        this.f7838A = function1;
        this.f7839B = modifier;
        this.C = function3;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        ExposedDropdownMenu_androidKt.a(this.f7840z, this.f7838A, this.f7839B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
