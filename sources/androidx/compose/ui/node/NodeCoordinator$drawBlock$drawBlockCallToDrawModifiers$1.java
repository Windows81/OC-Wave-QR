package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f17396z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.f17396z = nodeCoordinator;
    }

    public final void invoke() {
        NodeCoordinator nodeCoordinator = this.f17396z;
        Canvas d2 = nodeCoordinator.g0;
        Intrinsics.f(d2);
        nodeCoordinator.E2(d2, this.f17396z.f0);
    }
}
