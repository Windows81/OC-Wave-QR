package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata
final class MaskCodepointTransformation implements CodepointTransformation {

    /* renamed from: a  reason: collision with root package name */
    public final char f6258a;

    public int a(int i2, int i3) {
        return this.f6258a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskCodepointTransformation) && this.f6258a == ((MaskCodepointTransformation) obj).f6258a;
    }

    public int hashCode() {
        return Character.hashCode(this.f6258a);
    }

    public String toString() {
        return "MaskCodepointTransformation(character=" + this.f6258a + ')';
    }
}
