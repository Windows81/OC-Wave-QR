package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$invalidateParentLayer$1 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f17397z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invalidateParentLayer$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.f17397z = nodeCoordinator;
    }

    public final void invoke() {
        NodeCoordinator W2 = this.f17397z.W2();
        if (W2 != null) {
            W2.f3();
        }
    }
}
