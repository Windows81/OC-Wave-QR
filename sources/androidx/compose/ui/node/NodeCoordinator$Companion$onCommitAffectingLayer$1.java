package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends Lambda implements Function1<NodeCoordinator, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 f17392z = new NodeCoordinator$Companion$onCommitAffectingLayer$1();

    public NodeCoordinator$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    public final void b(NodeCoordinator nodeCoordinator) {
        OwnedLayer P2 = nodeCoordinator.P2();
        if (P2 != null) {
            P2.invalidate();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((NodeCoordinator) obj);
        return Unit.f40552a;
    }
}
