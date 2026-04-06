package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f9030A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f9031z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2(PullRefreshState pullRefreshState, boolean z2) {
        super(1);
        this.f9031z = pullRefreshState;
        this.f9030A = z2;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.h(this.f9031z.i() - Size.g(graphicsLayerScope.c()));
        if (this.f9030A && !this.f9031z.k()) {
            float a2 = EasingKt.f().a(this.f9031z.i() / this.f9031z.l());
            if (a2 < 0.0f) {
                a2 = 0.0f;
            }
            if (a2 > 1.0f) {
                a2 = 1.0f;
            }
            graphicsLayerScope.j(a2);
            graphicsLayerScope.i(a2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
