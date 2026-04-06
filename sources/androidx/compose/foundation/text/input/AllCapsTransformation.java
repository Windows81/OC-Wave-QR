package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AllCapsTransformation implements InputTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final Locale f6053b;

    /* renamed from: c  reason: collision with root package name */
    public final KeyboardOptions f6054c;

    public void X(TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer.ChangeList f2 = textFieldBuffer.f();
        for (int i2 = 0; i2 < f2.a(); i2++) {
            long c2 = f2.c(i2);
            f2.b(i2);
            if (!TextRange.h(c2)) {
                textFieldBuffer.p(TextRange.l(c2), TextRange.k(c2), StringKt.g(TextRangeKt.e(textFieldBuffer.a(), c2), this.f6053b));
            }
        }
    }

    public KeyboardOptions Y() {
        return this.f6054c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllCapsTransformation) && Intrinsics.d(this.f6053b, ((AllCapsTransformation) obj).f6053b);
    }

    public int hashCode() {
        return this.f6053b.hashCode();
    }

    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.f6053b + ')';
    }
}
