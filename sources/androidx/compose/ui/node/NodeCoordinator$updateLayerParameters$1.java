package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$updateLayerParameters$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f17404z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$updateLayerParameters$1(Function1 function1) {
        super(0);
        this.f17404z = function1;
    }

    public final void invoke() {
        this.f17404z.invoke(NodeCoordinator.p0);
        NodeCoordinator.p0.W();
    }
}
