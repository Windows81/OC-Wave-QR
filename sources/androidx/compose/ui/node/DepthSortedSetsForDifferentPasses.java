package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata
public final class DepthSortedSetsForDifferentPasses {

    /* renamed from: a  reason: collision with root package name */
    public final DepthSortedSet f17245a;

    /* renamed from: b  reason: collision with root package name */
    public final DepthSortedSet f17246b;

    public DepthSortedSetsForDifferentPasses(boolean z2) {
        this.f17245a = new DepthSortedSet(z2);
        this.f17246b = new DepthSortedSet(z2);
    }

    public final void c(LayoutNode layoutNode, boolean z2) {
        if (z2) {
            this.f17245a.a(layoutNode);
            this.f17246b.a(layoutNode);
        } else if (!this.f17245a.b(layoutNode)) {
            this.f17246b.a(layoutNode);
        }
    }

    public final boolean d(LayoutNode layoutNode) {
        return this.f17245a.b(layoutNode) || this.f17246b.b(layoutNode);
    }

    public final boolean e(LayoutNode layoutNode, boolean z2) {
        boolean b2 = this.f17245a.b(layoutNode);
        return z2 ? b2 : b2 || this.f17246b.b(layoutNode);
    }

    public final boolean f() {
        return this.f17246b.c() && this.f17245a.c();
    }

    public final boolean g(boolean z2) {
        return (z2 ? this.f17245a : this.f17246b).c();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(LayoutNode layoutNode) {
        return this.f17246b.e(layoutNode) || this.f17245a.e(layoutNode);
    }
}
