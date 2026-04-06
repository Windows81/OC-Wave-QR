package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {

    /* renamed from: z  reason: collision with root package name */
    public final float f15550z;

    public ZIndexElement(float f2) {
        this.f15550z = f2;
    }

    /* renamed from: c */
    public ZIndexNode a() {
        return new ZIndexNode(this.f15550z);
    }

    /* renamed from: d */
    public void b(ZIndexNode zIndexNode) {
        zIndexNode.a3(this.f15550z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f15550z, ((ZIndexElement) obj).f15550z) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f15550z);
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.f15550z + ')';
    }
}
