package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TransformedText {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f18927a;

    /* renamed from: b  reason: collision with root package name */
    public final OffsetMapping f18928b;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.f18927a = annotatedString;
        this.f18928b = offsetMapping;
    }

    public final OffsetMapping a() {
        return this.f18928b;
    }

    public final AnnotatedString b() {
        return this.f18927a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return Intrinsics.d(this.f18927a, transformedText.f18927a) && Intrinsics.d(this.f18928b, transformedText.f18928b);
    }

    public int hashCode() {
        return (this.f18927a.hashCode() * 31) + this.f18928b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.f18927a + ", offsetMapping=" + this.f18928b + ')';
    }
}
