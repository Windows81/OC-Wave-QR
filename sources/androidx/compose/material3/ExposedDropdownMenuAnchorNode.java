package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class ExposedDropdownMenuAnchorNode extends Modifier.Node {
    public Function0 N;

    public ExposedDropdownMenuAnchorNode(Function0 function0) {
        this.N = function0;
    }

    public void I2() {
        this.N.invoke();
    }

    public final void Z2(Function0 function0) {
        this.N = function0;
    }
}
