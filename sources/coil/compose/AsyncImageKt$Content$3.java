package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AsyncImageKt$Content$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AsyncImagePainter f23278A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f23279B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ ContentScale D;
    public final /* synthetic */ float E;
    public final /* synthetic */ ColorFilter F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f23280z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncImageKt$Content$3(Modifier modifier, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, boolean z2, int i2) {
        super(2);
        this.f23280z = modifier;
        this.f23278A = asyncImagePainter;
        this.f23279B = str;
        this.C = alignment;
        this.D = contentScale;
        this.E = f2;
        this.F = colorFilter;
        this.G = z2;
        this.H = i2;
    }

    public final void b(Composer composer, int i2) {
        AsyncImageKt.c(this.f23280z, this.f23278A, this.f23279B, this.C, this.D, this.E, this.F, this.G, composer, RecomposeScopeImplKt.a(this.H | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
