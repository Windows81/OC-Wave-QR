package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements Function1<NodeCoordinator, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 f17393z = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public final void b(NodeCoordinator nodeCoordinator) {
        if (nodeCoordinator.v0() && NodeCoordinator.S3(nodeCoordinator, false, 1, (Object) null)) {
            LayoutNode X1 = nodeCoordinator.X1();
            LayoutNodeLayoutDelegate f0 = X1.f0();
            if (f0.d() > 0) {
                if (f0.f() || f0.g()) {
                    LayoutNode.F1(X1, false, 1, (Object) null);
                }
                f0.w().h2();
            }
            Owner b2 = LayoutNodeKt.b(X1);
            b2.getRectManager().k(X1);
            b2.n(X1);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NodeCoordinator) obj);
        return Unit.f40552a;
    }
}
