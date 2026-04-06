package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata
public final class TextUnitKt {
    public static final long a(float f2, long j2) {
        return k(j2, f2);
    }

    public static final void b(long j2) {
        if (TextUnit.f(j2) == 0) {
            InlineClassHelperKt.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j2, long j3) {
        if (!((TextUnit.f(j2) == 0 || TextUnit.f(j3) == 0) ? false : true)) {
            InlineClassHelperKt.a("Cannot perform operation for Unspecified type.");
        }
        if (!TextUnitType.g(TextUnit.g(j2), TextUnit.g(j3))) {
            InlineClassHelperKt.a("Cannot perform operation for " + TextUnitType.i(TextUnit.g(j2)) + " and " + TextUnitType.i(TextUnit.g(j3)));
        }
    }

    public static final long d(double d2) {
        return k(8589934592L, (float) d2);
    }

    public static final long e(float f2) {
        return k(8589934592L, f2);
    }

    public static final long f(int i2) {
        return k(8589934592L, (float) i2);
    }

    public static final long g(double d2) {
        return k(4294967296L, (float) d2);
    }

    public static final long h(float f2) {
        return k(4294967296L, f2);
    }

    public static final long i(int i2) {
        return k(4294967296L, (float) i2);
    }

    public static final long j(long j2, long j3, float f2) {
        c(j2, j3);
        return k(TextUnit.f(j2), MathHelpersKt.b(TextUnit.h(j2), TextUnit.h(j3), f2));
    }

    public static final long k(long j2, float f2) {
        return TextUnit.c(j2 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }
}
