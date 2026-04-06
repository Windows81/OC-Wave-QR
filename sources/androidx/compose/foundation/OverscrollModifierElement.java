package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OverscrollModifierElement extends ModifierNodeElement<OverscrollModifierNode> {

    /* renamed from: z  reason: collision with root package name */
    public final OverscrollEffect f3139z;

    /* renamed from: c */
    public OverscrollModifierNode a() {
        OverscrollEffect overscrollEffect = this.f3139z;
        return new OverscrollModifierNode(overscrollEffect != null ? overscrollEffect.M() : null);
    }

    /* renamed from: d */
    public void b(OverscrollModifierNode overscrollModifierNode) {
        OverscrollEffect overscrollEffect = this.f3139z;
        overscrollModifierNode.g3(overscrollEffect != null ? overscrollEffect.M() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && Intrinsics.d(this.f3139z, ((OverscrollModifierElement) obj).f3139z);
    }

    public int hashCode() {
        OverscrollEffect overscrollEffect = this.f3139z;
        if (overscrollEffect != null) {
            return overscrollEffect.hashCode();
        }
        return 0;
    }
}
