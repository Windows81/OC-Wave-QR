package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    public long c() {
        long j2 = this.f28930A;
        Striped64.Cell[] cellArr = this.f28932z;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j2 += cell.f28935a;
                }
            }
        }
        return j2;
    }

    public double doubleValue() {
        return (double) c();
    }

    public float floatValue() {
        return (float) c();
    }

    public int intValue() {
        return (int) c();
    }

    public long longValue() {
        return c();
    }

    public String toString() {
        return Long.toString(c());
    }
}
