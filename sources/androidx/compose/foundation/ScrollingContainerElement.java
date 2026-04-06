package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ScrollingContainerElement extends ModifierNodeElement<ScrollingContainerNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Orientation f3179A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f3180B;
    public final boolean C;
    public final FlingBehavior D;
    public final MutableInteractionSource E;
    public final BringIntoViewSpec F;
    public final boolean G;
    public final OverscrollEffect H;

    /* renamed from: z  reason: collision with root package name */
    public final ScrollableState f3181z;

    public ScrollingContainerElement(ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z4, OverscrollEffect overscrollEffect) {
        this.f3181z = scrollableState;
        this.f3179A = orientation;
        this.f3180B = z2;
        this.C = z3;
        this.D = flingBehavior;
        this.E = mutableInteractionSource;
        this.F = bringIntoViewSpec;
        this.G = z4;
        this.H = overscrollEffect;
    }

    /* renamed from: c */
    public ScrollingContainerNode a() {
        return new ScrollingContainerNode(this.f3181z, this.f3179A, this.f3180B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    /* renamed from: d */
    public void b(ScrollingContainerNode scrollingContainerNode) {
        scrollingContainerNode.l3(this.f3181z, this.f3179A, this.G, this.H, this.f3180B, this.C, this.D, this.E, this.F);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return Intrinsics.d(this.f3181z, scrollingContainerElement.f3181z) && this.f3179A == scrollingContainerElement.f3179A && this.f3180B == scrollingContainerElement.f3180B && this.C == scrollingContainerElement.C && Intrinsics.d(this.D, scrollingContainerElement.D) && Intrinsics.d(this.E, scrollingContainerElement.E) && Intrinsics.d(this.F, scrollingContainerElement.F) && this.G == scrollingContainerElement.G && Intrinsics.d(this.H, scrollingContainerElement.H);
    }

    public int hashCode() {
        int hashCode = ((((((this.f3181z.hashCode() * 31) + this.f3179A.hashCode()) * 31) + Boolean.hashCode(this.f3180B)) * 31) + Boolean.hashCode(this.C)) * 31;
        FlingBehavior flingBehavior = this.D;
        int i2 = 0;
        int hashCode2 = (hashCode + (flingBehavior != null ? flingBehavior.hashCode() : 0)) * 31;
        MutableInteractionSource mutableInteractionSource = this.E;
        int hashCode3 = (hashCode2 + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        BringIntoViewSpec bringIntoViewSpec = this.F;
        int hashCode4 = (((hashCode3 + (bringIntoViewSpec != null ? bringIntoViewSpec.hashCode() : 0)) * 31) + Boolean.hashCode(this.G)) * 31;
        OverscrollEffect overscrollEffect = this.H;
        if (overscrollEffect != null) {
            i2 = overscrollEffect.hashCode();
        }
        return hashCode4 + i2;
    }
}
