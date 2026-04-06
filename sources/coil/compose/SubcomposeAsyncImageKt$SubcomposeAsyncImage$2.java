package coil.compose;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SubcomposeAsyncImageKt$SubcomposeAsyncImage$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f23322A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f23323B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Alignment D;
    public final /* synthetic */ ContentScale E;
    public final /* synthetic */ float F;
    public final /* synthetic */ ColorFilter G;
    public final /* synthetic */ boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SizeResolver f23324z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeAsyncImageKt$SubcomposeAsyncImage$2(SizeResolver sizeResolver, Function3 function3, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2) {
        super(3);
        this.f23324z = sizeResolver;
        this.f23322A = function3;
        this.f23323B = asyncImagePainter;
        this.C = str;
        this.D = alignment;
        this.E = contentScale;
        this.F = f2;
        this.G = colorFilter;
        this.H = z2;
    }

    public final void b(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        if ((i2 & 14) == 0) {
            i2 |= composer.W(boxWithConstraintsScope) ? 4 : 2;
        }
        if ((i2 & 91) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(748478484, i2, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:274)");
            }
            ((ConstraintsSizeResolver) this.f23324z).l(boxWithConstraintsScope.d());
            this.f23322A.d(new RealSubcomposeAsyncImageScope(boxWithConstraintsScope, this.f23323B, this.C, this.D, this.E, this.F, this.G, this.H), composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
