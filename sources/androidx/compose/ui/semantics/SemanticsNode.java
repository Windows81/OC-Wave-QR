package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SemanticsNode {

    /* renamed from: a  reason: collision with root package name */
    public final Modifier.Node f18087a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18088b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutNode f18089c;

    /* renamed from: d  reason: collision with root package name */
    public final SemanticsConfiguration f18090d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18091e;

    /* renamed from: f  reason: collision with root package name */
    public SemanticsNode f18092f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18093g;

    public SemanticsNode(Modifier.Node node, boolean z2, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.f18087a = node;
        this.f18088b = z2;
        this.f18089c = layoutNode;
        this.f18090d = semanticsConfiguration;
        this.f18093g = layoutNode.v();
    }

    public static /* synthetic */ List D(SemanticsNode semanticsNode, List list, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.C(list, z2, z3);
    }

    public static /* synthetic */ List g(SemanticsNode semanticsNode, List list, List list2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.f(list, list2);
    }

    public static /* synthetic */ List m(SemanticsNode semanticsNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = !semanticsNode.f18088b;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        if ((i2 & 4) != 0) {
            z4 = false;
        }
        return semanticsNode.l(z2, z3, z4);
    }

    public final boolean A() {
        if (!this.f18091e && t().isEmpty()) {
            LayoutNode C0 = this.f18089c.C0();
            while (true) {
                if (C0 == null) {
                    C0 = null;
                    break;
                }
                SemanticsConfiguration a0 = C0.a0();
                if (a0 != null && a0.u()) {
                    break;
                }
                C0 = C0.C0();
            }
            if (C0 == null) {
                return true;
            }
        }
        return false;
    }

    public final void B(List list, SemanticsConfiguration semanticsConfiguration) {
        if (!this.f18090d.s()) {
            D(this, list, false, false, 6, (Object) null);
            int size = list.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                SemanticsNode semanticsNode = (SemanticsNode) list.get(size2);
                if (!semanticsNode.y()) {
                    semanticsConfiguration.v(semanticsNode.f18090d);
                    semanticsNode.B(list, semanticsConfiguration);
                }
            }
        }
    }

    public final List C(List list, boolean z2, boolean z3) {
        if (this.f18091e) {
            return CollectionsKt.m();
        }
        d(this.f18089c, list, z3);
        if (z2) {
            b(list);
        }
        return list;
    }

    public final SemanticsNode a() {
        return new SemanticsNode(this.f18087a, true, this.f18089c, this.f18090d);
    }

    public final void b(List list) {
        Role c2 = SemanticsNodeKt.g(this);
        if (c2 != null && this.f18090d.u() && !list.isEmpty()) {
            list.add(c(c2, new SemanticsNode$emitFakeNodes$fakeNode$1(c2)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f18090d;
        SemanticsProperties semanticsProperties = SemanticsProperties.f18102a;
        if (semanticsConfiguration.h(semanticsProperties.d()) && !list.isEmpty() && this.f18090d.u()) {
            List list2 = (List) SemanticsConfigurationKt.a(this.f18090d, semanticsProperties.d());
            String str = list2 != null ? (String) CollectionsKt.g0(list2) : null;
            if (str != null) {
                list.add(0, c((Role) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    public final SemanticsNode c(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.z(false);
        semanticsConfiguration.w(false);
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, role != null ? SemanticsNodeKt.h(this) : SemanticsNodeKt.e(this)), semanticsConfiguration);
        semanticsNode.f18091e = true;
        semanticsNode.f18092f = this;
        return semanticsNode;
    }

    public final void d(LayoutNode layoutNode, List list, boolean z2) {
        MutableVector I0 = layoutNode.I0();
        Object[] objArr = I0.f15005z;
        int p2 = I0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.b() && (z2 || !layoutNode2.x())) {
                if (layoutNode2.u0().p(NodeKind.a(8))) {
                    list.add(SemanticsNodeKt.a(layoutNode2, this.f18088b));
                } else {
                    d(layoutNode2, list, z2);
                }
            }
        }
    }

    public final NodeCoordinator e() {
        if (this.f18091e) {
            SemanticsNode r2 = r();
            if (r2 != null) {
                return r2.e();
            }
            return null;
        }
        DelegatableNode f2 = SemanticsNodeKt.f(this.f18089c);
        if (f2 == null) {
            f2 = this.f18087a;
        }
        return DelegatableNodeKt.j(f2, NodeKind.a(8));
    }

    public final List f(List list, List list2) {
        D(this, list, false, false, 6, (Object) null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = (SemanticsNode) list.get(size2);
            if (semanticsNode.y()) {
                list2.add(semanticsNode);
            } else if (!semanticsNode.f18090d.s()) {
                semanticsNode.f(list, list2);
            }
        }
        return list2;
    }

    public final Rect h() {
        LayoutCoordinates e1;
        SemanticsNode r2 = r();
        if (r2 == null) {
            return Rect.f15860e.a();
        }
        NodeCoordinator e2 = e();
        if (e2 != null) {
            if (!e2.b()) {
                e2 = null;
            }
            if (!(e2 == null || (e1 = e2.e1()) == null)) {
                return LayoutCoordinates.J(DelegatableNodeKt.j(r2.f18087a, NodeKind.a(8)), e1, false, 2, (Object) null);
            }
        }
        return Rect.f15860e.a();
    }

    public final Rect i() {
        Rect b2;
        NodeCoordinator e2 = e();
        if (e2 != null) {
            if (!e2.b()) {
                e2 = null;
            }
            if (!(e2 == null || (b2 = LayoutCoordinatesKt.b(e2)) == null)) {
                return b2;
            }
        }
        return Rect.f15860e.a();
    }

    public final Rect j() {
        Rect c2;
        NodeCoordinator e2 = e();
        if (e2 != null) {
            if (!e2.b()) {
                e2 = null;
            }
            if (!(e2 == null || (c2 = LayoutCoordinatesKt.c(e2)) == null)) {
                return c2;
            }
        }
        return Rect.f15860e.a();
    }

    public final List k() {
        return m(this, false, false, false, 7, (Object) null);
    }

    public final List l(boolean z2, boolean z3, boolean z4) {
        if (!z2 && this.f18090d.s()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        return y() ? g(this, arrayList, (List) null, 2, (Object) null) : C(arrayList, z3, z4);
    }

    public final SemanticsConfiguration n() {
        if (!y()) {
            return this.f18090d;
        }
        SemanticsConfiguration m2 = this.f18090d.m();
        B(new ArrayList(), m2);
        return m2;
    }

    public final int o() {
        return this.f18093g;
    }

    public final LayoutInfo p() {
        return this.f18089c;
    }

    public final LayoutNode q() {
        return this.f18089c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.semantics.SemanticsNode r() {
        /*
            r4 = this;
            androidx.compose.ui.semantics.SemanticsNode r0 = r4.f18092f
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            boolean r0 = r4.f18088b
            r1 = 0
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.node.LayoutNode r0 = r4.f18089c
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
        L_0x0010:
            if (r0 == 0) goto L_0x0025
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r0.a0()
            if (r2 == 0) goto L_0x0020
            boolean r2 = r2.u()
            r3 = 1
            if (r2 != r3) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
            goto L_0x0010
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 != 0) goto L_0x0047
            androidx.compose.ui.node.LayoutNode r0 = r4.f18089c
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
        L_0x002e:
            if (r0 == 0) goto L_0x0046
            androidx.compose.ui.node.NodeChain r2 = r0.u0()
            r3 = 8
            int r3 = androidx.compose.ui.node.NodeKind.a(r3)
            boolean r2 = r2.p(r3)
            if (r2 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
            goto L_0x002e
        L_0x0046:
            r0 = r1
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            return r1
        L_0x004a:
            boolean r1 = r4.f18088b
            androidx.compose.ui.semantics.SemanticsNode r0 = androidx.compose.ui.semantics.SemanticsNodeKt.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNode.r():androidx.compose.ui.semantics.SemanticsNode");
    }

    public final long s() {
        NodeCoordinator e2 = e();
        if (e2 != null) {
            if (!e2.b()) {
                e2 = null;
            }
            if (e2 != null) {
                return LayoutCoordinatesKt.f(e2);
            }
        }
        return Offset.f15855b.c();
    }

    public final List t() {
        return m(this, false, true, false, 4, (Object) null);
    }

    public final long u() {
        NodeCoordinator e2 = e();
        return e2 != null ? e2.a() : IntSize.f19170b.a();
    }

    public final Rect v() {
        DelegatableNode delegatableNode;
        if (this.f18090d.u()) {
            delegatableNode = SemanticsNodeKt.f(this.f18089c);
            if (delegatableNode == null) {
                delegatableNode = this.f18087a;
            }
        } else {
            delegatableNode = this.f18087a;
        }
        return SemanticsModifierNodeKt.c(delegatableNode.M(), SemanticsModifierNodeKt.a(this.f18090d));
    }

    public final SemanticsConfiguration w() {
        return this.f18090d;
    }

    public final boolean x() {
        return this.f18091e;
    }

    public final boolean y() {
        return this.f18088b && this.f18090d.u();
    }

    public final boolean z() {
        NodeCoordinator e2 = e();
        if (e2 != null) {
            return e2.i3();
        }
        return false;
    }
}
