package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {
    public FiniteAnimationSpec N;
    public FiniteAnimationSpec O;
    public FiniteAnimationSpec P;

    public LazyLayoutAnimationSpecsNode(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        this.N = finiteAnimationSpec;
        this.O = finiteAnimationSpec2;
        this.P = finiteAnimationSpec3;
    }

    public Object F(Density density, Object obj) {
        return this;
    }

    public final FiniteAnimationSpec Z2() {
        return this.N;
    }

    public final FiniteAnimationSpec a3() {
        return this.P;
    }

    public final FiniteAnimationSpec b3() {
        return this.O;
    }

    public final void c3(FiniteAnimationSpec finiteAnimationSpec) {
        this.N = finiteAnimationSpec;
    }

    public final void d3(FiniteAnimationSpec finiteAnimationSpec) {
        this.P = finiteAnimationSpec;
    }

    public final void e3(FiniteAnimationSpec finiteAnimationSpec) {
        this.O = finiteAnimationSpec;
    }
}
