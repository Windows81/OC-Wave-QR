package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: A  reason: collision with root package name */
    public final int f40946A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f40947B;
    public int C;

    /* renamed from: z  reason: collision with root package name */
    public final int f40948z;

    public CharProgressionIterator(char c2, char c3, int i2) {
        this.f40948z = i2;
        this.f40946A = c3;
        boolean z2 = false;
        if (i2 <= 0 ? Intrinsics.k(c2, c3) >= 0 : Intrinsics.k(c2, c3) <= 0) {
            z2 = true;
        }
        this.f40947B = z2;
        this.C = !z2 ? c3 : c2;
    }

    public char b() {
        int i2 = this.C;
        if (i2 != this.f40946A) {
            this.C = this.f40948z + i2;
        } else if (this.f40947B) {
            this.f40947B = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i2;
    }

    public boolean hasNext() {
        return this.f40947B;
    }
}
