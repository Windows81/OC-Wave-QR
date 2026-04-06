package androidx.compose.ui.focus;

import kotlin.Metadata;

@Metadata
public final class BeyondBoundsLayoutKt {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        r1 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.compose.ui.focus.FocusTargetNode r11, int r12, kotlin.jvm.functions.Function1 r13) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0015:
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x0021:
            r3 = 0
            if (r2 == 0) goto L_0x00a4
            androidx.compose.ui.node.NodeChain r4 = r2.u0()
            androidx.compose.ui.Modifier$Node r4 = r4.k()
            int r4 = r4.v2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0090
        L_0x0033:
            if (r1 == 0) goto L_0x0090
            int r4 = r1.A2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x008b
            r4 = r1
            r5 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x008b
            boolean r6 = r4 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L_0x0046
            goto L_0x00a5
        L_0x0046:
            int r6 = r4.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x0086
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x0086
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r7 = 0
            r8 = r7
        L_0x005a:
            r9 = 1
            if (r6 == 0) goto L_0x0083
            int r10 = r6.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x007e
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x006a
            r4 = r6
            goto L_0x007e
        L_0x006a:
            if (r5 != 0) goto L_0x0075
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r7)
        L_0x0075:
            if (r4 == 0) goto L_0x007b
            r5.d(r4)
            r4 = r3
        L_0x007b:
            r5.d(r6)
        L_0x007e:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x005a
        L_0x0083:
            if (r8 != r9) goto L_0x0086
            goto L_0x003e
        L_0x0086:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x003e
        L_0x008b:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0033
        L_0x0090:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00a1
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x00a1
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0021
        L_0x00a1:
            r1 = r3
            goto L_0x0021
        L_0x00a4:
            r4 = r3
        L_0x00a5:
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.ui.focus.FocusTargetNode) r4
            if (r4 == 0) goto L_0x00b8
            androidx.compose.ui.layout.BeyondBoundsLayout r0 = r4.h3()
            androidx.compose.ui.layout.BeyondBoundsLayout r1 = r11.h3()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L_0x00b8
            return r3
        L_0x00b8:
            androidx.compose.ui.layout.BeyondBoundsLayout r11 = r11.h3()
            if (r11 == 0) goto L_0x0132
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r12, r1)
            if (r1 == 0) goto L_0x00d1
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.a()
            goto L_0x0125
        L_0x00d1:
            int r1 = r0.a()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r12, r1)
            if (r1 == 0) goto L_0x00e2
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.d()
            goto L_0x0125
        L_0x00e2:
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r12, r1)
            if (r1 == 0) goto L_0x00f3
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.e()
            goto L_0x0125
        L_0x00f3:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r12, r1)
            if (r1 == 0) goto L_0x0104
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.f()
            goto L_0x0125
        L_0x0104:
            int r1 = r0.e()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r12, r1)
            if (r1 == 0) goto L_0x0115
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.b()
            goto L_0x0125
        L_0x0115:
            int r0 = r0.f()
            boolean r12 = androidx.compose.ui.focus.FocusDirection.l(r12, r0)
            if (r12 == 0) goto L_0x012a
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r12 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.f17013b
            int r12 = r12.c()
        L_0x0125:
            java.lang.Object r3 = r11.Y0(r12, r13)
            goto L_0x0132
        L_0x012a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unsupported direction for beyond bounds layout"
            r11.<init>(r12)
            throw r11
        L_0x0132:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.BeyondBoundsLayoutKt.a(androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
