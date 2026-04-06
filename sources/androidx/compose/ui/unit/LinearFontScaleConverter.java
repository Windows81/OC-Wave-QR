package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.Metadata;

@Metadata
final class LinearFontScaleConverter implements FontScaleConverter {

    /* renamed from: a  reason: collision with root package name */
    public final float f19176a;

    public LinearFontScaleConverter(float f2) {
        this.f19176a = f2;
    }

    public float a(float f2) {
        return f2 / this.f19176a;
    }

    public float b(float f2) {
        return f2 * this.f19176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.f19176a, ((LinearFontScaleConverter) obj).f19176a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f19176a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f19176a + ')';
    }
}
