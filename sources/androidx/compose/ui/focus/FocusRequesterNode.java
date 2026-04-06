package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {
    public FocusRequester N;

    public FocusRequesterNode(FocusRequester focusRequester) {
        this.N = focusRequester;
    }

    public void I2() {
        super.I2();
        this.N.f().d(this);
    }

    public void J2() {
        this.N.f().v(this);
        super.J2();
    }

    public final void Z2(FocusRequester focusRequester) {
        this.N = focusRequester;
    }

    public final FocusRequester d1() {
        return this.N;
    }
}
