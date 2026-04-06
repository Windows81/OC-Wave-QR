package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TraversableNodeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r1 = r10.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.node.TraversableNode a(androidx.compose.ui.node.DelegatableNode r10, java.lang.Object r11) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r10 = androidx.compose.ui.node.DelegatableNodeKt.o(r10)
        L_0x0021:
            r2 = 0
            if (r10 == 0) goto L_0x00b0
            androidx.compose.ui.node.NodeChain r3 = r10.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x009b
        L_0x0033:
            if (r1 == 0) goto L_0x009b
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0096
            r3 = r1
            r4 = r2
        L_0x003e:
            if (r3 == 0) goto L_0x0096
            boolean r5 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r5 == 0) goto L_0x0051
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r5 = r3.i0()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r11, r5)
            if (r5 == 0) goto L_0x0091
            return r3
        L_0x0051:
            int r5 = r3.A2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0091
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L_0x0091
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.a3()
            r6 = 0
            r7 = r6
        L_0x0065:
            r8 = 1
            if (r5 == 0) goto L_0x008e
            int r9 = r5.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0089
            int r7 = r7 + 1
            if (r7 != r8) goto L_0x0075
            r3 = r5
            goto L_0x0089
        L_0x0075:
            if (r4 != 0) goto L_0x0080
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r4.<init>(r8, r6)
        L_0x0080:
            if (r3 == 0) goto L_0x0086
            r4.d(r3)
            r3 = r2
        L_0x0086:
            r4.d(r5)
        L_0x0089:
            androidx.compose.ui.Modifier$Node r5 = r5.w2()
            goto L_0x0065
        L_0x008e:
            if (r7 != r8) goto L_0x0091
            goto L_0x003e
        L_0x0091:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r4)
            goto L_0x003e
        L_0x0096:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0033
        L_0x009b:
            androidx.compose.ui.node.LayoutNode r10 = r10.C0()
            if (r10 == 0) goto L_0x00ad
            androidx.compose.ui.node.NodeChain r1 = r10.u0()
            if (r1 == 0) goto L_0x00ad
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00ad:
            r1 = r2
            goto L_0x0021
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.a(androidx.compose.ui.node.DelegatableNode, java.lang.Object):androidx.compose.ui.node.TraversableNode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r1 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.node.TraversableNode b(androidx.compose.ui.node.TraversableNode r11) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x0021:
            r3 = 0
            if (r2 == 0) goto L_0x00ba
            androidx.compose.ui.node.NodeChain r4 = r2.u0()
            androidx.compose.ui.Modifier$Node r4 = r4.k()
            int r4 = r4.v2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00a5
        L_0x0033:
            if (r1 == 0) goto L_0x00a5
            int r4 = r1.A2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00a0
            r4 = r1
            r5 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x00a0
            boolean r6 = r4 instanceof androidx.compose.ui.node.TraversableNode
            if (r6 == 0) goto L_0x005b
            androidx.compose.ui.node.TraversableNode r4 = (androidx.compose.ui.node.TraversableNode) r4
            java.lang.Object r6 = r11.i0()
            java.lang.Object r7 = r4.i0()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x009b
            boolean r6 = androidx.compose.ui.Actual_jvmKt.a(r11, r4)
            if (r6 == 0) goto L_0x009b
            return r4
        L_0x005b:
            int r6 = r4.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x009b
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x009b
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r7 = 0
            r8 = r7
        L_0x006f:
            r9 = 1
            if (r6 == 0) goto L_0x0098
            int r10 = r6.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0093
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x007f
            r4 = r6
            goto L_0x0093
        L_0x007f:
            if (r5 != 0) goto L_0x008a
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r7)
        L_0x008a:
            if (r4 == 0) goto L_0x0090
            r5.d(r4)
            r4 = r3
        L_0x0090:
            r5.d(r6)
        L_0x0093:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x006f
        L_0x0098:
            if (r8 != r9) goto L_0x009b
            goto L_0x003e
        L_0x009b:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x003e
        L_0x00a0:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0033
        L_0x00a5:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x00b7
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00b7:
            r1 = r3
            goto L_0x0021
        L_0x00ba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.b(androidx.compose.ui.node.TraversableNode):androidx.compose.ui.node.TraversableNode");
    }

    public static final void c(DelegatableNode delegatableNode, Object obj, Function1 function1) {
        NodeChain u0;
        int a2 = NodeKind.a(262144);
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("visitAncestors called on an unattached node");
        }
        Modifier.Node C2 = delegatableNode.M().C2();
        LayoutNode o2 = DelegatableNodeKt.o(delegatableNode);
        while (o2 != null) {
            if ((o2.u0().k().v2() & a2) != 0) {
                while (C2 != null) {
                    if ((C2.A2() & a2) != 0) {
                        Modifier.Node node = C2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            boolean z2 = true;
                            if (node instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node;
                                if (Intrinsics.d(obj, traversableNode.i0())) {
                                    z2 = ((Boolean) function1.invoke(traversableNode)).booleanValue();
                                }
                                if (!z2) {
                                    return;
                                }
                            } else {
                                if (((node.A2() & a2) != 0) && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                        if ((a3.A2() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = a3;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector.d(node);
                                                    node = null;
                                                }
                                                mutableVector.d(a3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector);
                        }
                        continue;
                    }
                    C2 = C2.C2();
                }
            }
            o2 = o2.C0();
            C2 = (o2 == null || (u0 = o2.u0()) == null) ? null : u0.o();
        }
    }

    public static final void d(TraversableNode traversableNode, Function1 function1) {
        NodeChain u0;
        int a2 = NodeKind.a(262144);
        if (!traversableNode.M().F2()) {
            InlineClassHelperKt.c("visitAncestors called on an unattached node");
        }
        Modifier.Node C2 = traversableNode.M().C2();
        LayoutNode o2 = DelegatableNodeKt.o(traversableNode);
        while (o2 != null) {
            if ((o2.u0().k().v2() & a2) != 0) {
                while (C2 != null) {
                    if ((C2.A2() & a2) != 0) {
                        Modifier.Node node = C2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            boolean z2 = true;
                            if (node instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) node;
                                if (Intrinsics.d(traversableNode.i0(), traversableNode2.i0()) && Actual_jvmKt.a(traversableNode, traversableNode2)) {
                                    z2 = ((Boolean) function1.invoke(traversableNode2)).booleanValue();
                                }
                                if (!z2) {
                                    return;
                                }
                            } else {
                                if (((node.A2() & a2) != 0) && (node instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                        if ((a3.A2() & a2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = a3;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector.d(node);
                                                    node = null;
                                                }
                                                mutableVector.d(a3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector);
                        }
                        continue;
                    }
                    C2 = C2.C2();
                }
            }
            o2 = o2.C0();
            C2 = (o2 == null || (u0 = o2.u0()) == null) ? null : u0.o();
        }
    }

    public static final void e(DelegatableNode delegatableNode, Object obj, Function1 function1) {
        int a2 = NodeKind.a(262144);
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = delegatableNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, delegatableNode.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) != 0) {
                Modifier.Node node2 = node;
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.A2() & a2) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) node3;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = Intrinsics.d(obj, traversableNode.i0()) ? (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsAction != TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } else if ((node3.A2() & a2) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node3).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.d(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.h(mutableVector2);
                        }
                        continue;
                    }
                    node2 = node2.w2();
                }
            }
            DelegatableNodeKt.c(mutableVector, node, false);
        }
    }

    public static final void f(TraversableNode traversableNode, Function1 function1) {
        int a2 = NodeKind.a(262144);
        if (!traversableNode.M().F2()) {
            InlineClassHelperKt.c("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = traversableNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, traversableNode.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) != 0) {
                Modifier.Node node2 = node;
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.A2() & a2) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof TraversableNode) {
                                TraversableNode traversableNode2 = (TraversableNode) node3;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = (!Intrinsics.d(traversableNode.i0(), traversableNode2.i0()) || !Actual_jvmKt.a(traversableNode, traversableNode2)) ? TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal : (TraversableNode.Companion.TraverseDescendantsAction) function1.invoke(traversableNode2);
                                if (traverseDescendantsAction != TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } else if ((node3.A2() & a2) != 0 && (node3 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node3).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.d(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.h(mutableVector2);
                        }
                        continue;
                    }
                    node2 = node2.w2();
                }
            }
            DelegatableNodeKt.c(mutableVector, node, false);
        }
    }
}
