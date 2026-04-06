package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata
final class ArrayLongIterator extends LongIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40879A;

    /* renamed from: z  reason: collision with root package name */
    public final long[] f40880z;

    public ArrayLongIterator(long[] jArr) {
        Intrinsics.i(jArr, "array");
        this.f40880z = jArr;
    }

    public long b() {
        try {
            long[] jArr = this.f40880z;
            int i2 = this.f40879A;
            this.f40879A = i2 + 1;
            return jArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40879A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40879A < this.f40880z.length;
    }
}
