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
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AsyncImageKt$AsyncImage$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f23273A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f23274B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Alignment E;
    public final /* synthetic */ ContentScale F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ColorFilter H;
    public final /* synthetic */ int I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AsyncImageState f23275z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncImageKt$AsyncImage$1(AsyncImageState asyncImageState, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, boolean z2, int i3, int i4) {
        super(2);
        this.f23275z = asyncImageState;
        this.f23273A = str;
        this.f23274B = modifier;
        this.C = function1;
        this.D = function12;
        this.E = alignment;
        this.F = contentScale;
        this.G = f2;
        this.H = colorFilter;
        this.I = i2;
        this.J = z2;
        this.K = i3;
        this.L = i4;
    }

    public final void b(Composer composer, int i2) {
        AsyncImageKt.a(this.f23275z, this.f23273A, this.f23274B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, composer, RecomposeScopeImplKt.a(this.K | 1), RecomposeScopeImplKt.a(this.L));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
