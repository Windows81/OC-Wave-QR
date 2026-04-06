package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Alignment f2385A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f2386B;

    /* renamed from: z  reason: collision with root package name */
    public final FiniteAnimationSpec f2387z;

    /* renamed from: c */
    public SizeAnimationModifierNode a() {
        return new SizeAnimationModifierNode(this.f2387z, this.f2385A, this.f2386B);
    }

    /* renamed from: d */
    public void b(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.g3(this.f2387z);
        sizeAnimationModifierNode.h3(this.f2386B);
        sizeAnimationModifierNode.e3(this.f2385A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return Intrinsics.d(this.f2387z, sizeAnimationModifierElement.f2387z) && Intrinsics.d(this.f2385A, sizeAnimationModifierElement.f2385A) && Intrinsics.d(this.f2386B, sizeAnimationModifierElement.f2386B);
    }

    public int hashCode() {
        int hashCode = ((this.f2387z.hashCode() * 31) + this.f2385A.hashCode()) * 31;
        Function2 function2 = this.f2386B;
        return hashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f2387z + ", alignment=" + this.f2385A + ", finishedListener=" + this.f2386B + ')';
    }
}
