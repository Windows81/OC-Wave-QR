package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f7955A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ State f7956B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f7957z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState mutableState, State state, State state2) {
        super(1);
        this.f7957z = mutableState;
        this.f7955A = state;
        this.f7956B = state2;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.j(MenuKt.b(this.f7955A));
        graphicsLayerScope.i(MenuKt.b(this.f7955A));
        graphicsLayerScope.d(MenuKt.c(this.f7956B));
        graphicsLayerScope.Q1(((TransformOrigin) this.f7957z.getValue()).j());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
