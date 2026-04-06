package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;

@Metadata
public final class FocusEventModifierNodeKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15740a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15740a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FocusState a(FocusEventModifierNode focusEventModifierNode) {
        int a2 = NodeKind.a(1024);
        Modifier.Node M = focusEventModifierNode.M();
        MutableVector mutableVector = null;
        while (M != null) {
            if (M instanceof FocusTargetNode) {
                FocusStateImpl i3 = ((FocusTargetNode) M).A0();
                int i2 = WhenMappings.f15740a[i3.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return i3;
                }
            } else if ((M.A2() & a2) != 0 && (M instanceof DelegatingNode)) {
                int i4 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) M).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i4++;
                        if (i4 == 1) {
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
                if (i4 == 1) {
                }
            }
            M = DelegatableNodeKt.h(mutableVector);
        }
        if (!focusEventModifierNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusEventModifierNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusEventModifierNode.M(), false);
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
                                FocusStateImpl i32 = ((FocusTargetNode) node).A0();
                                int i5 = WhenMappings.f15740a[i32.ordinal()];
                                if (i5 == 1 || i5 == 2 || i5 == 3) {
                                    return i32;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i6 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i6++;
                                        if (i6 == 1) {
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
                                if (i6 == 1) {
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
        return FocusStateImpl.Inactive;
    }

    public static final void b(FocusEventModifierNode focusEventModifierNode) {
        DelegatableNodeKt.p(focusEventModifierNode).getFocusOwner().a(focusEventModifierNode);
    }
}
