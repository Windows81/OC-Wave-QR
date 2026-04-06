package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MaterialThemeKt$MaterialTheme$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Typography f7941A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shapes f7942B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Colors f7943z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$2(Colors colors, Typography typography, Shapes shapes, Function2 function2, int i2, int i3) {
        super(2);
        this.f7943z = colors;
        this.f7941A = typography;
        this.f7942B = shapes;
        this.C = function2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        MaterialThemeKt.a(this.f7943z, this.f7941A, this.f7942B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
