package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwipeToDismissKt$SwipeToDismiss$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8552A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Set f8553B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DismissState f8554z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$3(DismissState dismissState, Modifier modifier, Set set, Function1 function1, Function3 function3, Function3 function32, int i2, int i3) {
        super(2);
        this.f8554z = dismissState;
        this.f8552A = modifier;
        this.f8553B = set;
        this.C = function1;
        this.D = function3;
        this.E = function32;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        SwipeToDismissKt.a(this.f8554z, this.f8552A, this.f8553B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
