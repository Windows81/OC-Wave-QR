package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;

@Metadata
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    public void a(int i2, int i3) {
        ((LayoutNode) b()).x1(i2, i3);
    }

    public void e() {
        ((LayoutNode) b()).p();
    }

    public void g(int i2, int i3, int i4) {
        ((LayoutNode) b()).o1(i2, i3, i4);
    }

    public void k() {
        super.k();
        Owner B0 = ((LayoutNode) l()).B0();
        if (B0 != null) {
            B0.J();
        }
    }

    public void m() {
        ((LayoutNode) l()).w1();
    }

    /* renamed from: o */
    public void c(int i2, LayoutNode layoutNode) {
        ((LayoutNode) b()).O0(i2, layoutNode);
    }

    /* renamed from: p */
    public void j(int i2, LayoutNode layoutNode) {
    }
}
