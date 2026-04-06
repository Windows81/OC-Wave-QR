package androidx.compose.ui.relocation;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata
public final class BringIntoViewModifierNodeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r1 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.compose.ui.node.DelegatableNode r11, kotlin.jvm.functions.Function0 r12, kotlin.coroutines.Continuation r13) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r11.M()
            boolean r0 = r0.F2()
            if (r0 != 0) goto L_0x000d
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        L_0x000d:
            r0 = 524288(0x80000, float:7.34684E-40)
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0022:
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x002e:
            r3 = 0
            if (r2 == 0) goto L_0x00bb
            androidx.compose.ui.node.NodeChain r4 = r2.u0()
            androidx.compose.ui.Modifier$Node r4 = r4.k()
            int r4 = r4.v2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00a6
        L_0x0040:
            if (r1 == 0) goto L_0x00a6
            int r4 = r1.A2()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00a1
            r4 = r1
            r5 = r3
        L_0x004b:
            if (r4 == 0) goto L_0x00a1
            boolean r6 = r4 instanceof androidx.compose.ui.relocation.BringIntoViewModifierNode
            if (r6 == 0) goto L_0x0054
            r3 = r4
            goto L_0x00bb
        L_0x0054:
            int r6 = r4.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x009c
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x009c
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r7 = 0
            r8 = r7
        L_0x0068:
            r9 = 1
            if (r6 == 0) goto L_0x0099
            int r10 = r6.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0094
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x0078
            r4 = r6
            goto L_0x0094
        L_0x0078:
            if (r5 != 0) goto L_0x0083
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r7)
        L_0x0083:
            if (r4 == 0) goto L_0x008d
            boolean r4 = r5.d(r4)
            kotlin.coroutines.jvm.internal.Boxing.a(r4)
            r4 = r3
        L_0x008d:
            boolean r9 = r5.d(r6)
            kotlin.coroutines.jvm.internal.Boxing.a(r9)
        L_0x0094:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x0068
        L_0x0099:
            if (r8 != r9) goto L_0x009c
            goto L_0x004b
        L_0x009c:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x004b
        L_0x00a1:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0040
        L_0x00a6:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00b8
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x00b8
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x002e
        L_0x00b8:
            r1 = r3
            goto L_0x002e
        L_0x00bb:
            androidx.compose.ui.relocation.BringIntoViewModifierNode r3 = (androidx.compose.ui.relocation.BringIntoViewModifierNode) r3
            if (r3 != 0) goto L_0x00c2
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        L_0x00c2:
            androidx.compose.ui.layout.LayoutCoordinates r11 = androidx.compose.ui.node.DelegatableNodeKt.m(r11)
            androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2 r0 = new androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            r0.<init>(r12, r11)
            java.lang.Object r11 = r3.W1(r11, r0, r13)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r11 != r12) goto L_0x00d6
            return r11
        L_0x00d6:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.a(androidx.compose.ui.node.DelegatableNode, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(DelegatableNode delegatableNode, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        return a(delegatableNode, function0, continuation);
    }
}
