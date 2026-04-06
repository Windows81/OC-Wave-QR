package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

@Metadata
public interface Density extends FontScaling {

    @Metadata
    public static final class DefaultImpls {
    }

    long A(float f2) {
        return r(E(f2));
    }

    float B1(float f2) {
        return f2 * getDensity();
    }

    float D(int i2) {
        return Dp.m(((float) i2) / getDensity());
    }

    float E(float f2) {
        return Dp.m(f2 / getDensity());
    }

    int K1(long j2) {
        return Math.round(f2(j2));
    }

    int P1(float f2) {
        float B1 = B1(f2);
        if (Float.isInfinite(B1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(B1);
    }

    long V(long j2) {
        if (j2 == 9205357640488583168L) {
            return Size.f15876b.a();
        }
        float B1 = B1(DpSize.j(j2));
        return Size.d((((long) Float.floatToRawIntBits(B1(DpSize.i(j2)))) & 4294967295L) | (((long) Float.floatToRawIntBits(B1)) << 32));
    }

    float f2(long j2) {
        if (!TextUnitType.g(TextUnit.g(j2), TextUnitType.f19181b.b())) {
            InlineClassHelperKt.b("Only Sp can convert to Px");
        }
        return B1(v(j2));
    }

    float getDensity();

    long s(long j2) {
        return j2 != 9205357640488583168L ? DpKt.b(E(Float.intBitsToFloat((int) (j2 >> 32))), E(Float.intBitsToFloat((int) (j2 & 4294967295L)))) : DpSize.f19156b.a();
    }
}
