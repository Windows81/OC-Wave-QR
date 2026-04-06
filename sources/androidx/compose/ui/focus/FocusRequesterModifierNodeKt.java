package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

@Metadata
public final class FocusRequesterModifierNodeKt {
    public static final boolean a(FocusRequesterModifierNode focusRequesterModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusRequesterModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                if (FocusTransactionsKt.e((FocusTargetNode) M)) {
                    return true;
                }
            } else if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) M).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            M = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (M != null) {
                                mutableVector.d(M);
                                M = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusRequesterModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusRequesterModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                if (FocusTransactionsKt.e((FocusTargetNode) node)) {
                                    return true;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = a32;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a32);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                        continue;
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        return false;
    }

    public static final PinnableContainer.PinnedHandle b(FocusRequesterModifierNode focusRequesterModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusRequesterModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                PinnableContainer.PinnedHandle a3 = FocusRestorerKt.a((FocusTargetNode) M);
                if (a3 != null) {
                    return a3;
                }
            } else if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a32 = ((DelegatingNode) M).a3(); a32 != null; a32 = a32.w2()) {
                    if ((a32.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            M = a32;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (M != null) {
                                mutableVector.d(M);
                                M = null;
                            }
                            mutableVector.d(a32);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusRequesterModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusRequesterModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                PinnableContainer.PinnedHandle a4 = FocusRestorerKt.a((FocusTargetNode) node);
                                if (a4 != null) {
                                    return a4;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a33 = ((DelegatingNode) node).a3(); a33 != null; a33 = a33.w2()) {
                                    if ((a33.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = a33;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a33);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                        continue;
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        return null;
    }

    public static final boolean c(FocusRequesterModifierNode focusRequesterModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusRequesterModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) M;
                return focusTargetNode.g3().t() ? FocusTargetModifierNode.v1(focusTargetNode, 0, 1, (Object) null) : TwoDimensionalFocusSearchKt.k(focusTargetNode, FocusDirection.f15729b.b(), FocusRequesterModifierNodeKt$requestFocus$1$1.f15810z);
            }
            if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) M).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            M = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (M != null) {
                                mutableVector.d(M);
                                M = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusRequesterModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusRequesterModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                return focusTargetNode2.g3().t() ? FocusTargetModifierNode.v1(focusTargetNode2, 0, 1, (Object) null) : TwoDimensionalFocusSearchKt.k(focusTargetNode2, FocusDirection.f15729b.b(), FocusRequesterModifierNodeKt$requestFocus$1$1.f15810z);
                            }
                            if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = a32;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a32);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                        continue;
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        return false;
    }

    public static final boolean d(FocusRequesterModifierNode focusRequesterModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusRequesterModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                if (FocusRestorerKt.b((FocusTargetNode) M)) {
                    return true;
                }
            } else if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) M).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            M = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (M != null) {
                                mutableVector.d(M);
                                M = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusRequesterModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusRequesterModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                if (FocusRestorerKt.b((FocusTargetNode) node)) {
                                    return true;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = a32;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a32);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                        continue;
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        return false;
    }

    public static final boolean e(FocusRequesterModifierNode focusRequesterModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusRequesterModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                if (FocusRestorerKt.c((FocusTargetNode) M)) {
                    return true;
                }
            } else if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) M).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            M = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (M != null) {
                                mutableVector.d(M);
                                M = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusRequesterModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusRequesterModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                if (FocusRestorerKt.c((FocusTargetNode) node)) {
                                    return true;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node = a32;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a32);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                        continue;
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        return false;
    }
}
