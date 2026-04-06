package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f17135z;

    /* renamed from: c */
    public OnPlacedNode a() {
        return new OnPlacedNode(this.f17135z);
    }

    /* renamed from: d */
    public void b(OnPlacedNode onPlacedNode) {
        onPlacedNode.Z2(this.f17135z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && Intrinsics.d(this.f17135z, ((OnPlacedElement) obj).f17135z);
    }

    public int hashCode() {
        return this.f17135z.hashCode();
    }

    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.f17135z + ')';
    }
}
