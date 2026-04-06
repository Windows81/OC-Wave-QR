package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata
final class ArrayIntIterator extends IntIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40875A;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f40876z;

    public ArrayIntIterator(int[] iArr) {
        Intrinsics.i(iArr, "array");
        this.f40876z = iArr;
    }

    public int b() {
        try {
            int[] iArr = this.f40876z;
            int i2 = this.f40875A;
            this.f40875A = i2 + 1;
            return iArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40875A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40875A < this.f40876z.length;
    }
}
