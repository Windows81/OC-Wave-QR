package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {

    /* renamed from: A  reason: collision with root package name */
    public final long f17132A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f17133B;

    /* renamed from: z  reason: collision with root package name */
    public final long f17134z;

    /* renamed from: c */
    public OnLayoutRectChangedNode a() {
        return new OnLayoutRectChangedNode(this.f17134z, this.f17132A, this.f17133B);
    }

    /* renamed from: d */
    public void b(OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.c3(this.f17134z);
        onLayoutRectChangedNode.b3(this.f17132A);
        onLayoutRectChangedNode.a3(this.f17133B);
        onLayoutRectChangedNode.Z2();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.f17134z == onLayoutRectChangedElement.f17134z && this.f17132A == onLayoutRectChangedElement.f17132A && Intrinsics.d(this.f17133B, onLayoutRectChangedElement.f17133B);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f17134z) * 31) + Long.hashCode(this.f17132A)) * 31) + this.f17133B.hashCode();
    }

    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.f17134z + ", debounceMillis=" + this.f17132A + ", callback=" + this.f17133B + ')';
    }
}
