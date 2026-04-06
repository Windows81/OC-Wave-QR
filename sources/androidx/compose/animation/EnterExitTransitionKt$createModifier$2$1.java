package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class EnterExitTransitionKt$createModifier$2$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f2239A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f2240z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(boolean z2, Function0 function0) {
        super(1);
        this.f2240z = z2;
        this.f2239A = function0;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.R(!this.f2240z && ((Boolean) this.f2239A.invoke()).booleanValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
