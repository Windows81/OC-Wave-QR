package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ListItemKt$ListItem$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7919A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7920B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f7921z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$1(Modifier modifier, Function2 function2, Function2 function22, boolean z2, Function2 function23, Function2 function24, Function2 function25, int i2, int i3) {
        super(2);
        this.f7921z = modifier;
        this.f7919A = function2;
        this.f7920B = function22;
        this.C = z2;
        this.D = function23;
        this.E = function24;
        this.F = function25;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        ListItemKt.b(this.f7921z, this.f7919A, this.f7920B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
