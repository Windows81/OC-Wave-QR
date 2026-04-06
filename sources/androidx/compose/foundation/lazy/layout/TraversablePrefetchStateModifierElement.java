package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TraversablePrefetchStateModifierElement extends ModifierNodeElement<TraversablePrefetchStateNode> {

    /* renamed from: z  reason: collision with root package name */
    public final LazyLayoutPrefetchState f4992z;

    public TraversablePrefetchStateModifierElement(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.f4992z = lazyLayoutPrefetchState;
    }

    /* renamed from: c */
    public TraversablePrefetchStateNode a() {
        return new TraversablePrefetchStateNode(this.f4992z);
    }

    /* renamed from: d */
    public void b(TraversablePrefetchStateNode traversablePrefetchStateNode) {
        traversablePrefetchStateNode.b3(this.f4992z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.d(this.f4992z, ((TraversablePrefetchStateModifierElement) obj).f4992z);
    }

    public int hashCode() {
        return this.f4992z.hashCode();
    }

    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f4992z + ')';
    }
}
