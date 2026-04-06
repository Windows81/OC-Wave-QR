package androidx.compose.animation;

import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final BoundsTransform f2161A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f2162B;
    public final boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final LookaheadScope f2163z;

    /* renamed from: c */
    public BoundsAnimationModifierNode a() {
        return new BoundsAnimationModifierNode(this.f2163z, this.f2161A, this.f2162B, this.C);
    }

    /* renamed from: d */
    public void b(BoundsAnimationModifierNode boundsAnimationModifierNode) {
        boundsAnimationModifierNode.e3(this.f2163z);
        boundsAnimationModifierNode.d3(this.f2161A);
        boundsAnimationModifierNode.f3(this.f2162B);
        boundsAnimationModifierNode.c3(this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) obj;
        return Intrinsics.d(this.f2163z, boundsAnimationElement.f2163z) && Intrinsics.d(this.f2161A, boundsAnimationElement.f2161A) && Intrinsics.d(this.f2162B, boundsAnimationElement.f2162B) && this.C == boundsAnimationElement.C;
    }

    public int hashCode() {
        return (((((this.f2163z.hashCode() * 31) + this.f2161A.hashCode()) * 31) + this.f2162B.hashCode()) * 31) + Boolean.hashCode(this.C);
    }

    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.f2163z + ", boundsTransform=" + this.f2161A + ", resolveMeasureConstraints=" + this.f2162B + ", animateMotionFrameOfReference=" + this.C + ')';
    }
}
