package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKt$TextFieldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f8835A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8836B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ float G;
    public final /* synthetic */ PaddingValues H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f8837z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextFieldLayout$2(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, boolean z2, float f2, PaddingValues paddingValues, int i2) {
        super(2);
        this.f8837z = modifier;
        this.f8835A = function2;
        this.f8836B = function22;
        this.C = function3;
        this.D = function23;
        this.E = function24;
        this.F = z2;
        this.G = f2;
        this.H = paddingValues;
        this.I = i2;
    }

    public final void b(Composer composer, int i2) {
        TextFieldKt.f(this.f8837z, this.f8835A, this.f8836B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
