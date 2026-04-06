package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata
public final class ModifierLocalManager {

    /* renamed from: a  reason: collision with root package name */
    public final Owner f17185a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableVector f17186b = new MutableVector(new BackwardsCompatNode[16], 0);

    /* renamed from: c  reason: collision with root package name */
    public final MutableVector f17187c = new MutableVector(new ModifierLocal[16], 0);

    /* renamed from: d  reason: collision with root package name */
    public final MutableVector f17188d = new MutableVector(new LayoutNode[16], 0);

    /* renamed from: e  reason: collision with root package name */
    public final MutableVector f17189e = new MutableVector(new ModifierLocal[16], 0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f17190f;

    public ModifierLocalManager(Owner owner) {
        this.f17185a = owner;
    }

    public final void a(BackwardsCompatNode backwardsCompatNode, ModifierLocal modifierLocal) {
        this.f17186b.d(backwardsCompatNode);
        this.f17187c.d(modifierLocal);
        b();
    }

    public final void b() {
        if (!this.f17190f) {
            this.f17190f = true;
            this.f17185a.F(new ModifierLocalManager$invalidate$1(this));
        }
    }

    public final void c(Modifier.Node node, ModifierLocal modifierLocal, Set set) {
        int a2 = NodeKind.a(32);
        if (!node.M().F2()) {
            InlineClassHelperKt.c("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = node.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector, node.M(), false);
        } else {
            mutableVector.d(w2);
        }
        while (mutableVector.p() != 0) {
            Modifier.Node node2 = (Modifier.Node) mutableVector.y(mutableVector.p() - 1);
            if ((node2.v2() & a2) != 0) {
                Modifier.Node node3 = node2;
                while (true) {
                    if (node3 == null) {
                        break;
                    }
                    if ((node3.A2() & a2) != 0) {
                        Modifier.Node node4 = node3;
                        MutableVector mutableVector2 = null;
                        while (node4 != null) {
                            if (node4 instanceof ModifierLocalModifierNode) {
                                ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) node4;
                                if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                    if ((backwardsCompatNode.a3() instanceof ModifierLocalConsumer) && backwardsCompatNode.b3().contains(modifierLocal)) {
                                        set.add(modifierLocalModifierNode);
                                    }
                                }
                                if (modifierLocalModifierNode.q1().a(modifierLocal)) {
                                    break;
                                }
                            } else if ((node4.A2() & a2) != 0 && (node4 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node4).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node4 = a3;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node4 != null) {
                                                mutableVector2.d(node4);
                                                node4 = null;
                                            }
                                            mutableVector2.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node4 = DelegatableNodeKt.h(mutableVector2);
                        }
                        continue;
                    }
                    node3 = node3.w2();
                }
            }
            DelegatableNodeKt.c(mutableVector, node2, false);
        }
    }

    public final void d(BackwardsCompatNode backwardsCompatNode, ModifierLocal modifierLocal) {
        this.f17188d.d(DelegatableNodeKt.o(backwardsCompatNode));
        this.f17189e.d(modifierLocal);
        b();
    }

    public final void e() {
        this.f17190f = false;
        HashSet<BackwardsCompatNode> hashSet = new HashSet<>();
        MutableVector mutableVector = this.f17188d;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            ModifierLocal modifierLocal = (ModifierLocal) this.f17189e.f15005z[i2];
            if (layoutNode.u0().k().F2()) {
                c(layoutNode.u0().k(), modifierLocal, hashSet);
            }
        }
        this.f17188d.l();
        this.f17189e.l();
        MutableVector mutableVector2 = this.f17186b;
        Object[] objArr2 = mutableVector2.f15005z;
        int p3 = mutableVector2.p();
        for (int i3 = 0; i3 < p3; i3++) {
            BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) objArr2[i3];
            ModifierLocal modifierLocal2 = (ModifierLocal) this.f17187c.f15005z[i3];
            if (backwardsCompatNode.F2()) {
                c(backwardsCompatNode, modifierLocal2, hashSet);
            }
        }
        this.f17186b.l();
        this.f17187c.l();
        for (BackwardsCompatNode h3 : hashSet) {
            h3.h3();
        }
    }

    public final void f(BackwardsCompatNode backwardsCompatNode, ModifierLocal modifierLocal) {
        this.f17186b.d(backwardsCompatNode);
        this.f17187c.d(modifierLocal);
        b();
    }
}
