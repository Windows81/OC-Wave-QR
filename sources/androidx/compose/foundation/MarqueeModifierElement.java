package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class MarqueeModifierElement extends ModifierNodeElement<MarqueeModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final int f3113A;

    /* renamed from: B  reason: collision with root package name */
    public final int f3114B;
    public final int C;
    public final MarqueeSpacing D;
    public final float E;

    /* renamed from: z  reason: collision with root package name */
    public final int f3115z;

    /* renamed from: c */
    public MarqueeModifierNode a() {
        return new MarqueeModifierNode(this.f3115z, this.f3113A, this.f3114B, this.C, this.D, this.E, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public void b(MarqueeModifierNode marqueeModifierNode) {
        marqueeModifierNode.x3(this.f3115z, this.f3113A, this.f3114B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.f3115z == marqueeModifierElement.f3115z && MarqueeAnimationMode.e(this.f3113A, marqueeModifierElement.f3113A) && this.f3114B == marqueeModifierElement.f3114B && this.C == marqueeModifierElement.C && Intrinsics.d(this.D, marqueeModifierElement.D) && Dp.o(this.E, marqueeModifierElement.E);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f3115z) * 31) + MarqueeAnimationMode.f(this.f3113A)) * 31) + Integer.hashCode(this.f3114B)) * 31) + Integer.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + Dp.p(this.E);
    }

    public String toString() {
        return "MarqueeModifierElement(iterations=" + this.f3115z + ", animationMode=" + MarqueeAnimationMode.g(this.f3113A) + ", delayMillis=" + this.f3114B + ", initialDelayMillis=" + this.C + ", spacing=" + this.D + ", velocity=" + Dp.r(this.E) + ')';
    }
}
