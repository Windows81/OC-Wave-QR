package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {

    /* renamed from: A  reason: collision with root package name */
    public final FiniteAnimationSpec f4782A;

    /* renamed from: B  reason: collision with root package name */
    public final FiniteAnimationSpec f4783B;

    /* renamed from: z  reason: collision with root package name */
    public final FiniteAnimationSpec f4784z;

    /* renamed from: c */
    public LazyLayoutAnimationSpecsNode a() {
        return new LazyLayoutAnimationSpecsNode(this.f4784z, this.f4782A, this.f4783B);
    }

    /* renamed from: d */
    public void b(LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.c3(this.f4784z);
        lazyLayoutAnimationSpecsNode.e3(this.f4782A);
        lazyLayoutAnimationSpecsNode.d3(this.f4783B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return Intrinsics.d(this.f4784z, lazyLayoutAnimateItemElement.f4784z) && Intrinsics.d(this.f4782A, lazyLayoutAnimateItemElement.f4782A) && Intrinsics.d(this.f4783B, lazyLayoutAnimateItemElement.f4783B);
    }

    public int hashCode() {
        FiniteAnimationSpec finiteAnimationSpec = this.f4784z;
        int i2 = 0;
        int hashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec finiteAnimationSpec2 = this.f4782A;
        int hashCode2 = (hashCode + (finiteAnimationSpec2 == null ? 0 : finiteAnimationSpec2.hashCode())) * 31;
        FiniteAnimationSpec finiteAnimationSpec3 = this.f4783B;
        if (finiteAnimationSpec3 != null) {
            i2 = finiteAnimationSpec3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f4784z + ", placementSpec=" + this.f4782A + ", fadeOutSpec=" + this.f4783B + ')';
    }
}
