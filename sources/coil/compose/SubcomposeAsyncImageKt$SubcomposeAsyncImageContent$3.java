package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f23330A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Painter f23331B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Alignment D;
    public final /* synthetic */ ContentScale E;
    public final /* synthetic */ float F;
    public final /* synthetic */ ColorFilter G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SubcomposeAsyncImageScope f23332z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$3(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2, int i2, int i3) {
        super(2);
        this.f23332z = subcomposeAsyncImageScope;
        this.f23330A = modifier;
        this.f23331B = painter;
        this.C = str;
        this.D = alignment;
        this.E = contentScale;
        this.F = f2;
        this.G = colorFilter;
        this.H = z2;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        SubcomposeAsyncImageKt.c(this.f23332z, this.f23330A, this.f23331B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
