package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.Metadata;

@Metadata
public final class NodeKindKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableObjectIntMap f17406a = ObjectIntMapKt.b();

    public static final void a(Modifier.Node node) {
        if (!node.F2()) {
            InlineClassHelperKt.c("autoInvalidateInsertedNode called on unattached node");
        }
        b(node, -1, 1);
    }

    public static final void b(Modifier.Node node, int i2, int i3) {
        if (node instanceof DelegatingNode) {
            DelegatingNode delegatingNode = (DelegatingNode) node;
            c(node, delegatingNode.b3() & i2, i3);
            int i4 = (~delegatingNode.b3()) & i2;
            for (Modifier.Node a3 = delegatingNode.a3(); a3 != null; a3 = a3.w2()) {
                b(a3, i4, i3);
            }
            return;
        }
        c(node, i2 & node.A2(), i3);
    }

    public static final void c(Modifier.Node node, int i2, int i3) {
        if (i3 != 0 || node.D2()) {
            if ((NodeKind.a(2) & i2) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.b((LayoutModifierNode) node);
                if (i3 == 2) {
                    DelegatableNodeKt.j(node, NodeKind.a(2)).s3();
                }
            }
            if (!((NodeKind.a(128) & i2) == 0 || !(node instanceof LayoutAwareModifierNode) || i3 == 2)) {
                DelegatableNodeKt.o(node).R0();
            }
            if (!((NodeKind.a(256) & i2) == 0 || !(node instanceof GlobalPositionAwareModifierNode) || i3 == 2)) {
                DelegatableNodeKt.o(node).S0();
            }
            if ((NodeKind.a(4) & i2) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.a((DrawModifierNode) node);
            }
            if ((NodeKind.a(8) & i2) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.o(node).Z1(true);
            }
            if ((NodeKind.a(64) & i2) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.a((ParentDataModifierNode) node);
            }
            if ((NodeKind.a(2048) & i2) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (k(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.f15479g) {
                        j(focusPropertiesModifierNode);
                    } else if (i3 == 2) {
                        j(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.a(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i2 & NodeKind.a(4096)) != 0 && (node instanceof FocusEventModifierNode)) {
                FocusEventModifierNodeKt.b((FocusEventModifierNode) node);
            }
        }
    }

    public static final void d(Modifier.Node node) {
        if (!node.F2()) {
            InlineClassHelperKt.c("autoInvalidateRemovedNode called on unattached node");
        }
        b(node, -1, 2);
    }

    public static final void e(Modifier.Node node) {
        if (!node.F2()) {
            InlineClassHelperKt.c("autoInvalidateUpdatedNode called on unattached node");
        }
        b(node, -1, 0);
    }

    public static final int f(Modifier.Element element) {
        int a2 = NodeKind.a(1);
        if (element instanceof LayoutModifier) {
            a2 |= NodeKind.a(2);
        }
        if (element instanceof DrawModifier) {
            a2 |= NodeKind.a(4);
        }
        if (element instanceof SemanticsModifier) {
            a2 |= NodeKind.a(8);
        }
        if (element instanceof PointerInputModifier) {
            a2 |= NodeKind.a(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            a2 |= NodeKind.a(32);
        }
        if (element instanceof FocusEventModifier) {
            a2 |= NodeKind.a(4096);
        }
        if (element instanceof FocusOrderModifier) {
            a2 |= NodeKind.a(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            a2 |= NodeKind.a(256);
        }
        if (element instanceof ParentDataModifier) {
            a2 |= NodeKind.a(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            a2 |= NodeKind.a(128);
        }
        return element instanceof BringIntoViewModifierNode ? a2 | NodeKind.a(524288) : a2;
    }

    public static final int g(Modifier.Node node) {
        if (node.A2() != 0) {
            return node.A2();
        }
        MutableObjectIntMap mutableObjectIntMap = f17406a;
        Object b2 = Actual_jvmKt.b(node);
        int b3 = mutableObjectIntMap.b(b2);
        if (b3 >= 0) {
            return mutableObjectIntMap.f1933c[b3];
        }
        int a2 = NodeKind.a(1);
        if (node instanceof LayoutModifierNode) {
            a2 |= NodeKind.a(2);
        }
        if (node instanceof DrawModifierNode) {
            a2 |= NodeKind.a(4);
        }
        if (node instanceof SemanticsModifierNode) {
            a2 |= NodeKind.a(8);
        }
        if (node instanceof PointerInputModifierNode) {
            a2 |= NodeKind.a(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            a2 |= NodeKind.a(32);
        }
        if (node instanceof ParentDataModifierNode) {
            a2 |= NodeKind.a(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            a2 |= NodeKind.a(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            a2 |= NodeKind.a(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            a2 |= NodeKind.a(512);
        }
        if (node instanceof FocusTargetNode) {
            a2 |= NodeKind.a(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            a2 |= NodeKind.a(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            a2 |= NodeKind.a(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            a2 |= NodeKind.a(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            a2 |= NodeKind.a(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            a2 |= NodeKind.a(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            a2 |= NodeKind.a(131072);
        }
        if (node instanceof TraversableNode) {
            a2 |= NodeKind.a(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            a2 |= NodeKind.a(524288);
        }
        int a3 = node instanceof OnUnplacedModifierNode ? NodeKind.a(1048576) | a2 : a2;
        mutableObjectIntMap.u(b2, a3);
        return a3;
    }

    public static final int h(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return g(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int b3 = delegatingNode.b3();
        for (Modifier.Node a3 = delegatingNode.a3(); a3 != null; a3 = a3.w2()) {
            b3 |= h(a3);
        }
        return b3;
    }

    public static final boolean i(int i2) {
        return (i2 & NodeKind.a(128)) != 0;
    }

    public static final void j(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int a2 = NodeKind.a(1024);
        if (!focusPropertiesModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusPropertiesModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, focusPropertiesModifierNode.M(), false);
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
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNodeKt.b((FocusTargetNode) node);
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
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
    }

    public static final boolean k(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.f17219a;
        canFocusChecker.b();
        focusPropertiesModifierNode.E0(canFocusChecker);
        return canFocusChecker.a();
    }
}
