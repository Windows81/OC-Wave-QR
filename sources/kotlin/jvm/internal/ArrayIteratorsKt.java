package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;

@Metadata
public final class ArrayIteratorsKt {
    public static final BooleanIterator a(boolean[] zArr) {
        Intrinsics.i(zArr, "array");
        return new ArrayBooleanIterator(zArr);
    }

    public static final ByteIterator b(byte[] bArr) {
        Intrinsics.i(bArr, "array");
        return new ArrayByteIterator(bArr);
    }

    public static final CharIterator c(char[] cArr) {
        Intrinsics.i(cArr, "array");
        return new ArrayCharIterator(cArr);
    }

    public static final DoubleIterator d(double[] dArr) {
        Intrinsics.i(dArr, "array");
        return new ArrayDoubleIterator(dArr);
    }

    public static final FloatIterator e(float[] fArr) {
        Intrinsics.i(fArr, "array");
        return new ArrayFloatIterator(fArr);
    }

    public static final IntIterator f(int[] iArr) {
        Intrinsics.i(iArr, "array");
        return new ArrayIntIterator(iArr);
    }

    public static final LongIterator g(long[] jArr) {
        Intrinsics.i(jArr, "array");
        return new ArrayLongIterator(jArr);
    }

    public static final ShortIterator h(short[] sArr) {
        Intrinsics.i(sArr, "array");
        return new ArrayShortIterator(sArr);
    }
}
