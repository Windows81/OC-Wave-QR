package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata
public final class ColorMatrixColorFilter extends ColorFilter {

    /* renamed from: c  reason: collision with root package name */
    public float[] f15993c;

    public final float[] b() {
        float[] fArr = this.f15993c;
        if (fArr != null) {
            return fArr;
        }
        float[] a2 = AndroidColorFilter_androidKt.a(a());
        this.f15993c = a2;
        return a2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(b(), ((ColorMatrixColorFilter) obj).b());
    }

    public int hashCode() {
        float[] fArr = this.f15993c;
        if (fArr != null) {
            return ColorMatrix.c(fArr);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f15993c;
        sb.append(fArr == null ? "null" : ColorMatrix.d(fArr));
        sb.append(')');
        return sb.toString();
    }
}
