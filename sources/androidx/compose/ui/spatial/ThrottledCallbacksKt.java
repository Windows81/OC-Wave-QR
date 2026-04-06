package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ThrottledCallbacksKt {
    public static final RelativeLayoutBounds a(DelegatableNode delegatableNode, long j2, long j3, long j4, long j5, float[] fArr) {
        DelegatableNode delegatableNode2 = delegatableNode;
        NodeCoordinator j6 = DelegatableNodeKt.j(delegatableNode, NodeKind.a(2));
        LayoutNode o2 = DelegatableNodeKt.o(delegatableNode);
        if (!o2.u()) {
            return null;
        }
        if (o2.y0() == j6) {
            return new RelativeLayoutBounds(j2, j3, j4, j5, fArr, delegatableNode, (DefaultConstructorMarker) null);
        }
        long f2 = IntOffset.f(j2);
        long e2 = Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.k(f2))) << 32) | (((long) Float.floatToRawIntBits((float) IntOffset.l(f2))) & 4294967295L));
        long a2 = j6.e1().a();
        long d2 = IntOffsetKt.d(o2.y0().e1().N(j6, e2));
        return new RelativeLayoutBounds(d2, IntOffset.f((((long) (IntOffset.k(d2) + ((int) (a2 >> 32)))) << 32) | (((long) (IntOffset.l(d2) + ((int) (a2 & 4294967295L)))) & 4294967295L)), j4, j5, fArr, delegatableNode, (DefaultConstructorMarker) null);
    }
}
