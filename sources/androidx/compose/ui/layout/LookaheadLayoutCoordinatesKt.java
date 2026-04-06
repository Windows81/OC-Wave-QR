package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate a(LookaheadDelegate lookaheadDelegate) {
        LayoutNode X1 = lookaheadDelegate.X1();
        while (true) {
            LayoutNode C0 = X1.C0();
            LayoutNode layoutNode = null;
            if ((C0 != null ? C0.l0() : null) != null) {
                LayoutNode C02 = X1.C0();
                if (C02 != null) {
                    layoutNode = C02.l0();
                }
                Intrinsics.f(layoutNode);
                if (layoutNode.Y0()) {
                    X1 = X1.C0();
                    Intrinsics.f(X1);
                } else {
                    LayoutNode C03 = X1.C0();
                    Intrinsics.f(C03);
                    X1 = C03.l0();
                    Intrinsics.f(X1);
                }
            } else {
                LookaheadDelegate Q2 = X1.y0().Q2();
                Intrinsics.f(Q2);
                return Q2;
            }
        }
    }
}
