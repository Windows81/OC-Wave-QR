package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class FillCrossAxisSizeElement extends ModifierNodeElement<FillCrossAxisSizeNode> {

    /* renamed from: z  reason: collision with root package name */
    public final float f3891z;

    /* renamed from: c */
    public FillCrossAxisSizeNode a() {
        return new FillCrossAxisSizeNode(this.f3891z);
    }

    /* renamed from: d */
    public void b(FillCrossAxisSizeNode fillCrossAxisSizeNode) {
        fillCrossAxisSizeNode.b3(this.f3891z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FillCrossAxisSizeNode fillCrossAxisSizeNode = obj instanceof FillCrossAxisSizeNode ? (FillCrossAxisSizeNode) obj : null;
        if (fillCrossAxisSizeNode == null) {
            return false;
        }
        return this.f3891z == fillCrossAxisSizeNode.Z2();
    }

    public int hashCode() {
        return Float.hashCode(this.f3891z) * 31;
    }
}
