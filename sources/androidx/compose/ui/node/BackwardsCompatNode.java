package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    public Modifier.Element N;
    public boolean O = true;
    public BackwardsCompatLocalMap P;
    public HashSet Q = new HashSet();
    public LayoutCoordinates R;

    public BackwardsCompatNode(Modifier.Element element) {
        T2(NodeKindKt.f(element));
        this.N = element;
    }

    public void E0(FocusProperties focusProperties) {
        Modifier.Element element = this.N;
        if (!(element instanceof FocusOrderModifier)) {
            InlineClassHelperKt.c("applyFocusProperties called on wrong node");
        }
        ((FocusOrderModifier) element).f1(new FocusOrder(focusProperties));
    }

    public Object F(Density density, Object obj) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element).F(density, obj);
    }

    public void G() {
        if (this.N instanceof PointerInputModifier) {
            X0();
        }
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).I(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public void I2() {
        c3(true);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element).J(layoutCoordinates);
    }

    public void J2() {
        f3();
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).i1().e(pointerEvent, pointerEventPass, j2);
    }

    public void U(ContentDrawScope contentDrawScope) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element;
        if (this.O && (element instanceof DrawCacheModifier)) {
            g3();
        }
        drawModifier.U(contentDrawScope);
    }

    public boolean V1() {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).i1().c();
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration a0 = ((SemanticsModifier) element).a0();
        Intrinsics.g(semanticsPropertyReceiver, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) semanticsPropertyReceiver).g(a0);
    }

    public void X(FocusState focusState) {
        Modifier.Element element = this.N;
        if (!(element instanceof FocusEventModifier)) {
            InlineClassHelperKt.c("onFocusEvent called on wrong node");
        }
        ((FocusEventModifier) element).X(focusState);
    }

    public void X0() {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element).i1().d();
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).Z(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public final Modifier.Element a3() {
        return this.N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        r1 = r2.u0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(androidx.compose.ui.modifier.ModifierLocal r12) {
        /*
            r11 = this;
            java.util.HashSet r0 = r11.Q
            r0.add(r12)
            r0 = 32
            int r0 = androidx.compose.ui.node.NodeKind.a(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            boolean r1 = r1.F2()
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.c(r1)
        L_0x001a:
            androidx.compose.ui.Modifier$Node r1 = r11.M()
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            androidx.compose.ui.node.LayoutNode r2 = androidx.compose.ui.node.DelegatableNodeKt.o(r11)
        L_0x0026:
            if (r2 == 0) goto L_0x00bd
            androidx.compose.ui.node.NodeChain r3 = r2.u0()
            androidx.compose.ui.Modifier$Node r3 = r3.k()
            int r3 = r3.v2()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00a8
        L_0x0038:
            if (r1 == 0) goto L_0x00a8
            int r3 = r1.A2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00a3
            r3 = r1
            r5 = r4
        L_0x0043:
            if (r3 == 0) goto L_0x00a3
            boolean r6 = r3 instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode
            if (r6 == 0) goto L_0x005e
            androidx.compose.ui.modifier.ModifierLocalModifierNode r3 = (androidx.compose.ui.modifier.ModifierLocalModifierNode) r3
            androidx.compose.ui.modifier.ModifierLocalMap r6 = r3.q1()
            boolean r6 = r6.a(r12)
            if (r6 == 0) goto L_0x009e
            androidx.compose.ui.modifier.ModifierLocalMap r0 = r3.q1()
            java.lang.Object r12 = r0.b(r12)
            return r12
        L_0x005e:
            int r6 = r3.A2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x009e
            boolean r6 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L_0x009e
            r6 = r3
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.a3()
            r7 = 0
            r8 = r7
        L_0x0072:
            r9 = 1
            if (r6 == 0) goto L_0x009b
            int r10 = r6.A2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0096
            int r8 = r8 + 1
            if (r8 != r9) goto L_0x0082
            r3 = r6
            goto L_0x0096
        L_0x0082:
            if (r5 != 0) goto L_0x008d
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r5.<init>(r9, r7)
        L_0x008d:
            if (r3 == 0) goto L_0x0093
            r5.d(r3)
            r3 = r4
        L_0x0093:
            r5.d(r6)
        L_0x0096:
            androidx.compose.ui.Modifier$Node r6 = r6.w2()
            goto L_0x0072
        L_0x009b:
            if (r8 != r9) goto L_0x009e
            goto L_0x0043
        L_0x009e:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.h(r5)
            goto L_0x0043
        L_0x00a3:
            androidx.compose.ui.Modifier$Node r1 = r1.C2()
            goto L_0x0038
        L_0x00a8:
            androidx.compose.ui.node.LayoutNode r2 = r2.C0()
            if (r2 == 0) goto L_0x00ba
            androidx.compose.ui.node.NodeChain r1 = r2.u0()
            if (r1 == 0) goto L_0x00ba
            androidx.compose.ui.Modifier$Node r1 = r1.o()
            goto L_0x0026
        L_0x00ba:
            r1 = r4
            goto L_0x0026
        L_0x00bd:
            kotlin.jvm.functions.Function0 r12 = r12.a()
            java.lang.Object r12 = r12.invoke()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.BackwardsCompatNode.b(androidx.compose.ui.modifier.ModifierLocal):java.lang.Object");
    }

    public final HashSet b3() {
        return this.Q;
    }

    public long c() {
        return IntSizeKt.e(DelegatableNodeKt.j(this, NodeKind.a(128)).a());
    }

    public final void c3(boolean z2) {
        if (!F2()) {
            InlineClassHelperKt.c("initializeModifier called on unattached node");
        }
        Modifier.Element element = this.N;
        if ((NodeKind.a(32) & A2()) != 0) {
            if (element instanceof ModifierLocalConsumer) {
                X2(new BackwardsCompatNode$initializeModifier$2(this));
            }
            if (element instanceof ModifierLocalProvider) {
                i3((ModifierLocalProvider) element);
            }
        }
        if ((NodeKind.a(4) & A2()) != 0) {
            if (element instanceof DrawCacheModifier) {
                this.O = true;
            }
            if (!z2) {
                LayoutModifierNodeKt.a(this);
            }
        }
        if ((NodeKind.a(2) & A2()) != 0) {
            if (BackwardsCompatNodeKt.e(this)) {
                NodeCoordinator x2 = x2();
                Intrinsics.f(x2);
                ((LayoutModifierNodeCoordinator) x2).Z3(this);
                x2.n3();
            }
            if (!z2) {
                LayoutModifierNodeKt.a(this);
                DelegatableNodeKt.o(this).R0();
            }
        }
        if (element instanceof RemeasurementModifier) {
            ((RemeasurementModifier) element).g2(DelegatableNodeKt.o(this));
        }
        if ((NodeKind.a(128) & A2()) != 0) {
            if ((element instanceof OnRemeasuredModifier) && BackwardsCompatNodeKt.e(this)) {
                DelegatableNodeKt.o(this).R0();
            }
            if (element instanceof OnPlacedModifier) {
                this.R = null;
                if (BackwardsCompatNodeKt.e(this)) {
                    DelegatableNodeKt.p(this).G(new BackwardsCompatNode$initializeModifier$3(this));
                }
            }
        }
        if ((NodeKind.a(256) & A2()) != 0 && (element instanceof OnGloballyPositionedModifier) && BackwardsCompatNodeKt.e(this)) {
            DelegatableNodeKt.o(this).R0();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).d1().f().d(this);
        }
        if ((NodeKind.a(16) & A2()) != 0 && (element instanceof PointerInputModifier)) {
            ((PointerInputModifier) element).i1().f(x2());
        }
        if ((NodeKind.a(8) & A2()) != 0) {
            DelegatableNodeKt.p(this).K();
        }
    }

    public final void d3() {
        this.O = true;
        DrawModifierNodeKt.a(this);
    }

    public void e1() {
        this.O = true;
        DrawModifierNodeKt.a(this);
    }

    public final void e3(Modifier.Element element) {
        if (F2()) {
            f3();
        }
        this.N = element;
        T2(NodeKindKt.f(element));
        if (F2()) {
            c3(false);
        }
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).f(measureScope, measurable, j2);
    }

    public final void f3() {
        if (!F2()) {
            InlineClassHelperKt.c("unInitializeModifier called on unattached node");
        }
        Modifier.Element element = this.N;
        if ((NodeKind.a(32) & A2()) != 0) {
            if (element instanceof ModifierLocalProvider) {
                DelegatableNodeKt.p(this).getModifierLocalManager().d(this, ((ModifierLocalProvider) element).getKey());
            }
            if (element instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer) element).H0(BackwardsCompatNodeKt.f17214a);
            }
        }
        if ((NodeKind.a(8) & A2()) != 0) {
            DelegatableNodeKt.p(this).K();
        }
        if (element instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier) element).d1().f().v(this);
        }
    }

    public final void g3() {
        Modifier.Element element = this.N;
        if (element instanceof DrawCacheModifier) {
            DelegatableNodeKt.p(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.f17215b, new BackwardsCompatNode$updateDrawCache$1(element, this));
        }
        this.O = false;
    }

    public Density getDensity() {
        return DelegatableNodeKt.o(this).P();
    }

    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.o(this).getLayoutDirection();
    }

    public boolean h1() {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element).i1().a();
    }

    public final void h3() {
        if (F2()) {
            this.Q.clear();
            DelegatableNodeKt.p(this).getSnapshotObserver().i(this, BackwardsCompatNodeKt.f17216c, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }

    public final void i3(ModifierLocalProvider modifierLocalProvider) {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this.P;
        if (backwardsCompatLocalMap == null || !backwardsCompatLocalMap.a(modifierLocalProvider.getKey())) {
            this.P = new BackwardsCompatLocalMap(modifierLocalProvider);
            if (BackwardsCompatNodeKt.e(this)) {
                DelegatableNodeKt.p(this).getModifierLocalManager().a(this, modifierLocalProvider.getKey());
                return;
            }
            return;
        }
        backwardsCompatLocalMap.d(modifierLocalProvider);
        DelegatableNodeKt.p(this).getModifierLocalManager().f(this, modifierLocalProvider.getKey());
    }

    public void q(long j2) {
        Modifier.Element element = this.N;
        if (element instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element).q(j2);
        }
    }

    public ModifierLocalMap q1() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this.P;
        return backwardsCompatLocalMap != null ? backwardsCompatLocalMap : ModifierLocalModifierNodeKt.a();
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).t(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    public String toString() {
        return this.N.toString();
    }

    public void u(LayoutCoordinates layoutCoordinates) {
        this.R = layoutCoordinates;
        Modifier.Element element = this.N;
        if (element instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element).u(layoutCoordinates);
        }
    }

    public boolean v0() {
        return F2();
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        Modifier.Element element = this.N;
        Intrinsics.g(element, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element).w(intrinsicMeasureScope, intrinsicMeasurable, i2);
    }
}
