package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$BackLayerTransition$1$5$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f7201A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7202z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackLayerTransition$1$5$1(float f2, State state) {
        super(1);
        this.f7202z = f2;
        this.f7201A = state;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        float f2 = (float) 1;
        float j2 = f2 - BackdropScaffoldKt.b(this.f7201A);
        if (j2 < 0.0f) {
            j2 = 0.0f;
        }
        if (j2 > 1.0f) {
            j2 = 1.0f;
        }
        graphicsLayerScope.d(j2);
        graphicsLayerScope.h((f2 - j2) * this.f7202z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
