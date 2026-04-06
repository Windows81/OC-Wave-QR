package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.DoubleIterator;

@Metadata
final class ArrayDoubleIterator extends DoubleIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40871A;

    /* renamed from: z  reason: collision with root package name */
    public final double[] f40872z;

    public ArrayDoubleIterator(double[] dArr) {
        Intrinsics.i(dArr, "array");
        this.f40872z = dArr;
    }

    public double b() {
        try {
            double[] dArr = this.f40872z;
            int i2 = this.f40871A;
            this.f40871A = i2 + 1;
            return dArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40871A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40871A < this.f40872z.length;
    }
}
