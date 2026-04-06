package androidx.compose.foundation.content;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {

    /* renamed from: z  reason: collision with root package name */
    public final ReceiveContentListener f3201z;

    /* renamed from: c */
    public ReceiveContentNode a() {
        return new ReceiveContentNode(this.f3201z);
    }

    /* renamed from: d */
    public void b(ReceiveContentNode receiveContentNode) {
        receiveContentNode.g3(this.f3201z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && Intrinsics.d(this.f3201z, ((ReceiveContentElement) obj).f3201z);
    }

    public int hashCode() {
        return this.f3201z.hashCode();
    }

    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.f3201z + ')';
    }
}
