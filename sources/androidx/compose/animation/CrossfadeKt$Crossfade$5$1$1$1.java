package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CrossfadeKt$Crossfade$5$1$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f2203z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1$1$1(State state) {
        super(1);
        this.f2203z = state;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.d(CrossfadeKt$Crossfade$5$1.e(this.f2203z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
