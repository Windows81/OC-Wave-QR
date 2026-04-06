package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FocusTransactionsKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15829a;

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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15829a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.<clinit>():void");
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        FocusTargetNode f2 = FocusTraversalKt.f(focusTargetNode);
        if (f2 != null) {
            return c(f2, z2, z3);
        }
        return true;
    }

    public static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        return a(focusTargetNode, z2, z3);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z2, boolean z3) {
        int i2 = WhenMappings.f15829a[focusTargetNode.A0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!a(focusTargetNode, z2, z3)) {
                    return false;
                } else {
                    if (!ComposeUiFlags.f15479g) {
                        focusTargetNode.r3(FocusStateImpl.Inactive);
                        if (z3) {
                            focusTargetNode.e3();
                        }
                    } else if (z3) {
                        focusTargetNode.f3(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    }
                }
            } else if (!z2) {
                return z2;
            } else {
                if (ComposeUiFlags.f15479g) {
                    DelegatableNodeKt.p(focusTargetNode).getFocusOwner().o((FocusTargetNode) null);
                    if (!z3) {
                        return z2;
                    }
                    focusTargetNode.f3(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                    return z2;
                }
                focusTargetNode.r3(FocusStateImpl.Inactive);
                if (!z3) {
                    return z2;
                }
                focusTargetNode.e3();
                return z2;
            }
        } else if (ComposeUiFlags.f15479g) {
            DelegatableNodeKt.p(focusTargetNode).getFocusOwner().o((FocusTargetNode) null);
            if (z3) {
                focusTargetNode.f3(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        } else {
            focusTargetNode.r3(FocusStateImpl.Inactive);
            if (z3) {
                focusTargetNode.e3();
            }
        }
        return true;
    }

    public static /* synthetic */ boolean d(FocusTargetNode focusTargetNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return c(focusTargetNode, z2, z3);
    }

    public static final boolean e(FocusTargetNode focusTargetNode) {
        boolean z2 = false;
        if (ComposeUiFlags.f15479g) {
            int i2 = WhenMappings.f15829a[focusTargetNode.A0().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    DelegatableNodeKt.p(focusTargetNode).getFocusOwner().k(false);
                    focusTargetNode.f3(FocusStateImpl.Captured, FocusStateImpl.Active);
                } else if (i2 == 3 || i2 == 4) {
                    return false;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }
        FocusTransactionManager c2 = FocusTargetNodeKt.c(focusTargetNode);
        try {
            if (c2.i()) {
                c2.f();
            }
            c2.e();
            int i3 = WhenMappings.f15829a[focusTargetNode.A0().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return z2;
                }
                focusTargetNode.r3(FocusStateImpl.Active);
                focusTargetNode.e3();
            }
            z2 = true;
            return z2;
        } finally {
            c2.g();
        }
    }

    public static final boolean f(FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.a(focusTargetNode, new FocusTransactionsKt$grantFocus$1(focusTargetNode));
        int i2 = WhenMappings.f15829a[focusTargetNode.A0().ordinal()];
        if (i2 != 3 && i2 != 4) {
            return true;
        }
        if (ComposeUiFlags.f15479g) {
            DelegatableNodeKt.p(focusTargetNode).getFocusOwner().o(focusTargetNode);
            return true;
        }
        focusTargetNode.r3(FocusStateImpl.Active);
        return true;
    }

    public static final CustomDestinationResult g(FocusTargetNode focusTargetNode, int i2) {
        int i3 = WhenMappings.f15829a[focusTargetNode.A0().ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i3 == 3) {
                CustomDestinationResult g2 = g(p(focusTargetNode), i2);
                if (g2 == CustomDestinationResult.None) {
                    g2 = null;
                }
                return g2 == null ? i(focusTargetNode, i2) : g2;
            } else if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult h(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.Q) {
            focusTargetNode.Q = true;
            try {
                FocusProperties g3 = focusTargetNode.g3();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, (DefaultConstructorMarker) null);
                FocusTransactionManager a2 = FocusTargetNodeKt.a(focusTargetNode);
                int h2 = a2 != null ? a2.h() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.p(focusTargetNode).getFocusOwner();
                FocusTargetNode t2 = focusOwner.t();
                g3.v().invoke(cancelIndicatingFocusBoundaryScope);
                int h3 = a2 != null ? a2.h() : 0;
                FocusTargetNode t3 = focusOwner.t();
                if (cancelIndicatingFocusBoundaryScope.c()) {
                    FocusRequester.Companion companion = FocusRequester.f15802b;
                    FocusRequester a3 = companion.a();
                    if (a3 == companion.a()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.Q = false;
                        return customDestinationResult;
                    } else if (a3 == companion.c()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.Q = false;
                        return customDestinationResult2;
                    } else {
                        return FocusRequester.i(a3, 0, 1, (Object) null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    }
                } else {
                    if (h2 == h3) {
                        if (!ComposeUiFlags.f15479g || t2 == t3 || t3 == null) {
                            focusTargetNode.Q = false;
                        }
                    }
                    FocusRequester.Companion companion2 = FocusRequester.f15802b;
                    FocusRequester c2 = companion2.c();
                    if (c2 == companion2.a()) {
                        CustomDestinationResult customDestinationResult3 = CustomDestinationResult.Cancelled;
                        focusTargetNode.Q = false;
                        return customDestinationResult3;
                    } else if (c2 == companion2.c()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Redirected;
                        focusTargetNode.Q = false;
                        return customDestinationResult4;
                    } else {
                        CustomDestinationResult customDestinationResult5 = FocusRequester.i(c2, 0, 1, (Object) null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                        focusTargetNode.Q = false;
                        return customDestinationResult5;
                    }
                }
            } finally {
                focusTargetNode.Q = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult i(FocusTargetNode focusTargetNode, int i2) {
        if (!focusTargetNode.P) {
            focusTargetNode.P = true;
            try {
                FocusProperties g3 = focusTargetNode.g3();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, (DefaultConstructorMarker) null);
                FocusTransactionManager a2 = FocusTargetNodeKt.a(focusTargetNode);
                int h2 = a2 != null ? a2.h() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.p(focusTargetNode).getFocusOwner();
                FocusTargetNode t2 = focusOwner.t();
                g3.x().invoke(cancelIndicatingFocusBoundaryScope);
                int h3 = a2 != null ? a2.h() : 0;
                FocusTargetNode t3 = focusOwner.t();
                if (cancelIndicatingFocusBoundaryScope.c()) {
                    FocusRequester.Companion companion = FocusRequester.f15802b;
                    FocusRequester a3 = companion.a();
                    if (a3 == companion.a()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.P = false;
                        return customDestinationResult;
                    } else if (a3 == companion.c()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.P = false;
                        return customDestinationResult2;
                    } else {
                        return FocusRequester.i(a3, 0, 1, (Object) null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    }
                } else {
                    if (h2 == h3) {
                        if (!ComposeUiFlags.f15479g || t2 == t3 || t3 == null) {
                            focusTargetNode.P = false;
                        }
                    }
                    FocusRequester.Companion companion2 = FocusRequester.f15802b;
                    FocusRequester c2 = companion2.c();
                    if (c2 == companion2.a()) {
                        CustomDestinationResult customDestinationResult3 = CustomDestinationResult.Cancelled;
                        focusTargetNode.P = false;
                        return customDestinationResult3;
                    } else if (c2 == companion2.c()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Redirected;
                        focusTargetNode.P = false;
                        return customDestinationResult4;
                    } else {
                        CustomDestinationResult customDestinationResult5 = FocusRequester.i(c2, 0, 1, (Object) null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                        focusTargetNode.P = false;
                        return customDestinationResult5;
                    }
                }
            } finally {
                focusTargetNode.P = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r5 = r13.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.focus.CustomDestinationResult j(androidx.compose.ui.focus.FocusTargetNode r13, int r14) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r13.A0()
            int[] r1 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.f15829a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x010a
            r2 = 2
            if (r0 == r2) goto L_0x010a
            r3 = 3
            if (r0 == r3) goto L_0x0101
            r4 = 4
            if (r0 != r4) goto L_0x00fb
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r5 = r13.M()
            boolean r5 = r5.F2()
            if (r5 != 0) goto L_0x002d
            java.lang.String r5 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r5)
        L_0x002d:
            androidx.compose.ui.Modifier$Node r5 = r13.M()
            androidx.compose.ui.Modifier$Node r5 = r5.C2()
            androidx.compose.ui.node.LayoutNode r13 = androidx.compose.ui.node.DelegatableNodeKt.o(r13)
        L_0x0039:
            r6 = 0
            if (r13 == 0) goto L_0x00bb
            androidx.compose.ui.node.NodeChain r7 = r13.u0()
            androidx.compose.ui.Modifier$Node r7 = r7.k()
            int r7 = r7.v2()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x00a7
        L_0x004b:
            if (r5 == 0) goto L_0x00a7
            int r7 = r5.A2()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x00a2
            r7 = r5
            r8 = r6
        L_0x0056:
            if (r7 == 0) goto L_0x00a2
            boolean r9 = r7 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r9 == 0) goto L_0x005e
            goto L_0x00bc
        L_0x005e:
            int r9 = r7.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x009d
            boolean r9 = r7 instanceof androidx.compose.ui.node.DelegatingNode
            if (r9 == 0) goto L_0x009d
            r9 = r7
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9
            androidx.compose.ui.Modifier$Node r9 = r9.a3()
            r10 = 0
            r11 = r10
        L_0x0072:
            if (r9 == 0) goto L_0x009a
            int r12 = r9.A2()
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0095
            int r11 = r11 + 1
            if (r11 != r1) goto L_0x0081
            r7 = r9
            goto L_0x0095
        L_0x0081:
            if (r8 != 0) goto L_0x008c
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            r12 = 16
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r12]
            r8.<init>(r12, r10)
        L_0x008c:
            if (r7 == 0) goto L_0x0092
            r8.d(r7)
            r7 = r6
        L_0x0092:
            r8.d(r9)
        L_0x0095:
            androidx.compose.ui.Modifier$Node r9 = r9.w2()
            goto L_0x0072
        L_0x009a:
            if (r11 != r1) goto L_0x009d
            goto L_0x0056
        L_0x009d:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.h(r8)
            goto L_0x0056
        L_0x00a2:
            androidx.compose.ui.Modifier$Node r5 = r5.C2()
            goto L_0x004b
        L_0x00a7:
            androidx.compose.ui.node.LayoutNode r13 = r13.C0()
            if (r13 == 0) goto L_0x00b8
            androidx.compose.ui.node.NodeChain r5 = r13.u0()
            if (r5 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Node r5 = r5.o()
            goto L_0x0039
        L_0x00b8:
            r5 = r6
            goto L_0x0039
        L_0x00bb:
            r7 = r6
        L_0x00bc:
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            if (r7 != 0) goto L_0x00c3
            androidx.compose.ui.focus.CustomDestinationResult r13 = androidx.compose.ui.focus.CustomDestinationResult.None
            return r13
        L_0x00c3:
            androidx.compose.ui.focus.FocusStateImpl r13 = r7.A0()
            int[] r0 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.f15829a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r1) goto L_0x00f6
            if (r13 == r2) goto L_0x00f3
            if (r13 == r3) goto L_0x00ee
            if (r13 != r4) goto L_0x00e8
            androidx.compose.ui.focus.CustomDestinationResult r13 = j(r7, r14)
            androidx.compose.ui.focus.CustomDestinationResult r0 = androidx.compose.ui.focus.CustomDestinationResult.None
            if (r13 != r0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r6 = r13
        L_0x00e1:
            if (r6 != 0) goto L_0x00fa
            androidx.compose.ui.focus.CustomDestinationResult r6 = h(r7, r14)
            goto L_0x00fa
        L_0x00e8:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x00ee:
            androidx.compose.ui.focus.CustomDestinationResult r6 = j(r7, r14)
            goto L_0x00fa
        L_0x00f3:
            androidx.compose.ui.focus.CustomDestinationResult r6 = androidx.compose.ui.focus.CustomDestinationResult.Cancelled
            goto L_0x00fa
        L_0x00f6:
            androidx.compose.ui.focus.CustomDestinationResult r6 = h(r7, r14)
        L_0x00fa:
            return r6
        L_0x00fb:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0101:
            androidx.compose.ui.focus.FocusTargetNode r13 = p(r13)
            androidx.compose.ui.focus.CustomDestinationResult r13 = g(r13, r14)
            return r13
        L_0x010a:
            androidx.compose.ui.focus.CustomDestinationResult r13 = androidx.compose.ui.focus.CustomDestinationResult.None
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.j(androidx.compose.ui.focus.FocusTargetNode, int):androidx.compose.ui.focus.CustomDestinationResult");
    }

    public static final boolean k(FocusTargetNode focusTargetNode) {
        return ComposeUiFlags.f15479g ? m(focusTargetNode) : l(focusTargetNode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r3 = r5.u0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dd, code lost:
        if (f(r11) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f2, code lost:
        if (f(r11) != false) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean l(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r11.A0()
            int[] r1 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.f15829a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x00f4
            r3 = 2
            if (r0 == r3) goto L_0x00f4
            r3 = 3
            r4 = 0
            if (r0 == r3) goto L_0x00e8
            r3 = 4
            if (r0 != r3) goto L_0x00e2
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r3 = r11.M()
            boolean r3 = r3.F2()
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r3)
        L_0x002f:
            androidx.compose.ui.Modifier$Node r3 = r11.M()
            androidx.compose.ui.Modifier$Node r3 = r3.C2()
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x003b:
            if (r5 == 0) goto L_0x00ba
            androidx.compose.ui.node.NodeChain r6 = r5.u0()
            androidx.compose.ui.Modifier$Node r6 = r6.k()
            int r6 = r6.v2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a7
        L_0x004c:
            if (r3 == 0) goto L_0x00a7
            int r6 = r3.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a2
            r7 = r1
            r6 = r3
        L_0x0057:
            if (r6 == 0) goto L_0x00a2
            boolean r8 = r6 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L_0x005f
            goto L_0x00bb
        L_0x005f:
            int r8 = r6.A2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x009d
            boolean r8 = r6 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto L_0x009d
            r8 = r6
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.a3()
            r9 = r4
        L_0x0072:
            if (r8 == 0) goto L_0x009a
            int r10 = r8.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0095
            int r9 = r9 + 1
            if (r9 != r2) goto L_0x0081
            r6 = r8
            goto L_0x0095
        L_0x0081:
            if (r7 != 0) goto L_0x008c
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            r10 = 16
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
            r7.<init>(r10, r4)
        L_0x008c:
            if (r6 == 0) goto L_0x0092
            r7.d(r6)
            r6 = r1
        L_0x0092:
            r7.d(r8)
        L_0x0095:
            androidx.compose.ui.Modifier$Node r8 = r8.w2()
            goto L_0x0072
        L_0x009a:
            if (r9 != r2) goto L_0x009d
            goto L_0x0057
        L_0x009d:
            androidx.compose.ui.Modifier$Node r6 = androidx.compose.ui.node.DelegatableNodeKt.h(r7)
            goto L_0x0057
        L_0x00a2:
            androidx.compose.ui.Modifier$Node r3 = r3.C2()
            goto L_0x004c
        L_0x00a7:
            androidx.compose.ui.node.LayoutNode r5 = r5.C0()
            if (r5 == 0) goto L_0x00b8
            androidx.compose.ui.node.NodeChain r3 = r5.u0()
            if (r3 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Node r3 = r3.o()
            goto L_0x003b
        L_0x00b8:
            r3 = r1
            goto L_0x003b
        L_0x00ba:
            r6 = r1
        L_0x00bb:
            androidx.compose.ui.focus.FocusTargetNode r6 = (androidx.compose.ui.focus.FocusTargetNode) r6
            if (r6 == 0) goto L_0x00d3
            androidx.compose.ui.focus.FocusStateImpl r0 = r6.A0()
            boolean r2 = n(r6, r11)
            if (r2 == 0) goto L_0x00f4
            androidx.compose.ui.focus.FocusStateImpl r3 = r6.A0()
            if (r0 == r3) goto L_0x00f4
            r6.e3()
            goto L_0x00f4
        L_0x00d3:
            boolean r0 = o(r11)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = f(r11)
            if (r0 == 0) goto L_0x00e0
            goto L_0x00f4
        L_0x00e0:
            r2 = r4
            goto L_0x00f4
        L_0x00e2:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00e8:
            boolean r0 = b(r11, r4, r4, r3, r1)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = f(r11)
            if (r0 == 0) goto L_0x00e0
        L_0x00f4:
            if (r2 == 0) goto L_0x011c
            boolean r0 = androidx.compose.ui.ComposeUiFlags.f15477e
            if (r0 == 0) goto L_0x0119
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
            android.view.View r0 = r0.X()
            if (r0 != 0) goto L_0x0119
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.p(r11)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusDirection$Companion r3 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r3 = r3.e()
            androidx.compose.ui.focus.FocusDirection r3 = androidx.compose.ui.focus.FocusDirection.i(r3)
            r0.v(r3, r1)
        L_0x0119:
            r11.e3()
        L_0x011c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.l(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r4 = r13.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m(androidx.compose.ui.focus.FocusTargetNode r18) {
        /*
            r0 = r18
            androidx.compose.ui.node.Owner r1 = androidx.compose.ui.node.DelegatableNodeKt.p(r18)
            androidx.compose.ui.focus.FocusOwner r1 = r1.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r2 = r1.t()
            androidx.compose.ui.focus.FocusStateImpl r3 = r18.A0()
            r4 = 1
            if (r2 != r0) goto L_0x0019
            r0.f3(r3, r3)
            return r4
        L_0x0019:
            r5 = 0
            if (r2 != 0) goto L_0x0023
            boolean r6 = o(r18)
            if (r6 != 0) goto L_0x0023
            return r5
        L_0x0023:
            java.lang.String r6 = "visitAncestors called on an unattached node"
            r7 = 1024(0x400, float:1.435E-42)
            r8 = 16
            if (r2 == 0) goto L_0x00dd
            androidx.compose.runtime.collection.MutableVector r10 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.focus.FocusTargetNode[] r11 = new androidx.compose.ui.focus.FocusTargetNode[r8]
            r10.<init>(r11, r5)
            int r11 = androidx.compose.ui.node.NodeKind.a(r7)
            androidx.compose.ui.Modifier$Node r12 = r2.M()
            boolean r12 = r12.F2()
            if (r12 != 0) goto L_0x0043
            androidx.compose.ui.internal.InlineClassHelperKt.c(r6)
        L_0x0043:
            androidx.compose.ui.Modifier$Node r12 = r2.M()
            androidx.compose.ui.Modifier$Node r12 = r12.C2()
            androidx.compose.ui.node.LayoutNode r13 = androidx.compose.ui.node.DelegatableNodeKt.o(r2)
        L_0x004f:
            if (r13 == 0) goto L_0x00de
            androidx.compose.ui.node.NodeChain r14 = r13.u0()
            androidx.compose.ui.Modifier$Node r14 = r14.k()
            int r14 = r14.v2()
            r14 = r14 & r11
            if (r14 == 0) goto L_0x00c5
        L_0x0060:
            if (r12 == 0) goto L_0x00c5
            int r14 = r12.A2()
            r14 = r14 & r11
            if (r14 == 0) goto L_0x00bd
            r14 = r12
            r15 = 0
        L_0x006b:
            if (r14 == 0) goto L_0x00bd
            boolean r9 = r14 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r9 == 0) goto L_0x0077
            androidx.compose.ui.focus.FocusTargetNode r14 = (androidx.compose.ui.focus.FocusTargetNode) r14
            r10.d(r14)
            goto L_0x00b7
        L_0x0077:
            int r9 = r14.A2()
            r9 = r9 & r11
            if (r9 == 0) goto L_0x00b7
            boolean r9 = r14 instanceof androidx.compose.ui.node.DelegatingNode
            if (r9 == 0) goto L_0x00b7
            r9 = r14
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9
            androidx.compose.ui.Modifier$Node r9 = r9.a3()
            r7 = r5
        L_0x008a:
            if (r9 == 0) goto L_0x00b2
            int r17 = r9.A2()
            r17 = r17 & r11
            if (r17 == 0) goto L_0x00ac
            int r7 = r7 + 1
            if (r7 != r4) goto L_0x009a
            r14 = r9
            goto L_0x00ac
        L_0x009a:
            if (r15 != 0) goto L_0x00a3
            androidx.compose.runtime.collection.MutableVector r15 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r8]
            r15.<init>(r4, r5)
        L_0x00a3:
            if (r14 == 0) goto L_0x00a9
            r15.d(r14)
            r14 = 0
        L_0x00a9:
            r15.d(r9)
        L_0x00ac:
            androidx.compose.ui.Modifier$Node r9 = r9.w2()
            r4 = 1
            goto L_0x008a
        L_0x00b2:
            if (r7 != r4) goto L_0x00b7
        L_0x00b4:
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x006b
        L_0x00b7:
            androidx.compose.ui.Modifier$Node r14 = androidx.compose.ui.node.DelegatableNodeKt.h(r15)
            r4 = 1
            goto L_0x00b4
        L_0x00bd:
            androidx.compose.ui.Modifier$Node r12 = r12.C2()
            r4 = 1
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x0060
        L_0x00c5:
            androidx.compose.ui.node.LayoutNode r13 = r13.C0()
            if (r13 == 0) goto L_0x00d7
            androidx.compose.ui.node.NodeChain r4 = r13.u0()
            if (r4 == 0) goto L_0x00d7
            androidx.compose.ui.Modifier$Node r4 = r4.o()
            r12 = r4
            goto L_0x00d8
        L_0x00d7:
            r12 = 0
        L_0x00d8:
            r4 = 1
            r7 = 1024(0x400, float:1.435E-42)
            goto L_0x004f
        L_0x00dd:
            r10 = 0
        L_0x00de:
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.focus.FocusTargetNode[] r7 = new androidx.compose.ui.focus.FocusTargetNode[r8]
            r4.<init>(r7, r5)
            r7 = 1024(0x400, float:1.435E-42)
            int r7 = androidx.compose.ui.node.NodeKind.a(r7)
            androidx.compose.ui.Modifier$Node r9 = r18.M()
            boolean r9 = r9.F2()
            if (r9 != 0) goto L_0x00f8
            androidx.compose.ui.internal.InlineClassHelperKt.c(r6)
        L_0x00f8:
            androidx.compose.ui.Modifier$Node r6 = r18.M()
            androidx.compose.ui.Modifier$Node r6 = r6.C2()
            androidx.compose.ui.node.LayoutNode r9 = androidx.compose.ui.node.DelegatableNodeKt.o(r18)
            r11 = 1
        L_0x0105:
            if (r9 == 0) goto L_0x01b0
            androidx.compose.ui.node.NodeChain r12 = r9.u0()
            androidx.compose.ui.Modifier$Node r12 = r12.k()
            int r12 = r12.v2()
            r12 = r12 & r7
            if (r12 == 0) goto L_0x0198
        L_0x0116:
            if (r6 == 0) goto L_0x0198
            int r12 = r6.A2()
            r12 = r12 & r7
            if (r12 == 0) goto L_0x018f
            r13 = r6
            r12 = 0
        L_0x0121:
            if (r13 == 0) goto L_0x018f
            boolean r14 = r13 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r14 == 0) goto L_0x0144
            androidx.compose.ui.focus.FocusTargetNode r13 = (androidx.compose.ui.focus.FocusTargetNode) r13
            if (r10 == 0) goto L_0x0134
            boolean r14 = r10.v(r13)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            if (r14 == 0) goto L_0x013d
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0140
        L_0x013d:
            r4.d(r13)
        L_0x0140:
            if (r13 != r2) goto L_0x018a
            r11 = r5
            goto L_0x018a
        L_0x0144:
            int r14 = r13.A2()
            r14 = r14 & r7
            if (r14 == 0) goto L_0x018a
            boolean r14 = r13 instanceof androidx.compose.ui.node.DelegatingNode
            if (r14 == 0) goto L_0x018a
            r14 = r13
            androidx.compose.ui.node.DelegatingNode r14 = (androidx.compose.ui.node.DelegatingNode) r14
            androidx.compose.ui.Modifier$Node r14 = r14.a3()
            r15 = r5
        L_0x0157:
            if (r14 == 0) goto L_0x0183
            int r16 = r14.A2()
            r16 = r16 & r7
            if (r16 == 0) goto L_0x017b
            int r15 = r15 + 1
            r5 = 1
            if (r15 != r5) goto L_0x0168
            r13 = r14
            goto L_0x017b
        L_0x0168:
            if (r12 != 0) goto L_0x0172
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r5 = new androidx.compose.ui.Modifier.Node[r8]
            r8 = 0
            r12.<init>(r5, r8)
        L_0x0172:
            if (r13 == 0) goto L_0x0178
            r12.d(r13)
            r13 = 0
        L_0x0178:
            r12.d(r14)
        L_0x017b:
            androidx.compose.ui.Modifier$Node r14 = r14.w2()
            r5 = 0
            r8 = 16
            goto L_0x0157
        L_0x0183:
            r5 = 1
            if (r15 != r5) goto L_0x018a
        L_0x0186:
            r5 = 0
            r8 = 16
            goto L_0x0121
        L_0x018a:
            androidx.compose.ui.Modifier$Node r13 = androidx.compose.ui.node.DelegatableNodeKt.h(r12)
            goto L_0x0186
        L_0x018f:
            androidx.compose.ui.Modifier$Node r6 = r6.C2()
            r5 = 0
            r8 = 16
            goto L_0x0116
        L_0x0198:
            androidx.compose.ui.node.LayoutNode r9 = r9.C0()
            if (r9 == 0) goto L_0x01aa
            androidx.compose.ui.node.NodeChain r5 = r9.u0()
            if (r5 == 0) goto L_0x01aa
            androidx.compose.ui.Modifier$Node r5 = r5.o()
            r6 = r5
            goto L_0x01ab
        L_0x01aa:
            r6 = 0
        L_0x01ab:
            r5 = 0
            r8 = 16
            goto L_0x0105
        L_0x01b0:
            if (r11 == 0) goto L_0x01be
            if (r2 == 0) goto L_0x01be
            r5 = 1
            r6 = 0
            r7 = 0
            boolean r8 = d(r2, r6, r5, r5, r7)
            if (r8 != 0) goto L_0x01bf
            return r6
        L_0x01be:
            r5 = 1
        L_0x01bf:
            f(r18)
            if (r10 == 0) goto L_0x01e6
            int r6 = r10.p()
            int r6 = r6 - r5
            java.lang.Object[] r5 = r10.f15005z
            int r7 = r5.length
            if (r6 >= r7) goto L_0x01e6
        L_0x01ce:
            if (r6 < 0) goto L_0x01e6
            r7 = r5[r6]
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            androidx.compose.ui.focus.FocusTargetNode r8 = r1.t()
            if (r8 == r0) goto L_0x01dc
            r8 = 0
            return r8
        L_0x01dc:
            androidx.compose.ui.focus.FocusStateImpl r8 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            androidx.compose.ui.focus.FocusStateImpl r9 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r7.f3(r8, r9)
            int r6 = r6 + -1
            goto L_0x01ce
        L_0x01e6:
            int r5 = r4.p()
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object[] r4 = r4.f15005z
            int r6 = r4.length
            if (r5 >= r6) goto L_0x020e
        L_0x01f1:
            if (r5 < 0) goto L_0x020e
            r6 = r4[r5]
            androidx.compose.ui.focus.FocusTargetNode r6 = (androidx.compose.ui.focus.FocusTargetNode) r6
            androidx.compose.ui.focus.FocusTargetNode r7 = r1.t()
            if (r7 == r0) goto L_0x01ff
            r7 = 0
            return r7
        L_0x01ff:
            if (r6 != r2) goto L_0x0204
            androidx.compose.ui.focus.FocusStateImpl r7 = androidx.compose.ui.focus.FocusStateImpl.Active
            goto L_0x0206
        L_0x0204:
            androidx.compose.ui.focus.FocusStateImpl r7 = androidx.compose.ui.focus.FocusStateImpl.Inactive
        L_0x0206:
            androidx.compose.ui.focus.FocusStateImpl r8 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            r6.f3(r7, r8)
            int r5 = r5 + -1
            goto L_0x01f1
        L_0x020e:
            androidx.compose.ui.focus.FocusTargetNode r2 = r1.t()
            if (r2 == r0) goto L_0x0216
            r2 = 0
            return r2
        L_0x0216:
            r2 = 0
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Active
            r0.f3(r3, r4)
            androidx.compose.ui.focus.FocusTargetNode r1 = r1.t()
            if (r1 == r0) goto L_0x0223
            return r2
        L_0x0223:
            boolean r1 = androidx.compose.ui.ComposeUiFlags.f15477e
            if (r1 == 0) goto L_0x0247
            androidx.compose.ui.node.LayoutNode r1 = androidx.compose.ui.node.DelegatableNodeKt.o(r18)
            android.view.View r1 = r1.X()
            if (r1 != 0) goto L_0x0247
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.DelegatableNodeKt.p(r18)
            androidx.compose.ui.focus.FocusOwner r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.FocusDirection$Companion r1 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r1.e()
            androidx.compose.ui.focus.FocusDirection r1 = androidx.compose.ui.focus.FocusDirection.i(r1)
            r2 = 0
            r0.v(r1, r2)
        L_0x0247:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.m(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r2 = r4.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean n(androidx.compose.ui.focus.FocusTargetNode r14, androidx.compose.ui.focus.FocusTargetNode r15) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r1 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r2 = r15.M()
            boolean r2 = r2.F2()
            java.lang.String r3 = "visitAncestors called on an unattached node"
            if (r2 != 0) goto L_0x0015
            androidx.compose.ui.internal.InlineClassHelperKt.c(r3)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r2 = r15.M()
            androidx.compose.ui.Modifier$Node r2 = r2.C2()
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.DelegatableNodeKt.o(r15)
        L_0x0021:
            r5 = 16
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x00a3
            androidx.compose.ui.node.NodeChain r9 = r4.u0()
            androidx.compose.ui.Modifier$Node r9 = r9.k()
            int r9 = r9.v2()
            r9 = r9 & r1
            if (r9 == 0) goto L_0x008f
        L_0x0037:
            if (r2 == 0) goto L_0x008f
            int r9 = r2.A2()
            r9 = r9 & r1
            if (r9 == 0) goto L_0x008a
            r9 = r2
            r10 = r8
        L_0x0042:
            if (r9 == 0) goto L_0x008a
            boolean r11 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r11 == 0) goto L_0x0049
            goto L_0x00a4
        L_0x0049:
            int r11 = r9.A2()
            r11 = r11 & r1
            if (r11 == 0) goto L_0x0085
            boolean r11 = r9 instanceof androidx.compose.ui.node.DelegatingNode
            if (r11 == 0) goto L_0x0085
            r11 = r9
            androidx.compose.ui.node.DelegatingNode r11 = (androidx.compose.ui.node.DelegatingNode) r11
            androidx.compose.ui.Modifier$Node r11 = r11.a3()
            r12 = r7
        L_0x005c:
            if (r11 == 0) goto L_0x0082
            int r13 = r11.A2()
            r13 = r13 & r1
            if (r13 == 0) goto L_0x007d
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x006b
            r9 = r11
            goto L_0x007d
        L_0x006b:
            if (r10 != 0) goto L_0x0074
            androidx.compose.runtime.collection.MutableVector r10 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r13 = new androidx.compose.ui.Modifier.Node[r5]
            r10.<init>(r13, r7)
        L_0x0074:
            if (r9 == 0) goto L_0x007a
            r10.d(r9)
            r9 = r8
        L_0x007a:
            r10.d(r11)
        L_0x007d:
            androidx.compose.ui.Modifier$Node r11 = r11.w2()
            goto L_0x005c
        L_0x0082:
            if (r12 != r6) goto L_0x0085
            goto L_0x0042
        L_0x0085:
            androidx.compose.ui.Modifier$Node r9 = androidx.compose.ui.node.DelegatableNodeKt.h(r10)
            goto L_0x0042
        L_0x008a:
            androidx.compose.ui.Modifier$Node r2 = r2.C2()
            goto L_0x0037
        L_0x008f:
            androidx.compose.ui.node.LayoutNode r4 = r4.C0()
            if (r4 == 0) goto L_0x00a0
            androidx.compose.ui.node.NodeChain r2 = r4.u0()
            if (r2 == 0) goto L_0x00a0
            androidx.compose.ui.Modifier$Node r2 = r2.o()
            goto L_0x0021
        L_0x00a0:
            r2 = r8
            goto L_0x0021
        L_0x00a3:
            r9 = r8
        L_0x00a4:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r9, r14)
            if (r1 == 0) goto L_0x01b7
            androidx.compose.ui.focus.FocusStateImpl r1 = r14.A0()
            int[] r2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.f15829a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r6) goto L_0x01ab
            r2 = 2
            if (r1 == r2) goto L_0x0193
            r2 = 3
            if (r1 == r2) goto L_0x019b
            r2 = 4
            if (r1 != r2) goto L_0x0195
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r14.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x00d2
            androidx.compose.ui.internal.InlineClassHelperKt.c(r3)
        L_0x00d2:
            androidx.compose.ui.Modifier$Node r1 = r14.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r14)
        L_0x00de:
            if (r2 == 0) goto L_0x015b
            androidx.compose.ui.node.NodeChain r3 = r2.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0148
        L_0x00ef:
            if (r1 == 0) goto L_0x0148
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0143
            r3 = r1
            r4 = r8
        L_0x00fa:
            if (r3 == 0) goto L_0x0143
            boolean r9 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r9 == 0) goto L_0x0102
            r8 = r3
            goto L_0x015b
        L_0x0102:
            int r9 = r3.A2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x013e
            boolean r9 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r9 == 0) goto L_0x013e
            r9 = r3
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9
            androidx.compose.ui.Modifier$Node r9 = r9.a3()
            r10 = r7
        L_0x0115:
            if (r9 == 0) goto L_0x013b
            int r11 = r9.A2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0136
            int r10 = r10 + 1
            if (r10 != r6) goto L_0x0124
            r3 = r9
            goto L_0x0136
        L_0x0124:
            if (r4 != 0) goto L_0x012d
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r11 = new androidx.compose.ui.Modifier.Node[r5]
            r4.<init>(r11, r7)
        L_0x012d:
            if (r3 == 0) goto L_0x0133
            r4.d(r3)
            r3 = r8
        L_0x0133:
            r4.d(r9)
        L_0x0136:
            androidx.compose.ui.Modifier$Node r9 = r9.w2()
            goto L_0x0115
        L_0x013b:
            if (r10 != r6) goto L_0x013e
            goto L_0x00fa
        L_0x013e:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r4)
            goto L_0x00fa
        L_0x0143:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x00ef
        L_0x0148:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x0159
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x0159
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x00de
        L_0x0159:
            r1 = r8
            goto L_0x00de
        L_0x015b:
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            if (r8 != 0) goto L_0x0171
            boolean r0 = o(r14)
            if (r0 == 0) goto L_0x0171
            boolean r6 = f(r15)
            if (r6 == 0) goto L_0x01b6
            androidx.compose.ui.focus.FocusStateImpl r15 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            r14.r3(r15)
            goto L_0x01b6
        L_0x0171:
            if (r8 == 0) goto L_0x0193
            boolean r0 = n(r8, r14)
            if (r0 == 0) goto L_0x0193
            boolean r6 = n(r14, r15)
            androidx.compose.ui.focus.FocusStateImpl r14 = r14.A0()
            androidx.compose.ui.focus.FocusStateImpl r15 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            if (r14 != r15) goto L_0x018b
            if (r6 == 0) goto L_0x01b6
            r8.e3()
            goto L_0x01b6
        L_0x018b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Deactivated node is focused"
            r14.<init>(r15)
            throw r14
        L_0x0193:
            r6 = r7
            goto L_0x01b6
        L_0x0195:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x019b:
            p(r14)
            boolean r14 = b(r14, r7, r7, r2, r8)
            if (r14 == 0) goto L_0x0193
            boolean r14 = f(r15)
            if (r14 == 0) goto L_0x0193
            goto L_0x01b6
        L_0x01ab:
            boolean r6 = f(r15)
            if (r6 == 0) goto L_0x01b6
            androidx.compose.ui.focus.FocusStateImpl r15 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent
            r14.r3(r15)
        L_0x01b6:
            return r6
        L_0x01b7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Non child node cannot request focus."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.n(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean o(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.p(focusTargetNode).getFocusOwner().v((FocusDirection) null, (Rect) null);
    }

    public static final FocusTargetNode p(FocusTargetNode focusTargetNode) {
        FocusTargetNode f2 = FocusTraversalKt.f(focusTargetNode);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
