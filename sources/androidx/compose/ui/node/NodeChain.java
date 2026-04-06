package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NodeChain {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f17375a;

    /* renamed from: b  reason: collision with root package name */
    public final InnerNodeCoordinator f17376b;

    /* renamed from: c  reason: collision with root package name */
    public NodeCoordinator f17377c;

    /* renamed from: d  reason: collision with root package name */
    public final Modifier.Node f17378d;

    /* renamed from: e  reason: collision with root package name */
    public Modifier.Node f17379e;

    /* renamed from: f  reason: collision with root package name */
    public MutableVector f17380f;

    /* renamed from: g  reason: collision with root package name */
    public MutableVector f17381g;

    /* renamed from: h  reason: collision with root package name */
    public Differ f17382h;

    /* renamed from: i  reason: collision with root package name */
    public Logger f17383i;

    @Metadata
    public final class Differ implements DiffCallback {

        /* renamed from: a  reason: collision with root package name */
        public Modifier.Node f17384a;

        /* renamed from: b  reason: collision with root package name */
        public int f17385b;

        /* renamed from: c  reason: collision with root package name */
        public MutableVector f17386c;

        /* renamed from: d  reason: collision with root package name */
        public MutableVector f17387d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17388e;

        public Differ(Modifier.Node node, int i2, MutableVector mutableVector, MutableVector mutableVector2, boolean z2) {
            this.f17384a = node;
            this.f17385b = i2;
            this.f17386c = mutableVector;
            this.f17387d = mutableVector2;
            this.f17388e = z2;
        }

        public void a(int i2, int i3) {
            Modifier.Node w2 = this.f17384a.w2();
            Intrinsics.f(w2);
            Logger d2 = NodeChain.this.f17383i;
            if (d2 != null) {
                d2.b(i3, (Modifier.Element) this.f17386c.f15005z[this.f17385b + i3], w2);
            }
            if ((NodeKind.a(2) & w2.A2()) != 0) {
                NodeCoordinator x2 = w2.x2();
                Intrinsics.f(x2);
                NodeCoordinator W2 = x2.W2();
                NodeCoordinator V2 = x2.V2();
                Intrinsics.f(V2);
                if (W2 != null) {
                    W2.F3(V2);
                }
                V2.G3(W2);
                NodeChain.this.v(this.f17384a, V2);
            }
            this.f17384a = NodeChain.this.h(w2);
        }

        public boolean b(int i2, int i3) {
            MutableVector mutableVector = this.f17386c;
            int i4 = this.f17385b;
            return NodeChainKt.d((Modifier.Element) mutableVector.f15005z[i2 + i4], (Modifier.Element) this.f17387d.f15005z[i4 + i3]) != 0;
        }

        public void c(int i2, int i3) {
            Modifier.Node w2 = this.f17384a.w2();
            Intrinsics.f(w2);
            this.f17384a = w2;
            MutableVector mutableVector = this.f17386c;
            int i4 = this.f17385b;
            Modifier.Element element = (Modifier.Element) mutableVector.f15005z[i4 + i2];
            Modifier.Element element2 = (Modifier.Element) this.f17387d.f15005z[i4 + i3];
            if (!Intrinsics.d(element, element2)) {
                NodeChain.this.F(element, element2, this.f17384a);
                Logger d2 = NodeChain.this.f17383i;
                if (d2 != null) {
                    int i5 = this.f17385b;
                    d2.d(i5 + i2, i5 + i3, element, element2, this.f17384a);
                    return;
                }
                return;
            }
            Logger d3 = NodeChain.this.f17383i;
            if (d3 != null) {
                int i6 = this.f17385b;
                d3.c(i6 + i2, i6 + i3, element, element2, this.f17384a);
            }
        }

        public void d(int i2) {
            int i3 = this.f17385b + i2;
            Modifier.Node node = this.f17384a;
            this.f17384a = NodeChain.this.g((Modifier.Element) this.f17387d.f15005z[i3], node);
            Logger d2 = NodeChain.this.f17383i;
            if (d2 != null) {
                d2.a(i3, i3, (Modifier.Element) this.f17387d.f15005z[i3], node, this.f17384a);
            }
            if (this.f17388e) {
                Modifier.Node w2 = this.f17384a.w2();
                Intrinsics.f(w2);
                NodeCoordinator x2 = w2.x2();
                Intrinsics.f(x2);
                LayoutModifierNode d3 = DelegatableNodeKt.d(this.f17384a);
                if (d3 != null) {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.m(), d3);
                    this.f17384a.Y2(layoutModifierNodeCoordinator);
                    NodeChain.this.v(this.f17384a, layoutModifierNodeCoordinator);
                    layoutModifierNodeCoordinator.G3(x2.W2());
                    layoutModifierNodeCoordinator.F3(x2);
                    x2.G3(layoutModifierNodeCoordinator);
                } else {
                    this.f17384a.Y2(x2);
                }
                this.f17384a.G2();
                this.f17384a.M2();
                NodeKindKt.a(this.f17384a);
                return;
            }
            this.f17384a.S2(true);
        }

        public final void e(MutableVector mutableVector) {
            this.f17387d = mutableVector;
        }

        public final void f(MutableVector mutableVector) {
            this.f17386c = mutableVector;
        }

        public final void g(Modifier.Node node) {
            this.f17384a = node;
        }

        public final void h(int i2) {
            this.f17385b = i2;
        }

        public final void i(boolean z2) {
            this.f17388e = z2;
        }
    }

    @Metadata
    public interface Logger {
        void a(int i2, int i3, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void b(int i2, Modifier.Element element, Modifier.Node node);

        void c(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void d(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void e(int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public NodeChain(LayoutNode layoutNode) {
        this.f17375a = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.f17376b = innerNodeCoordinator;
        this.f17377c = innerNodeCoordinator;
        TailModifierNode U3 = innerNodeCoordinator.U2();
        this.f17378d = U3;
        this.f17379e = U3;
    }

    public final void A(int i2, MutableVector mutableVector, MutableVector mutableVector2, Modifier.Node node, boolean z2) {
        MyersDiffKt.e(mutableVector.p() - i2, mutableVector2.p() - i2, j(node, i2, mutableVector, mutableVector2, z2));
        B();
    }

    public final void B() {
        Modifier.Node C2 = this.f17378d.C2();
        int i2 = 0;
        while (C2 != null && C2 != NodeChainKt.f17390a) {
            i2 |= C2.A2();
            C2.O2(i2);
            C2 = C2.C2();
        }
    }

    public final void C() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.f17376b;
        for (Modifier.Node C2 = this.f17378d.C2(); C2 != null; C2 = C2.C2()) {
            LayoutModifierNode d2 = DelegatableNodeKt.d(C2);
            if (d2 != null) {
                if (C2.x2() != null) {
                    NodeCoordinator x2 = C2.x2();
                    Intrinsics.g(x2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = (LayoutModifierNodeCoordinator) x2;
                    LayoutModifierNode V3 = layoutModifierNodeCoordinator2.V3();
                    layoutModifierNodeCoordinator2.Z3(d2);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    if (V3 != C2) {
                        layoutModifierNodeCoordinator2.n3();
                        layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = new LayoutModifierNodeCoordinator(this.f17375a, d2);
                    C2.Y2(layoutModifierNodeCoordinator3);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator3;
                }
                nodeCoordinator.G3(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.F3(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                C2.Y2(nodeCoordinator);
            }
        }
        LayoutNode C0 = this.f17375a.C0();
        nodeCoordinator.G3(C0 != null ? C0.V() : null);
        this.f17377c = nodeCoordinator;
    }

    public final Modifier.Node D(Modifier.Node node) {
        boolean z2 = false;
        if (!(node == NodeChainKt.f17390a)) {
            InlineClassHelperKt.c("trimChain called on already trimmed chain");
        }
        Modifier.Node w2 = NodeChainKt.f17390a.w2();
        if (w2 == null) {
            w2 = this.f17378d;
        }
        w2.V2((Modifier.Node) null);
        NodeChainKt.f17390a.Q2((Modifier.Node) null);
        NodeChainKt.f17390a.O2(-1);
        NodeChainKt.f17390a.Y2((NodeCoordinator) null);
        if (w2 != NodeChainKt.f17390a) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.c("trimChain did not update the head");
        }
        return w2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(androidx.compose.ui.Modifier r19) {
        /*
            r18 = this;
            r6 = r18
            androidx.compose.ui.Modifier$Node r7 = r18.u()
            androidx.compose.runtime.collection.MutableVector r8 = r6.f17380f
            r0 = 0
            if (r8 == 0) goto L_0x0010
            int r1 = r8.p()
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            androidx.compose.runtime.collection.MutableVector r2 = r6.f17381g
            r3 = 16
            if (r2 != 0) goto L_0x001e
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Element[] r4 = new androidx.compose.ui.Modifier.Element[r3]
            r2.<init>(r4, r0)
        L_0x001e:
            r4 = r19
            androidx.compose.runtime.collection.MutableVector r9 = androidx.compose.ui.node.NodeChainKt.e(r4, r2)
            int r2 = r9.p()
            r10 = 0
            java.lang.String r4 = "expected prior modifier list to be non-empty"
            r11 = 1
            if (r2 != r1) goto L_0x00bd
            androidx.compose.ui.Modifier$Node r2 = r7.w2()
            r3 = r2
            r2 = r0
        L_0x0034:
            if (r3 == 0) goto L_0x0083
            if (r2 >= r1) goto L_0x0083
            if (r8 == 0) goto L_0x0085
            java.lang.Object[] r5 = r8.f15005z
            r5 = r5[r2]
            r15 = r5
            androidx.compose.ui.Modifier$Element r15 = (androidx.compose.ui.Modifier.Element) r15
            java.lang.Object[] r5 = r9.f15005z
            r5 = r5[r2]
            androidx.compose.ui.Modifier$Element r5 = (androidx.compose.ui.Modifier.Element) r5
            int r12 = androidx.compose.ui.node.NodeChainKt.d(r15, r5)
            if (r12 == 0) goto L_0x0078
            if (r12 == r11) goto L_0x0061
            r13 = 2
            if (r12 == r13) goto L_0x0053
            goto L_0x0071
        L_0x0053:
            androidx.compose.ui.node.NodeChain$Logger r12 = r6.f17383i
            if (r12 == 0) goto L_0x0071
            r13 = r2
            r14 = r2
            r16 = r5
            r17 = r3
            r12.c(r13, r14, r15, r16, r17)
            goto L_0x0071
        L_0x0061:
            r6.F(r15, r5, r3)
            androidx.compose.ui.node.NodeChain$Logger r12 = r6.f17383i
            if (r12 == 0) goto L_0x0071
            r13 = r2
            r14 = r2
            r16 = r5
            r17 = r3
            r12.d(r13, r14, r15, r16, r17)
        L_0x0071:
            androidx.compose.ui.Modifier$Node r3 = r3.w2()
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0078:
            androidx.compose.ui.node.NodeChain$Logger r12 = r6.f17383i
            if (r12 == 0) goto L_0x007f
            r12.e(r2, r15, r5, r3)
        L_0x007f:
            androidx.compose.ui.Modifier$Node r3 = r3.C2()
        L_0x0083:
            r5 = r3
            goto L_0x008e
        L_0x0085:
            androidx.compose.ui.internal.InlineClassHelperKt.d(r4)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x008e:
            if (r2 >= r1) goto L_0x0158
            if (r8 == 0) goto L_0x00b4
            if (r5 == 0) goto L_0x00a9
            androidx.compose.ui.node.LayoutNode r0 = r6.f17375a
            boolean r0 = r0.I()
            r12 = r0 ^ 1
            r0 = r18
            r1 = r2
            r2 = r8
            r3 = r9
            r4 = r5
            r5 = r12
            r0.A(r1, r2, r3, r4, r5)
        L_0x00a6:
            r0 = r11
            goto L_0x0158
        L_0x00a9:
            java.lang.String r0 = "structuralUpdate requires a non-null tail"
            androidx.compose.ui.internal.InlineClassHelperKt.d(r0)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00b4:
            androidx.compose.ui.internal.InlineClassHelperKt.d(r4)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x00bd:
            androidx.compose.ui.node.LayoutNode r2 = r6.f17375a
            boolean r2 = r2.I()
            if (r2 == 0) goto L_0x00ee
            if (r1 != 0) goto L_0x00ee
            r1 = r7
        L_0x00c8:
            int r2 = r9.p()
            if (r0 >= r2) goto L_0x00ea
            java.lang.Object[] r2 = r9.f15005z
            r2 = r2[r0]
            r15 = r2
            androidx.compose.ui.Modifier$Element r15 = (androidx.compose.ui.Modifier.Element) r15
            androidx.compose.ui.Modifier$Node r2 = r6.g(r15, r1)
            androidx.compose.ui.node.NodeChain$Logger r12 = r6.f17383i
            if (r12 == 0) goto L_0x00e6
            r13 = 0
            r14 = r0
            r16 = r1
            r17 = r2
            r12.a(r13, r14, r15, r16, r17)
        L_0x00e6:
            int r0 = r0 + 1
            r1 = r2
            goto L_0x00c8
        L_0x00ea:
            r18.B()
            goto L_0x00a6
        L_0x00ee:
            int r1 = r9.p()
            if (r1 != 0) goto L_0x013c
            if (r8 == 0) goto L_0x0133
            androidx.compose.ui.Modifier$Node r1 = r7.w2()
            r2 = r0
        L_0x00fb:
            if (r1 == 0) goto L_0x011b
            int r3 = r8.p()
            if (r2 >= r3) goto L_0x011b
            androidx.compose.ui.node.NodeChain$Logger r3 = r6.f17383i
            if (r3 == 0) goto L_0x0110
            java.lang.Object[] r4 = r8.f15005z
            r4 = r4[r2]
            androidx.compose.ui.Modifier$Element r4 = (androidx.compose.ui.Modifier.Element) r4
            r3.b(r2, r4, r1)
        L_0x0110:
            androidx.compose.ui.Modifier$Node r1 = r6.h(r1)
            androidx.compose.ui.Modifier$Node r1 = r1.w2()
            int r2 = r2 + 1
            goto L_0x00fb
        L_0x011b:
            androidx.compose.ui.node.InnerNodeCoordinator r1 = r6.f17376b
            androidx.compose.ui.node.LayoutNode r2 = r6.f17375a
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x012a
            androidx.compose.ui.node.NodeCoordinator r2 = r2.V()
            goto L_0x012b
        L_0x012a:
            r2 = r10
        L_0x012b:
            r1.G3(r2)
            androidx.compose.ui.node.InnerNodeCoordinator r1 = r6.f17376b
            r6.f17377c = r1
            goto L_0x0158
        L_0x0133:
            androidx.compose.ui.internal.InlineClassHelperKt.d(r4)
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L_0x013c:
            if (r8 != 0) goto L_0x0145
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Element[] r1 = new androidx.compose.ui.Modifier.Element[r3]
            r8.<init>(r1, r0)
        L_0x0145:
            androidx.compose.ui.node.LayoutNode r0 = r6.f17375a
            boolean r0 = r0.I()
            r5 = r0 ^ 1
            r1 = 0
            r0 = r18
            r2 = r8
            r3 = r9
            r4 = r7
            r0.A(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x0158:
            r6.f17380f = r9
            if (r8 == 0) goto L_0x0160
            r8.l()
            r10 = r8
        L_0x0160:
            r6.f17381g = r10
            androidx.compose.ui.Modifier$Node r1 = r6.D(r7)
            r6.f17379e = r1
            if (r0 == 0) goto L_0x016d
            r18.C()
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.E(androidx.compose.ui.Modifier):void");
    }

    public final void F(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.f((ModifierNodeElement) element2, node);
            if (node.F2()) {
                NodeKindKt.e(node);
            } else {
                node.W2(true);
            }
        } else if (node instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) node).e3(element2);
            if (node.F2()) {
                NodeKindKt.e(node);
            } else {
                node.W2(true);
            }
        } else {
            InlineClassHelperKt.c("Unknown Modifier.Node type");
        }
    }

    public final Modifier.Node g(Modifier.Element element, Modifier.Node node) {
        Modifier.Node node2;
        if (element instanceof ModifierNodeElement) {
            node2 = ((ModifierNodeElement) element).a();
            node2.T2(NodeKindKt.h(node2));
        } else {
            node2 = new BackwardsCompatNode(element);
        }
        if (node2.F2()) {
            InlineClassHelperKt.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        node2.S2(true);
        return q(node2, node);
    }

    public final Modifier.Node h(Modifier.Node node) {
        if (node.F2()) {
            NodeKindKt.d(node);
            node.N2();
            node.H2();
        }
        return w(node);
    }

    public final int i() {
        return this.f17379e.v2();
    }

    public final Differ j(Modifier.Node node, int i2, MutableVector mutableVector, MutableVector mutableVector2, boolean z2) {
        Differ differ = this.f17382h;
        if (differ == null) {
            Differ differ2 = new Differ(node, i2, mutableVector, mutableVector2, z2);
            this.f17382h = differ2;
            return differ2;
        }
        differ.g(node);
        differ.h(i2);
        differ.f(mutableVector);
        differ.e(mutableVector2);
        differ.i(z2);
        return differ;
    }

    public final Modifier.Node k() {
        return this.f17379e;
    }

    public final InnerNodeCoordinator l() {
        return this.f17376b;
    }

    public final LayoutNode m() {
        return this.f17375a;
    }

    public final NodeCoordinator n() {
        return this.f17377c;
    }

    public final Modifier.Node o() {
        return this.f17378d;
    }

    public final boolean p(int i2) {
        return (i2 & i()) != 0;
    }

    public final Modifier.Node q(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node w2 = node2.w2();
        if (w2 != null) {
            w2.V2(node);
            node.Q2(w2);
        }
        node2.Q2(node);
        node.V2(node2);
        return node;
    }

    public final boolean r() {
        return NodeChainKt.f17390a.w2() != null;
    }

    public final void s() {
        for (Modifier.Node k2 = k(); k2 != null; k2 = k2.w2()) {
            k2.G2();
        }
    }

    public final void t() {
        for (Modifier.Node o2 = o(); o2 != null; o2 = o2.C2()) {
            if (o2.F2()) {
                o2.H2();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f17379e != this.f17378d) {
            Modifier.Node k2 = k();
            while (true) {
                if (k2 == null || k2 == o()) {
                    break;
                }
                sb.append(String.valueOf(k2));
                if (k2.w2() == this.f17378d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                k2 = k2.w2();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public final Modifier.Node u() {
        if (!(this.f17379e != NodeChainKt.f17390a)) {
            InlineClassHelperKt.c("padChain called on already padded chain");
        }
        Modifier.Node node = this.f17379e;
        node.V2(NodeChainKt.f17390a);
        NodeChainKt.f17390a.Q2(node);
        return NodeChainKt.f17390a;
    }

    public final void v(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        Modifier.Node C2 = node.C2();
        while (C2 != null) {
            if (C2 == NodeChainKt.f17390a) {
                LayoutNode C0 = this.f17375a.C0();
                nodeCoordinator.G3(C0 != null ? C0.V() : null);
                this.f17377c = nodeCoordinator;
                return;
            } else if ((NodeKind.a(2) & C2.A2()) == 0) {
                C2.Y2(nodeCoordinator);
                C2 = C2.C2();
            } else {
                return;
            }
        }
    }

    public final Modifier.Node w(Modifier.Node node) {
        Modifier.Node w2 = node.w2();
        Modifier.Node C2 = node.C2();
        if (w2 != null) {
            w2.V2(C2);
            node.Q2((Modifier.Node) null);
        }
        if (C2 != null) {
            C2.Q2(w2);
            node.V2((Modifier.Node) null);
        }
        Intrinsics.f(C2);
        return C2;
    }

    public final void x() {
        for (Modifier.Node o2 = o(); o2 != null; o2 = o2.C2()) {
            if (o2.F2()) {
                o2.L2();
            }
        }
        z();
        t();
    }

    public final void y() {
        NodeCoordinator nodeCoordinator = this.f17377c;
        InnerNodeCoordinator innerNodeCoordinator = this.f17376b;
        while (nodeCoordinator != innerNodeCoordinator) {
            nodeCoordinator.k3();
            nodeCoordinator = nodeCoordinator.V2();
            Intrinsics.f(nodeCoordinator);
        }
        innerNodeCoordinator.k3();
        for (Modifier.Node k2 = k(); k2 != null; k2 = k2.w2()) {
            k2.M2();
            if (k2.z2()) {
                NodeKindKt.a(k2);
            }
            if (k2.E2()) {
                NodeKindKt.e(k2);
            }
            k2.S2(false);
            k2.W2(false);
        }
    }

    public final void z() {
        for (Modifier.Node o2 = o(); o2 != null; o2 = o2.C2()) {
            if (o2.F2()) {
                o2.N2();
            }
        }
        NodeCoordinator nodeCoordinator = this.f17376b;
        NodeCoordinator nodeCoordinator2 = this.f17377c;
        while (nodeCoordinator != nodeCoordinator2) {
            nodeCoordinator.m3();
            nodeCoordinator = nodeCoordinator.W2();
            Intrinsics.f(nodeCoordinator);
        }
        nodeCoordinator2.m3();
    }
}
