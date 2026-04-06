package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AnchoredDraggableElement<T> extends ModifierNodeElement<AnchoredDraggableNode<T>> {

    /* renamed from: A  reason: collision with root package name */
    public final Orientation f3325A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3326B;
    public final Boolean C;
    public final MutableInteractionSource D;
    public final Boolean E;
    public final OverscrollEffect F;
    public final FlingBehavior G;

    /* renamed from: z  reason: collision with root package name */
    public final AnchoredDraggableState f3327z;

    /* renamed from: c */
    public AnchoredDraggableNode a() {
        return new AnchoredDraggableNode(this.f3327z, this.f3325A, this.f3326B, this.C, this.D, this.F, this.E, this.G);
    }

    /* renamed from: d */
    public void b(AnchoredDraggableNode anchoredDraggableNode) {
        anchoredDraggableNode.U3(this.f3327z, this.f3325A, this.f3326B, this.C, this.D, this.F, this.E, this.G);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.d(this.f3327z, anchoredDraggableElement.f3327z) && this.f3325A == anchoredDraggableElement.f3325A && this.f3326B == anchoredDraggableElement.f3326B && Intrinsics.d(this.C, anchoredDraggableElement.C) && Intrinsics.d(this.D, anchoredDraggableElement.D) && Intrinsics.d(this.E, anchoredDraggableElement.E) && Intrinsics.d(this.F, anchoredDraggableElement.F) && Intrinsics.d(this.G, anchoredDraggableElement.G);
    }

    public int hashCode() {
        int hashCode = ((((this.f3327z.hashCode() * 31) + this.f3325A.hashCode()) * 31) + Boolean.hashCode(this.f3326B)) * 31;
        Boolean bool = this.C;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.D;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        Boolean bool2 = this.E;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        OverscrollEffect overscrollEffect = this.F;
        int hashCode5 = (hashCode4 + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31;
        FlingBehavior flingBehavior = this.G;
        if (flingBehavior != null) {
            i2 = flingBehavior.hashCode();
        }
        return hashCode5 + i2;
    }
}
