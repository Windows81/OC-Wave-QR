package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

@Metadata
public final class FocusRestorerKt {
    public static final PinnableContainer.PinnedHandle a(FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode b2 = FocusTraversalKt.b(focusTargetNode);
        if (b2 == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.a(b2, PinnableContainerKt.a())) == null) {
            return null;
        }
        return pinnableContainer.a();
    }

    public static final boolean b(FocusTargetNode focusTargetNode) {
        SaveableStateRegistry saveableStateRegistry;
        Object e2;
        if (!(focusTargetNode.k3() != 0 || (saveableStateRegistry = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.a(focusTargetNode, SaveableStateRegistryKt.g())) == null || (e2 = saveableStateRegistry.e("previouslyFocusedChildHash")) == null)) {
            focusTargetNode.s3(((Integer) e2).intValue());
        }
        if (focusTargetNode.k3() == 0) {
            return false;
        }
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, focusTargetNode.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.F2() && DelegatableNodeKt.o(focusTargetNode2).N() == focusTargetNode.k3()) {
                                    return b(focusTargetNode2) || FocusTargetModifierNode.v1(focusTargetNode2, 0, 1, (Object) null);
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.d(node);
                                                node = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector2);
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

    public static final boolean c(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.A0().d()) {
            return false;
        }
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, focusTargetNode.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        continue;
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.A0().d()) {
                                    focusTargetNode.s3(DelegatableNodeKt.o(focusTargetNode2).N());
                                    SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) CompositionLocalConsumerModifierNodeKt.a(focusTargetNode, SaveableStateRegistryKt.g());
                                    if (saveableStateRegistry != null) {
                                        saveableStateRegistry.f("previouslyFocusedChildHash", new FocusRestorerKt$saveFocusedChild$1$1(focusTargetNode));
                                    }
                                    return true;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.d(node);
                                                node = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector2);
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
