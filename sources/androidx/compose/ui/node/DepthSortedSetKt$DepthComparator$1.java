package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DepthSortedSetKt$DepthComparator$1 implements Comparator<LayoutNode> {
    /* renamed from: a */
    public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int k2 = Intrinsics.k(layoutNode.Q(), layoutNode2.Q());
        return k2 != 0 ? k2 : Intrinsics.k(layoutNode.hashCode(), layoutNode2.hashCode());
    }
}
