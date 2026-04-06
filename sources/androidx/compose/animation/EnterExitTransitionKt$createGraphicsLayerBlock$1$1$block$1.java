package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f2225A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ State f2226B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f2227z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(State state, State state2, State state3) {
        super(1);
        this.f2227z = state;
        this.f2225A = state2;
        this.f2226B = state3;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        State state = this.f2227z;
        float f2 = 1.0f;
        graphicsLayerScope.d(state != null ? ((Number) state.getValue()).floatValue() : 1.0f);
        State state2 = this.f2225A;
        graphicsLayerScope.j(state2 != null ? ((Number) state2.getValue()).floatValue() : 1.0f);
        State state3 = this.f2225A;
        if (state3 != null) {
            f2 = ((Number) state3.getValue()).floatValue();
        }
        graphicsLayerScope.i(f2);
        State state4 = this.f2226B;
        graphicsLayerScope.Q1(state4 != null ? ((TransformOrigin) state4.getValue()).j() : TransformOrigin.f16150b.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
