package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;

@Metadata
final class ArrayByteIterator extends ByteIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40867A;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f40868z;

    public ArrayByteIterator(byte[] bArr) {
        Intrinsics.i(bArr, "array");
        this.f40868z = bArr;
    }

    public boolean hasNext() {
        return this.f40867A < this.f40868z.length;
    }

    public byte p() {
        try {
            byte[] bArr = this.f40868z;
            int i2 = this.f40867A;
            this.f40867A = i2 + 1;
            return bArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40867A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
