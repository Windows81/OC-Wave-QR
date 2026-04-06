package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

@Metadata
final class SensitiveContentNode extends Modifier.Node {
    public boolean N;
    public boolean O;
    public boolean P;

    public SensitiveContentNode(boolean z2) {
        this.N = z2;
        this.P = z2;
    }

    public void I2() {
        super.I2();
        if (this.P) {
            if (this.O) {
                InlineClassHelperKt.c("invalid sensitive content state");
            }
            DelegatableNodeKt.p(this).y();
            this.O = true;
        }
    }

    public void J2() {
        if (this.O) {
            DelegatableNodeKt.p(this).M();
            this.O = false;
        }
        super.J2();
    }

    public final void Z2(boolean z2) {
        this.P = z2;
        if (z2 && !this.O) {
            DelegatableNodeKt.p(this).y();
            this.O = true;
        } else if (!z2 && this.O) {
            DelegatableNodeKt.p(this).M();
            this.O = false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveContentNode) && this.N == ((SensitiveContentNode) obj).N;
    }

    public int hashCode() {
        return Boolean.hashCode(this.N);
    }

    public String toString() {
        return "SensitiveContentNode(_isContentSensitive=" + this.N + ')';
    }
}
