package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class OneDimensionalFocusSearchKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15840a;

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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
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
                f15840a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Function1 function1) {
        FocusStateImpl i3 = focusTargetNode.A0();
        int[] iArr = WhenMappings.f15840a;
        int i2 = iArr[i3.ordinal()];
        if (i2 == 1) {
            FocusTargetNode f2 = FocusTraversalKt.f(focusTargetNode);
            if (f2 != null) {
                int i4 = iArr[f2.A0().ordinal()];
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return d(focusTargetNode, f2, FocusDirection.f15729b.f(), function1);
                    }
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                } else if (!b(f2, function1) && !d(focusTargetNode, f2, FocusDirection.f15729b.f(), function1) && (!f2.g3().t() || !((Boolean) function1.invoke(f2)).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i2 == 2 || i2 == 3) {
            return g(focusTargetNode, function1);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (!g(focusTargetNode, function1)) {
                if (!(focusTargetNode.g3().t() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(FocusTargetNode focusTargetNode, Function1 function1) {
        int i2 = WhenMappings.f15840a[focusTargetNode.A0().ordinal()];
        if (i2 == 1) {
            FocusTargetNode f2 = FocusTraversalKt.f(focusTargetNode);
            if (f2 != null) {
                return c(f2, function1) || d(focusTargetNode, f2, FocusDirection.f15729b.e(), function1);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        } else if (i2 == 2 || i2 == 3) {
            return h(focusTargetNode, function1);
        } else {
            if (i2 == 4) {
                return focusTargetNode.g3().t() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : h(focusTargetNode, function1);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, Function1 function1) {
        if (i(focusTargetNode, focusTargetNode2, i2, function1)) {
            return true;
        }
        FocusTransactionManager c2 = FocusTargetNodeKt.c(focusTargetNode);
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i2, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(c2.h(), c2, DelegatableNodeKt.p(focusTargetNode).getFocusOwner().t(), focusTargetNode, focusTargetNode2, i2, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        r1 = r10.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r1 = r10.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r10 = androidx.compose.ui.node.DelegatableNodeKt.o(r10)
        L_0x0021:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x00a4
            androidx.compose.ui.node.NodeChain r5 = r10.u0()
            androidx.compose.ui.Modifier$Node r5 = r5.k()
            int r5 = r5.v2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0090
        L_0x0035:
            if (r1 == 0) goto L_0x0090
            int r5 = r1.A2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x008b
            r5 = r1
            r6 = r4
        L_0x0040:
            if (r5 == 0) goto L_0x008b
            boolean r7 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L_0x0048
            r4 = r5
            goto L_0x00a4
        L_0x0048:
            int r7 = r5.A2()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x0086
            boolean r7 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L_0x0086
            r7 = r5
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.a3()
            r8 = r2
        L_0x005b:
            if (r7 == 0) goto L_0x0083
            int r9 = r7.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x007e
            int r8 = r8 + 1
            if (r8 != r3) goto L_0x006a
            r5 = r7
            goto L_0x007e
        L_0x006a:
            if (r6 != 0) goto L_0x0075
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r6.<init>(r9, r2)
        L_0x0075:
            if (r5 == 0) goto L_0x007b
            r6.d(r5)
            r5 = r4
        L_0x007b:
            r6.d(r7)
        L_0x007e:
            androidx.compose.ui.Modifier$Node r7 = r7.w2()
            goto L_0x005b
        L_0x0083:
            if (r8 != r3) goto L_0x0086
            goto L_0x0040
        L_0x0086:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.h(r6)
            goto L_0x0040
        L_0x008b:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0035
        L_0x0090:
            androidx.compose.ui.node.LayoutNode r10 = r10.C0()
            if (r10 == 0) goto L_0x00a1
            androidx.compose.ui.node.NodeChain r1 = r10.u0()
            if (r1 == 0) goto L_0x00a1
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00a1:
            r1 = r4
            goto L_0x0021
        L_0x00a4:
            if (r4 != 0) goto L_0x00a7
            r2 = r3
        L_0x00a7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.e(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i2, Function1 function1) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.e())) {
            return c(focusTargetNode, function1);
        }
        if (FocusDirection.l(i2, companion.f())) {
            return b(focusTargetNode, function1);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    public static final boolean g(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusTargetNode.M(), false);
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
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.d((FocusTargetNode) node);
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        mutableVector.E(FocusableChildrenComparator.f15838z);
        int p2 = mutableVector.p() - 1;
        Object[] objArr = mutableVector.f15005z;
        if (p2 < objArr.length) {
            while (p2 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[p2];
                if (FocusTraversalKt.g(focusTargetNode2) && b(focusTargetNode2, function1)) {
                    return true;
                }
                p2--;
            }
        }
        return false;
    }

    public static final boolean h(FocusTargetNode focusTargetNode, Function1 function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusTargetNode.M(), false);
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
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.d((FocusTargetNode) node);
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.d(node);
                                                node = null;
                                            }
                                            mutableVector3.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        mutableVector.E(FocusableChildrenComparator.f15838z);
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i3 = 0; i3 < p2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.g(focusTargetNode2) && c(focusTargetNode2, function1)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, Function1 function1) {
        if (focusTargetNode.A0() == FocusStateImpl.ActiveParent) {
            MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int a2 = NodeKind.a(1024);
            if (!focusTargetNode.M().F2()) {
                InlineClassHelperKt.c("visitChildren called on an unattached node");
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node w2 = focusTargetNode.M().w2();
            if (w2 == null) {
                DelegatableNodeKt.c(mutableVector2, focusTargetNode.M(), false);
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
                            break;
                        } else if ((node.A2() & a2) != 0) {
                            MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    mutableVector.d((FocusTargetNode) node);
                                } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                        if ((a3.A2() & a2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node = a3;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    mutableVector3.d(node);
                                                    node = null;
                                                }
                                                mutableVector3.d(a3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                node = DelegatableNodeKt.h(mutableVector3);
                            }
                        } else {
                            node = node.w2();
                        }
                    }
                }
            }
            mutableVector.E(FocusableChildrenComparator.f15838z);
            FocusDirection.Companion companion = FocusDirection.f15729b;
            if (FocusDirection.l(i2, companion.e())) {
                IntRange v2 = RangesKt.v(0, mutableVector.p());
                int n2 = v2.n();
                int o2 = v2.o();
                if (n2 <= o2) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.f15005z[n2];
                            if (FocusTraversalKt.g(focusTargetNode3) && c(focusTargetNode3, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.d(mutableVector.f15005z[n2], focusTargetNode2)) {
                            z2 = true;
                        }
                        if (n2 == o2) {
                            break;
                        }
                        n2++;
                    }
                }
            } else if (FocusDirection.l(i2, companion.f())) {
                IntRange v3 = RangesKt.v(0, mutableVector.p());
                int n3 = v3.n();
                int o3 = v3.o();
                if (n3 <= o3) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.f15005z[o3];
                            if (FocusTraversalKt.g(focusTargetNode4) && b(focusTargetNode4, function1)) {
                                return true;
                            }
                        }
                        if (Intrinsics.d(mutableVector.f15005z[o3], focusTargetNode2)) {
                            z3 = true;
                        }
                        if (o3 == n3) {
                            break;
                        }
                        o3--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            if (FocusDirection.l(i2, FocusDirection.f15729b.e()) || !focusTargetNode.g3().t() || e(focusTargetNode)) {
                return false;
            }
            return ((Boolean) function1.invoke(focusTargetNode)).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
