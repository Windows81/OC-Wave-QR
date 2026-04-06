package androidx.compose.ui.modifier;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    void T0(ModifierLocal modifierLocal, Object obj) {
        if (!(q1() != EmptyMap.f17181a)) {
            InlineClassHelperKt.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!q1().a(modifierLocal)) {
            InlineClassHelperKt.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.");
        }
        q1().c(modifierLocal, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        r1 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.lang.Object b(androidx.compose.ui.modifier.ModifierLocal r12) {
        /*
            r11 = this;
            androidx.compose.ui.Modifier$Node r0 = r11.M()
            boolean r0 = r0.F2()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "ModifierLocal accessed from an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.a(r0)
        L_0x000f:
            r0 = 32
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x0024:
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x0030:
            if (r2 == 0) goto L_0x00c7
            androidx.compose.ui.node.NodeChain r3 = r2.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00b2
        L_0x0042:
            if (r1 == 0) goto L_0x00b2
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00ad
            r3 = r1
            r5 = r4
        L_0x004d:
            if (r3 == 0) goto L_0x00ad
            boolean r6 = r3 instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode
            if (r6 == 0) goto L_0x0068
            androidx.compose.ui.modifier.ModifierLocalModifierNode r3 = (androidx.compose.ui.modifier.ModifierLocalModifierNode) r3
            androidx.compose.ui.modifier.ModifierLocalMap r6 = r3.q1()
            boolean r6 = r6.a(r12)
            if (r6 == 0) goto L_0x00a8
            androidx.compose.ui.modifier.ModifierLocalMap r0 = r3.q1()
            java.lang.Object r12 = r0.b(r12)
            return r12
        L_0x0068:
            int r6 = r3.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a8
            boolean r6 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x00a8
            r6 = r3
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r7 = 0
            r8 = r7
        L_0x007c:
            r9 = 1
            if (r6 == 0) goto L_0x00a5
            int r10 = r6.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x00a0
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x008c
            r3 = r6
            goto L_0x00a0
        L_0x008c:
            if (r5 != 0) goto L_0x0097
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r7)
        L_0x0097:
            if (r3 == 0) goto L_0x009d
            r5.d(r3)
            r3 = r4
        L_0x009d:
            r5.d(r6)
        L_0x00a0:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x007c
        L_0x00a5:
            if (r8 != r9) goto L_0x00a8
            goto L_0x004d
        L_0x00a8:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x004d
        L_0x00ad:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0042
        L_0x00b2:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00c4
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x00c4
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0030
        L_0x00c4:
            r1 = r4
            goto L_0x0030
        L_0x00c7:
            kotlin.jvm.functions.Function0 r12 = r12.a()
            java.lang.Object r12 = r12.invoke()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalModifierNode.b(androidx.compose.ui.modifier.ModifierLocal):java.lang.Object");
    }

    ModifierLocalMap q1() {
        return EmptyMap.f17181a;
    }
}
