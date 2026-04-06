package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    public static final TraverseKey X = new TraverseKey((DefaultConstructorMarker) null);
    public static final int Y = 8;
    public MutableInteractionSource P;
    public final Function1 Q;
    public final boolean R;
    public FocusInteraction.Focus S;
    public PinnableContainer.PinnedHandle T;
    public LayoutCoordinates U;
    public final FocusTargetModifierNode V;
    public Function0 W;

    @Metadata
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public TraverseKey() {
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, i2, function1);
    }

    private final void h3() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.P;
        if (!(mutableInteractionSource == null || (focus = this.S) == null)) {
            mutableInteractionSource.b(new FocusInteraction.Unfocus(focus));
        }
        this.S = null;
    }

    public boolean D2() {
        return this.R;
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.U = layoutCoordinates;
        if (this.V.A0().f()) {
            if (layoutCoordinates.b()) {
                l3();
                return;
            }
            FocusedBoundsObserverNode k3 = k3();
            if (k3 != null) {
                k3.Z2((LayoutCoordinates) null);
            }
        }
    }

    public void K2() {
        PinnableContainer.PinnedHandle pinnedHandle = this.T;
        if (pinnedHandle != null) {
            pinnedHandle.g();
        }
        this.T = null;
    }

    public void L1() {
        PinnableContainer n3 = n3();
        if (this.V.A0().f()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.T;
            if (pinnedHandle != null) {
                pinnedHandle.g();
            }
            this.T = n3 != null ? n3.a() : null;
        }
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.j0(semanticsPropertyReceiver, this.V.A0().f());
        if (this.W == null) {
            this.W = new FocusableNode$applySemantics$1(this);
        }
        SemanticsPropertiesKt.U(semanticsPropertyReceiver, (String) null, this.W, 1, (Object) null);
    }

    public Object i0() {
        return X;
    }

    public final void i3(boolean z2) {
        MutableInteractionSource mutableInteractionSource = this.P;
        if (mutableInteractionSource == null) {
            return;
        }
        if (z2) {
            FocusInteraction.Focus focus = this.S;
            if (focus != null) {
                j3(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                this.S = null;
            }
            FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
            j3(mutableInteractionSource, focus2);
            this.S = focus2;
            return;
        }
        FocusInteraction.Focus focus3 = this.S;
        if (focus3 != null) {
            j3(mutableInteractionSource, new FocusInteraction.Unfocus(focus3));
            this.S = null;
        }
    }

    public final void j3(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        if (F2()) {
            Job job = (Job) y2().getCoroutineContext().d(Job.f41415x);
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new FocusableNode$emitWithFallback$1(mutableInteractionSource, interaction, job != null ? job.S(new FocusableNode$emitWithFallback$handler$1(mutableInteractionSource, interaction)) : null, (Continuation) null), 3, (Object) null);
            return;
        }
        mutableInteractionSource.b(interaction);
    }

    public final FocusedBoundsObserverNode k3() {
        if (!F2()) {
            return null;
        }
        TraversableNode a2 = TraversableNodeKt.a(this, FocusedBoundsObserverNode.P);
        if (a2 instanceof FocusedBoundsObserverNode) {
            return (FocusedBoundsObserverNode) a2;
        }
        return null;
    }

    public final void l3() {
        FocusedBoundsObserverNode k3;
        LayoutCoordinates layoutCoordinates = this.U;
        if (layoutCoordinates != null) {
            Intrinsics.f(layoutCoordinates);
            if (layoutCoordinates.b() && (k3 = k3()) != null) {
                k3.Z2(this.U);
            }
        }
    }

    public final void m3(FocusState focusState, FocusState focusState2) {
        boolean f2;
        if (F2() && (f2 = focusState2.f()) != focusState.f()) {
            Function1 function1 = this.Q;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(f2));
            }
            PinnableContainer.PinnedHandle pinnedHandle = null;
            if (f2) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new FocusableNode$onFocusStateChange$1(this, (Continuation) null), 3, (Object) null);
                PinnableContainer n3 = n3();
                if (n3 != null) {
                    pinnedHandle = n3.a();
                }
                this.T = pinnedHandle;
                l3();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle2 = this.T;
                if (pinnedHandle2 != null) {
                    pinnedHandle2.g();
                }
                this.T = null;
                FocusedBoundsObserverNode k3 = k3();
                if (k3 != null) {
                    k3.Z2((LayoutCoordinates) null);
                }
            }
            SemanticsModifierNodeKt.b(this);
            i3(f2);
        }
    }

    public final PinnableContainer n3() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.a(this, new FocusableNode$retrievePinnableContainer$1(objectRef, this));
        return (PinnableContainer) objectRef.f40908z;
    }

    public final void o3(MutableInteractionSource mutableInteractionSource) {
        if (!Intrinsics.d(this.P, mutableInteractionSource)) {
            h3();
            this.P = mutableInteractionSource;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, (i3 & 2) != 0 ? Focusability.f15833b.a() : i2, (i3 & 4) != 0 ? null : function1, (DefaultConstructorMarker) null);
    }

    public FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1) {
        this.P = mutableInteractionSource;
        this.Q = function1;
        this.V = (FocusTargetModifierNode) Z2(FocusTargetModifierNodeKt.a(i2, new FocusableNode$focusTargetNode$1(this)));
    }
}
