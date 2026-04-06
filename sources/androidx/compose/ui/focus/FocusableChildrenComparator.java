package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    /* renamed from: z  reason: collision with root package name */
    public static final FocusableChildrenComparator f15838z = new FocusableChildrenComparator();

    /* renamed from: a */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i2 = 0;
        if (FocusTraversalKt.g(focusTargetNode) && FocusTraversalKt.g(focusTargetNode2)) {
            LayoutNode o2 = DelegatableNodeKt.o(focusTargetNode);
            LayoutNode o3 = DelegatableNodeKt.o(focusTargetNode2);
            if (Intrinsics.d(o2, o3)) {
                return 0;
            }
            MutableVector b2 = b(o2);
            MutableVector b3 = b(o3);
            int min = Math.min(b2.p() - 1, b3.p() - 1);
            if (min >= 0) {
                while (Intrinsics.d(b2.f15005z[i2], b3.f15005z[i2])) {
                    if (i2 != min) {
                        i2++;
                    }
                }
                return Intrinsics.k(((LayoutNode) b2.f15005z[i2]).D0(), ((LayoutNode) b3.f15005z[i2]).D0());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        } else if (FocusTraversalKt.g(focusTargetNode)) {
            return -1;
        } else {
            return FocusTraversalKt.g(focusTargetNode2) ? 1 : 0;
        }
    }

    public final MutableVector b(LayoutNode layoutNode) {
        MutableVector mutableVector = new MutableVector(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.a(0, layoutNode);
            layoutNode = layoutNode.C0();
        }
        return mutableVector;
    }
}
