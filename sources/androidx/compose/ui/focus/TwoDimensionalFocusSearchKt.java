package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TwoDimensionalFocusSearchKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15844a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15844a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.A0() == FocusStateImpl.ActiveParent) {
            FocusTargetNode b2 = FocusTraversalKt.b(focusTargetNode);
            if (b2 != null) {
                return b2;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy");
    }

    public static final boolean c(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (d(rect3, i2, rect) || !d(rect2, i2, rect)) {
            return false;
        }
        if (e(rect3, i2, rect)) {
            FocusDirection.Companion companion = FocusDirection.f15729b;
            if (!FocusDirection.l(i2, companion.d()) && !FocusDirection.l(i2, companion.g()) && f(rect2, i2, rect) >= g(rect3, i2, rect)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (!(FocusDirection.l(i2, companion.d()) ? true : FocusDirection.l(i2, companion.g()))) {
            if (!(FocusDirection.l(i2, companion.h()) ? true : FocusDirection.l(i2, companion.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            } else if (rect.p() > rect2.o() && rect.o() < rect2.p()) {
                return true;
            }
        } else if (rect.i() > rect2.r() && rect.r() < rect2.i()) {
            return true;
        }
        return false;
    }

    public static final boolean e(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.d())) {
            if (rect2.o() < rect.p()) {
                return false;
            }
        } else if (FocusDirection.l(i2, companion.g())) {
            if (rect2.p() > rect.o()) {
                return false;
            }
        } else if (FocusDirection.l(i2, companion.h())) {
            if (rect2.r() < rect.i()) {
                return false;
            }
        } else if (!FocusDirection.l(i2, companion.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if (rect2.i() > rect.r()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float f(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x0016
            float r3 = r4.o()
            float r2 = r2.p()
        L_0x0014:
            float r3 = r3 - r2
            goto L_0x0051
        L_0x0016:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x002b
            float r2 = r2.o()
            float r3 = r4.p()
        L_0x0028:
            float r3 = r2 - r3
            goto L_0x0051
        L_0x002b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x003e
            float r3 = r4.r()
            float r2 = r2.i()
            goto L_0x0014
        L_0x003e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.l(r3, r0)
            if (r3 == 0) goto L_0x0058
            float r2 = r2.r()
            float r3 = r4.i()
            goto L_0x0028
        L_0x0051:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0057
            r3 = r2
        L_0x0057:
            return r3
        L_0x0058:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.f(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float g(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x0016
            float r3 = r4.o()
            float r2 = r2.o()
        L_0x0014:
            float r3 = r3 - r2
            goto L_0x0051
        L_0x0016:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x002b
            float r2 = r2.p()
            float r3 = r4.p()
        L_0x0028:
            float r3 = r2 - r3
            goto L_0x0051
        L_0x002b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x003e
            float r3 = r4.r()
            float r2 = r2.r()
            goto L_0x0014
        L_0x003e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.l(r3, r0)
            if (r3 == 0) goto L_0x0059
            float r2 = r2.i()
            float r3 = r4.i()
            goto L_0x0028
        L_0x0051:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0058
            r3 = r2
        L_0x0058:
            return r3
        L_0x0059:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.g(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    public static final Rect h(Rect rect) {
        return new Rect(rect.p(), rect.i(), rect.p(), rect.i());
    }

    public static final void i(DelegatableNode delegatableNode, MutableVector mutableVector) {
        int a2 = NodeKind.a(1024);
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = delegatableNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, delegatableNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                                if (focusTargetNode.F2() && !DelegatableNodeKt.o(focusTargetNode).x()) {
                                    if (focusTargetNode.g3().t()) {
                                        mutableVector.d(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
    }

    public static final FocusTargetNode j(MutableVector mutableVector, Rect rect, int i2) {
        Rect rect2;
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.d())) {
            rect2 = rect.A((rect.p() - rect.o()) + ((float) 1), 0.0f);
        } else if (FocusDirection.l(i2, companion.g())) {
            rect2 = rect.A(-((rect.p() - rect.o()) + ((float) 1)), 0.0f);
        } else if (FocusDirection.l(i2, companion.h())) {
            rect2 = rect.A(0.0f, (rect.i() - rect.r()) + ((float) 1));
        } else if (FocusDirection.l(i2, companion.a())) {
            rect2 = rect.A(0.0f, -((rect.i() - rect.r()) + ((float) 1)));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < p2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.g(focusTargetNode2)) {
                Rect d2 = FocusTraversalKt.d(focusTargetNode2);
                if (m(d2, rect2, rect, i2)) {
                    focusTargetNode = focusTargetNode2;
                    rect2 = d2;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i2, Function1 function1) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        i(focusTargetNode, mutableVector);
        boolean z2 = true;
        if (mutableVector.p() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.p() == 0 ? null : mutableVector.f15005z[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) function1.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.b())) {
            i2 = companion.g();
        }
        if (FocusDirection.l(i2, companion.g()) ? true : FocusDirection.l(i2, companion.a())) {
            rect = s(FocusTraversalKt.d(focusTargetNode));
        } else {
            if (!FocusDirection.l(i2, companion.d())) {
                z2 = FocusDirection.l(i2, companion.h());
            }
            if (z2) {
                rect = h(FocusTraversalKt.d(focusTargetNode));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        FocusTargetNode j2 = j(mutableVector, rect, i2);
        if (j2 != null) {
            return ((Boolean) function1.invoke(j2)).booleanValue();
        }
        return false;
    }

    public static final boolean l(FocusTargetNode focusTargetNode, Rect rect, int i2, Function1 function1) {
        if (r(focusTargetNode, rect, i2, function1)) {
            return true;
        }
        FocusTransactionManager c2 = FocusTargetNodeKt.c(focusTargetNode);
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i2, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(c2.h(), c2, DelegatableNodeKt.p(focusTargetNode).getFocusOwner().t(), focusTargetNode, rect, i2, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (!n(rect, i2, rect3)) {
            return false;
        }
        return !n(rect2, i2, rect3) || c(rect3, rect, rect2, i2) || (!c(rect3, rect2, rect, i2) && q(i2, rect3, rect) < q(i2, rect3, rect2));
    }

    public static final boolean n(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.f15729b;
        if (FocusDirection.l(i2, companion.d())) {
            if ((rect2.p() <= rect.p() && rect2.o() < rect.p()) || rect2.o() <= rect.o()) {
                return false;
            }
        } else if (FocusDirection.l(i2, companion.g())) {
            if ((rect2.o() >= rect.o() && rect2.p() > rect.o()) || rect2.p() >= rect.p()) {
                return false;
            }
        } else if (FocusDirection.l(i2, companion.h())) {
            if ((rect2.i() <= rect.i() && rect2.r() < rect.i()) || rect2.r() <= rect.r()) {
                return false;
            }
        } else if (!FocusDirection.l(i2, companion.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if ((rect2.r() >= rect.r() && rect2.i() > rect.r()) || rect2.i() >= rect.i()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float o(androidx.compose.ui.geometry.Rect r2, int r3, androidx.compose.ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.f15729b
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x0016
            float r3 = r4.o()
            float r2 = r2.p()
        L_0x0014:
            float r3 = r3 - r2
            goto L_0x0051
        L_0x0016:
            int r1 = r0.g()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x002b
            float r2 = r2.o()
            float r3 = r4.p()
        L_0x0028:
            float r3 = r2 - r3
            goto L_0x0051
        L_0x002b:
            int r1 = r0.h()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.l(r3, r1)
            if (r1 == 0) goto L_0x003e
            float r3 = r4.r()
            float r2 = r2.i()
            goto L_0x0014
        L_0x003e:
            int r0 = r0.a()
            boolean r3 = androidx.compose.ui.focus.FocusDirection.l(r3, r0)
            if (r3 == 0) goto L_0x0058
            float r2 = r2.r()
            float r3 = r4.i()
            goto L_0x0028
        L_0x0051:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0057
            r3 = r2
        L_0x0057:
            return r3
        L_0x0058:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.o(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    public static final float p(Rect rect, int i2, Rect rect2) {
        float f2;
        float f3;
        float o2;
        float p2;
        float o3;
        FocusDirection.Companion companion = FocusDirection.f15729b;
        boolean z2 = true;
        if (FocusDirection.l(i2, companion.d()) ? true : FocusDirection.l(i2, companion.g())) {
            float r2 = rect2.r();
            float i3 = rect2.i() - rect2.r();
            f2 = (float) 2;
            f3 = r2 + (i3 / f2);
            o2 = rect.r();
            p2 = rect.i();
            o3 = rect.r();
        } else {
            if (!FocusDirection.l(i2, companion.h())) {
                z2 = FocusDirection.l(i2, companion.a());
            }
            if (z2) {
                float o4 = rect2.o();
                float p3 = rect2.p() - rect2.o();
                f2 = (float) 2;
                f3 = o4 + (p3 / f2);
                o2 = rect.o();
                p2 = rect.p();
                o3 = rect.o();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        return f3 - (o2 + ((p2 - o3) / f2));
    }

    public static final long q(int i2, Rect rect, Rect rect2) {
        long o2 = (long) o(rect2, i2, rect);
        long p2 = (long) p(rect2, i2, rect);
        return (((long) 13) * o2 * o2) + (p2 * p2);
    }

    public static final boolean r(FocusTargetNode focusTargetNode, Rect rect, int i2, Function1 function1) {
        FocusTargetNode j2;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int a2 = NodeKind.a(1024);
        if (!focusTargetNode.M().F2()) {
            InlineClassHelperKt.c("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node w2 = focusTargetNode.M().w2();
        if (w2 == null) {
            DelegatableNodeKt.c(mutableVector2, focusTargetNode.M(), false);
        } else {
            mutableVector2.d(w2);
        }
        while (mutableVector2.p() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.y(mutableVector2.p() - 1);
            if ((node.v2() & a2) == 0) {
                DelegatableNodeKt.c(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    } else if ((node.A2() & a2) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.F2()) {
                                    mutableVector.d(focusTargetNode2);
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
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
                            node = DelegatableNodeKt.h(mutableVector3);
                        }
                    } else {
                        node = node.w2();
                    }
                }
            }
        }
        while (mutableVector.p() != 0 && (j2 = j(mutableVector, rect, i2)) != null) {
            if (j2.g3().t()) {
                return ((Boolean) function1.invoke(j2)).booleanValue();
            }
            if (l(j2, rect, i2, function1)) {
                return true;
            }
            mutableVector.v(j2);
        }
        return false;
    }

    public static final Rect s(Rect rect) {
        return new Rect(rect.o(), rect.r(), rect.o(), rect.r());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i2, Rect rect, Function1 function1) {
        FocusStateImpl i3 = focusTargetNode.A0();
        int[] iArr = WhenMappings.f15844a;
        int i4 = iArr[i3.ordinal()];
        if (i4 == 1) {
            FocusTargetNode f2 = FocusTraversalKt.f(focusTargetNode);
            if (f2 != null) {
                int i5 = iArr[f2.A0().ordinal()];
                if (i5 == 1) {
                    Boolean t2 = t(f2, i2, rect, function1);
                    if (!Intrinsics.d(t2, Boolean.FALSE)) {
                        return t2;
                    }
                    if (rect == null) {
                        rect = FocusTraversalKt.d(b(f2));
                    }
                    return Boolean.valueOf(l(focusTargetNode, rect, i2, function1));
                } else if (i5 == 2 || i5 == 3) {
                    if (rect == null) {
                        rect = FocusTraversalKt.d(f2);
                    }
                    return Boolean.valueOf(l(focusTargetNode, rect, i2, function1));
                } else if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i4 == 2 || i4 == 3) {
            return Boolean.valueOf(k(focusTargetNode, i2, function1));
        } else {
            if (i4 == 4) {
                return focusTargetNode.g3().t() ? (Boolean) function1.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(k(focusTargetNode, i2, function1)) : Boolean.valueOf(r(focusTargetNode, rect, i2, function1));
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
