package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;

@Metadata
final class ArrayCharIterator extends CharIterator {

    /* renamed from: A  reason: collision with root package name */
    public int f40869A;

    /* renamed from: z  reason: collision with root package name */
    public final char[] f40870z;

    public ArrayCharIterator(char[] cArr) {
        Intrinsics.i(cArr, "array");
        this.f40870z = cArr;
    }

    public char b() {
        try {
            char[] cArr = this.f40870z;
            int i2 = this.f40869A;
            this.f40869A = i2 + 1;
            return cArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f40869A--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f40869A < this.f40870z.length;
    }
}
