package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public ScrollableState P;
    public Orientation Q;
    public boolean R;
    public boolean S;
    public FlingBehavior T;
    public MutableInteractionSource U;
    public BringIntoViewSpec V;
    public boolean W;
    public OverscrollEffect X;
    public final boolean Y;
    public ScrollableNode Z;
    public DelegatableNode a0;
    public OverscrollFactory b0;
    public OverscrollEffect c0;
    public boolean d0;

    public ScrollingContainerNode(ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z4, OverscrollEffect overscrollEffect) {
        this.P = scrollableState;
        this.Q = orientation;
        this.R = z2;
        this.S = z3;
        this.T = flingBehavior;
        this.U = mutableInteractionSource;
        this.V = bringIntoViewSpec;
        this.W = z4;
        this.X = overscrollEffect;
    }

    public boolean D2() {
        return this.Y;
    }

    public void I2() {
        this.d0 = k3();
        i3();
        if (this.Z == null) {
            this.Z = (ScrollableNode) Z2(new ScrollableNode(this.P, j3(), this.T, this.Q, this.R, this.d0, this.U, this.V));
        }
    }

    public void J2() {
        DelegatableNode delegatableNode = this.a0;
        if (delegatableNode != null) {
            c3(delegatableNode);
        }
    }

    public void L1() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.a(this, OverscrollKt.a());
        if (!Intrinsics.d(overscrollFactory, this.b0)) {
            this.b0 = overscrollFactory;
            this.c0 = null;
            DelegatableNode delegatableNode = this.a0;
            if (delegatableNode != null) {
                c3(delegatableNode);
            }
            this.a0 = null;
            i3();
            ScrollableNode scrollableNode = this.Z;
            if (scrollableNode != null) {
                scrollableNode.J3(this.P, this.Q, j3(), this.R, this.d0, this.T, this.U, this.V);
            }
        }
    }

    public final void i3() {
        DelegatableNode delegatableNode = this.a0;
        if (delegatableNode == null) {
            if (this.W) {
                ObserverModifierNodeKt.a(this, new ScrollingContainerNode$attachOverscrollNodeIfNeeded$1(this));
            }
            OverscrollEffect j3 = j3();
            if (j3 != null) {
                DelegatableNode M = j3.M();
                if (!M.M().F2()) {
                    this.a0 = Z2(M);
                }
            }
        } else if (delegatableNode != null && !delegatableNode.M().F2()) {
            Z2(delegatableNode);
        }
    }

    public void j1() {
        boolean k3 = k3();
        if (this.d0 != k3) {
            this.d0 = k3;
            l3(this.P, this.Q, this.W, j3(), this.R, this.S, this.T, this.U, this.V);
        }
    }

    public final OverscrollEffect j3() {
        return this.W ? this.c0 : this.X;
    }

    public final boolean k3() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (F2()) {
            layoutDirection = DelegatableNodeKt.n(this);
        }
        return ScrollableDefaults.f3558a.b(layoutDirection, this.Q, this.S);
    }

    public final void l3(ScrollableState scrollableState, Orientation orientation, boolean z2, OverscrollEffect overscrollEffect, boolean z3, boolean z4, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z5;
        boolean z6 = z2;
        OverscrollEffect overscrollEffect2 = overscrollEffect;
        this.P = scrollableState;
        this.Q = orientation;
        boolean z7 = true;
        if (this.W != z6) {
            this.W = z6;
            z5 = true;
        } else {
            z5 = false;
        }
        if (!Intrinsics.d(this.X, overscrollEffect)) {
            this.X = overscrollEffect2;
        } else {
            z7 = false;
        }
        if (z5 || (z7 && !z6)) {
            DelegatableNode delegatableNode = this.a0;
            if (delegatableNode != null) {
                c3(delegatableNode);
            }
            this.a0 = null;
            i3();
        }
        this.R = z3;
        this.S = z4;
        this.T = flingBehavior;
        this.U = mutableInteractionSource;
        this.V = bringIntoViewSpec;
        this.d0 = k3();
        ScrollableNode scrollableNode = this.Z;
        if (scrollableNode != null) {
            scrollableNode.J3(scrollableState, orientation, j3(), z3, this.d0, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
        }
    }
}
