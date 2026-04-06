package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class InputTransformationByValue implements InputTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f6059b;

    public void X(TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence A2 = TextFieldBuffer.A(textFieldBuffer, 0, (TextRange) null, (List) null, 7, (Object) null);
        CharSequence charSequence = (CharSequence) this.f6059b.m(textFieldBuffer.k(), A2);
        if (charSequence != A2) {
            if (charSequence == textFieldBuffer.k()) {
                textFieldBuffer.s();
            } else {
                textFieldBuffer.y(charSequence);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && Intrinsics.d(this.f6059b, ((InputTransformationByValue) obj).f6059b);
    }

    public int hashCode() {
        return this.f6059b.hashCode();
    }

    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.f6059b + ')';
    }
}
