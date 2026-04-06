package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement<LazyLayoutBeyondBoundsModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4789A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f4790B;
    public final Orientation C;

    /* renamed from: z  reason: collision with root package name */
    public final LazyLayoutBeyondBoundsState f4791z;

    public LazyLayoutBeyondBoundsModifierElement(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, Orientation orientation) {
        this.f4791z = lazyLayoutBeyondBoundsState;
        this.f4789A = lazyLayoutBeyondBoundsInfo;
        this.f4790B = z2;
        this.C = orientation;
    }

    /* renamed from: c */
    public LazyLayoutBeyondBoundsModifierNode a() {
        return new LazyLayoutBeyondBoundsModifierNode(this.f4791z, this.f4789A, this.f4790B, this.C);
    }

    /* renamed from: d */
    public void b(LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode) {
        lazyLayoutBeyondBoundsModifierNode.e3(this.f4791z, this.f4789A, this.f4790B, this.C);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.d(this.f4791z, lazyLayoutBeyondBoundsModifierElement.f4791z) && Intrinsics.d(this.f4789A, lazyLayoutBeyondBoundsModifierElement.f4789A) && this.f4790B == lazyLayoutBeyondBoundsModifierElement.f4790B && this.C == lazyLayoutBeyondBoundsModifierElement.C;
    }

    public int hashCode() {
        return (((((this.f4791z.hashCode() * 31) + this.f4789A.hashCode()) * 31) + Boolean.hashCode(this.f4790B)) * 31) + this.C.hashCode();
    }
}
