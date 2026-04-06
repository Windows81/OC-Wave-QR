package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class DelegatingNode extends Modifier.Node {
    public final int N = NodeKindKt.g(this);
    public Modifier.Node O;

    public void G2() {
        super.G2();
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.Y2(x2());
            if (!a3.F2()) {
                a3.G2();
            }
        }
    }

    public void H2() {
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.H2();
        }
        super.H2();
    }

    public void L2() {
        super.L2();
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.L2();
        }
    }

    public void M2() {
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.M2();
        }
        super.M2();
    }

    public void N2() {
        super.N2();
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.N2();
        }
    }

    public void P2(Modifier.Node node) {
        super.P2(node);
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.P2(node);
        }
    }

    public void Y2(NodeCoordinator nodeCoordinator) {
        super.Y2(nodeCoordinator);
        for (Modifier.Node a3 = a3(); a3 != null; a3 = a3.w2()) {
            a3.Y2(nodeCoordinator);
        }
    }

    public final DelegatableNode Z2(DelegatableNode delegatableNode) {
        Modifier.Node M = delegatableNode.M();
        Modifier.Node node = null;
        if (M != delegatableNode) {
            Modifier.Node node2 = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            if (node2 != null) {
                node = node2.C2();
            }
            if (M == M() && Intrinsics.d(node, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (M.F2()) {
            InlineClassHelperKt.c("Cannot delegate to an already attached node");
        }
        M.P2(M());
        int A2 = A2();
        int h2 = NodeKindKt.h(M);
        M.T2(h2);
        e3(h2, M);
        M.Q2(this.O);
        this.O = M;
        M.V2(this);
        d3(A2() | h2, false);
        if (F2()) {
            if ((h2 & NodeKind.a(2)) == 0 || (A2 & NodeKind.a(2)) != 0) {
                Y2(x2());
            } else {
                NodeChain u0 = DelegatableNodeKt.o(this).u0();
                M().Y2((NodeCoordinator) null);
                u0.C();
            }
            M.G2();
            M.M2();
            NodeKindKt.a(M);
        }
        return delegatableNode;
    }

    public final Modifier.Node a3() {
        return this.O;
    }

    public final int b3() {
        return this.N;
    }

    public final void c3(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.O; node2 != null; node2 = node2.w2()) {
            if (node2 == delegatableNode) {
                if (node2.F2()) {
                    NodeKindKt.d(node2);
                    node2.N2();
                    node2.H2();
                }
                node2.P2(node2);
                node2.O2(0);
                if (node == null) {
                    this.O = node2.w2();
                } else {
                    node.Q2(node2.w2());
                }
                node2.Q2((Modifier.Node) null);
                node2.V2((Modifier.Node) null);
                int A2 = A2();
                int h2 = NodeKindKt.h(this);
                d3(h2, true);
                if (F2() && (A2 & NodeKind.a(2)) != 0 && (NodeKind.a(2) & h2) == 0) {
                    NodeChain u0 = DelegatableNodeKt.o(this).u0();
                    M().Y2((NodeCoordinator) null);
                    u0.C();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5 = r1.w2();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d3(int r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.A2()
            r3.T2(r4)
            if (r0 == r4) goto L_0x0057
            boolean r0 = androidx.compose.ui.node.DelegatableNodeKt.g(r3)
            if (r0 == 0) goto L_0x0012
            r3.O2(r4)
        L_0x0012:
            boolean r0 = r3.F2()
            if (r0 == 0) goto L_0x0057
            androidx.compose.ui.Modifier$Node r0 = r3.M()
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x002e
            int r2 = r1.A2()
            r4 = r4 | r2
            r1.T2(r4)
            if (r1 == r0) goto L_0x002e
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x001d
        L_0x002e:
            if (r5 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x0039
            int r4 = androidx.compose.ui.node.NodeKindKt.h(r0)
            r0.T2(r4)
        L_0x0039:
            if (r1 == 0) goto L_0x0046
            androidx.compose.ui.Modifier$Node r5 = r1.w2()
            if (r5 == 0) goto L_0x0046
            int r5 = r5.v2()
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r4 = r4 | r5
        L_0x0048:
            if (r1 == 0) goto L_0x0057
            int r5 = r1.A2()
            r4 = r4 | r5
            r1.O2(r4)
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0048
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatingNode.d3(int, boolean):void");
    }

    public final void e3(int i2, Modifier.Node node) {
        int A2 = A2();
        if ((i2 & NodeKind.a(2)) != 0 && (NodeKind.a(2) & A2) != 0 && !(this instanceof LayoutModifierNode)) {
            InlineClassHelperKt.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
    }
}
