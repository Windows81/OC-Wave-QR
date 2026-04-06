package androidx.compose.foundation;

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
public final class ImageKt$Image$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f3083A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f3084B;
    public final /* synthetic */ Alignment C;
    public final /* synthetic */ ContentScale D;
    public final /* synthetic */ float E;
    public final /* synthetic */ ColorFilter F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f3085z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$2(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, int i3) {
        super(2);
        this.f3085z = painter;
        this.f3083A = str;
        this.f3084B = modifier;
        this.C = alignment;
        this.D = contentScale;
        this.E = f2;
        this.F = colorFilter;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        ImageKt.a(this.f3085z, this.f3083A, this.f3084B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
