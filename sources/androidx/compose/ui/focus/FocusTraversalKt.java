package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FocusTraversalKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15831a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15832b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f15831a = r0
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r3 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f15832b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FocusRequester a(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        FocusProperties g3 = focusTargetNode.g3();
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.e())) {
            return g3.f();
        }
        if (FocusDirection.l(i2, companion.f())) {
            return g3.u();
        }
        if (FocusDirection.l(i2, companion.h())) {
            return g3.w();
        }
        if (FocusDirection.l(i2, companion.a())) {
            return g3.A();
        }
        boolean z2 = true;
        if (FocusDirection.l(i2, companion.d())) {
            int i3 = WhenMappings.f15831a[layoutDirection.ordinal()];
            if (i3 == 1) {
                focusRequester2 = g3.e();
            } else if (i3 == 2) {
                focusRequester2 = g3.y();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (focusRequester2 == FocusRequester.f15802b.b()) {
                focusRequester2 = null;
            }
            return focusRequester2 == null ? g3.o() : focusRequester2;
        } else if (FocusDirection.l(i2, companion.g())) {
            int i4 = WhenMappings.f15831a[layoutDirection.ordinal()];
            if (i4 == 1) {
                focusRequester = g3.y();
            } else if (i4 == 2) {
                focusRequester = g3.e();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (focusRequester == FocusRequester.f15802b.b()) {
                focusRequester = null;
            }
            return focusRequester == null ? g3.s() : focusRequester;
        } else {
            if (!FocusDirection.l(i2, companion.b())) {
                z2 = FocusDirection.l(i2, companion.c());
            }
            if (z2) {
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, (DefaultConstructorMarker) null);
                FocusTransactionManager a2 = FocusTargetNodeKt.a(focusTargetNode);
                int i5 = 0;
                int h2 = a2 != null ? a2.h() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.p(focusTargetNode).getFocusOwner();
                FocusTargetNode t2 = focusOwner.t();
                if (FocusDirection.l(i2, companion.b())) {
                    g3.v().invoke(cancelIndicatingFocusBoundaryScope);
                } else {
                    g3.x().invoke(cancelIndicatingFocusBoundaryScope);
                }
                if (a2 != null) {
                    i5 = a2.h();
                }
                return cancelIndicatingFocusBoundaryScope.c() ? FocusRequester.f15802b.a() : (h2 != i5 || (ComposeUiFlags.f15479g && t2 != focusOwner.t())) ? FocusRequester.f15802b.c() : FocusRequester.f15802b.b();
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.f15479g) {
            FocusTargetNode t2 = DelegatableNodeKt.p(focusTargetNode).getFocusOwner().t();
            if (t2 == null || !t2.F2()) {
                return null;
            }
            return t2;
        }
        int i2 = WhenMappings.f15832b[focusTargetNode.A0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
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
                                        FocusTargetNode b2 = b((FocusTargetNode) node);
                                        if (b2 != null) {
                                            return b2;
                                        }
                                    } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                            if ((a3.A2() & a2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
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
                return null;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r1 = r10.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode r10) {
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
            if (r10 == 0) goto L_0x00b0
            androidx.compose.ui.node.NodeChain r3 = r10.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x009b
        L_0x0033:
            if (r1 == 0) goto L_0x009b
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0096
            r3 = r1
            r4 = r2
        L_0x003e:
            if (r3 == 0) goto L_0x0096
            boolean r5 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L_0x0051
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            androidx.compose.ui.focus.FocusProperties r5 = r3.g3()
            boolean r5 = r5.t()
            if (r5 == 0) goto L_0x0091
            return r3
        L_0x0051:
            int r5 = r3.A2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0091
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L_0x0091
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.a3()
            r6 = 0
            r7 = r6
        L_0x0065:
            r8 = 1
            if (r5 == 0) goto L_0x008e
            int r9 = r5.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0089
            int r7 = r7 + 1
            if (r7 != r8) goto L_0x0075
            r3 = r5
            goto L_0x0089
        L_0x0075:
            if (r4 != 0) goto L_0x0080
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r4.<init>(r8, r6)
        L_0x0080:
            if (r3 == 0) goto L_0x0086
            r4.d(r3)
            r3 = r2
        L_0x0086:
            r4.d(r5)
        L_0x0089:
            androidx.compose.ui.Modifier$Node r5 = r5.w2()
            goto L_0x0065
        L_0x008e:
            if (r7 != r8) goto L_0x0091
            goto L_0x003e
        L_0x0091:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r4)
            goto L_0x003e
        L_0x0096:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0033
        L_0x009b:
            androidx.compose.ui.node.LayoutNode r10 = r10.C0()
            if (r10 == 0) goto L_0x00ad
            androidx.compose.ui.node.NodeChain r1 = r10.u0()
            if (r1 == 0) goto L_0x00ad
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00ad:
            r1 = r2
            goto L_0x0021
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = androidx.compose.ui.layout.LayoutCoordinatesKt.d(r2).X(r2, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.geometry.Rect d(androidx.compose.ui.focus.FocusTargetNode r2) {
        /*
            androidx.compose.ui.node.NodeCoordinator r2 = r2.x2()
            if (r2 == 0) goto L_0x0011
            androidx.compose.ui.layout.LayoutCoordinates r0 = androidx.compose.ui.layout.LayoutCoordinatesKt.d(r2)
            r1 = 0
            androidx.compose.ui.geometry.Rect r2 = r0.X(r2, r1)
            if (r2 != 0) goto L_0x0017
        L_0x0011:
            androidx.compose.ui.geometry.Rect$Companion r2 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.ui.geometry.Rect r2 = r2.a()
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.d(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.geometry.Rect");
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection, Rect rect, Function1 function1) {
        int i3;
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.e()) ? true : FocusDirection.l(i2, companion.f())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.f(focusTargetNode, i2, function1));
        }
        if (FocusDirection.l(i2, companion.d()) ? true : FocusDirection.l(i2, companion.g()) ? true : FocusDirection.l(i2, companion.h()) ? true : FocusDirection.l(i2, companion.a())) {
            return TwoDimensionalFocusSearchKt.t(focusTargetNode, i2, rect, function1);
        }
        FocusTargetNode focusTargetNode2 = null;
        if (FocusDirection.l(i2, companion.b())) {
            int i4 = WhenMappings.f15831a[layoutDirection.ordinal()];
            if (i4 == 1) {
                i3 = companion.g();
            } else if (i4 == 2) {
                i3 = companion.d();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode b2 = b(focusTargetNode);
            if (b2 != null) {
                return TwoDimensionalFocusSearchKt.t(b2, i3, rect, function1);
            }
            return null;
        } else if (FocusDirection.l(i2, companion.c())) {
            FocusTargetNode b3 = b(focusTargetNode);
            if (b3 != null) {
                focusTargetNode2 = c(b3);
            }
            return Boolean.valueOf((focusTargetNode2 == null || Intrinsics.d(focusTargetNode2, focusTargetNode)) ? false : ((Boolean) function1.invoke(focusTargetNode2)).booleanValue());
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.n(i2)).toString());
        }
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.M().F2()) {
            return null;
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
                                if (focusTargetNode2.M().F2()) {
                                    int i2 = WhenMappings.f15832b[focusTargetNode2.A0().ordinal()];
                                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                                        return focusTargetNode2;
                                    }
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.X1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = (r2 = r2.x2()).X1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean g(androidx.compose.ui.focus.FocusTargetNode r2) {
        /*
            androidx.compose.ui.node.NodeCoordinator r0 = r2.x2()
            if (r0 == 0) goto L_0x0026
            androidx.compose.ui.node.LayoutNode r0 = r0.X1()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.u()
            r1 = 1
            if (r0 != r1) goto L_0x0026
            androidx.compose.ui.node.NodeCoordinator r2 = r2.x2()
            if (r2 == 0) goto L_0x0026
            androidx.compose.ui.node.LayoutNode r2 = r2.X1()
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.b()
            if (r2 != r1) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.g(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
