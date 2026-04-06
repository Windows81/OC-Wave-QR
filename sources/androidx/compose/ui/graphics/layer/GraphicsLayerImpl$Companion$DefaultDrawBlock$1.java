package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class GraphicsLayerImpl$Companion$DefaultDrawBlock$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final GraphicsLayerImpl$Companion$DefaultDrawBlock$1 f16346z = new GraphicsLayerImpl$Companion$DefaultDrawBlock$1();

    public GraphicsLayerImpl$Companion$DefaultDrawBlock$1() {
        super(1);
    }

    public final void b(DrawScope drawScope) {
        DrawScope.A1(drawScope, Color.f15975b.e(), 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
