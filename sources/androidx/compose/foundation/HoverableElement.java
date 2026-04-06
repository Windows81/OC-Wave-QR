package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class HoverableElement extends ModifierNodeElement<HoverableNode> {

    /* renamed from: z  reason: collision with root package name */
    public final MutableInteractionSource f3080z;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.f3080z = mutableInteractionSource;
    }

    /* renamed from: c */
    public HoverableNode a() {
        return new HoverableNode(this.f3080z);
    }

    /* renamed from: d */
    public void b(HoverableNode hoverableNode) {
        hoverableNode.e3(this.f3080z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.d(((HoverableElement) obj).f3080z, this.f3080z);
    }

    public int hashCode() {
        return this.f3080z.hashCode() * 31;
    }
}
