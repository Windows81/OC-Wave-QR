package androidx.compose.ui.node;

import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

@Metadata
public final class BackwardsCompatNode$initializeModifier$3 implements Owner.OnLayoutCompletedListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f17210z;

    public BackwardsCompatNode$initializeModifier$3(BackwardsCompatNode backwardsCompatNode) {
        this.f17210z = backwardsCompatNode;
    }

    public void c() {
        if (this.f17210z.R == null) {
            BackwardsCompatNode backwardsCompatNode = this.f17210z;
            backwardsCompatNode.u(DelegatableNodeKt.j(backwardsCompatNode, NodeKind.a(128)));
        }
    }
}
