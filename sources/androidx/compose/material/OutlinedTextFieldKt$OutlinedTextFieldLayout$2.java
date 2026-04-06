package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
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
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8144A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f8145B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ PaddingValues J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8146z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, boolean z2, float f2, Function1 function1, Function2 function25, PaddingValues paddingValues, int i2, int i3) {
        super(2);
        this.f8146z = modifier;
        this.f8144A = function2;
        this.f8145B = function3;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = z2;
        this.G = f2;
        this.H = function1;
        this.I = function25;
        this.J = paddingValues;
        this.K = i2;
        this.L = i3;
    }

    public final void b(Composer composer, int i2) {
        OutlinedTextFieldKt.f(this.f8146z, this.f8144A, this.f8145B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
