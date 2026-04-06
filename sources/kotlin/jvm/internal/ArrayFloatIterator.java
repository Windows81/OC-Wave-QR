package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.FloatIterator;

@Metadata
final class ArrayFloatIterator extends FloatIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40873A;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f40874z;

    public ArrayFloatIterator(float[] fArr) {
        Intrinsics.i(fArr, "array");
        this.f40874z = fArr;
    }

    public float b() {
        try {
            float[] fArr = this.f40874z;
            int i2 = this.f40873A;
            this.f40873A = i2 + 1;
            return fArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40873A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40873A < this.f40874z.length;
    }
}
