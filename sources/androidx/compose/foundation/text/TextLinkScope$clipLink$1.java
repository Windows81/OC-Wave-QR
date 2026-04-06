package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextLinkScope$clipLink$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f6002A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6003z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextLinkScope$clipLink$1(TextLinkScope textLinkScope, AnnotatedString.Range range) {
        super(1);
        this.f6003z = textLinkScope;
        this.f6002A = range;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        Shape h2 = this.f6003z.s(this.f6002A);
        if (h2 != null) {
            graphicsLayerScope.s1(h2);
            graphicsLayerScope.R(true);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
