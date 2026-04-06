package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View N;
    public ViewTreeObserver O;
    public final Function1 P = new FocusGroupPropertiesNode$onEnter$1(this);
    public final Function1 Q = new FocusGroupPropertiesNode$onExit$1(this);

    public void E0(FocusProperties focusProperties) {
        focusProperties.B(false);
        focusProperties.C(this.P);
        focusProperties.z(this.Q);
    }

    public void I2() {
        super.I2();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.a(this).getViewTreeObserver();
        this.O = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    public void J2() {
        ViewTreeObserver viewTreeObserver = this.O;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.O = null;
        DelegatableNode_androidKt.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.N = null;
        super.J2();
    }

    public final FocusTargetNode Z2() {
        int a2 = NodeKind.a(1024);
        if (!M().F2()) {
            InlineClassHelperKt.c("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node M = M();
        if ((M.v2() & a2) != 0) {
            boolean z2 = false;
            for (Modifier.Node w2 = M.w2(); w2 != null; w2 = w2.w2()) {
                if ((w2.A2() & a2) != 0) {
                    Modifier.Node node = w2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z2 = true;
                        } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                if ((a3.A2() & a2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node = a3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.d(node);
                                            node = null;
                                        }
                                        mutableVector.d(a3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.h(mutableVector);
                    }
                    continue;
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final View a3() {
        return this.N;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (DelegatableNodeKt.o(this).B0() != null) {
            View c2 = FocusGroupNode_androidKt.g(this);
            FocusOwner focusOwner = DelegatableNodeKt.p(this).getFocusOwner();
            Owner p2 = DelegatableNodeKt.p(this);
            boolean z2 = view != null && !Intrinsics.d(view, p2) && FocusGroupNode_androidKt.d(c2, view);
            boolean z3 = view2 != null && !Intrinsics.d(view2, p2) && FocusGroupNode_androidKt.d(c2, view2);
            if (z2 && z3) {
                this.N = view2;
            } else if (z3) {
                this.N = view2;
                FocusTargetNode Z2 = Z2();
                if (Z2.A0().d()) {
                    return;
                }
                if (ComposeUiFlags.f15479g) {
                    FocusTransactionsKt.k(Z2);
                    return;
                }
                FocusTransactionManager l2 = focusOwner.l();
                try {
                    if (l2.i()) {
                        l2.f();
                    }
                    l2.e();
                    FocusTransactionsKt.k(Z2);
                    l2.g();
                } catch (Throwable th) {
                    l2.g();
                    throw th;
                }
            } else if (z2) {
                this.N = null;
                if (Z2().A0().f()) {
                    focusOwner.i(false, true, false, FocusDirection.f15729b.c());
                }
            } else {
                this.N = null;
            }
        }
    }
}
