package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FocusRequester {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15802b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final FocusRequester f15803c = new FocusRequester();

    /* renamed from: d  reason: collision with root package name */
    public static final FocusRequester f15804d = new FocusRequester();

    /* renamed from: e  reason: collision with root package name */
    public static final FocusRequester f15805e = new FocusRequester();

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f15806a = new MutableVector(new FocusRequesterModifierNode[16], 0);

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class FocusRequesterFactory {

            /* renamed from: a  reason: collision with root package name */
            public static final FocusRequesterFactory f15807a = new FocusRequesterFactory();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FocusRequester a() {
            return FocusRequester.f15804d;
        }

        public final FocusRequester b() {
            return FocusRequester.f15803c;
        }

        public final FocusRequester c() {
            return FocusRequester.f15805e;
        }

        public Companion() {
        }
    }

    public static /* synthetic */ boolean i(FocusRequester focusRequester, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = FocusDirection.f15729b.b();
        }
        return focusRequester.h(i2);
    }

    public final boolean d(Function1 function1) {
        Function1 function12 = function1;
        Companion companion = f15802b;
        if (this == companion.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this == companion.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        } else if (this.f15806a.p() != 0) {
            MutableVector mutableVector = this.f15806a;
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            boolean z2 = false;
            for (int i2 = 0; i2 < p2; i2++) {
                FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i2];
                int a2 = NodeKind.a(1024);
                if (!focusRequesterModifierNode.M().F2()) {
                    InlineClassHelperKt.c("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node w2 = focusRequesterModifierNode.M().w2();
                if (w2 == null) {
                    DelegatableNodeKt.c(mutableVector2, focusRequesterModifierNode.M(), false);
                } else {
                    mutableVector2.d(w2);
                }
                while (true) {
                    if (mutableVector2.p() == 0) {
                        break;
                    }
                    Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
                    if ((node.v2() & a2) == 0) {
                        DelegatableNodeKt.c(mutableVector2, node, false);
                    } else {
                        while (true) {
                            if (node == null) {
                                continue;
                                break;
                            } else if ((node.A2() & a2) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                        if (focusTargetNode.g3().t() ? ((Boolean) function12.invoke(focusTargetNode)).booleanValue() : TwoDimensionalFocusSearchKt.k(focusTargetNode, FocusDirection.f15729b.b(), function12)) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        if (((node.A2() & a2) != 0) && (node instanceof DelegatingNode)) {
                                            int i3 = 0;
                                            for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                                if ((a3.A2() & a2) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        node = a3;
                                                    } else {
                                                        if (mutableVector3 == null) {
                                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (node != null) {
                                                            mutableVector3.d(node);
                                                            node = null;
                                                        }
                                                        mutableVector3.d(a3);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                    }
                                    node = DelegatableNodeKt.h(mutableVector3);
                                }
                                continue;
                            } else {
                                node = node.w2();
                            }
                        }
                    }
                }
            }
            return z2;
        } else {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
    }

    public final boolean e() {
        if (this.f15806a.p() != 0) {
            MutableVector mutableVector = this.f15806a;
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            for (int i2 = 0; i2 < p2; i2++) {
                if (FocusRequesterModifierNodeKt.a((FocusRequesterModifierNode) objArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
    }

    public final MutableVector f() {
        return this.f15806a;
    }

    public final /* synthetic */ void g() {
        h(FocusDirection.f15729b.b());
    }

    public final boolean h(int i2) {
        return d(new FocusRequester$requestFocus$1(i2));
    }
}
