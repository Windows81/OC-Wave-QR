package androidx.compose.foundation.text.input;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata
final class MaxLengthFilter implements InputTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final int f6060b;

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.n0(semanticsPropertyReceiver, this.f6060b);
    }

    public void X(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.j() > this.f6060b) {
            textFieldBuffer.s();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.f6060b == ((MaxLengthFilter) obj).f6060b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6060b);
    }

    public String toString() {
        return "InputTransformation.maxLength(" + this.f6060b + ')';
    }
}
