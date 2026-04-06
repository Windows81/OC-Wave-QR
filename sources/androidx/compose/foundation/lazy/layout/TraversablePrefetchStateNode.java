package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;

@Metadata
final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {
    public LazyLayoutPrefetchState N;
    public final String O = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public TraversablePrefetchStateNode(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.N = lazyLayoutPrefetchState;
    }

    public final LazyLayoutPrefetchState Z2() {
        return this.N;
    }

    /* renamed from: a3 */
    public String i0() {
        return this.O;
    }

    public final void b3(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.N = lazyLayoutPrefetchState;
    }
}
