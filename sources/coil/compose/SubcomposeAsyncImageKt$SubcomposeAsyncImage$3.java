package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeAsyncImageKt$SubcomposeAsyncImage$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f23325A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f23326B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Alignment E;
    public final /* synthetic */ ContentScale F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ColorFilter H;
    public final /* synthetic */ int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Function3 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncImageState f23327z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeAsyncImageKt$SubcomposeAsyncImage$3(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, Function3 function3, int i3, int i4, int i5) {
        super(2);
        this.f23327z = asyncImageState;
        this.f23325A = str;
        this.f23326B = modifier;
        this.C = function1;
        this.D = function12;
        this.E = alignment;
        this.F = contentScale;
        this.G = f2;
        this.H = colorFilter;
        this.I = i2;
        this.J = z2;
        this.K = function3;
        this.L = i3;
        this.M = i4;
        this.N = i5;
    }

    public final void b(Composer composer, int i2) {
        SubcomposeAsyncImageKt.a(this.f23327z, this.f23325A, this.f23326B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, composer, RecomposeScopeImplKt.a(this.L | 1), RecomposeScopeImplKt.a(this.M), this.N);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
