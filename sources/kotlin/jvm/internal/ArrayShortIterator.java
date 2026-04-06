package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ShortIterator;

@Metadata
final class ArrayShortIterator extends ShortIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40881A;

    /* renamed from: z  reason: collision with root package name */
    public final short[] f40882z;

    public ArrayShortIterator(short[] sArr) {
        Intrinsics.i(sArr, "array");
        this.f40882z = sArr;
    }

    public short b() {
        try {
            short[] sArr = this.f40882z;
            int i2 = this.f40881A;
            this.f40881A = i2 + 1;
            return sArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40881A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40881A < this.f40882z.length;
    }
}
