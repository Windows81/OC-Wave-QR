package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;

@Metadata
final class ArrayBooleanIterator extends BooleanIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40865A;

    /* renamed from: z  reason: collision with root package name */
    public final boolean[] f40866z;

    public ArrayBooleanIterator(boolean[] zArr) {
        Intrinsics.i(zArr, "array");
        this.f40866z = zArr;
    }

    public boolean b() {
        try {
            boolean[] zArr = this.f40866z;
            int i2 = this.f40865A;
            this.f40865A = i2 + 1;
            return zArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40865A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40865A < this.f40866z.length;
    }
}
