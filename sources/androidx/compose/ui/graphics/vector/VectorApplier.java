package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;

@Metadata
public final class VectorApplier extends AbstractApplier<VNode> {
    public void a(int i2, int i3) {
        o((VNode) b()).p(i2, i3);
    }

    public void g(int i2, int i3, int i4) {
        o((VNode) b()).o(i2, i3, i4);
    }

    public void m() {
        GroupComponent o2 = o((VNode) l());
        o2.p(0, o2.f());
    }

    public final GroupComponent o(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    /* renamed from: p */
    public void c(int i2, VNode vNode) {
        o((VNode) b()).i(i2, vNode);
    }

    /* renamed from: q */
    public void j(int i2, VNode vNode) {
    }
}
