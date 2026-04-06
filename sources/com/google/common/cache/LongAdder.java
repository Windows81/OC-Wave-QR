package com.google.common.cache;

import com.google.common.cache.Striped64;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    public void a() {
        b(1);
    }

    public void b(long j2) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f27936z;
        if (cellArr == null) {
            long j3 = this.f27934A;
            if (d(j3, j3 + j2)) {
                return;
            }
        }
        int[] iArr = (int[]) Striped64.C.get();
        boolean z2 = true;
        if (!(iArr == null || cellArr == null || (length = cellArr.length) < 1 || (cell = cellArr[(length - 1) & iArr[0]]) == null)) {
            long j4 = cell.f27939a;
            z2 = cell.a(j4, j4 + j2);
            if (z2) {
                return;
            }
        }
        h(j2, iArr, z2);
    }

    public double doubleValue() {
        return (double) i();
    }

    public final long f(long j2, long j3) {
        return j2 + j3;
    }

    public float floatValue() {
        return (float) i();
    }

    public long i() {
        long j2 = this.f27934A;
        Striped64.Cell[] cellArr = this.f27936z;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j2 += cell.f27939a;
                }
            }
        }
        return j2;
    }

    public int intValue() {
        return (int) i();
    }

    public long longValue() {
        return i();
    }

    public String toString() {
        return Long.toString(i());
    }
}
