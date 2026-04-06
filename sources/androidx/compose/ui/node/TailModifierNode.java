package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class TailModifierNode extends Modifier.Node {
    public boolean N;

    public TailModifierNode() {
        O2(0);
    }

    public void I2() {
        this.N = true;
    }

    public void J2() {
        this.N = false;
    }

    public final boolean Z2() {
        return this.N;
    }

    public String toString() {
        return "<tail>";
    }
}
