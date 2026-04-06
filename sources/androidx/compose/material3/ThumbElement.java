package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ThumbElement extends ModifierNodeElement<ThumbNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f11428A;

    /* renamed from: B  reason: collision with root package name */
    public final FiniteAnimationSpec f11429B;

    /* renamed from: z  reason: collision with root package name */
    public final InteractionSource f11430z;

    public ThumbElement(InteractionSource interactionSource, boolean z2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f11430z = interactionSource;
        this.f11428A = z2;
        this.f11429B = finiteAnimationSpec;
    }

    /* renamed from: c */
    public ThumbNode a() {
        return new ThumbNode(this.f11430z, this.f11428A, this.f11429B);
    }

    /* renamed from: d */
    public void b(ThumbNode thumbNode) {
        thumbNode.k3(this.f11430z);
        if (thumbNode.f3() != this.f11428A) {
            LayoutModifierNodeKt.b(thumbNode);
        }
        thumbNode.j3(this.f11428A);
        thumbNode.i3(this.f11429B);
        thumbNode.l3();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.d(this.f11430z, thumbElement.f11430z) && this.f11428A == thumbElement.f11428A && Intrinsics.d(this.f11429B, thumbElement.f11429B);
    }

    public int hashCode() {
        return (((this.f11430z.hashCode() * 31) + Boolean.hashCode(this.f11428A)) * 31) + this.f11429B.hashCode();
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.f11430z + ", checked=" + this.f11428A + ", animationSpec=" + this.f11429B + ')';
    }
}
