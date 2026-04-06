package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public DpTouchBoundsExpansion N;
    public PointerIcon O;
    public boolean P;
    public boolean Q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public void J2() {
        l3();
        super.J2();
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (pointerEventPass == PointerEventPass.Main) {
            List c2 = pointerEvent.c();
            int size = c2.size();
            int i2 = 0;
            while (i2 < size) {
                if (j3(((PointerInputChange) c2.get(i2)).n())) {
                    int h2 = pointerEvent.h();
                    PointerEventType.Companion companion = PointerEventType.f16852b;
                    if (PointerEventType.j(h2, companion.a())) {
                        k3();
                        return;
                    } else if (PointerEventType.j(pointerEvent.h(), companion.b())) {
                        l3();
                        return;
                    } else {
                        return;
                    }
                } else {
                    i2++;
                }
            }
        }
    }

    public void X0() {
        l3();
    }

    public final void a3() {
        PointerIcon pointerIcon;
        HoverIconModifierNode g3 = g3();
        if (g3 == null || (pointerIcon = g3.O) == null) {
            pointerIcon = this.O;
        }
        b3(pointerIcon);
    }

    public abstract void b3(PointerIcon pointerIcon);

    public final void c3() {
        Unit unit;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.d(this, new HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(objectRef));
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.f40908z;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.a3();
            unit = Unit.f40552a;
        } else {
            unit = null;
        }
        if (unit == null) {
            b3((PointerIcon) null);
        }
    }

    public final void d3() {
        HoverIconModifierNode hoverIconModifierNode;
        if (this.Q) {
            if (this.P || (hoverIconModifierNode = f3()) == null) {
                hoverIconModifierNode = this;
            }
            hoverIconModifierNode.a3();
        }
    }

    public final void e3() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f40901z = true;
        if (!this.P) {
            TraversableNodeKt.f(this, new HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(booleanRef));
        }
        if (booleanRef.f40901z) {
            a3();
        }
    }

    public final HoverIconModifierNode f3() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.f(this, new HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(objectRef));
        return (HoverIconModifierNode) objectRef.f40908z;
    }

    public final HoverIconModifierNode g3() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.d(this, new HoverIconModifierNode$findOverridingAncestorNode$1(objectRef));
        return (HoverIconModifierNode) objectRef.f40908z;
    }

    public final boolean h3() {
        return this.P;
    }

    public final PointerIconService i3() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.n());
    }

    public abstract boolean j3(int i2);

    public final void k3() {
        this.Q = true;
        e3();
    }

    public final void l3() {
        if (this.Q) {
            this.Q = false;
            if (F2()) {
                c3();
            }
        }
    }

    public final void m3(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.N = dpTouchBoundsExpansion;
    }

    public long n0() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.N;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.a(DelegatableNodeKt.k(this)) : TouchBoundsExpansion.f17451b.b();
    }

    public final void n3(PointerIcon pointerIcon) {
        if (!Intrinsics.d(this.O, pointerIcon)) {
            this.O = pointerIcon;
            if (this.Q) {
                e3();
            }
        }
    }

    public final void o3(boolean z2) {
        if (this.P != z2) {
            this.P = z2;
            if (z2) {
                if (this.Q) {
                    a3();
                }
            } else if (this.Q) {
                d3();
            }
        }
    }

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.N = dpTouchBoundsExpansion;
        this.O = pointerIcon;
        this.P = z2;
    }
}
