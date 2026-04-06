package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class OneLine$ListItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f8094A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8095B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OneLine f8096z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneLine$ListItem$2(OneLine oneLine, Modifier modifier, Function2 function2, Function2 function22, Function2 function23, int i2, int i3) {
        super(2);
        this.f8096z = oneLine;
        this.f8094A = modifier;
        this.f8095B = function2;
        this.C = function22;
        this.D = function23;
        this.E = i2;
        this.F = i3;
    }

    public final void b(Composer composer, int i2) {
        this.f8096z.a(this.f8094A, this.f8095B, this.C, this.D, composer, RecomposeScopeImplKt.a(this.E | 1), this.F);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
