package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata
public final class PasswordVisualTransformation implements VisualTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final char f18876b;

    public PasswordVisualTransformation(char c2) {
        this.f18876b = c2;
    }

    public TransformedText a(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(StringsKt.G(String.valueOf(this.f18876b), annotatedString.k().length()), (List) null, 2, (DefaultConstructorMarker) null), OffsetMapping.f18867a.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.f18876b == ((PasswordVisualTransformation) obj).f18876b;
    }

    public int hashCode() {
        return Character.hashCode(this.f18876b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasswordVisualTransformation(char c2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8226 : c2);
    }
}
