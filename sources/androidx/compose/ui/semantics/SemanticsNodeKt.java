package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SemanticsNodeKt {
    public static final SemanticsNode a(LayoutNode layoutNode, boolean z2) {
        NodeChain u0 = layoutNode.u0();
        int a2 = NodeKind.a(8);
        Modifier.Node node = null;
        if ((u0.i() & a2) != 0) {
            Modifier.Node k2 = u0.k();
            loop0:
            while (true) {
                if (k2 != null) {
                    if ((k2.A2() & a2) != 0) {
                        Modifier.Node node2 = k2;
                        MutableVector mutableVector = null;
                        while (true) {
                            if (node2 == null) {
                                break;
                            } else if (node2 instanceof SemanticsModifierNode) {
                                node = node2;
                                break loop0;
                            } else {
                                if ((node2.A2() & a2) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node a3 = ((DelegatingNode) node2).a3(); a3 != null; a3 = a3.w2()) {
                                        if ((a3.A2() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = a3;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.d(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.d(a3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.h(mutableVector);
                            }
                        }
                    }
                    if ((k2.v2() & a2) == 0) {
                        break;
                    }
                    k2 = k2.w2();
                } else {
                    break;
                }
            }
        }
        Intrinsics.f(node);
        Modifier.Node M = ((SemanticsModifierNode) node).M();
        SemanticsConfiguration a0 = layoutNode.a0();
        if (a0 == null) {
            a0 = new SemanticsConfiguration();
        }
        return new SemanticsNode(M, z2, layoutNode, a0);
    }

    public static final int e(SemanticsNode semanticsNode) {
        return semanticsNode.o() + 2000000000;
    }

    public static final SemanticsModifierNode f(LayoutNode layoutNode) {
        NodeChain u0 = layoutNode.u0();
        int a2 = NodeKind.a(8);
        Modifier.Node node = null;
        if ((u0.i() & a2) != 0) {
            Modifier.Node k2 = u0.k();
            loop0:
            while (true) {
                if (k2 != null) {
                    if ((k2.A2() & a2) != 0) {
                        Modifier.Node node2 = k2;
                        MutableVector mutableVector = null;
                        while (true) {
                            if (node2 == null) {
                                break;
                            }
                            if (node2 instanceof SemanticsModifierNode) {
                                if (((SemanticsModifierNode) node2).i2()) {
                                    node = node2;
                                    break loop0;
                                }
                            } else if ((node2.A2() & a2) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node2).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = a3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.d(node2);
                                                node2 = null;
                                            }
                                            mutableVector.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.h(mutableVector);
                        }
                    }
                    if ((k2.v2() & a2) == 0) {
                        break;
                    }
                    k2 = k2.w2();
                } else {
                    break;
                }
            }
        }
        return (SemanticsModifierNode) node;
    }

    public static final Role g(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.a(semanticsNode.w(), SemanticsProperties.f18102a.C());
    }

    public static final int h(SemanticsNode semanticsNode) {
        return semanticsNode.o() + 1000000000;
    }
}
