package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class FocusOwnerImpl$modifier$1 extends ModifierNodeElement<FocusTargetNode> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FocusOwnerImpl f15778z;

    public FocusOwnerImpl$modifier$1(FocusOwnerImpl focusOwnerImpl) {
        this.f15778z = focusOwnerImpl;
    }

    /* renamed from: c */
    public FocusTargetNode a() {
        return this.f15778z.B();
    }

    /* renamed from: d */
    public void b(FocusTargetNode focusTargetNode) {
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f15778z.B().hashCode();
    }
}
