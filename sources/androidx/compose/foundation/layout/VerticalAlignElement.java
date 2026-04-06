package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VerticalAlignElement extends ModifierNodeElement<VerticalAlignNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Alignment.Vertical f4205z;

    public VerticalAlignElement(Alignment.Vertical vertical) {
        this.f4205z = vertical;
    }

    /* renamed from: c */
    public VerticalAlignNode a() {
        return new VerticalAlignNode(this.f4205z);
    }

    /* renamed from: d */
    public void b(VerticalAlignNode verticalAlignNode) {
        verticalAlignNode.a3(this.f4205z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return Intrinsics.d(this.f4205z, verticalAlignElement.f4205z);
    }

    public int hashCode() {
        return this.f4205z.hashCode();
    }
}
