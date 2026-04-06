package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Alignment.Horizontal f4044z;

    public HorizontalAlignElement(Alignment.Horizontal horizontal) {
        this.f4044z = horizontal;
    }

    /* renamed from: c */
    public HorizontalAlignNode a() {
        return new HorizontalAlignNode(this.f4044z);
    }

    /* renamed from: d */
    public void b(HorizontalAlignNode horizontalAlignNode) {
        horizontalAlignNode.a3(this.f4044z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.d(this.f4044z, horizontalAlignElement.f4044z);
    }

    public int hashCode() {
        return this.f4044z.hashCode();
    }
}
