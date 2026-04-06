package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutTreeConsistencyChecker {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f17321a;

    /* renamed from: b  reason: collision with root package name */
    public final DepthSortedSetsForDifferentPasses f17322b;

    /* renamed from: c  reason: collision with root package name */
    public final List f17323c;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, List list) {
        this.f17321a = layoutNode;
        this.f17322b = depthSortedSetsForDifferentPasses;
        this.f17323c = list;
    }

    public static final void e(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i2) {
        String f2 = layoutTreeConsistencyChecker.f(layoutNode);
        if (f2.length() > 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("..");
            }
            sb.append(f2);
            Intrinsics.h(sb, "append(...)");
            sb.append(10);
            Intrinsics.h(sb, "append(...)");
            i2++;
        }
        List M = layoutNode.M();
        int size = M.size();
        for (int i4 = 0; i4 < size; i4++) {
            e(layoutTreeConsistencyChecker, sb, (LayoutNode) M.get(i4), i2);
        }
    }

    public final void a() {
        if (!c(this.f17321a)) {
            System.out.println(d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    public final boolean b(LayoutNode layoutNode) {
        Object obj;
        LayoutNode C0 = layoutNode.C0();
        Object obj2 = null;
        LayoutNode.LayoutState h0 = C0 != null ? C0.h0() : null;
        if (layoutNode.u() || !(layoutNode.D0() == Integer.MAX_VALUE || C0 == null || !C0.u())) {
            if (layoutNode.o0()) {
                List list = this.f17323c;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i2);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest = (MeasureAndLayoutDelegate.PostponedRequest) obj;
                    if (Intrinsics.d(postponedRequest.a(), layoutNode) && !postponedRequest.c()) {
                        break;
                    }
                    i2++;
                }
                if (obj != null) {
                    return true;
                }
            }
            if (layoutNode.x()) {
                return true;
            }
            if (layoutNode.o0()) {
                return this.f17322b.d(layoutNode) || layoutNode.h0() == LayoutNode.LayoutState.LookaheadMeasuring || (C0 != null && C0.o0()) || ((C0 != null && C0.j0()) || h0 == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.g0()) {
                if (!this.f17322b.d(layoutNode) && C0 != null && !C0.o0() && !C0.g0() && h0 != LayoutNode.LayoutState.Measuring && h0 != LayoutNode.LayoutState.LayingOut) {
                    List list2 = this.f17323c;
                    int size2 = list2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (Intrinsics.d(((MeasureAndLayoutDelegate.PostponedRequest) list2.get(i3)).a(), layoutNode)) {
                                break;
                            }
                            i3++;
                        } else if (layoutNode.h0() != LayoutNode.LayoutState.Measuring) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        if (Intrinsics.d(layoutNode.X0(), Boolean.TRUE)) {
            if (layoutNode.j0()) {
                List list3 = this.f17323c;
                int size3 = list3.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    Object obj3 = list3.get(i4);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = (MeasureAndLayoutDelegate.PostponedRequest) obj3;
                    if (Intrinsics.d(postponedRequest2.a(), layoutNode) && postponedRequest2.c()) {
                        obj2 = obj3;
                        break;
                    }
                    i4++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (layoutNode.j0()) {
                return this.f17322b.e(layoutNode, true) || (C0 != null && C0.j0()) || h0 == LayoutNode.LayoutState.LookaheadMeasuring || (C0 != null && C0.o0() && Intrinsics.d(layoutNode.l0(), layoutNode));
            }
            if (layoutNode.i0()) {
                return this.f17322b.e(layoutNode, true) || C0 == null || C0.j0() || C0.i0() || h0 == LayoutNode.LayoutState.LookaheadMeasuring || h0 == LayoutNode.LayoutState.LookaheadLayingOut || (C0.g0() && Intrinsics.d(layoutNode.l0(), layoutNode));
            }
        }
        return true;
    }

    public final boolean c(LayoutNode layoutNode) {
        if (!b(layoutNode)) {
            return false;
        }
        List M = layoutNode.M();
        int size = M.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!c((LayoutNode) M.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.h(sb, "append(...)");
        sb.append(10);
        Intrinsics.h(sb, "append(...)");
        e(this, sb, this.f17321a, 0);
        return sb.toString();
    }

    public final String f(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.h0());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.u()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.q0() + ']');
        if (!b(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }
}
