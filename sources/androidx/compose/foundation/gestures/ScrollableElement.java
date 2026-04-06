package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Orientation f3560A;

    /* renamed from: B  reason: collision with root package name */
    public final OverscrollEffect f3561B;
    public final boolean C;
    public final boolean D;
    public final FlingBehavior E;
    public final MutableInteractionSource F;
    public final BringIntoViewSpec G;

    /* renamed from: z  reason: collision with root package name */
    public final ScrollableState f3562z;

    public ScrollableElement(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        this.f3562z = scrollableState;
        this.f3560A = orientation;
        this.f3561B = overscrollEffect;
        this.C = z2;
        this.D = z3;
        this.E = flingBehavior;
        this.F = mutableInteractionSource;
        this.G = bringIntoViewSpec;
    }

    /* renamed from: c */
    public ScrollableNode a() {
        return new ScrollableNode(this.f3562z, this.f3561B, this.E, this.f3560A, this.C, this.D, this.F, this.G);
    }

    /* renamed from: d */
    public void b(ScrollableNode scrollableNode) {
        scrollableNode.J3(this.f3562z, this.f3560A, this.f3561B, this.C, this.D, this.E, this.F, this.G);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.d(this.f3562z, scrollableElement.f3562z) && this.f3560A == scrollableElement.f3560A && Intrinsics.d(this.f3561B, scrollableElement.f3561B) && this.C == scrollableElement.C && this.D == scrollableElement.D && Intrinsics.d(this.E, scrollableElement.E) && Intrinsics.d(this.F, scrollableElement.F) && Intrinsics.d(this.G, scrollableElement.G);
    }

    public int hashCode() {
        int hashCode = ((this.f3562z.hashCode() * 31) + this.f3560A.hashCode()) * 31;
        OverscrollEffect overscrollEffect = this.f3561B;
        int i2 = 0;
        int hashCode2 = (((((hashCode + (overscrollEffect != null ? overscrollEffect.hashCode() : 0)) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31;
        FlingBehavior flingBehavior = this.E;
        int hashCode3 = (hashCode2 + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.F;
        int hashCode4 = (hashCode3 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.G;
        if (bringIntoViewSpec != null) {
            i2 = bringIntoViewSpec.hashCode();
        }
        return hashCode4 + i2;
    }
}
