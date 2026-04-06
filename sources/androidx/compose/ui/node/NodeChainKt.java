package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class NodeChainKt {

    /* renamed from: a  reason: collision with root package name */
    public static final NodeChainKt$SentinelHead$1 f17390a;

    static {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = new NodeChainKt$SentinelHead$1();
        nodeChainKt$SentinelHead$1.O2(-1);
        f17390a = nodeChainKt$SentinelHead$1;
    }

    public static final int d(Modifier.Element element, Modifier.Element element2) {
        if (Intrinsics.d(element, element2)) {
            return 2;
        }
        return Actual_jvmKt.a(element, element2) ? 1 : 0;
    }

    public static final MutableVector e(Modifier modifier, MutableVector mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[RangesKt.e(mutableVector.p(), 16)], 0);
        mutableVector2.d(modifier);
        NodeChainKt$fillVector$1 nodeChainKt$fillVector$1 = null;
        while (mutableVector2.p() != 0) {
            Modifier modifier2 = (Modifier) mutableVector2.y(mutableVector2.p() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.d(combinedModifier.a());
                mutableVector2.d(combinedModifier.b());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.d(modifier2);
            } else {
                if (nodeChainKt$fillVector$1 == null) {
                    nodeChainKt$fillVector$1 = new NodeChainKt$fillVector$1(mutableVector);
                }
                modifier2.P(nodeChainKt$fillVector$1);
                nodeChainKt$fillVector$1 = nodeChainKt$fillVector$1;
            }
        }
        return mutableVector;
    }

    public static final void f(ModifierNodeElement modifierNodeElement, Modifier.Node node) {
        Intrinsics.g(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.b(node);
    }
}
