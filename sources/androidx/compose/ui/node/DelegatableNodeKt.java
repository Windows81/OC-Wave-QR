package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DelegatableNodeKt {
    public static final void c(MutableVector mutableVector, Modifier.Node node, boolean z2) {
        MutableVector e2 = e(o(node), z2);
        int p2 = e2.p() - 1;
        Object[] objArr = e2.f15005z;
        if (p2 < objArr.length) {
            while (p2 >= 0) {
                mutableVector.d(((LayoutNode) objArr[p2]).u0().k());
                p2--;
            }
        }
    }

    public static final LayoutModifierNode d(Modifier.Node node) {
        if ((NodeKind.a(2) & node.A2()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = (!(a3 instanceof DelegatingNode) || (NodeKind.a(2) & a3.A2()) == 0) ? a3.w2() : ((DelegatingNode) a3).a3()) {
                    if (a3 instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) a3;
                    }
                }
            }
        }
        return null;
    }

    public static final MutableVector e(LayoutNode layoutNode, boolean z2) {
        return z2 ? layoutNode.I0() : layoutNode.J0();
    }

    public static final boolean f(DelegatableNode delegatableNode, int i2) {
        return (delegatableNode.M().v2() & i2) != 0;
    }

    public static final boolean g(DelegatableNode delegatableNode) {
        return delegatableNode.M() == delegatableNode;
    }

    public static final Modifier.Node h(MutableVector mutableVector) {
        if (mutableVector == null || mutableVector.p() == 0) {
            return null;
        }
        return (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
    }

    public static final void i(DelegatableNode delegatableNode) {
        o(delegatableNode).z1();
    }

    public static final NodeCoordinator j(DelegatableNode delegatableNode, int i2) {
        NodeCoordinator x2 = delegatableNode.M().x2();
        Intrinsics.f(x2);
        if (x2.U2() != delegatableNode || !NodeKindKt.i(i2)) {
            return x2;
        }
        NodeCoordinator V2 = x2.V2();
        Intrinsics.f(V2);
        return V2;
    }

    public static final Density k(DelegatableNode delegatableNode) {
        return o(delegatableNode).P();
    }

    public static final GraphicsContext l(DelegatableNode delegatableNode) {
        return p(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates m(DelegatableNode delegatableNode) {
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates e1 = j(delegatableNode, NodeKind.a(2)).e1();
        if (!e1.b()) {
            InlineClassHelperKt.c("LayoutCoordinates is not attached.");
        }
        return e1;
    }

    public static final LayoutDirection n(DelegatableNode delegatableNode) {
        return o(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode o(DelegatableNode delegatableNode) {
        NodeCoordinator x2 = delegatableNode.M().x2();
        if (x2 != null) {
            return x2.X1();
        }
        InlineClassHelperKt.d("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final Owner p(DelegatableNode delegatableNode) {
        Owner B0 = o(delegatableNode).B0();
        if (B0 != null) {
            return B0;
        }
        InlineClassHelperKt.d("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final SemanticsInfo q(DelegatableNode delegatableNode) {
        return o(delegatableNode);
    }
}
