package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DepthSortedSet {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17241a;

    /* renamed from: b  reason: collision with root package name */
    public MutableObjectIntMap f17242b;

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet f17243c = new TreeSet(DepthSortedSetKt.f17244a);

    public DepthSortedSet(boolean z2) {
        this.f17241a = z2;
    }

    public final void a(LayoutNode layoutNode) {
        if (!layoutNode.b()) {
            InlineClassHelperKt.c("DepthSortedSet.add called on an unattached node");
        }
        if (this.f17241a) {
            MutableObjectIntMap f2 = f();
            int e2 = f2.e(layoutNode, Integer.MAX_VALUE);
            if (e2 == Integer.MAX_VALUE) {
                f2.u(layoutNode, layoutNode.Q());
            } else {
                if (!(e2 == layoutNode.Q())) {
                    InlineClassHelperKt.c("invalid node depth");
                }
            }
        }
        this.f17243c.add(layoutNode);
    }

    public final boolean b(LayoutNode layoutNode) {
        boolean contains = this.f17243c.contains(layoutNode);
        if (this.f17241a) {
            if (!(contains == f().a(layoutNode))) {
                InlineClassHelperKt.c("inconsistency in TreeSet");
            }
        }
        return contains;
    }

    public final boolean c() {
        return this.f17243c.isEmpty();
    }

    public final LayoutNode d() {
        LayoutNode layoutNode = (LayoutNode) this.f17243c.first();
        e(layoutNode);
        return layoutNode;
    }

    public final boolean e(LayoutNode layoutNode) {
        if (!layoutNode.b()) {
            InlineClassHelperKt.c("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.f17243c.remove(layoutNode);
        if (this.f17241a) {
            MutableObjectIntMap f2 = f();
            if (f2.a(layoutNode)) {
                int c2 = f2.c(layoutNode);
                f2.r(layoutNode);
                if (!(c2 == (remove ? layoutNode.Q() : Integer.MAX_VALUE))) {
                    InlineClassHelperKt.c("invalid node depth");
                }
            }
        }
        return remove;
    }

    public final MutableObjectIntMap f() {
        if (this.f17242b == null) {
            this.f17242b = ObjectIntMapKt.b();
        }
        MutableObjectIntMap mutableObjectIntMap = this.f17242b;
        Intrinsics.f(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public String toString() {
        return this.f17243c.toString();
    }
}
