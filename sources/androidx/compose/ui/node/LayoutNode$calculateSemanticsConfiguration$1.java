package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class LayoutNode$calculateSemanticsConfiguration$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17296A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17297z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$calculateSemanticsConfiguration$1(LayoutNode layoutNode, Ref.ObjectRef objectRef) {
        super(0);
        this.f17297z = layoutNode;
        this.f17296A = objectRef;
    }

    public final void invoke() {
        NodeChain u0 = this.f17297z.u0();
        int a2 = NodeKind.a(8);
        Ref.ObjectRef objectRef = this.f17296A;
        if ((u0.i() & a2) != 0) {
            for (Modifier.Node o2 = u0.o(); o2 != null; o2 = o2.C2()) {
                if ((o2.A2() & a2) != 0) {
                    Modifier.Node node = o2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof SemanticsModifierNode) {
                            SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) node;
                            if (semanticsModifierNode.Z0()) {
                                SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                objectRef.f40908z = semanticsConfiguration;
                                semanticsConfiguration.w(true);
                            }
                            if (semanticsModifierNode.i2()) {
                                ((SemanticsConfiguration) objectRef.f40908z).z(true);
                            }
                            semanticsModifierNode.W((SemanticsPropertyReceiver) objectRef.f40908z);
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
                }
            }
        }
    }
}
