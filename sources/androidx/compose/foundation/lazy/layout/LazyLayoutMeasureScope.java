package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface LazyLayoutMeasureScope extends MeasureScope {
    long A(float f2) {
        return TextUnitKt.h(f2 / (u1() * getDensity()));
    }

    float D(int i2) {
        return Dp.m(((float) i2) / getDensity());
    }

    float E(float f2) {
        return Dp.m(f2 / getDensity());
    }

    long V(long j2) {
        if (j2 == 9205357640488583168L) {
            return Size.f15876b.a();
        }
        float B1 = B1(DpSize.j(j2));
        return Size.d((((long) Float.floatToRawIntBits(B1(DpSize.i(j2)))) & 4294967295L) | (((long) Float.floatToRawIntBits(B1)) << 32));
    }

    List k1(int i2, long j2);

    long r(float f2) {
        return TextUnitKt.h(f2 / u1());
    }

    long s(long j2) {
        return j2 != 9205357640488583168L ? DpKt.b(E(Float.intBitsToFloat((int) (j2 >> 32))), E(Float.intBitsToFloat((int) (j2 & 4294967295L)))) : DpSize.f19156b.a();
    }

    float v(long j2) {
        if (!TextUnitType.g(TextUnit.g(j2), TextUnitType.f19181b.b())) {
            InlineClassHelperKt.c("Only Sp can convert to Px");
        }
        return Dp.m(TextUnit.h(j2) * u1());
    }
}
