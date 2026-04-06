package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {

    /* renamed from: z  reason: collision with root package name */
    public final boolean f15546z;

    /* renamed from: c */
    public SensitiveContentNode a() {
        return new SensitiveContentNode(this.f15546z);
    }

    /* renamed from: d */
    public void b(SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.Z2(this.f15546z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.f15546z == ((SensitiveNodeElement) obj).f15546z;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f15546z);
    }

    public String toString() {
        return "SensitiveNodeElement(isContentSensitive=" + this.f15546z + ')';
    }
}
