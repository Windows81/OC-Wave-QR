package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MultiParagraph$getPathForRange$2 extends Lambda implements Function1<ParagraphInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f18298A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f18299B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Path f18300z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiParagraph$getPathForRange$2(Path path, int i2, int i3) {
        super(1);
        this.f18300z = path;
        this.f18298A = i2;
        this.f18299B = i3;
    }

    public final void b(ParagraphInfo paragraphInfo) {
        Path.p(this.f18300z, paragraphInfo.j(paragraphInfo.e().F(paragraphInfo.r(this.f18298A), paragraphInfo.r(this.f18299B))), 0, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ParagraphInfo) obj);
        return Unit.f40552a;
    }
}
