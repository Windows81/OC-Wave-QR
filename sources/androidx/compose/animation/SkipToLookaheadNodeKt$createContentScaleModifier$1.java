package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SkipToLookaheadNodeKt$createContentScaleModifier$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f2403z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadNodeKt$createContentScaleModifier$1(Function0 function0) {
        super(1);
        this.f2403z = function0;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.R(((Boolean) this.f2403z.invoke()).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
